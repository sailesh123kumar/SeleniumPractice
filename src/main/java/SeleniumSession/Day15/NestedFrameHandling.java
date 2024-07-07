package SeleniumSession.Day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameHandling {

	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		WebDriver frame1 = driver.switchTo().frame("pact1");  //f1
		frame1.findElement(By.cssSelector("[placeholder='First Crush']")).sendKeys("Aishwarya Rai");

		WebDriver frame2 = driver.switchTo().frame("pact2");  //f2
		frame2.findElement(By.cssSelector("[placeholder='Current Crush Name']")).sendKeys("Laxmi Rai");

		WebDriver frame3 = driver.switchTo().frame("pact3");  //f3
		frame3.findElement(By.cssSelector("[placeholder='Destiny']")).sendKeys("Wife");
		
		//Page -- F1 : yes
		//F1 -- F2 : yes
		//F2 -- F3 : yes
		
		//Page -- F2 : No
		//Page -- F3 : No
		//Page --> F1 --> F2 --> F3
		
		//F1 --> DC = Page
		//F1 --> ParentFrame = Page
		
		WebDriver parentFrame = driver.switchTo().parentFrame();   //It will switch to previous frame F2
		parentFrame.findElement(By.cssSelector("[placeholder='Current Crush Name']")).sendKeys(" Samantha");
		
		//It will switch to Main Page
		driver.switchTo().defaultContent();  //If we comment this line --Below will throw NSE Exception
		
		String text = driver.findElement(By.xpath("//h3[text()='Memory Test']")).getText();
		System.out.println(text);

		Thread.sleep(3000);
		driver.quit();
		
		
		
	}
}
