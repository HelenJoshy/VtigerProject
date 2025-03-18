package TestPackage;

import org.testng.annotations.Test;

import utilities.BaseClass;

public class LeadsTest extends BaseClass {
	
@Test
public void CreateLead() {
	hp.ClickLeadsLink();
	leadp.SalutationDropdown("Mr.");
}

}
