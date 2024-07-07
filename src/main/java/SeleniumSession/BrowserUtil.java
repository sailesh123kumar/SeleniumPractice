package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
	WebDriver driver;
	
	public WebDriver launchBrowser(String browserName) {
		
		System.out.println("Browser Name is : " + browserName);
		
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		case "edge":
			driver=new EdgeDriver();
			break;

		case "safari":
			driver=new SafariDriver();
			break;

		default:
			System.out.println("Please pass the right browser Name :" +browserName);
			throw new BrowserException("INVALID BROWSER ... :" +browserName);
		}
		
		return driver;
		
		
	}
	
	public void launchURL(String url) {
		if(url==null) {
			throw new BrowserException("INVALID URL... " +url);
		}
		
		if(url.isBlank() || url.isEmpty()) {
			throw new BrowserException("Blank/Empty URL... " +url);
		}
		
		if (url.indexOf("http")==-1 || url.indexOf("http")>0) {
			throw new BrowserException("http(s) is missing or Misplaced... " +url  );
		}
		driver.get(url.trim());
	}
	
	
	public String getPageTiltle() {
		String title = driver.getTitle();
		if(title==null) {
			System.out.println("getting the null title...");
			return null;
		} 
			return title;
			
	}
	
	public String getPageCurrentURL() {
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	public void closeBrowser() {
		driver.close();
	}
		
		

}
