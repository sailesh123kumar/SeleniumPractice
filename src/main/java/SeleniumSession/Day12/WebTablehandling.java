package SeleniumSession.Day12;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablehandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		Thread.sleep(5000);

		// WebElement checkbox =
		// driver.findElement(By.xpath("//a[text()='Joe.Root']/../preceding-sibling::td/input[@type='checkbox']"));
		// WebElement checkbox =
		// driver.findElement(By.xpath("//a[text()='Joe.Root']//ancestor::tr//input[@type='checkbox']"));
		// Replacing the name
//		WebElement checkbox = driver.findElement(By.xpath("//a[text()='Jordan.Mathews']//ancestor::tr//input[@type='checkbox']"));
//		checkbox.click();

		selectUserName("Jordan.Mathews");
		selectUserName("Joe.Root");

//		List<WebElement> elements = driver.findElements(By.xpath("//a[text()='Joe.Root']/../following-sibling::td"));
//		for(WebElement e:elements) {
//			String text = e.getText();
//			System.out.print(text + " ");
//		}

		System.out.println(getUserDataList("Joe.Root"));
		System.out.println(getUserDataList("Jordan.Mathews"));

		Thread.sleep(3000);
		driver.quit();

	}

	// Application Specific Util

	public static List<String> getUserDataList(String userName) {
		List<WebElement> userDataLists = driver
				.findElements(By.xpath("//a[text()='" + userName + "']/../following-sibling::td"));
		List<String> textList = new ArrayList<String>();
		for (WebElement e : userDataLists) {
			String text = e.getText();
			textList.add(text);
		}
		return textList;
	}

	public static void selectUserName(String userName) {
		driver.findElement(By.xpath("//a[text()='" + userName + "']//ancestor::tr//input[@type='checkbox']")).click();
	}

}
