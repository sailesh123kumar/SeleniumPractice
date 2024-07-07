package SeleniumSession.Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1. id : Unique Attribute
		// driver.findElement(By.id("input-email")).sendKeys("sailesh.kumar@gmail.com");

		// 2. name : can be duplicate
		// driver.findElement(By.name("email")).sendKeys("saileshkumar@gmail.com");

		// 3. class name : can be duplicate
		// driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");

		// 4. xpath: its not an attribute - xpath is an address of element in html dom
		// driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("sailesh.kumar@gmail.com");

		// 5. cssSelector: its not an attribute
		// driver.findElement(By.cssSelector("#input-email")).sendKeys("sailesh.kumar@gmail.com");

		// 6 LinkText: only for links. htmltag <a>
		// driver.findElement(By.linkText("Register")).click();

		// 7. PartialLinkText: only for links
		//driver.findElement(By.partialLinkText("Delivery")).click();
		//Duplicate elemts and always clicks the 1st element
		//Delivery information
		//Delivery Product
		
		//8.  Tagname
//		String text = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(text);
		
		
		
		
		

	}

}
