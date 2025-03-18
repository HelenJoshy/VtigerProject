package ObjectRepository;

import java.net.http.WebSocket;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage {
	
	//Declaration 
	@FindBy(linkText ="Calendar")
	private WebElement CalendarLink;
	
	@FindBy(xpath ="//td[@class='calAddButton']")
	private WebElement Addbtn;
	
	@FindBy(linkText = "Call")
	private WebElement callbtn;
	
	@FindBy(name="subject")
	private WebElement EventNAmeTextField;
	
	@FindBy(name="description")
	private WebElement DescriptionTextField;
	
	@FindBy(name="location")
	private WebElement LocationTextField;
	
}
