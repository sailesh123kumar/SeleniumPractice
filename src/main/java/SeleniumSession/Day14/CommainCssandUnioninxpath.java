package SeleniumSession.Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommainCssandUnioninxpath {

	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		System.out.println("============USING CSS SELECTOR===============");
		By loginpageElements = By.cssSelector("input#username,input#password,button#loginBtn,input#remember");
		int loginpageElementsCount = driver.findElements(loginpageElements).size();
		 
		System.out.println(loginpageElementsCount);
		
		if(loginpageElementsCount == 4) {
			System.out.println("Important Elements are available in the page as expected");
		}
		
		System.out.println("============USING XPATH UNION OPERATOR===============");
		
		//footer//a | //footer//h5
		//footer//a | //footer//h5 | //footer//p
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}
	
	
}
