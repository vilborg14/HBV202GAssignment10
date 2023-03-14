package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class MultiplyandPlusTemplate {
    protected List<MathExpression> children = new ArrayList<MathExpression>();
    protected int lastObservedResult;

    protected abstract int getResult();


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

