package TestPackage;

import org.testng.annotations.Test;

import utilities.BaseClass;

public class OrganizationTest extends BaseClass {
	
	@Test
	public void OrganizationTest() {
		hp.ClickOrganization();
		op.clickCreateBtn();
		op.enterOrganizationName("Renai Medicity");
		op.enterEmploye("100");
		op.EnterIndustryDropdown("Healthcare");
		op.EnterType("Investor");
		op.enterEmail("renai33@gmail.com");
		op.enterPhoneNumber("9987564225");
		op.Clicksavebtn();
		
	}

}
