package testNGSessions.Day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class openCartLoginTest {
	WebDriver driver;
	
	//@BeforeMethod
	@BeforeTest
	public void setUp() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	}
	
	@Test(description = "checkin login page title...")
	public void LoginPageTitleTest() {
		String title = driver.getTitle();
		System.out.println("Page title is : "+title);
		Assert.assertEquals(title, "Account Login" ,"===title is not matched===");
	}
	
	@Test(description = "checkin login page url...")
	public void LoginPageURLTest() {
		String url = driver.getCurrentUrl();
		System.out.println("Page title is : "+url);
		Assert.assertTrue(url.contains("route=account/login"), "===Url validation failed===");
	}
	
	@Test(description = "checkin login page logo...")
	public void LoginPageLogoTest() {
		boolean displayed = driver.findElement(By.cssSelector("img[title='naveenopencart']")).isDisplayed();
		Assert.assertEquals(displayed,true,"===logo is not displayed===");
	}
	
	//@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
