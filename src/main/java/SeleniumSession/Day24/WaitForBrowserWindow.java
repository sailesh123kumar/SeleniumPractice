package SeleniumSession.Day24;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumSession.Utils.ElementUtil;

public class WaitForBrowserWindow {
	
	static WebDriver driver;
	public static void main(String[] args){

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
		
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		
		By linkedinLink = By.xpath("//a[contains(@href,'linkedin')]");
		By facebookLink = By.xpath("//a[contains(@href,'facebook')]");
		By twitterLink = By.xpath("//a[contains(@href,'twitter')]");
		By youtubeLink = By.xpath("//a[contains(@href,'youtube')]");
		
		ElementUtil eleUtil =new ElementUtil(driver);
		eleUtil.clickWhenReady(twitterLink, 10);
		
		if(waitForWindowsToBe(5, 2)) {
			Set<String> windowHandles = driver.getWindowHandles();
			
			Iterator<String> it = windowHandles.iterator();
			
			while(it.hasNext()) {
				String windowId = it.next();
				driver.switchTo().window(windowId);
				System.out.println(driver.getCurrentUrl());
				
				if(!windowId.equals(parentWindowId)) {
				driver.close();
				}
			}
			
			
			driver.switchTo().window(parentWindowId);
			System.out.println(driver.getCurrentUrl());
			
			
			driver.close();
		}
		
		
		
	}
	
	public static Boolean waitForWindowsToBe(int timeOut, int totalWindows) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(totalWindows));
	}
	

}
