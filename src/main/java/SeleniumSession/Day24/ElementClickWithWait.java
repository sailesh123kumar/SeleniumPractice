package SeleniumSession.Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSession.Utils.ElementUtil;

public class ElementClickWithWait {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("https://classic.freecrm.com/");
		
		By pricingLink = By.linkText("Pricing");
		
		ElementUtil eleutil= new ElementUtil(driver);
		eleutil.clickWhenReady(pricingLink, 10);
		Thread.sleep(5000);  //For observation purpose
		driver.close();
		
	}
	

}
