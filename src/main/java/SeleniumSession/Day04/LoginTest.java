package SeleniumSession.Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SeleniumSession.Day03.BrowserUtil;
import SeleniumSession.Utils.ElementUtil;

public class LoginTest {
	
	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		
		String browser ="Chrome";
		WebDriver driver = brUtil.launchBrowser(browser);
		
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		System.out.println(brUtil.getPageTiltle());
		System.out.println(brUtil.getPageCurrentURL());
		
		By emailID = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleUtil= new ElementUtil(driver);
		
		eleUtil.doSendKeys(emailID, "saileshkumar@gmail.com");
		eleUtil.doSendKeys(password, "testing@124");
		
		brUtil.closeBrowser();
		
	}

}
