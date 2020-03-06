package pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAndRecordVideo {
	
	@FindBy(xpath = "//div[@class='importIcon import']")public static WebElement Click_floating_icon;
	@FindBy(xpath = "//section[text()='Create video']")public static WebElement Clickon_Create_Video;
	@FindBy(xpath = "//a[text()='RECORD']")public static WebElement Clickon_Start_recording_button;
	@FindBy(xpath = "//img[@class='arrow-right-orange']")public static WebElement RecordingSelectionArrow;
	
	@FindBy(id="chrome-modal")public static WebElement ChromeMoelpopup;
	@FindBy(id="chrome-modalYesBtn")public static WebElement Install_BrowserExtension;
	@FindBy(xpath = "//div[@aria-label='Add to Chrome']")public static WebElement Add_Chrome_Extension;
	
	@FindBy(xpath = "//button[text()='OKAY']")public static WebElement OkayExtension;
	//recording
	@FindBy(id="hvFocusImg")public static WebElement Clickon_recording_highlighter_icon;
	@FindBy(xpath = "//div[@data-name='Sales_Home']")public static WebElement Clickon_Home_Menu;
	@FindBy(xpath = "//div[@data-name=\"Dashboard\"]")public static WebElement Clickon_Sales_Menu;
	@FindBy(xpath = "//a[href='/people/home']")public static WebElement Clickon_People_menu;
	@FindBy(xpath = "//div[@data-name='Library']")public static WebElement Clickon_Library_menu;
	@FindBy(xpath = "//div[@class=\"nav-center-menu-icon-img campaings\"]")public static WebElement Clickon_campaings_menu;
	@FindBy(xpath = "//div[@data-name='Testimonial']")public static WebElement Clickon_testimonial_menu;
	@FindBy(id="hvStopImg")public static WebElement Stop_recording_menu;
	
	
	
	@FindBy(id="stopRecording")public static WebElement Clickon_Stop_recording_button;


}
