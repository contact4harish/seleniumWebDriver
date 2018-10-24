package practiceExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autosuggestivedropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//when you write a text, suggestions will be there as a dropdown
		//this happens when you stop writing the text in middle
		//wait should be there through explicit wait
		System.setProperty("webdriver.chrome.driver","G:\\quality-testing-master\\seleniumWebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://demos.telerik.com/kendo-ui/dropdownlist/serverfiltering");
		driver.findElement(By.xpath(".//*[@id='example']/div/span/span/span[1]")).click();
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='products-list']/div[2]")));
		
	}

}
