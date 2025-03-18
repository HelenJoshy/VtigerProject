package TestPackage;

import org.testng.annotations.Test;

// if the credentials is in the other class we will use "dataproviderclass"to call the class...........the class which is taken in this datasupply
// supplying the data in other class
public class ScenarioTest3 {

	@Test(dataProvider = "userCredentials1", dataProviderClass = DataSupply.class)

	public void printData(String username, String password) {
		System.out.println(username);
		System.out.println(password);

	}
}