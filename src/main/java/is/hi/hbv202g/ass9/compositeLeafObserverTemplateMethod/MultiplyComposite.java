package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite  extends MultiplyandPlusTemplate implements MathExpression, Observer {

    public int getResult() {
        int result = 1;
        int temp = 1;
        if (children.size() == 0) {
            return 0;
        }

        for (MathExpression child : children) {
            temp = child.getResult();
            result = temp * result;
        }
        return result;

}
}
