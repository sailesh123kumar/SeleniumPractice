package SeleniumSession.Day09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		By searchbox = By.name("q");
		By SuggestionList = By.xpath("//ul[@class='G43f7e']//div[contains(@class,'wM6W7d')]/span");
		
//		driver.findElement(searchbox).sendKeys("Naveen automation lab");
//		Thread.sleep(3000);
//		List<WebElement> sugList = driver.findElements(SuggestionList);
//		int size = sugList.size();
//		System.out.println(size);
//		
//		for(WebElement e:sugList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(e.getText().contains("selenium")) {
//				e.click();
//				break;
//			}
//			
//		}
		
		doSearch(searchbox, "Naveen automation lab", SuggestionList, "selenium");
	}
	
	
	public static void doSearch(By searchbox,String Searchkey,By SuggestionList,String clickKey) throws InterruptedException {
		driver.findElement(searchbox).sendKeys(Searchkey);
		Thread.sleep(3000);
		List<WebElement> sugList = driver.findElements(SuggestionList);
		
		for(WebElement e:sugList) {
			String text = e.getText();
			System.out.println(text);
			if(e.getText().contains(clickKey)) {
				e.click();
				break;
			}
			
		}
	}
	
}
