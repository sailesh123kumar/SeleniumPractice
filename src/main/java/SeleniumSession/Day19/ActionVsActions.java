package SeleniumSession.Day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionVsActions {
	
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");  
		
		By emailId = By.id("input-email"); 
		By submitBtn = By.cssSelector("[value='Login']");
		
		Actions act = new Actions(driver);
		//act.sendKeys(driver.findElement(emailId),"Testing").perform();
		
		Action action = act.sendKeys(driver.findElement(emailId),"Testing").build();  //Return type is Action = Interface
		action.perform();
		
	}
	

}
