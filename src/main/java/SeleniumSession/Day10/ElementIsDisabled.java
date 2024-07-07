package SeleniumSession.Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisabled {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/register/");
		
		By submitBtn = By.xpath("//button[@name='submitButton']");
		
		By checkBox = By.name("agreeTerms");
		
		System.out.println("Is Displayed"); //True
		System.out.println(driver.findElement(submitBtn).isDisplayed());
		System.out.println("Is Enabled"); //False
		System.out.println(driver.findElement(submitBtn).isEnabled());
	
		System.out.println();
		System.out.println();
		
		System.out.println("Is Selected");
		System.out.println(driver.findElement(checkBox).isSelected());
		
		driver.findElement(checkBox).click();
		
		System.out.println("Is Selected");
		System.out.println(driver.findElement(checkBox).isSelected());

		
		System.out.println();
		System.out.println();
		
		System.out.println("Is Displayed"); //True
		System.out.println(driver.findElement(submitBtn).isDisplayed());
		
		System.out.println("Is Enabled"); //True
		System.out.println(driver.findElement(submitBtn).isEnabled());
		
		
		
		Thread.sleep(3000);
		driver.quit();

	}
	
}
