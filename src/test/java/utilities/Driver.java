package utilities;
import java.time.Duration;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;


public class Driver {

	private Driver() {
		
	}

	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver==null) {
			switch(System.getProperty("browser")) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			case "safari":
				WebDriverManager.safaridriver().setup();
				driver=new SafariDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				break;
//			case "opera":
//				WebDriverManager.operadriver().setup();
//				driver=new OperaDriver();
//				break;
			default:
				WebDriverManager.safaridriver().setup();
				driver=new SafariDriver();
			}
	}

		return driver;

}

	public static void closeDriver() {
		if (driver!=null) {
			driver.quit();
			driver=null;
		}
	}
}
