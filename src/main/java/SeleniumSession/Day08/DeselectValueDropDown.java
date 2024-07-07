package SeleniumSession.Day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectValueDropDown {

	public static void main(String[] args) {
		// If select tag has multiple attribute then we can select multiple value

		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");

		By selecttag = By.xpath("//*[@id=\"post-291\"]/div/div[2]/select");
		Select sel = new Select(driver.findElement(selecttag));

		System.out.println(sel.isMultiple());
		
		if(sel.isMultiple()) {
			sel.selectByVisibleText("American flamingo");
			sel.selectByVisibleText("Chilean flamingo");
			sel.selectByVisibleText("James's flamingo");
			sel.selectByVisibleText("Lesser flamingo");
		}
		
		//sel.deselectAll();
		
		
	}

}
