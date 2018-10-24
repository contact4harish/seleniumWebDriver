package checkSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class WebElementsValidation {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//is displayed is to check if they are visible or not
		//--only if the option is present in web
		//is selected is to check if they are selected or not
		
		System.setProperty("webdriver.gecko.driver","./geckodriver.exe");
		WebDriver b=new FirefoxDriver();
		b.get("https://www.makemytrip.com/");
		//visible and invisible modes
		System.out.println("after round trip select");
		b.findElement(By.xpath(".//*[@id='js-switch__option']/div[2]/label")).click();
		
		System.out.println(b.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());

		// is the particular option is in web or not
		//use .size() at this point
		
		int count=(b.findElements(By.xpath(".//*[@id='js-sch__option']/div[2]/label")).size());
		if(count==0){
			System.out.println("no such elements");
			
			//is enabled method
			
			
			
			//get text
			
			System.out.println(b.findElement(By.xpath(".//*[@id='js-hp-widgetSection']/div[1]/h1")).getText() );
		}
		b.close();
	}

}
