package SeleniumSession.Day41;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeadlessAndIncognitoMode {

	public static void main(String[] args) {
		
		//headless mode:
		//no browser - blocking the browser visibility
		//faster
		//not recommended - no user exp
		//when to use?--> headless based os -- linux , docker , VM
		//for simple ad small test cases --> yes
		//it might not work with complete html components
		//Actions class also will work
		
		ChromeOptions co = new ChromeOptions();
		//WebDriver driver= new ChromeDriver(co);
		//co.addArguments("--headless");
		//co.addArguments("--incognito");
		
		
		FirefoxOptions fo = new FirefoxOptions();
		//fo.addArguments("--headless");
		//fo.addArguments("--incognito");
		WebDriver driver= new FirefoxDriver(fo);
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
