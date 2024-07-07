package SeleniumSession.Day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		By src = By.xpath("//p[text()='Drag me to my target']");
		By target = By.id("droppable");
		
		WebElement src_Ele = driver.findElement(src);
		WebElement target_Ele = driver.findElement(target);
		
		Actions act = new Actions(driver);
		act.clickAndHold(src_Ele)
		 		.moveToElement(target_Ele)
		 			.release()
		 				.perform();   //If we dont use perform method it wont work and it doesnt throw any exception
		
		//act.dragAndDrop(src_Ele, target_Ele).perform();
		
		//.perform()--->build.perform();
		//.build() --no 
		//.build().perform()--->yes
		
		
	}
	
	 public static void doDragAndDrop(By srcLocator,By tagetLocator) {
		 WebElement src_Ele = driver.findElement(srcLocator);
		 WebElement target_Ele = driver.findElement(tagetLocator);
		 Actions act = new Actions(driver);
		 act.dragAndDrop(src_Ele, target_Ele).perform();
		 
	 }
	
	
	
	
	
	
	
}
