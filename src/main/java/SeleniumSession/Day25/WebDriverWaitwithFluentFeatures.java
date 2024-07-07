package SeleniumSession.Day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitwithFluentFeatures {
	
	
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// Wait(I)-->until();
		//		-->implemented by FW(C) --until(){} + Individual method(){}
		//					-->extended by WebDriverWait --> all are inherits the property from FW

		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");

		By pricinglink = By.linkText("Pricing");
		
		//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2))
		.ignoring(NoSuchElementException.class)
		.withMessage("======Element Not Found========");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(pricinglink)).click();
	}
	


}
