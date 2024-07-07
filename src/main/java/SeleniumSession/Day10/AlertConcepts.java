package SeleniumSession.Day10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcepts {

	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		By JSAlert = By.xpath("//button[text()='Click for JS Alert']");
		By JSAlertConfirm = By.xpath("//button[text()='Click for JS Confirm']");
		By JSAlertPrompt = By.xpath("//button[text()='Click for JS Prompt']");
		
		//JS click alert
//		driver.findElement(JSAlert).click();
//		Thread.sleep(3000); 
//		
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
		//alert.accept();
		
		//JS confirm alert
//		driver.findElement(JSAlertConfirm).click();
//		Alert alert = driver.switchTo().alert();
//		//alert.accept();
//		alert.dismiss();
		
		//JS Prompt alert
		
	driver.findElement(JSAlertPrompt).click();
	Thread.sleep(3000);
	Alert alert = driver.switchTo().alert();
	String text = alert.getText();
	System.out.println(text);
	alert.sendKeys("Test Automation");
	Thread.sleep(3000);
	alert.accept();
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	
}
