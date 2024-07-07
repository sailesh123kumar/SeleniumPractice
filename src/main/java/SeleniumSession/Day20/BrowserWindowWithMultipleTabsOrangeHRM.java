package SeleniumSession.Day20;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowWithMultipleTabsOrangeHRM {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
		Thread.sleep(5000);
		
		//window handler apis
		//any browser: window/tab
		//advertisements
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		
		WebElement linkedinLink = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		WebElement facebookLink = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement twitterLink = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement youtubeLink = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		
		System.out.println(driver.getCurrentUrl());
		
		linkedinLink.click();
		facebookLink.click();
		twitterLink.click();
		youtubeLink.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		Iterator<String> it = windowHandles.iterator();
		
		while(it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getCurrentUrl());
			
			//Condition to close all other window except launching window
			if(!windowId.equals(parentWindowId)) {
			driver.close();
			}
		}
		
		//System.out.println(driver.getCurrentUrl());  
		//Without switching if you try to get title
		//org.openqa.selenium.NoSuchWindowException: no such window: target window already closed
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		driver.close();
	}

}
