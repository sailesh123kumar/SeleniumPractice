package SeleniumSession.Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	
	static WebDriver driver;

	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\DELL\\OneDrive - TestLeaf Software Solutions Private Limited\\Desktop\\marriage certificate.pdf";

		driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.findElement(By.name("upfile")).sendKeys(filePath); 
		
		//It should have @type=file attribute, If its not there it wont work
		//We should ask developer to add the attribute if its not there
		//we can overcome with tools like AutoIT, Sikuli , Robot Class but it wont work when we runs through pipeline
		//Above will works only in local machine
		
		//1. AutoIT - windows -- Not Recommended
		//2. Sikuli - lib: images
		//3. Robot Class: Java: windows machine
		
	}
	
}
