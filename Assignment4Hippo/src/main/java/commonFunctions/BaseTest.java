package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	public static Properties properties=null;
	public static WebDriver driver=null;
	
	
	public static Properties loadpropertyFile() throws IOException {
		FileInputStream fileInputStream=new FileInputStream("config.properties");
		properties =new Properties();
		properties.load(fileInputStream);		
		return properties;
		
	}
	
	@BeforeSuite
	public void LaunchBrowser() throws IOException {
		loadpropertyFile();
		String WebBrowser=properties.getProperty("Browser");
		String Apurl=properties.getProperty("URL");
		String ChromeDriverLocation=properties.getProperty("ChromedriverLocation");
		String FirefoxDriverLocation=properties.getProperty("FirefoxdriverLocation");
		
		
		
		
		if(WebBrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",ChromeDriverLocation);
			driver=new ChromeDriver();
			
		}else if(WebBrowser.equalsIgnoreCase("fireFox")) {
			System.setProperty("webdriver.gecko.driver", FirefoxDriverLocation);
			driver=new FirefoxDriver();
		}
		
		driver.get(Apurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@AfterSuite
	public void teardown() {
			//driver.quit();
		}


}
