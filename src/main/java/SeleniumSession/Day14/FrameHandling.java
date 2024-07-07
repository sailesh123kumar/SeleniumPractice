package SeleniumSession.Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");

		/*
		 * this types of frames are deprecated from market as per w3c protocol
		 * now a days iframes only developing but still selenium supports to handle both
		 * frame and iframe 
		 *     
		 *      <frameset> ----parent 
		 *        <frame> ----child
		 * 
		 * 
		 * There are 3 ways
		 * 1.By index
		 * 2.By nameorid
		 * 3.By Webelement
		 */

//		driver.switchTo().frame(2);
//		driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src*='top.html']")));
		
		System.out.println(driver.findElement(By.tagName("h2")).getText());

	}

}
