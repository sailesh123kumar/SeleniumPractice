package SeleniumSession.Day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By email = By.id("input-email");
		By forgotPW = By.linkText("Forgotten Password");
		
        //Apprroach1
		// boolean emaildisplayed =
		// driver.findElement(By.id("input-email")).isDisplayed();
		// boolean emaildisplayed =
		// driver.findElement(By.id("input-email1")).isDisplayed();

        //		boolean doIsDisplayed = doIsDisplayed(email);
        //		System.out.println(doIsDisplayed);

		// System.out.println(emaildisplayed); //It wont return false , It will throw
		// NSE exception
		if (doIsDisplayed(email)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		
		
		//Approach 2
		
//		List<WebElement> elements = driver.findElements(email);
//		int elementSize = elements.size();
//		
//		if(elementSize==1) {
//			System.out.println("email id is present in the page");
//		} else {
//			System.out.println("email id displays more than one or zero time in the page");
//		}
		
		boolean elementsDisplayed = isElementsDisplayed(email);
		System.out.println(elementsDisplayed);
		
		boolean forgtPWDisplayed = isElementsDisplayed(forgotPW,2);
		System.out.println(forgtPWDisplayed);

		Thread.sleep(3000);
		driver.quit();

	}
	
	
	
	

	public static boolean doIsDisplayed(By locator) {
		try {
			boolean flag = getElement(locator).isDisplayed();
			System.out.println("element is displayed " + locator);
			return flag;
		} catch (NoSuchElementException e) {
			System.out.println("element with locator " + locator + " is not displayed");
			return false;
		}
	}
	
	public static boolean isElementsDisplayed(By locator,int expectedElementCount) {
		int elementsCount = driver.findElements(locator).size();
		if(elementsCount==expectedElementCount) {
			System.out.println("element is displayed: "+locator + " with occurence of "+expectedElementCount);
			return true;
		}
		else {
			System.out.println("Multiple or Zero element is displayed "+locator);
			return false;
		}
	}
	
	public static boolean isElementsDisplayed(By locator) {
		int elementsCount = driver.findElements(locator).size();
		if(elementsCount==1) {
			System.out.println("Single element is displayed "+locator);
			return true;
		}
		else {
			System.out.println("Multiple or Zero element is displayed "+locator);
			return false;
		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
