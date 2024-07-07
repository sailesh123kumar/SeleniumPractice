package SeleniumSession.Day08;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllOptions {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");

		By CountryDD = By.id("Form_getForm_Country");
		By NoofEmplyeeDD = By.id("Form_getForm_NoOfEmployees");

		Select selCountry = new Select(driver.findElement(CountryDD));
		List<WebElement> countryOptions = selCountry.getOptions();
		int size = countryOptions.size();
		System.out.println(size);
		
		System.out.println("===============================");
		
		for (WebElement e : countryOptions) {
			String text = e.getText();
			System.out.println(text);
		}
		
		List<String> dropDownOptionsTextList = getDropDownOptionsTextList(NoofEmplyeeDD);
		System.out.println(dropDownOptionsTextList);
		
		System.out.println(getDropDownOptionsCount(NoofEmplyeeDD));
		
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
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
