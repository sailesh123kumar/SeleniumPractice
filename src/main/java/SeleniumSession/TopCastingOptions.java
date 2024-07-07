package SeleniumSession;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	
	public static void main(String[] args) {
		
		//1.Valid and Recomended
		WebDriver driver = new ChromeDriver();
		
		//2.Valid but not recommended
		SearchContext driver1 =new ChromeDriver(); 
		//We can only access FE and FEs method and cant access other method
		
		//3.valid and Recommended
		RemoteWebDriver driver2=new ChromeDriver();
		
		//4.Valid and Recommended - for emote Execution (AWS,Cloud,Server , VM,Maching) with Grid
		//WebDriver driver4= new RemoteWebDriver(remoteaddress, capabilities);
		
		//5.Valid and not recommended
		//SearchContext driver5 =new RemoteWebDriver(remoteaddress, capabilities);
		
		//6.Valid but not recommended
		ChromiumDriver driver6 = new ChromeDriver(); 
		//With chromiumDrier reference we can only launch chrome and edge . Cross browser testing not possible with it
		
		//7.not valid
		//RemoteWebDriver driver7= new ChromiumDriver();
		
		
		
		
	}
}
