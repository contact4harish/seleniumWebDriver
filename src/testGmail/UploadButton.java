package testGmail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class UploadButton {

	public static void main(String[] args) {
		
		

		
		// Open FireFox 
		System.setProperty("webdriver.gecko.driver","./geckodriver.exe");
		WebDriver f=new FirefoxDriver();
				
				
		//open url
				f.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
				
					
				
				// type username
			
				f.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("haris.kumar4095@gmail.com");
				
				//next
			
				f.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
				
	 //password
				
				
				f.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("@sriramula5");
				
				
				//next
				
				f.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
				
				//compose
								
				//select google drive
				
				f.findElement(By.xpath(".//*[@id=':o7']")).click();
				
				//select upload
			
			f.findElement(By.xpath(".//*[@id=':8']/div")).click();
	}

}
