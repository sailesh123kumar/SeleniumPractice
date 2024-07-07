package SeleniumSession.Day09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearch {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		By searchbox = By.name("q");
		By SuggestionList = By.xpath("//div[@class='YGcVZO _2VHNef']");
		String SearchKey="MacBook";
		String clickKey = "macbook m2 pro";
		
		doSearch(searchbox, SearchKey, SuggestionList, clickKey);
		
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
