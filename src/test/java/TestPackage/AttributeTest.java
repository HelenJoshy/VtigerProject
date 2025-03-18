package TestPackage;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class AttributeTest extends BaseClass {
	
	@Test(groups = "smoke")
	public void moveToCalendarPage() {
		hp.ClickCalendarLink();
		System.out.println("smoke 1");
	
	}
	
	@Test(groups = "integration")
	public void moveToLeadsPage() throws InterruptedException {
		Thread.sleep(6000);
		hp.ClickLeadsLink();
		System.out.println("integration 1");
		
	}
	
	@Test(groups = "integration")
	public void moveToOrganizationPage() {
		hp.ClickOrganization();
		System.out.println("integration 2");
		
	}
	
	@Test(groups = "adhoc")
	public void moveToContactsPage() {
		hp.ClickContacts();
		System.out.println("adhoc 1");
		
	}

}
