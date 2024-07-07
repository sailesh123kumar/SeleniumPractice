package SeleniumSession.Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSession.JavaScriptUtil;

public class JavaScriptExecutorConcept {
	
	//JavaScriptExecutor -- Interface -- executeScript();
	//RWD --> JavaScriptExecutor
	//RWD --> WebDriver
	
	//to execute the JS on the browser --JS
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		String title = js.executeScript("return document.title").toString();
//		System.out.println(title);
		
		JavaScriptUtil jsutil=new JavaScriptUtil(driver);
//		String titleByJs = jsutil.getTitleByJs();
//		System.out.println(titleByJs);
//		
//		System.out.println(jsutil.getURLByJs());
		
//		jsutil.generateJSAlert("I am a Alert");
		
		// history.back();    Navigate to Previous page
		// history.forward(); Navigate to forward page
		//history.go(0);      Refreshing the page
		//history.go(-1);     Navigate to Previous page
		//history.go(1);      Navigate to forward page
		
		
		driver.get("https://classic.freecrm.com/");
		Thread.sleep(4000);
		String pageInnerText = jsutil.getPageInnerText();
		System.out.println(pageInnerText.contains("Calls & Voice"));
		
		//In JavaScript we need to make a note on 2 things
		// 1. Method [go(),back(),forward()]
		// 2. Property [title,URL,InnerText]
		
		//Objects in JavaScript
		// document
		// window
		
//		jsutil.scrollPageDown();
//		Thread.sleep(3000);
//		jsutil.scrollMiddlePageDown();
//		Thread.sleep(3000);
//		jsutil.scrollPageDown();
//		Thread.sleep(3000);
//		jsutil.scrollPageUp();
		
		WebElement headerele = driver.findElement(By.xpath("//h3[text()='Alerts & Reminders']"));
		jsutil.scrollIntoView(headerele);
		
		//To execute from the console for scrollIntoView
		//document.querySelector("div:nth-child(2) div:nth-child(1) div:nth-child(6) h3:nth-child(1)").scrollIntoView(true)
		
		
		//To execute from the console for creating border
		//document.querySelector("input[placeholder='Password']").style.border='3px solid red'
		
		//Testing zoomin , zoomout is Responsiveness testing
		
		
		
		
		
	}
	
	
	
	

}
