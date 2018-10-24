package ajaxandmouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class actionsDemo {
	public static void main(String args[]){
		

		System.setProperty("webdriver.chrome.driver","G:\\quality-testing-master\\seleniumWebDriver\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//for implicit wait
		a.get("https://www.amazon.com/");
		
		//actions class for show data visible
		//whereas select class for drop downs
		
		Actions b= new Actions(a);
		b.moveToElement(a.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[2]"))).build().perform();
		  //moves the mouse//find the ele//locator//                                     //in one step//action
	
		//shift+(hello)=(HELLO)
		b.moveToElement(a.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//moves the mouse//find the ele//                         //click+shift key down+hello+doubleclick+all actions in one step+action
	
		Select s=new Select(a.findElement(By.id("searchDropdownBox")));
		s.selectByValue("search-alias=alexa-skills");
		
		b.moveToElement(a.findElement(By.xpath("//input[@class='nav-input']"))).click().build().perform();
		
		
	}

}
