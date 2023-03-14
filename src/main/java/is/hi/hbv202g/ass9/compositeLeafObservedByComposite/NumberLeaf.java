package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

public class NumberLeaf extends Observable implements MathExpression {


    private int number;

    public NumberLeaf(int i){
        this.number = i;
    }

public void setValue(int i){
    this.number = i;
    notifyObservers();
}
    public int getResult() {
        return this.number;
    }
}

