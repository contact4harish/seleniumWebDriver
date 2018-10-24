package ajaxandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class captcha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//i m not a robot will be present in a frame
		//how to identify--at the left side you will see that iframe
		//you cannot view in xpath, you will find in html
		
	//captcha = small frame in a bigframe and when clicked opens a new frame
		
		System.setProperty("webdriver.chrome.driver","G:\\quality-testing-master\\seleniumWebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com/recaptcha/api2/demo");
		driver.get("https://patrickhlauke.github.io/recaptcha/");
		
		int framenum=driver.findElements(By.tagName("iframe")).size();
      System.out.println(driver.findElements(By.tagName("iframe")).size());
      for(int i=0;i<framenum;i++){
    	 int count= driver.findElements(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).size();
    	  if(count>0){
    		  driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
    	  }
    	  else{
    		  System.out.println("loading....");
    	  }
      }
      
	}
	
		
	}


//didnt get the answer//section 11--lecture 81