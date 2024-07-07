package testNGSessions.Day27.MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest{
		
	
		
	
	@Test(description = "checkin login page title...")
	public void orangeHRMTitleTest() {
		String title = driver.getTitle();
		System.out.println("Page title is : "+title);
		Assert.assertEquals(title, "30-Day Advanced Free Trial | OrangeHRM" ,"===title is not matched===");
	}
	
	@Test(description = "checkin login page url...")
	public void orangeHRMURLTest() {
		String url = driver.getCurrentUrl();
		System.out.println("Page title is : "+url);
		Assert.assertTrue(url.contains("orangehrm"), "===Url validation failed===");
	}
	
		
	

}
