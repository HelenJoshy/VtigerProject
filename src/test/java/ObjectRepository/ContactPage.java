package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenericUtilities;

public class ContactPage {

	// declaration

	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement CreateContactIcon;

	@FindBy(name = "salutationtype")
	private WebElement SalutationDropDown;

	@FindBy(name = "firstname")
	private WebElement FirstNameTextField;

	@FindBy(name = "lastname")
	private WebElement LastNameTextField;

	@FindBy(name = "leadsource")
	private WebElement LeadsrcDropdown;

	@FindBy(id = "title")
	private WebElement TitleTextField;

	@FindBy(id = "department")
	private WebElement DepartmentTextField;

	@FindBy(id = "email")
	private WebElement EmailTextField;

	@FindBy(id = "mobile")
	private WebElement MobileTextField;
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement Savebtn;

	@FindBy(xpath = "(//input[@title='Cancel [Alt+X]'])[1]")
	private WebElement Cancelbtn;
	// initialization

	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization

	public void clickCreateContactIcon() {
		CreateContactIcon.click();
	}

	public void SelectSAlutation(String text) {
		GenericUtilities gu = new GenericUtilities();
		gu.SelectOptionByVisibleText(SalutationDropDown, text);
	}

	public void EnterFirstName(String text) {
		FirstNameTextField.sendKeys(text);
	}

	public void EnterLastName(String text) {
		LastNameTextField.sendKeys(text);
	}

	public void SelectLeadsrc(String text) {
		GenericUtilities gu = new GenericUtilities();
		gu.SelectOptionByVisibleText(LeadsrcDropdown, text);
	}

	public void enterTitle(String text) {
		TitleTextField.sendKeys(text);
	}

	public void enterDepartment(String text) {
		DepartmentTextField.sendKeys(text);
	}

	public void enterEmail(String email) {
		EmailTextField.sendKeys(email);
	}

	public void enterMobileNumber(String number) {
		MobileTextField.sendKeys(number);
	}

	public void clickSave() {
		Savebtn.click();

	}

	public void clickCancel() {
		Cancelbtn.click();

	}

}
