package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenericUtilities;

public class OrganizationPage {
	// declaration
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement CreateOrganization;

	@FindBy(name = "accountname")
	private WebElement OrganizationNameTextField;

	@FindBy(id = "employees")
	private WebElement EmployeesTextField;

	@FindBy(name = "industry")
	private WebElement industryDropDown;

	@FindBy(name = "industry")
	private WebElement typeDropDown;

	@FindBy(id = "phone")
	private WebElement PhoneNumberTextFiled;

	@FindBy(id = "email1")
	private WebElement EmailTextFiled;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement savebtn;

	@FindBy(xpath = "(//input[@title='Cancel [Alt+X]'])[1]")
	private WebElement cancelbtn;

	// initialization

	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization

	public void clickCreateBtn() {
		CreateOrganization.click();
	}

	public void enterOrganizationName(String text) {
		OrganizationNameTextField.sendKeys(text);
		;
	}

	public void enterEmploye(String text) {
		EmployeesTextField.sendKeys(text);
	}

	public void EnterIndustryDropdown(String text) {
		GenericUtilities gu = new GenericUtilities();
		industryDropDown.sendKeys(text);
	}

	public void EnterType(String text) {
		GenericUtilities gu = new GenericUtilities();
		typeDropDown.sendKeys(text);
	}

	public void enterPhoneNumber(String number) {
		PhoneNumberTextFiled.sendKeys(number);
	}

	public void enterEmail(String email) {
		EmailTextFiled.sendKeys(email);
	}

	public void Clicksavebtn() {
		savebtn.click();
	}

	public void ClickCancelbtn() {
		cancelbtn.click();
	}

}
