package SeleniumSession.Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//driver.findElement(By.id("input-email")).sendKeys("sailesh.kumar@gmail.com");
		
		String name="sailesh";
		String role="SDET";
		StringBuilder sb = new StringBuilder("Automation");
		StringBuffer sf = new StringBuffer("Selenium");
		
		
		driver.findElement(By.id("input-email")).sendKeys(name , " " , role ,sb , sf);
		
	}
	
}
