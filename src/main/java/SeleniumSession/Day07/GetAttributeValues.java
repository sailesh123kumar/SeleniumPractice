package SeleniumSession.Day07;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValues {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");

		By img = By.tagName("img");

		List<WebElement> imglist = getElements(img);

		System.out.println("img list count is :" + getElementsCount(img));

		for (WebElement e : imglist) {
			String attributeVal = e.getAttribute("src");
			System.out.println(attributeVal);
		}

		System.out.println("========================================");

		getAttributelist(img, "alt");

		System.out.println("========================================");

		getAttributelist(img, "style");
		
		driver.quit();

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public static List<String> getElementTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String text = e.getText();
			if (text.length() != 0) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}

	public static List<String> getAttributelist(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		List<String> attrTextList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String attributeVal = e.getAttribute(attrName);
			if (attributeVal != null && attributeVal.length() != 0) {
				attrTextList.add(attributeVal);
				System.out.println(attributeVal);
			}
		}
		return attrTextList;
	}

}
