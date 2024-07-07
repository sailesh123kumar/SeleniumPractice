package SeleniumSession.Day20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowTabConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentwindowid = driver.getWindowHandle();

		// Create a new Blank tab and automaticallyb switchto new Window
		// driver.switchTo().newWindow(WindowType.TAB);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentwindowid);
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		

	}

}
