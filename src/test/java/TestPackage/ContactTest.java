package TestPackage;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class ContactTest extends BaseClass{
	
		@Test(dataProvider = "databaseContactDetails",dataProviderClass=DataSupply.class )
		public void  CreateContact(String salutation,String firstname,String lastname,String leadsrc,String title,String Department,String email,String mobno) {
			hp.ClickContacts();
			cp.clickCreateContactIcon();
			cp.SelectSAlutation(salutation);
			cp.EnterFirstName(firstname);
			cp.EnterLastName(lastname);
			cp.SelectLeadsrc(leadsrc);
			cp.enterTitle(leadsrc);
			cp.enterDepartment(Department);
			cp.enterEmail(email);
			cp.enterMobileNumber(mobno);
			cp.clickSave();
			
		}
			
		}
	
	
		
	


