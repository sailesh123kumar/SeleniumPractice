package SeleniumSession.Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMConcepts {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException  {
		
		driver=new ChromeDriver();
		
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		
		Thread.sleep(4000);
		String jsScript="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement pizza =(WebElement) js.executeScript(jsScript);
		
		pizza.sendKeys("ButterChicken");
		
		
	}
}
