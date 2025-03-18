package TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerificationClass {
	@Test
	public void verify() {
				SoftAssert sa = new SoftAssert();
		sa.assertEquals(false,false);

		sa.assertEquals(5,5);
		
		sa.assertNotEquals(true,false);
	   sa.assertNotEquals(5,3);
		
		
		sa.assertNull(null);
		Assert.assertNotNull("helen");
		
		
		sa.assertTrue(true);
		sa.assertFalse(false);
		
	
	}

}
