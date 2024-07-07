package SeleniumSession.Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConceptWithException {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		//Generic Method created in Element Utils
		
		//NSE
		try {
			driver.findElement(By.id("input-email11")).sendKeys("sailesh.kumar@gmail.com");
		} catch (NoSuchElementException e) {
			e.printStackTrace(); 
		}
		
		//on send keys should not pass null
		//driver.findElement(By.id("input-password")).sendKeys(null); //Invalid Argument Exception
		
		driver.quit();
		
	}
}
