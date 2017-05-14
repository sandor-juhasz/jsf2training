package hu.sjuhasz.jsftraining.copymyname.beans;

import org.junit.Test;
import static org.junit.Assert.*;

public class CopyBeanTest {

	@Test
	public void testSubmit() {
		CopyBean bean = new CopyBean();
		bean.setName("Sandor Juhasz");
		bean.submit();
		assertEquals("You have submitted: Sandor Juhasz.", bean.getCopyText());
		assertEquals("", bean.getName());
	}
	
	@Test
	public void testIsCopyTextRendered() {
		CopyBean bean = new CopyBean();
		bean.setName("Sandor Juhasz");
		assertFalse(bean.isCopyTextRendered());
		bean.submit();
		assertTrue(bean.isCopyTextRendered());		
	}
}
