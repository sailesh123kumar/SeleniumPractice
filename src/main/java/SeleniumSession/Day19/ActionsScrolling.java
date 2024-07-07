package SeleniumSession.Day19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");  
		
		Actions act = new Actions(driver);
		//act.sendKeys(Keys.PAGE_DOWN).pause(2000).sendKeys(Keys.PAGE_UP).perform();
		
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
//		Thread.sleep(4000);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		
		act.scrollToElement(driver.findElement(By.linkText("Help"))).click(driver.findElement(By.linkText("Help"))).perform();
		
	}

}
