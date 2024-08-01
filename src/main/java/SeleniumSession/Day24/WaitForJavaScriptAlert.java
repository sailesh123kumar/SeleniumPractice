package SeleniumSession.Day24;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumSession.Utils.ElementUtil;

public class WaitForJavaScriptAlert {

	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		By JSAlert = By.xpath("//button[text()='Click for JS Alert']");
		
		
		ElementUtil eleutil= new ElementUtil(driver);
		eleutil.doClick(JSAlert);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		

		
	}
	
	public static Alert waitForJSAlert(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public static String getAlertText(int timeOut) {
		Alert alert = waitForJSAlert(timeOut);
		String text = alert.getText();
		alert.accept();
		return text;
	}

	public static void acceptAlert(int timeOut) {
		waitForJSAlert(timeOut).accept();
	}

	public static void dismissAlert(int timeOut) {
		waitForJSAlert(timeOut).dismiss();
	}

	public static void alertSendKeys(int timeOut, String value) {
		Alert alert = waitForJSAlert(timeOut);
		alert.sendKeys(value);
		alert.accept();
	}
	
	
	
}
