package pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlanPersonalizedPage {
	@FindBy(id="Business-4")public static WebElement Click_on_BusinessPlan;
	@FindBy(xpath = "//span[text()='Personalized marketing campaigns to boost conversions']")public static WebElement Click_on_PersonalizedMarketing;
	@FindBy(id="Business-next-btn")public static WebElement Click_on_NextButton;

}
