package SeleniumSession.Day15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		// To interact with svg only xpath is applicable , css is not recommended
		//   //*[local-name()='svg']
		//   //*[name()='svg']

		driver = new ChromeDriver();
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		Thread.sleep(6000);
		String xpath1="//*[local-name()='svg'  and @id='map-svg']/*[name()='g' and @id='features']/*[name()='g' and @id='regions']//*[name()='path']";
		String xpath2="//*[local-name()='svg'  and @id='map-svg']//*[name()='path']";
		
		
		WebDriver frame = driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		List<WebElement> elements = frame.findElements(By.xpath(xpath2));
		
		System.out.println(elements.size());
		for(WebElement e:elements) {
			String attribute = e.getAttribute("name");
			System.out.println(attribute);
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	

}
