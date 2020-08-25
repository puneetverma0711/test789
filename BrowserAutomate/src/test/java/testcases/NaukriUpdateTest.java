package testcases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.remote.RemoteWebDriver;
public class NaukriUpdateTest {
  
public static WebDriver driver;
	@Test
  public void updateprofile() throws InterruptedException {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true"); 
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		/*Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browsername=cap.getBrowserName();
		String browserversion=cap.getVersion();
		System.out.println(browsername);
		System.out.println(browserversion);   */
		
		//System.setProperty("webdriver.chrome.driver", "F:\\downloaded data\\selenium drivers\\chromedriver.exe");
				
				
				  
				  driver.get("https://www.naukri.com/"); driver.manage().window().maximize();
				  driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
				  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				   

	}
  
  @AfterMethod
  public void afterMethod() {
	//  driver.quit();
	  
  }

}
