package SeleniumSession.Day16_17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();//browser
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");  //Page DOM V1
		
		WebElement emailId = driver.findElement(By.id("input-email")); //V1
		
		emailId.sendKeys("sailesh123@gmail.com");  //V1
		//V1 webelement id = f.D0A42DD3F9338DD64A689D1A66011F50.d.A433EEEC68B258183156B17771BB7BF7.e.4
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		//DOM V2 
		//V1 WebElement
		//emailId.sendKeys("kumar123@gmail.com");  //org.openqa.selenium.StaleElementReferenceException
		
		//Reinstantiate the webelement variable to avoid staleElementException
		emailId = driver.findElement(By.id("input-email"));
		Thread.sleep(2000);
		emailId.sendKeys("kumar123@gmail.com");
		

		Thread.sleep(3000);
		driver.quit();

		
	}
}
