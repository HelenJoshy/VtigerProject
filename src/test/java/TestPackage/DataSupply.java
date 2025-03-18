package TestPackage;

import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.DataUtilities;

// suppling the data within the class...........

public class DataSupply {

	
	@DataProvider(name="userCredentials")
	public Object[][] userData(){
		 return new Object[][] {
			 
			 {"resbin@gmail.com","resbin@123"},
			 {"siva@gmail.com","siva@123"},
			 {"sreekanth@gmail.com","sreekanth@123"},
			 {"athulya@gmail.com","athulya@123"}
	};
	}
	
	
	@DataProvider(name="userCredentials1")
	public Object[][] userData2(){
		 return new Object[][] {
			 
			 {"sneha@gmail.com","sneha@123"},
			 {"helen@gmail. ","helen@123"},
			 {"aleena@gmail.com","aleena@123"},
			 {"hari@gmail.com","hari@123"}
	};
	}
	
	@DataProvider(name="contactDetails")
	public Object[][]contactData(){
		
		return new Object[][] {
			{"Mr.","Anirudhan","k","Employee","Health Inspector","Health","anirudhan@gmail.com","234512769"},
			{"Ms.","molly","CR","Self Generated","journalist","Al India Radio","mollyjoshy3437@gmail.com","7765494623"},
			{"Mr.","ABhinandan","raj","Partner","Student","EEE","abhi@gmail.com","4456329975"}
		};
		
	}

@Test(dataProvider = "userCredentials1")

public void printData(String username,String password) {
	System.out.println(username);
	System.out.println(password);
}


@DataProvider(name="databaseContactDetails")
public Object[][] databaseContacts(){
	DataUtilities du = new DataUtilities();
	ArrayList<Object[]> result = du.getDataFromDatabase("select * from contacts");
	return result.toArray(new Object[0][]);
	}


@Test(dataProvider = "databaseContactDetails")

public void contactdetails(String salutation, String firstname,String lastname,String leadsrc,String title,String department,String email,String phno) {
	
}





}

