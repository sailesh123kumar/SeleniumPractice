package SeleniumSession.Day20;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BrowserWindowHandlehasPairInOrangeHRM {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
		Thread.sleep(5000);
		
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		
		List<WebElement> linksList = driver.findElements(By.cssSelector(".orangehrm-login-footer-sm a"));
		
		for(WebElement e:linksList) {
			e.click();
			Set<String> windowHandles = driver.getWindowHandles();
			Iterator<String> it = windowHandles.iterator();
			
			while(it.hasNext()) {
				String windowid = it.next();
				if(!windowid.equals(parentWindowId)) {
					driver.switchTo().window(windowid);
					String title = driver.getTitle();
					System.out.println(title);
					driver.close();
					}
			}
			
			driver.switchTo().window(parentWindowId);
		}
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}
