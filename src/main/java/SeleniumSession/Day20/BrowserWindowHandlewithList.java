package SeleniumSession.Day20;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandlewithList {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
		Thread.sleep(5000);

		WebElement linkedinLink = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		System.out.println(driver.getCurrentUrl());
		
		linkedinLink.click();
		
		// 1. fetch the window ids
		Set<String> windowset = driver.getWindowHandles();
		
		//Convert set in to list
		List<String> windowlist = new ArrayList<String>(windowset);
		String parentwindowid = windowlist.get(0);
		System.out.println(parentwindowid);
		
		String childwindowid = windowlist.get(1);
		System.out.println(childwindowid);
		
		
		//2. Switching work
		driver.switchTo().window(childwindowid);
		String title = driver.getTitle();
		System.out.println("Child title : "+title);
		
		driver.close();
		
		driver.switchTo().window(parentwindowid);
		String titleparent = driver.getTitle();
		System.out.println("Parent title : "+titleparent);
		
	}
}
