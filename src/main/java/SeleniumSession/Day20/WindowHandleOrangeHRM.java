package SeleniumSession.Day20;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleOrangeHRM {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
		Thread.sleep(5000);
		WebElement linkedinLink = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		WebElement facebookLink = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement twitterLink = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement youtubeLink = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		
		System.out.println(driver.getTitle());
		twitterLink.click();
		
		//1.Fetch the Window ids
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();
		
		//Parent ID
		String parentId = it.next();
		System.out.println("parent windown id : "+parentId);  
		//Whenever we handle 2 window it will always store parent window id on first

		//Child ID
		String childId = it.next();
		System.out.println("child windown id : "+childId);
		
		
		//2.Switch work
		driver.switchTo().window(childId);
		Thread.sleep(4000);
		System.out.println(driver.getCurrentUrl());
		
		driver.close();  //driver is lost here
		
		driver.switchTo().window(parentId);
		Thread.sleep(4000);
		System.out.println(driver.getTitle());

		driver.close();
	}

}
