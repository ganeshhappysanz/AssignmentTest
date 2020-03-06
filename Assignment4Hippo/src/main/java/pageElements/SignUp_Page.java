package pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp_Page {
	
	@FindBy(xpath = "//a[@aria-label='login']")public static WebElement LoginLink;
	@FindBy(xpath = "//a[@href='/users/sign_up']")public static WebElement SignupLink;
	@FindBy(id="user_email")public static WebElement EmailId_Field;
	@FindBy(id="user_password")public static WebElement Password_Field;
	@FindBy(name="commit")public static WebElement Submit_Signup_Button;

}
