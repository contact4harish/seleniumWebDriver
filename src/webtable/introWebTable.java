package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class introWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//invoke driver and open web
		System.setProperty("webdriver.gecko.driver","./geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.espncricinfo.com/icc-champions-trophy-2017/content/series/1022345.html");
		
		//find table in web
		WebElement table=driver.findElement(By.xpath(".//*[@id='viewport']/div[6]/div[2]/div[2]/section[2]/section[2]/div[2]"));
		//no of rows in a table
		int noOFrows=table.findElements(By.tagName("tr")).size();
		System.out.println("no of rows are = "+noOFrows);
		
		///or 
		List<WebElement>noOFrows2=table.findElements(By.tagName("tr"));
		System.out.println("no of rows in the table = "+noOFrows2.size());
		//no of colums in the table
		int i=0;
		//each row and no of columns in each row
		for(WebElement eachrow:noOFrows2){
			//datatype <obj contained in list>name of list
			List<WebElement>noOFcolumns=eachrow.findElements(By.tagName("td"));
			i++;
			System.out.println("the number of colums of row "+i+" are "+noOFcolumns.size());
			
			for(WebElement eachcolumn:noOFcolumns){
			
				System.out.println("the text in the column is = "+eachcolumn.getText());
			
			
			
			}
		}
		
	}

}
