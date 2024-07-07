package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// Find a webelement + perform an action(click , sendkeys , getText
		// ,isDisplayed..etc)

		// 1.
//		driver.findElement(By.id("input-email")).sendKeys("sailesh.kumar@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("sailesh@123");

		// 2.
//		WebElement username = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		username.sendKeys("sailesh.kumar@gmail.com");
//		password.sendKeys("sailesh@123");

		// 3.By locator : OR
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement emailele = driver.findElement(email);
//		WebElement passwordele = driver.findElement(password);
//		
//		emailele.sendKeys("sailesh.kumar@gmail.com");
//		passwordele.sendKeys("sailesh@123");

		// 4.By locator + Generic function for Webelements
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(email).sendKeys("sailesh.kumar@gmail.com");
//		getElement(password).sendKeys("sailesh@123");

		// 5.By locator + Generic function for Webelements and SendKey
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//
//		doSendKeys(email, "sailesh.kumar@gmail.com");
//		doSendKeys(password, "sailesh@123");

		// 6.By locator + Generic function for Webelements and SendKey : ElementUtils
		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//
//		eleUtil.doSendKeys(email, "sailesh.kumar@gmail.com");
//		eleUtil.doSendKeys(password, "sailesh@123");
		
		//7.By locator + BrowserUtils + ElementUtils
		
		
		

		driver.quit();
		
		

	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By loactor) {
		return driver.findElement(loactor);
	}

}
