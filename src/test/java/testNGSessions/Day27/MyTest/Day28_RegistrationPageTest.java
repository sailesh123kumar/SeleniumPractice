package testNGSessions.Day27.MyTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day28_RegistrationPageTest extends BaseTest {
	
	public static String getRandomEmailId() {
		String emailId ="openkart" +System.currentTimeMillis()+"@gmail.com";
		return emailId;
	}
	
	
	@DataProvider
	public Object[][] getRegTestData() {
		return new Object[][] {
			{"kavi","selenium","9988776655","kavi@123"},
			{"sail","selenium","9988776655","sail@123"},
			{"kumar","selenium","9988776655","kumar@123"}
		};
	}
	
	@Test(dataProvider ="getRegTestData")
	public void registerTest(String firstName,String lastName,String phone,String password) {
		
		driver.findElement(By.id("input-firstname")).sendKeys(firstName);
		driver.findElement(By.id("input-lastname")).sendKeys(lastName);
		driver.findElement(By.id("input-email")).sendKeys(getRandomEmailId());
		driver.findElement(By.id("input-telephone")).sendKeys(phone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(password);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		String text = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		System.out.println(text);
		
		Assert.assertEquals(text, "Your Account Has Been Created!");
		
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Register")).click();
	}
	
	

}
