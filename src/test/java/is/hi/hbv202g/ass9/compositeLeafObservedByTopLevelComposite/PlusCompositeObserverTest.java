package is.hi.hbv202g.ass9.compositeLeafObservedByTopLevelComposite;

import static org.junit.Assert.*;
import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.MultiplyComposite;
import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.NumberLeaf;
import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.PlusComposite;
import org.junit.Before;
import org.junit.Test;

public class PlusCompositeObserverTest {

	private PlusComposite plusComposite;

	@Before
	public void createPlusComposite() {
		plusComposite = new PlusComposite();
	}

	@Test
	public void testOneElementPlusCompositeObserver() {
		NumberLeaf number1 = new NumberLeaf(1);
		plusComposite.add(number1);

		plusComposite.update(); // This will cause stuff printed on the screen: this is not tested.

		assertEquals(1, plusComposite.getLastObservedResult()); 
	}

}
