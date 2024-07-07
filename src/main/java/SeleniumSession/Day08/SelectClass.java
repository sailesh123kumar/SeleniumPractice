package SeleniumSession.Day08;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");
		

		By CountryDD = By.id("Form_getForm_Country");
		By NoofEmplyeeDD = By.id("Form_getForm_NoOfEmployees");
		
		Select selCountry=new Select(driver.findElement(CountryDD));
		//selCountry.selectByIndex(5);
		doSelectByIndex(CountryDD, 5);
		
		Thread.sleep(5000);
		//selCountry.selectByVisibleText("Belgium");
		doSelectByText(CountryDD, "Belgium");
		
		Thread.sleep(5000);
		//selCountry.selectByValue("Andorra");
		doSelectByValue(CountryDD, "Andorra");
		
		Thread.sleep(5000);

		driver.quit();
		
		
		
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectByIndex(By locator,int index) {
		Select sel= new Select(getElement(locator));
		sel.selectByIndex(index);
	}
	
	public static void doSelectByValue(By locator,String value) {
		Select sel= new Select(getElement(locator));
		sel.selectByValue(value);
	}
	
	public static void doSelectByText(By locator,String visibleText) {
		Select sel= new Select(getElement(locator));
		sel.selectByVisibleText(visibleText);
	}
	
	public static int getDropDownOptionsCount(By locator) {
		Select sel = new Select(getElement(locator));
		return sel.getOptions().size();
	}
	
	
	public static List<String> getDropDownOptionsTextList(By locator) {
		Select sel = new Select(getElement(locator));
		List<WebElement> optList = sel.getOptions();
		List<String> optTextList = new ArrayList<String>();
		for (WebElement e : optList) {
			optTextList.add(e.getText());
		}
		return optTextList;
	}


}
