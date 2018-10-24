package checkSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSeleniumDriver {
	
	public static void main(String args[]) {
		
		System.setProperty("WebDriver.chrome.driver", "G:\\quality-testing-master\\seleniumWebDriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

}
