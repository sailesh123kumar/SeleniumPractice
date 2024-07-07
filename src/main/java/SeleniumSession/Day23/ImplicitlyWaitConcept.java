package SeleniumSession.Day23;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//sync concept
		//sel script <------>  app
		
		//Thread.sleep(10000); //--- static wait
		
		//e1 ---> o secs , 2 secs , 14 secs , 18 secs
		
		//dynamic wait: 
		//10 secs -->  2 secs --> 8 secs(cancelled)
		//10 secs -->  0 secs --> 10 secs(cancelled)
		//10 secs -->  8 secs --> 2 secs(cancelled)
		//10 secs --> 12 secs --> Throws Timeout Exception
		
		// 1.Implicit Wait:
					//global wait: it will be applied for all the web elements by default
		// 2.Explicit Wait
				//2) a: WebDriverWait
				//2) b: FluentWait
		
		
		driver = new ChromeDriver();
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   //sel 3.xx Depricated from market
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   //sel 4.xx
		
		//login page
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("saileshkumar@gmail.com"); //10 sec
		driver.findElement(By.id("input-password")).sendKeys("saileshkumar@123"); //10 sec
		driver.findElement(By.id("//input[@value='Login']")).click(); //10 sec
		
		//e4 e5 e6... e10 --> 10 sec
		
		//Homepage
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		
		//Registration Page
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		
		//nulliy the implicit wait == 0
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0)); 
		
		//selenium creators clearly mentioned that we should avoid using implicit wait in our framework
		//implicit wait can not be used for non webelements: url , title , alerts , popup


	}

}
