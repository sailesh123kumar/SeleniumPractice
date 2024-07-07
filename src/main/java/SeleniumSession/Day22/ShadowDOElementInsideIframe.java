package SeleniumSession.Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOElementInsideIframe {

	
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException  {
		
		driver=new ChromeDriver();
		
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		
		//Browser --> Page --> Iframe --> ShadowDOM -->Element
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe#pact")));
		
		String jsScript="return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement tea =(WebElement) js.executeScript(jsScript);
		
		tea.sendKeys("I love tea than coffee");
		
		driver.close();

		
		
		
	}
}
