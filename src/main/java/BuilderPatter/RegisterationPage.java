package BuilderPatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterationPage {
	
	WebDriver driver;
	
	private By firstName = By.id("input-firstname");
	private By lastName = By.id("input-lastname");
	private By email = By.id("input-email");
	private By telephone = By.id("input-telephone");
	private By password = By.id("input-password");
	private By confirm = By.id("input-confirm");
	private By checkbox = By.name("agree");
	
	private By continueBtn = By.xpath("//input[@value='Continue']");
	
	public RegisterationPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void UserRegister(Register register) {
		
		driver.findElement(firstName).sendKeys(register.getFirstName());
		driver.findElement(lastName).sendKeys(register.getFirstName());
		driver.findElement(email).sendKeys(register.getEmail());
		driver.findElement(telephone).sendKeys(register.getTelephone());
		driver.findElement(password).sendKeys(register.getPassword());
		driver.findElement(confirm).sendKeys(register.getConfirm());
		driver.findElement(checkbox).click();
		driver.findElement(continueBtn).click();
		
		
	}

}
