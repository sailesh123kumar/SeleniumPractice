package SeleniumSession.Day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumSession.ElementUtil;

public class WaitTillTiltleandURLLoad {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("https://classic.freecrm.com/");
		
		By pricingLink = By.linkText("Pricing");
		
		ElementUtil eleutil= new ElementUtil(driver);
		eleutil.clickWhenReady(pricingLink, 10);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Boolean titleFlag = wait.until(ExpectedConditions.titleContains("PRICING"));
		System.out.println(titleFlag);
		
		String title = waitForTitleContains("PRICING", 5);
		System.out.println(title);
		
		String url = eleutil.waitForURLContains("pricing.html", 5);
		System.out.println(url);
		
		
		Thread.sleep(5000);  //For observation purpose
		driver.close();
	}
	
	
	public static String waitForTitleContains(String titleFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println("Title not Found");
		}
		return driver.getTitle();
	}
	
	public static String waitForTitleTobe(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.titleIs(title))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println("Title not Found");
		}
		return driver.getTitle();
	}
	
		

}
