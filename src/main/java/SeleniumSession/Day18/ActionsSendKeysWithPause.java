package SeleniumSession.Day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;

public class ActionsSendKeysWithPause {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By searchby = By.name("search");
		WebElement searchBox = driver.findElement(By.name("search"));
//		String key = "macbook";
//		Actions act = new Actions(driver);
//
//		char[] keyArray = key.toCharArray();
//		for (char e : keyArray) {
//			// Method 1
//			act.sendKeys(searchBox, String.valueOf(e)).pause(1000).perform();
//			// Method 2
//			// act.sendKeys(searchBox, (e+"")).perform(); //Code will looks ugly so avoid
//			// this
//		}
		
		doActionsSendKeyswithPause(searchby, "macbook", 1000);

		Thread.sleep(3000);
		driver.quit();

	}

	public static void doActionsSendKeyswithPause(By locator, String value, long pauseTime) {
		Actions act = new Actions(driver);
		char[] valueArray = value.toCharArray();
		for (char c : valueArray) {
			act.sendKeys(driver.findElement(locator), String.valueOf(c)).pause(pauseTime).perform();
		}
	}

}
