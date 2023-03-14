package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression, Observer {
    private List<MathExpression> children = new ArrayList<MathExpression>();

   private int result = 1;
    private int temp = 1;



    private int lastObservedResult;
    public int getResult() {

        if (children.size() == 0) {
            return 0;
        }

        for (MathExpression child : children) {
            temp = child.getResult();
            result = temp * result;
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
