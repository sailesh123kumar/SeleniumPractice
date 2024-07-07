package testNGSessions.Day27.MyTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest {
	
	@Test(description = "checkin login page title...")
	public void LoginPageTitleTest() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
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
	
	
	
	
	

}
