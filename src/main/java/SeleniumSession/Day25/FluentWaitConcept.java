package SeleniumSession.Day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import SeleniumSession.ElementUtil;

public class FluentWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// Wait(I)-->FW(C)-->WebDriverWait

		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.isPageLoaded(8);
		

		By pricinglink = By.linkText("Pricing");

		// Default polling time is 500 ms
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//					.withTimeout(Duration.ofSeconds(10))
//						.pollingEvery(Duration.ofSeconds(2))
//							.ignoring(NoSuchElementException.class)
//								.withMessage("=======element is not found=======");
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(pricinglink)).click();

//		WebElement pricing_ele = waitForElementVisibleWithFluentWait(pricinglink, 10, 2);
//		pricing_ele.click();

//		driver.quit();

	}

	public static WebElement waitForElementVisibleWithFluentWait(By locator, int timeOut, int intervalTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(intervalTime))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.withMessage("=======element is not found=======");
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static WebElement waitForElementPresenceWithFluentWait(By locator, int timeOut, int intervalTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(intervalTime))
				.ignoring(NoSuchElementException.class)
				.withMessage("=======element is not found=======");
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
