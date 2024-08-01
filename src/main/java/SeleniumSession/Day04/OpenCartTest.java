package SeleniumSession.Day04;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import SeleniumSession.Day03.BrowserUtil;

public class OpenCartTest {

	public static void main(String[] args) {
		ReadProperty propreader = new ReadProperty();
		
		Properties prop = propreader.initProp();
		
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");

		BrowserUtil brUtil = new BrowserUtil();

		brUtil.launchBrowser(browser);

		brUtil.launchURL(url);

		// Normally throws InvalidArgument Exception but with browserexception modified
		// with meaningful
		// brUtil.launchURL("://naveenautomationlabs.com/opencart");

		String actTitle = brUtil.getPageTiltle();
		System.out.println("Page Title is : " + actTitle);
		if (actTitle.equals("Your Store")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is not correct");
		}
		
		String pageCurrentURL = brUtil.getPageCurrentURL();
		System.out.println("Page Current URL is : " + pageCurrentURL);
		
		if (pageCurrentURL.contains("opencart")) {
			System.out.println("URL is correct");
		} else {
			System.out.println("URL is not correct");
		}


		brUtil.closeBrowser();

	}

}
