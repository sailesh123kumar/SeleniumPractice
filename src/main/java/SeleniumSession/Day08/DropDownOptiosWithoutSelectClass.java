package SeleniumSession.Day08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOptiosWithoutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// 1. select a value from drop down without using select class methods by index
		// , value and visibleText
		// 2. select a value from drop down without using select class

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");

		By CountryDD = By.id("Form_getForm_Country");
		By NoofEmplyeeDD = By.id("Form_getForm_NoOfEmployees");
		By countryOptions = By.xpath("//select[@id='Form_getForm_Country']/option");

//		Select selCountry = new Select(driver.findElement(CountryDD));
//		List<WebElement> options = selCountry.getOptions();
//
//		for (WebElement e : options) {
//			String text = e.getText();
//			if (text.equals("Canada")) {
//				e.click();
//				break;
//			}
//
//		}

		List<WebElement> elements = driver.findElements(countryOptions);

		for (WebElement e : elements) {
			String text = e.getText();
			if (text.equals("India")) {
				e.click();
				break;
			}
		}

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void selectValuefromDropDown(By locator, String optiontoSelect) {
		Select sel = new Select(getElement(locator));
		List<WebElement> options = sel.getOptions();
		for (WebElement e : options) {
			String text = e.getText();
			if (text.equals(optiontoSelect)) {
				e.click();
				break;
			}
		}
	}

	public static void selectValuefromDropDownWithoutSelect(By locator, String optiontoSelect) {
		List<WebElement> options = getElements(locator);
		for (WebElement e : options) {
			String text = e.getText();
			if (text.equals(optiontoSelect)) {
				e.click();
				break;
			}
		}
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
}
