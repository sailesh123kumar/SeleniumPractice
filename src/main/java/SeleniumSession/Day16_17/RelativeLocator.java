package SeleniumSession.Day16_17;

import static org.openqa.selenium.support.locators.RelativeLocator.with;  //to import static
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocator {
	static WebDriver driver;
	
	
//	                above
//	                  |
//	                  |
//	                  |
//       left <-----WebElement-----> right
//                    |
//                    |
//        near        |
//                  below
	

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.linkText("Saint John, Canada"));
		
		String Rank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		String AQI = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		String aboveState = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		String belowState = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		String nearestElementTxt = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		
		System.out.println("state :" +ele.getText()+ " = " +" Rank :" +Rank +" AQI Status : "+AQI);
		System.out.println("Above State :" +aboveState);
		System.out.println("Below State :" +belowState);
		System.out.println("Nearest Element Text :" +nearestElementTxt);
		
		Thread.sleep(3000);
		driver.quit();
	
	
	
	}
	
	
}
