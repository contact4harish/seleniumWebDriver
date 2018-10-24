package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class frameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//frames are the just as a (content and container) which is a part of html 
		
		System.setProperty("webdriver.gecko.driver","./geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

driver.get("https://jqueryui.com/droppable/");
WebDriverWait wait=new WebDriverWait(driver,5);
//wait.until(ExpectedCondit)//driver.get("https://jqueryui.com/droppable/"))

wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[class='demo-frame']")));

//to handle frames(boxes)say the selenium that it is a frame

driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
WebElement source=driver.findElement(By.id("draggable"));
WebElement destination=driver.findElement(By.id("droppable"));
Actions act=new Actions(driver);
act.dragAndDrop(source, destination).build().perform();

//to know how many frames are present
System.out.println(driver.findElements(By.tagName("iframe")).size());


	}

}
