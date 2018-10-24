package practiceExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class limitWebdriverScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver","./geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.ebay.com/");
		
		//get title of the page//page name before and after change
		
			System.out.println("before clicking on the sublink== "+driver.getTitle());
		String beforeclick=driver.getTitle();
		//count no:of links in entire page
		//define a link then do it as a anchor tagname <a
		//<a is link and link will be <a
		
	int linknum=driver.findElements(By.tagName("a")).size();
	System.out.println("total web link number = "+linknum);		
		//scenario---a page should not be more than 50 links
		//at that time---test how many links are actually there
		
	//count the no: of links in header or footer section
	//spy entire section
	
	//create a driver obj "footer"
WebElement footer=	driver.findElement(By.xpath("//footer[@id='glbfooter']"));
	int footerlinknum=footer.findElements(By.tagName("a")).size();
	//now search is only in the footer section	
	System.out.println("footer link number = "+footerlinknum);
	
	// get the links count in 2 column in the footer section
	
	WebElement column2=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
	int column2linknum=column2.findElements(By.tagName("a")).size();
	System.out.println("number of links in column2 are "+column2linknum);
	
	//print all link names in the output
	
	for(int i=0;i<column2linknum;i++){
		//System.out.println(column2.findElements(By.tagName("a")).get(i).getText());
		//it displays all elements in column2
    //to display sitemap
	//click on particular link--but its position may change  
		if(column2.findElements(By.tagName("a")).get(i).getText().contains("Site map")){
			
			column2.findElements(By.tagName("a")).get(i).click();
			
			
			//if you find the goal
			break;
			//break the loop
			
		}
	
	
	}
	String afterclick=driver.getTitle();
	System.out.println("after clicking on the site map link== "+driver.getTitle());

if(beforeclick!=afterclick){
	System.out.println("pass");
}
else{
	System.out.println("fail");
}
	
	if(driver.getPageSource().contains("Art")){
		System.out.println(" new page source contains 'Art' ");
		
		//or else
if(driver.findElement(By.xpath(".//*[@id='buy']/div[1]/h4[2]/a")).isDisplayed()){
	System.out.println("Art is visible");
}
else{
	System.out.println("Art is not visible");
}
	}

	}

	
     
}
