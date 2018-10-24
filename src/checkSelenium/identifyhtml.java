package checkSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class identifyhtml {

	public static void main(String[] args) {
	//firefox
		//html address 
		//firebug and firepath addon download for firefox
		//inspect tool
		//locators: Xpath, ID, classname, name, linktext, css selector
		//id="reg_form_box" is better than id but very rare
		
		System.setProperty("webdriver.gecko.driver","./geckodriver.exe");
		WebDriver c=new FirefoxDriver();
	c.get("http://qaclickacademy.com");
	c.findElement(By.xpath(".//*[@id='content']/div/ul/li[1]/div/h3/a")).click();
	
	c.close();
	
	//if you use same c variable, it is saying duplicate
	//use unique valued attribute
	// '<tagname attribute value' to create own xpath: //tagname[@attribute='value']
	
	WebDriver d=new FirefoxDriver();
	d.get("http://facebook.com");
	//d.findElement(By.id("email")).sendKeys("contact4harish@gmail.com");
	//d.findElement(By.linkText("Email or Phone")).sendKeys("contact4harish@gmail.com");
	d.findElement(By.xpath("//input[@id='email']")).sendKeys("contact4harish@gmail.com");
	d.findElement(By.name("pass")).sendKeys("12345");
	d.findElement(By.id("u_0_q")).click();
	d.close();
	
	
	//css selector
			// syntax for xpath:  //tagname[@attribute='value']
			// syntax for css:  tagname[attribute='value']
			WebDriver e=new FirefoxDriver();
			e.get("https://login.salesforce.com/");
			e.findElement( By.cssSelector("input[id='username']")).sendKeys("contact4harish@gmail.com");
			e.findElement( By.cssSelector("input[id='password']")).sendKeys("haris123");
			e.findElement( By.cssSelector("#Login")).click();
			//e.findElement(By.className("fld")).sendKeys("contact4harish@gmail.com");
			

	}

}
