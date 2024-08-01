package SeleniumSession.Day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumSession.Utils.ElementUtil;

public class ExplicitWaitConcept {
	
	//Wait(I) - until();
		//implemented by FluentWait(C) -- methods(){} + until(){}
			//extended by WebDriverWait (C) --> Inherited Methods + Individual Methods
	
	//Dont mix implicit wait and Explicit wait
	
	//		implicit   explicit     cum
	//e1:       10        20        30
	//e1:       05        02        07
	//e1:       18        01        19
	//e1:       00        09        09
	//e1:       21(NSE)       
	//e1:       00        00        00
	//e1:       20        00        20

	
	

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();

		// login page
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginbtn = By.xpath("//input[@value='Login']");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(email));
//		email_ele.sendKeys("sailesh@yahoo.com");
		
		
//		waitForElementPresence(email, 10).sendKeys("sailesh@google.com");
//		getElement(password).sendKeys("saiesh@123");
//		getElement(loginbtn).click();
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(email, 10, "sailesh@google.com");
		eleUtil.doSendKeys(password, "saiesh@123");
		eleUtil.doClick(loginbtn, 5);
		

	}
	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does notnecessarily mean that the element is visible.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public static WebElement waitForElementPresence(By locator,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementVisible(By locator,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	

}
