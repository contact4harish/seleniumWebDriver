package checkSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class driver {
	
	public static void main(String args[]){
		
		//firefox driver
		System.setProperty("webdriver.gecko.driver","./geckodriver.exe");
		WebDriver c=new FirefoxDriver();
		c.get("https://www.google.com");
		c.close();		
				
		//chrome driver 
		System.setProperty("webdriver.chrome.driver","G:\\quality-testing-master\\seleniumWebDriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.close();
		
		//ie driver
		
		System.setProperty("webdriver.ie.driver","G:\\MS Essential Softwares\\IEDriverServer.exe");
		WebDriver e=new InternetExplorerDriver();
		e.get("https://www.google.com");
		e.quit();
		
		//gaecko driver//if you are using new version
		//System.setProperty("webdriver.gecko.driver","G:\\Selenium\\Firefox driver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
	}

}
