package testCases;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import commonFunctions.BaseTest;
import pageElements.CompanyCreationPage;
import pageElements.CreateAndRecordVideo;
import pageElements.PlanPersonalizedPage;
import pageElements.Recording;
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
	
	public void Start_Recording()throws InterruptedException {
		PageFactory.initElements(driver, Recording.class);
		wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElements(Recording.Uncheck_Screen_Recording));
		Recording.Uncheck_Screen_Recording.click();
		
		wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElements(Recording.Uncheck_mic));
		Recording.Uncheck_mic.click();
		
		Recording.Clickon_Recording.click();
	}
		public void Grand_BrowserPermission()throws AWTException, InterruptedException {
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
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
	public void Test_Execution() throws InterruptedException, AWTException {
		User_SignUp();
		Plan_And_Campaigns();
		Create_Company();
		Create_Video();
		Start_Recording();
		Grand_BrowserPermission();
		Send_to_Email();
		Send_to_Email();
		
		
	}

}
