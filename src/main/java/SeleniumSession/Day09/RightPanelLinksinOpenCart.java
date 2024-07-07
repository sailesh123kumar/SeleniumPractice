package SeleniumSession.Day09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightPanelLinksinOpenCart {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By rightPanelLinks = By.className("list-group-item");
		
		List<WebElement> links = driver.findElements(rightPanelLinks);
		System.out.println(links.size());
		
		for(WebElement e:links) {
			String text = e.getText();
			System.out.println(text);
		}
		
	}

}
