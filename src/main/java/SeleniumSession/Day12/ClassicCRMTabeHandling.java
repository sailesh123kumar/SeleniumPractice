package SeleniumSession.Day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassicCRMTabeHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://classic.freecrm.com/index.html");

		// userName: apiautomation
		// password: Selenium@12345

		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(4000);
		driver.switchTo().frame("mainpanel");

		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(3000);

		selectUserName("David Rodriguez");
		System.out.println(getCompanyName("David Rodriguez"));
		selectMultiUserName("cheen Meen");
		selectLastUserName("Geetanjali Kalra");
		selectUserName("cheen Meen", 3);
		
		

		//to get email id
		//(//a[text()='Keerthana Vignesh']/../following-sibling::td)[last()-1]
		//a[text()='Keerthana Vignesh']/../following-sibling::td/a[contains(@href,'mailto:')]
		

		Thread.sleep(3000);
		driver.quit();

	}

	public static void selectUserName(String userName) {
		driver.findElement(By.xpath("//a[text()='" + userName + "']/../preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}

	public static void selectUserName(String userName, int index) {
		if (index > 0) {
			driver.findElement(By.xpath(
					"(//a[text()='" + userName + "']/../preceding-sibling::td/input[@type='checkbox'])[" + index + "]"))
					.click();
		}
	}

	public static void selectLastUserName(String userName) {
		driver.findElement(
				By.xpath("(//a[text()='" + userName + "']/../preceding-sibling::td/input[@type='checkbox'])[last()]"))
				.click();
	}

	public static String getCompanyName(String userName) {
		return driver
				.findElement(By.xpath("//a[text()='" + userName + "']/../following-sibling::td/a[@context='company']"))
				.getText();
	}

	public static void selectMultiUserName(String userName) throws InterruptedException {
		List<WebElement> UsersList = driver.findElements(
				By.xpath("//a[text()='" + userName + "']/../preceding-sibling::td/input[@type='checkbox']"));
		for (WebElement e : UsersList) {
			e.click();
			Thread.sleep(1000);
		}
	}

}
