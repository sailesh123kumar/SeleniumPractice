package SeleniumSession.Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueUsingElement {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		
		WebElement element = driver.findElement(By.cssSelector("[value='Login']"));
		
		String cssValue = element.getCssValue("background");
		System.out.println(cssValue);
		
		driver.close();
		
	}

}
