package checkSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String args[]) throws InterruptedException{
	
	//static dropdown--use select class, select by index/id/
		System.setProperty("webdriver.gecko.driver","./geckodriver.exe");
		WebDriver f=new FirefoxDriver();
	f.get("https://book2.spicejet.com");
	Select s=new Select(f.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
	s.selectByIndex(1);
	Thread.sleep(2000);
	//dynamic dropdown	f.findElements(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
	f.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
	f.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[2]/li[6]/a")).click();
	f.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).click();
	f.findElement(By.linkText("Delhi (DEL)")).click();
	Thread.sleep(4000);
	f.close();
	
	
	//static dropdown
	System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
	WebDriver g=new ChromeDriver();	
	g.get("https://book2.spicejet.com");
	Select t=new Select(g.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
	t.selectByIndex(2);
	
	
	Thread.sleep(2000);
	//dynamic dropdown	f.findElements(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
	g.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
	g.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[2]/li[6]/a")).click();
	g.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).click();
	g.findElement(By.linkText("Delhi (DEL)")).click();
	Thread.sleep(3000);
	g.close();
	}
}
