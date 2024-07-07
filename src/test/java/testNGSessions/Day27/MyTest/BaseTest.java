package testNGSessions.Day27.MyTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import SeleniumSession.BrowserException;

public class BaseTest {
	WebDriver driver;
	
	@Parameters({"browser","url"})
	@BeforeTest
	public void setUp(String browserName , String url) {
		
		switch (browserName.trim().toLowerCase()) 
		{
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		case "edge":
			driver=new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the right browser..."+browserName);
			throw new BrowserException("===WRONG BROWSER PASSED===");
			
		}
		
		
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}
	
		@AfterTest
		public void tearDown() {
			driver.quit();
		}

}
