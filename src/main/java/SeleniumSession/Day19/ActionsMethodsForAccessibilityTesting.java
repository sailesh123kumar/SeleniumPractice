package SeleniumSession.Day19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodsForAccessibilityTesting {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		WebElement firstName = driver.findElement(By.id("input-firstname"));

		Actions act = new Actions(driver);
		act.sendKeys(firstName, "Selenium")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("Automation")
		.sendKeys(Keys.TAB)
	    .pause(1000)
	    .sendKeys("SeleniumAutomation@yahoo.com")
	    .sendKeys(Keys.TAB)
	    .pause(1000)
		.sendKeys("0987654321")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("0987654321")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("0987654321")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.SPACE)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.ENTER)
		.pause(1000)
		.perform();

	}

}
