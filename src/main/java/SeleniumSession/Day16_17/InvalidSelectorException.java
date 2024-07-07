package SeleniumSession.Day16_17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidSelectorException {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// driver.findElement(By.id("input-email")).sendKeys("sailesh testing"); //NSE

		// driver.findElement(By.cssSelector("input//[@id=='Testing']")).sendKeys("testing");
		// org.openqa.selenium.InvalidSelectorException: invalid selector

		// driver.findElement(By.xpath("//input//@@name==-email")).sendKeys("sailesh
		// testing");
		// org.openqa.selenium.InvalidSelectorException: invalid selector

		Thread.sleep(3000);

		driver.quit();

	}

}
