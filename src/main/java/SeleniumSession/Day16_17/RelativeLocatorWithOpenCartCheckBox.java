package SeleniumSession.Day16_17;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocatorWithOpenCartCheckBox {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement belowele = driver.findElement(By.xpath("//h2[text()='New Customer']"));
		WebElement aboveele = driver.findElement(By.linkText("Continue"));
		
		List<WebElement> headersList1 = driver.findElements(with(By.tagName("p")).below(belowele));
		for(WebElement e:headersList1) {
			String text = e.getText();
			System.out.println(text);
		}
		
		System.out.println("==============================");
		
		
		List<WebElement> headersList2 = driver.findElements(with(By.tagName("p")).below(belowele).above(aboveele));
		for(WebElement e1 :headersList2) {
			String text = e1 .getText();
			System.out.println(text);
		}

		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();

	}
}
