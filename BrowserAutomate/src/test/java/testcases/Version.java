package testcases;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Version {
	private static WebDriver browserDriver;
	public static void main(String[] args) {
		
		getBrowserAndVersion();

	}


	public static String getBrowserAndVersion() {
	String browser_version = null;
	Capabilities cap = ((RemoteWebDriver) browserDriver).getCapabilities();
	String browsername = cap.getBrowserName();
	// This block to find out IE Version number
	if (browsername.equalsIgnoreCase("internet explorer")) {
	String uAgent = (String) ((JavascriptExecutor)browserDriver).executeScript("navigator.userAgent"); 
	System.out.println(uAgent);
	//uAgent return as “MSIE 8.0 Windows” for IE8
	if (uAgent.contains("10") && uAgent.contains("Windows")) {
	browser_version = uAgent.substring(uAgent.indexOf("MSIE")+5,uAgent.indexOf("Windows")-2);
	} else if (uAgent.contains("Trident/7.0")) {
	browser_version = "11.0";
	} else {
	browser_version = "0.0";
	}
	} else
	{
	//Browser version for Firefox and Chrome
	browser_version = cap.getVersion();// .split(“.”)[0];
	}
	String browserversion = browser_version.substring(0, browser_version.indexOf("."));
	return browsername +" " +browser_version;
	}
	
}
