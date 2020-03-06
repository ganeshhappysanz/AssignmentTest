package pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyCreationPage {
	@FindBy(id="firstNameTxt")public static WebElement Firstname_field;
	@FindBy(id="companyNameTxt")public static WebElement CompanyName_field;
	@FindBy(id="phoneTxt")public static WebElement PhoneNumber_field;
	@FindBy(id="saveCompanyName")public static WebElement ClickOn_GetStarted;

}
