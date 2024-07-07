package testNGSessions.Day27.MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
	
	@Test(description = "checkin login page title...")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("Page title is : "+title);
		Assert.assertEquals(title, "Google" ,"===title is not matched===");
	}
	
	@Test(description = "checkin login page url...")
	public void googleURLTest() {
		String url = driver.getCurrentUrl();
		System.out.println("Page title is : "+url);
		Assert.assertTrue(url.contains("google"), "===Url validation failed===");
	}
	

	
	
	
	
	

}
