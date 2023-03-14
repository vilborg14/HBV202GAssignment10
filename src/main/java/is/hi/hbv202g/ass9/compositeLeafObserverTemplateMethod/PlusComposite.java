package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite extends MultiplyandPlusTemplate implements MathExpression, Observer {

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


}
