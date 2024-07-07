package SeleniumSession.Day22;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsuedoElementHandlewithJavaScript {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// Psuedo class
		// ::Before
		// ::After
		// ::Has
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		String firstnamecontentScript = "return window.getComputedStyle(document.querySelector(\"#account > div:nth-child(3) > label\"),'::before').getPropertyValue('content');";
		String mand_color = "return window.getComputedStyle(document.querySelector(\"#account > div:nth-child(3) > label\"),'::Before').getPropertyValue('color')";
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String mand_fieldText = js.executeScript(firstnamecontentScript).toString();
		String color = js.executeScript(mand_color).toString();

		System.out.println(mand_fieldText);
		System.out.println(color);
		
		Thread.sleep(4000);
		driver.quit();

	}
}
