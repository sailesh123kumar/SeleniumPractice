package SeleniumSession.Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		// Java + Selenium code (4.x)

		// Open the Browser
		// Automation + Validation = Automation Testing

		// Automation
		// WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.google.com/");

		// Title validation
		String title = driver.getTitle();
		System.out.println("Page Title : " + title);
		if (title.equals("Google")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is not correct");
		}

		// URL Validation
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Page URL :" + currentUrl);
		if (currentUrl.contains("google.com")) {
			System.out.println("URL is correct");
		} else {
			System.out.println("URL is not correct");
		}
		driver.close();

	}

}
