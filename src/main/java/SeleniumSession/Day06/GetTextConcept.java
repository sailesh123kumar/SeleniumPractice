package SeleniumSession.Day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSession.Utils.ElementUtil;

public class GetTextConcept {

	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		By linkText = By.linkText("Forgotten Password");
		String forgotLink = driver.findElement(linkText).getText();
		System.out.println(forgotLink);
		
		
		System.out.println("-------With doGetText()---------");
		
		ElementUtil elUtil = new ElementUtil(driver);
		
		String fogotlinktxt = elUtil.doGetText(linkText);
		System.out.println(fogotlinktxt);
		

	}
	
	
	
	
}
