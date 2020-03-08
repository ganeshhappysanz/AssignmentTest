package pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Recording {
	@FindBy(xpath = "//div[@class='screen-img']//img[@src='/img/right-dot.png']")public static WebElement Uncheck_Screen_Recording;
	@FindBy(xpath = "//div[@class='audio-img']//img[@src='/img/right-dot.png']")public static WebElement Uncheck_mic;
	@FindBy(id ="startRecording")public static WebElement Clickon_Recording;
	
	

}
