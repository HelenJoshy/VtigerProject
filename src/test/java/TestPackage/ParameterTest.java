package TestPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
//	@Parameters({"browser","username","password"})
//	@Test
//	public void Scenario3(String browser,String un,String pwd) {
//		System.out.println(browser);
//		System.out.println(un);
//		System.out.println(pwd);
	
	
	
	@Test
	public void getDataFromMaven() {
		String un = System.getProperty("username");
		String pwd = System.getProperty("password");
		
		System.out.println(un);
		System.out.println(pwd);
	}
	}


