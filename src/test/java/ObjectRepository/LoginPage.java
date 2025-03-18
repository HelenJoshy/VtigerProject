package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.DataUtilities;

public class LoginPage {

	DataUtilities du;

	// declaration
	@FindBy(name = "user_name")
	private WebElement UsernameTextFiled;

	@FindBy(name = "user_password")
	private WebElement pwdTextFiled;

	@FindBy(id = "submitButton")
	private WebElement loginBtn;

	// initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public void enterUserName() {
		du = new DataUtilities();
		String un = du.getDataFromPropertyFile("username");
		UsernameTextFiled.sendKeys(un);
	}

	public void enterPassword() {
		du = new DataUtilities();
		String pwd = du.getDataFromPropertyFile("password");
		pwdTextFiled.sendKeys(pwd);
	}

	public void clickOnLoginbtn() {
		loginBtn.click();
	}
	
	

}
