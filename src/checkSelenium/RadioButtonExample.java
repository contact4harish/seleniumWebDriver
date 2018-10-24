package checkSelenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonExample {
	
	

		public static void main(String[] args) throws InterruptedException 
		{
			
			// Open Fire fox
			System.setProperty("webdriver.gecko.driver","./geckodriver.exe");
			WebDriver d=new FirefoxDriver();
			
			
			// open web site url
			Thread.sleep(5000);
			d.get("http://newtours.demoaut.com/");
			
			
			
			
		}


	
	
	
}
