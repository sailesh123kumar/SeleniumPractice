package SeleniumSession.Day07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		// Approach1
		int count = 0;
		for (int i = 0; i < linksList.size(); i++) {
			String text = linksList.get(i).getText();
			if (text.length() != 0) {
				System.out.println(text);
				count++;
			}
		}
		System.out.println("================================");

		int size = linksList.size();
		System.out.println("Total Links size : " + size);

		System.out.println("Links with Text count is :" + count);

		int withoutTextLinkcount = size - count;
		System.out.println("No of links without text is :" + withoutTextLinkcount);

		System.out.println("================================");

		// Approach2
		for (WebElement link : linksList) {
			String text = link.getText();
			if(text.length()!=0) {
			System.out.println(text);
			}
		}

	}
	
	
	

}
