package ListenerandScreenshotTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListenerwithScreenshot.class)
public class AmazonTest extends ListenerwithScreenshot {

	@Test
	public void launchAmazonandsearch() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Mobile");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[4]")).click();
		
		
		
	}
	
	
}
