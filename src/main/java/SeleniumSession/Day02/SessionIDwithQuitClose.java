package SeleniumSession.Day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SessionIDwithQuitClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.google.com/");

		// Title validation
		String title = driver.getTitle();
		System.out.println("Page Title : " + title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Page URL :" + currentUrl);
		
		
		//driver.quit(); //NoSuchSessionEception: Session ID is null. Using WebDriver after calling quit()?
		driver.close();  //NoSuchSessionEception: invalid session id. 
		
		driver.getTitle(); 


	}

}
