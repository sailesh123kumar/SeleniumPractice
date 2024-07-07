package SeleniumSession.Day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		// parent menu
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.className(""))).perform();

		// child menu
		// driver.findElement(By.id("")).click();
		
		
		By addOns = By.xpath("//div[text()='Add-ons']");
		By youFirst = By.xpath("//div[text()='You1st']");
		
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(6000);

		handleParentSubMenu(addOns, youFirst);
	}

	public static void handleParentSubMenu(By parentLocator, By ChildLocator) throws InterruptedException {

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(parentLocator)).perform();
		Thread.sleep(2000);
		driver.findElement(ChildLocator).click();

	}

}
