package pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendVideo2Email {
	@FindBy(id ="videoCampaignsTab-heading" )public static WebElement Videocampaignlink;
	@FindBy(id="videoCampaign")public static WebElement Send_Email;
	@FindBy(xpath = "//span[@class='add-contacts-btn']")public static WebElement addcontact;
	@FindBy(xpath = "//label[text()='Desktop']")public static WebElement Select_Desktop;
	@FindBy(xpath = "//label[text()='Add Contacts']")public static WebElement addcontact_tab;
	@FindBy(id="hiddenUpload")public static WebElement Upload_File;
	
	@FindBy(xpath = "//input[@name='email']/preceding-sibling::input[2]")public static WebElement enter_contactemail;

}
