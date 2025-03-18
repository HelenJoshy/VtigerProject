package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenericUtilities;

public class LeadsPage {

	// declaration
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement CreateIcon;

	@FindBy(name = "salutationtype")
	private WebElement salutationDropdown;

	@FindBy(name = "firstname")
	private WebElement FirstNameTextField;

	@FindBy(name = "lastname")
	private WebElement LastNameTextField;

	@FindBy(name = "company")
	private WebElement CompanyNameTextField;

	@FindBy(id = "designation")
	private WebElement titleTextField;

	@FindBy(name = "leadsource")
	private WebElement leadsrcDropDown;

	@FindBy(name = "industry")
	private WebElement industrDropDown;

	@FindBy(id = "phone")
	private WebElement PhoneNumberTextField;

	@FindBy(id = "email")
	private WebElement emailTextField;
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement savebtn;
	
	@FindBy(xpath="(//input[@title='Cancel [Alt+X]'])[1]")
	private WebElement cancelbtn;

	// intialization

	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization

	public void ClickOnLeadsCreateIcon() {
		CreateIcon.click();
	}

	public void SalutationDropdown(String text) {
		  GenericUtilities gu= new GenericUtilities();
		  gu.SelectOptionByVisibleText(salutationDropdown, text);
	 }

	public void enterFirstName(String text) {
		FirstNameTextField.sendKeys(text);
	}

	public void enterLastName(String text) {
		LastNameTextField.sendKeys(text);
	}

	public void enterCompany(String text) {
		CompanyNameTextField.sendKeys(text);
	}

	public void enterTitle(String text) {
		titleTextField.sendKeys(text);
	}

	public void LeadsrcDropdown(String text) {
		GenericUtilities gu = new GenericUtilities();

		gu.SelectOptionByVisibleText(leadsrcDropDown, text);
	}

	public void SelectIndustry(String text) {
		GenericUtilities gu = new GenericUtilities();
		gu.SelectOptionByVisibleText(industrDropDown, text);
	}
	
	public void EnterMobileNumber(String number) {
		PhoneNumberTextField.sendKeys(number);
	}
	
	public void EnterEmailId(String email) {
		emailTextField.sendKeys(email);
	}
	
	public void clickSavebtn() {
		savebtn.click();
	}
	
	public void clickcancelbtn() {
		cancelbtn.click();
	}
}

 
		  


