package checkSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {
	
	public static void main(String args[]){
		
		
		//check box is same as basic locator 
		System.setProperty("webdriver.chrome.driver","G:\\quality-testing-master\\seleniumWebDriver\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("https://book2.spicejet.com/search.aspx");
		a.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense")).click();
		
		
		//how to validate if checkbox is selected or not
		//checkdriver.findelement
		
		System.out.println(a.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense")).isSelected());
		 //a.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense").isChecked());
	a.close();
	
	}

}
