package BuilderPatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import InterviewPractice.TestListener;


public class RegistrationPageTest {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void userRegistrationtest() {
		
		Register register = new Register.RegisterBuilder()
					.setFirstName("sailesh kumar")
					.setLastNmae("testing")
					.setEmail("random"+System.currentTimeMillis()+"@cart.com")
					.setTelephone("9988776655")
					.setPassword("random123")
					.setConfirm("random123")
					.build();
		
		
		RegisterationPage registerpage = new RegisterationPage(driver);
		registerpage.UserRegister(register);
		
		
		
	}
	

}
