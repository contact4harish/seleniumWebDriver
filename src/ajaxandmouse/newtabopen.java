package ajaxandmouse;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtabopen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//parent-child tab//handling multiple windows
		
		//driver invocation
		System.setProperty("webdriver.chrome.driver","G:\\quality-testing-master\\seleniumWebDriver\\chromedriver.exe");
		WebDriver n=new ChromeDriver();
		n.get("https://www.google.com/gmail/about/");
		n.findElement(By.xpath("//a[@class='gmail-nav__nav-link gmail-nav__nav-link__create-account']")).click();
		System.out.println("before switching");
		System.out.println(n.getTitle());
		

		//switch to particular window--you need to know id of the window
		
		Set<String>ids=n.getWindowHandles();
		
		//stores as string id's=all windows ids
		//windows will be stored in the form of data structures(array)
		//now to store the data as datastructures--use iterater
		
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		
		//now switch to child window
		
		n.switchTo().window(childid);
		System.out.println("after switching");
		System.out.println(n.getTitle());
		
		//second switch
		
		n.switchTo().window(parentid);
		System.out.println("after second switch");
		System.out.println(n.getTitle());
		
		

	}

}
