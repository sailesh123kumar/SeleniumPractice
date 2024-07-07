package SeleniumSession.Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateElements {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//driver.findElement(By.linkText("Forgotten Password")).click();
		
		By linkText = By.linkText("Forgotten Password");
		By loginText = By.linkText("Login");
		doClick(linkText);
		doClick(loginText);
		
		driver.quit();
		
	}
	
	public static WebElement getElement(By loactor) {
		return driver.findElement(loactor);
	}
	
	public static void doClick(By loactor) {
		getElement(loactor).click();
	}

}
