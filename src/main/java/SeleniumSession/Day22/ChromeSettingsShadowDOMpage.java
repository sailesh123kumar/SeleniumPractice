package SeleniumSession.Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSettingsShadowDOMpage {
	
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException  {
		
		driver=new ChromeDriver();
		
		driver.get("chrome://settings/");
		
		String jsScript="return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Return type is html so converting it to webElement
		WebElement search =(WebElement) js.executeScript(jsScript);
		
		search.sendKeys("password");
		
		driver.close();
		
	}
		
		

}
