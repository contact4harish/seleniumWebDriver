package checkSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronisingSelenium {
	public static void main(String args[]){
		
		
		//waiting during execution//which type of wait should i use
	// wait--hey wait for n seconds before you click on the link
		System.setProperty("webdriver.gecko.driver","./geckodriver.exe");
		WebDriver b=new FirefoxDriver();
		
		
		//implicit wait: defining globally--declared once but applicable for each steps
		//just like thread.sleep but doesnt stop --listen to dom in html webpage
		
		b.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		b.get("https://alaskatrips.poweredbygps.com/g/pt/hotels");
		b.findElement(By.id("H-destination")).sendKeys("nyc");
		b.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		b.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
		b.findElement(By.xpath("//a[@class='flex-link']")).click();
		b.close();

		//explicit wait: for each part of test//on specific location
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		
		WebDriverWait d=new WebDriverWait(c,5);
		c.get("https://alaskatrips.poweredbygps.com/g/pt/hotels");
		c.findElement(By.id("H-destination")).sendKeys("nyc");
		c.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		c.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
		
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='flex-link']")));
		c.findElement(By.xpath("//a[@class='flex-link']")).click();
		
		c.close();
		
		
		
		
		
//thread.sleep: pause for some time
		
		
		

		
	}

}
