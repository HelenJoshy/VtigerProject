package TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class ScenarioTest2 extends BaseClass {
	
	@Test(groups = "adhoc")
	public void TestCase3() {
	
		System.out.println("adhoc2");
		
	}
	
	@Test(groups = "smoke")
	public void TestCase4() {
		
		System.out.println("smoke2");
		

	}}
