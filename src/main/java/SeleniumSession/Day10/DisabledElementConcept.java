package SeleniumSession.Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElementConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		Thread.sleep(5000);
		driver.findElement(By.id("pass")).click();
		driver.findElement(By.id("pass")).sendKeys("sailesh");
		driver.findElement(By.id("passnew")).sendKeys("sailesh");
		
		Thread.sleep(3000);
		driver.quit();
	}
	
}
