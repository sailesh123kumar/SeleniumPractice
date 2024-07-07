package SeleniumSession.Day09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogeLanguagePrint {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		By langLinkText = By.xpath("//div[text()='Google offered in:  ']/a");
		
		List<WebElement> links = driver.findElements(langLinkText);
		
		for(WebElement e:links) {
			String text = e.getText();
			System.out.println(text);
		}
		
	}
	
}
