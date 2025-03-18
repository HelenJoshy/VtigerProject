package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import ObjectRepository.ContactPage;
import ObjectRepository.HomePage;
import ObjectRepository.LeadsPage;
import ObjectRepository.LoginPage;
import ObjectRepository.OrganizationPage;
import TestPackage.OrganizationTest;

@Listeners(ListenersClass.class)
public class BaseClass {
	public static WebDriver sdriver;
	public WebDriverUtilities wu;
	public WebDriver driver;
	public LoginPage lp;
	public HomePage hp;
	public ContactPage cp;
	public OrganizationPage op;
	public LeadsPage leadp;

	@Parameters("browser")
	@BeforeMethod(alwaysRun = true)
	public void login(String browser) {
		wu = new WebDriverUtilities();
		driver = wu.launchBrowser(browser);
		sdriver = driver;

		hp = new HomePage(driver);
		cp = new ContactPage(driver);
		lp = new LoginPage(driver);
		op = new OrganizationPage(driver);
		LeadsPage leadp = new LeadsPage(driver);

		wu.maximizeBrowser(driver);
		wu.implicitwait(driver, 10);
		wu.pageLoadingWait(driver, 30);
		wu.passURL(driver);

		lp.enterUserName();
		lp.enterPassword();
		lp.clickOnLoginbtn();
	}

	@AfterMethod(alwaysRun = true)
	public void logout() {

		hp.Signout(driver);
		wu.closeBrowser(driver);

	}
}
