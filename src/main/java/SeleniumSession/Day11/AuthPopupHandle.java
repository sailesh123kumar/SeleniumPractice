package SeleniumSession.Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopupHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

			//Basic Auth
		
		String userName ="admin";
		String password ="admin";
		
		
			driver = new ChromeDriver();
			//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			driver.get("https://"+userName+":"+password+"@the-internet.herokuapp.com/basic_auth");
			
			Thread.sleep(4000);
			driver.quit();
			
			
			
			
		}
}
