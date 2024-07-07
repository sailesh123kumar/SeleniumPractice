package SeleniumSession.Day07;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericMethodFindElements {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		
		By links = By.tagName("a");
		By images = By.tagName("img");
		
		System.out.println("Total images in the page "+getElementsCount(images));
		System.out.println("Total links in the page "+getElementsCount(links));
		
		List<String> linkstext = getElementTextList(links);
		System.out.println(linkstext);
		
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	//WAF Write a Function: To fetch the text of each lin, store it in list and return
	//name: getElementTextList
	//param: By locator
	//return: List<String>
	
	public static List<String> getElementTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for(WebElement e:eleList) {
			String text = e.getText();
			if(text.length()!=0) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	
}
