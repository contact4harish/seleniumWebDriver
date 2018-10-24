package checkSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobutton {
	
	public static void main(String args[]){
		
		
		// handling radio buttons
		
		System.setProperty("webdriver.gecko.driver","./geckodriver.exe");
		WebDriver b=new FirefoxDriver();
		b.get("http://www.echoecho.com/htmlforms10.htm");
		//b.findElement(By.xpath("//input[@value='Cheese']")).click();
		
		
		//if the value is not given and we want to click on second index 
		// so select the attribute which has common value
		// use find elements
		System.out.println(b.findElements(By.xpath("//input[@name='group1']")).size());//find no:of ele
		int count=(b.findElements(By.xpath("//input[@name='group1']")).size());
		
		// select 1 from above 3
		// use for loop for this
		
		for(int i=0;i<count;i++)
		{
			//clicks on 3 values
			b.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			
			
			
			//click from the value
			String text=b.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			
			if(text=="Cheese"){
b.findElements(By.xpath("//input[@name='group1']")).get(i).click();			
			}
		}
		b.close();
	}

}
