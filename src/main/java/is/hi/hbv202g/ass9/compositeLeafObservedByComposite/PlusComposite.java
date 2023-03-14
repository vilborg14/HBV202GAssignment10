package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression {
    private List<MathExpression> children = new ArrayList<MathExpression>();

private int lastObservedResult;
    public int getResult() {
        int result = 0;
        int temp;
        if (children.size() == 0) {
            return 0;
        }

        for (MathExpression child : children) {
            temp = child.getResult();
            result += temp;
        }
        return result;

    }

    public void add(MathExpression child){
        children.add(child);
    }

    public void remove(MathExpression child){
        children.remove(child);
    }

    public List<MathExpression> getChildren(){
        return children;
    }

    public void update() {
        lastObservedResult=getResult();
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}
