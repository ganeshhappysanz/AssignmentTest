package testCases;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import commonFunctions.BaseTest;
import pageElements.CompanyCreationPage;
import pageElements.CreateAndRecordVideo;
import pageElements.PlanPersonalizedPage;
import pageElements.SendVideo2Email;
import pageElements.SignUp_Page;

public class TestCaseExecution extends BaseTest {
	public static WebDriverWait wait;
	
	
	
	public void User_SignUp() {
		PageFactory.initElements(driver, SignUp_Page.class);
		SignUp_Page.LoginLink.click();
		SignUp_Page.SignupLink.click();
		SignUp_Page.EmailId_Field.sendKeys(properties.getProperty("SignupEmail"));
		SignUp_Page.Password_Field.sendKeys(properties.getProperty("SignupPassword"));
		SignUp_Page.Submit_Signup_Button.submit();
	}
	
	public void Plan_And_Campaigns() {
		PageFactory.initElements(driver, PlanPersonalizedPage.class);
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(PlanPersonalizedPage.Click_on_BusinessPlan));
		PlanPersonalizedPage.Click_on_BusinessPlan.click();
		PlanPersonalizedPage.Click_on_PersonalizedMarketing.click();
		PlanPersonalizedPage.Click_on_NextButton.click();
	}
	
	public void Create_Company() {
		PageFactory.initElements(driver, CompanyCreationPage.class);
		CompanyCreationPage.Firstname_field.sendKeys(properties.getProperty("Name"));
		CompanyCreationPage.CompanyName_field.clear();
		CompanyCreationPage.CompanyName_field.sendKeys(properties.getProperty("CompanyName"));
		CompanyCreationPage.PhoneNumber_field.sendKeys(properties.getProperty("PhoneNumber"));
		CompanyCreationPage.ClickOn_GetStarted.click();
	}
	
	public void Create_Video()  {
		PageFactory.initElements(driver, CreateAndRecordVideo.class);
		wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElements(CreateAndRecordVideo.Click_floating_icon));
		CreateAndRecordVideo.Click_floating_icon.click();
		CreateAndRecordVideo.Clickon_Create_Video.click();
	}
	
	public void Add_Browser_Extesion()throws InterruptedException {
		CreateAndRecordVideo.Clickon_Start_recording_button.click();
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElements(CreateAndRecordVideo.ChromeMoelpopup));
		CreateAndRecordVideo.Install_BrowserExtension.click();
		
		//Add Hippo video browser extension
		Set<String> winSet2 = driver.getWindowHandles();
		List<String> winList2 = new ArrayList<String>(winSet2);
		String browserpermission = winList2.get(winList2.size() - 1);
		driver.switchTo().window(browserpermission);
		
		CreateAndRecordVideo.Add_Chrome_Extension.click();
		Actions actions=new Actions(driver);
		try {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.alertIsPresent());
		actions.sendKeys(Keys.TAB).click().build().perform();
		actions.sendKeys(Keys.ENTER).click().build().perform();
		}catch (TimeoutException e) {
			// TODO: handle exception
			
		}
		CreateAndRecordVideo.OkayExtension.click();
		CreateAndRecordVideo.Clickon_Start_recording_button.click();
		
		
	}
		public void  Start_Screen_Recording()throws InterruptedException {	
		//Start Recording
		CreateAndRecordVideo.Clickon_Home_Menu.click();
		CreateAndRecordVideo.Clickon_Sales_Menu.click();
		CreateAndRecordVideo.Clickon_People_menu.click();
		CreateAndRecordVideo.Clickon_Library_menu.click();
		CreateAndRecordVideo.Clickon_campaings_menu.click();
		CreateAndRecordVideo.Clickon_testimonial_menu.click();
		CreateAndRecordVideo.Clickon_Stop_recording_button.click();
				
	}
		
		public void Send_to_Email() {
			PageFactory.initElements(driver, SendVideo2Email.class);
			SendVideo2Email.Videocampaignlink.click();
			SendVideo2Email.Send_Email.click();
			SendVideo2Email.addcontact.click();
			SendVideo2Email.Select_Desktop.click();
			SendVideo2Email.addcontact_tab.click();
			SendVideo2Email.enter_contactemail.sendKeys(properties.getProperty("VideoSendEmail"));			
			
		}
	
	
	@Test
	public void Test_Execution() throws InterruptedException {
		User_SignUp();
		Plan_And_Campaigns();
		Create_Company();
		Create_Video();
		Add_Browser_Extesion();
		Start_Screen_Recording();
		Send_to_Email();
		
		
	}

}
