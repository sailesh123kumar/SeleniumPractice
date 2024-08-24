package InterviewPractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.class)
public class ApplicationLaunchTest extends TestListener {
	
	
	@Test
	public void launchAmazon() {
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
	}
	

}
