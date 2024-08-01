package SeleniumSession.Day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSession.Utils.ElementUtil;

public class GetAttributValue {
	static WebDriver driver;
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By linkText = By.linkText("Forgotten Password");
		By email = By.id("input-email");
		
		String href = driver.findElement(linkText).getAttribute("href");
		System.out.println(href);
		
		String placeholdervalue = driver.findElement(email).getAttribute("placeholder");
		System.out.println(placeholdervalue);
		
		driver.findElement(email).sendKeys("saileshkumar@gmail.com");
//		String value = driver.findElement(email).getAttribute("value");
//		System.out.println(value);
		
		ElementUtil elUtil = new ElementUtil(driver);
		String val = elUtil.doGetAttribute(email, "value");
		System.out.println(val);
		
		driver.quit();
		
		
		
	}
	
}
