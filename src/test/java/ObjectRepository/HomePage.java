package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenericUtilities;

public class HomePage {

	// declaration
	@FindBy(linkText = "Calendar")
	private WebElement calendarLink;

	@FindBy(linkText = "Leads")
	private WebElement leadsLink;

	@FindBy(linkText = "Organizations")
	private WebElement OrganizationLink;

	@FindBy(linkText = "Contacts")
	private WebElement ContactLink;

	@FindBy(xpath = "/html/body/table[1]/tbody/tr/td[3]/table/tbody/tr/td[2]/img")
	private WebElement AdminIcon;

	@FindBy(linkText = "Sign Out")
	private WebElement SignOutLink;

	// initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization

	public void ClickCalendarLink() {
		calendarLink.click();
	}

	public void ClickLeadsLink() {
		leadsLink.click();
	}

	public void ClickOrganization() {
		OrganizationLink.click();
	}

	public void ClickContacts() {
		ContactLink.click();
	}

	public void Signout(WebDriver driver) {
		GenericUtilities gu = new GenericUtilities();
		gu.MouseHoverOn(driver, AdminIcon);
		SignOutLink.click();
	}

}
