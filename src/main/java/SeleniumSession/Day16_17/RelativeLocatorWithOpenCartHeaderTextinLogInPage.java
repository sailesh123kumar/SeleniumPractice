package SeleniumSession.Day16_17;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocatorWithOpenCartHeaderTextinLogInPage {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement ele = driver.findElement(By.cssSelector(".agree"));
		
		driver.findElement(with(By.cssSelector("input[name='agree']")).toRightOf(ele)).click();
		driver.findElement(with(By.cssSelector("input[value='Continue']")).toRightOf(ele)).click();

		Thread.sleep(3000);
		driver.quit();

	}
}
