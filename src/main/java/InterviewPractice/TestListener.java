package InterviewPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
	
	static WebDriver driver;
	static TakesScreenshot ts;
	
	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		String methodName = result.getMethod().getMethodName();
		System.out.println("Test Succesfully Passed - Listener");
		
		ts =((TakesScreenshot) driver);
		File source = ts.getScreenshotAs(OutputType.FILE);	
		//File destination = new File(System.getProperty("user.dir") + "//"+"AmazonScreenShots"+methodName+"_"+System.currentTimeMillis()+".png");
		//File destination = new File("C:\\Users\\DELL\\OneDrive - TestLeaf Software Solutions Private Limited\\Desktop\\Collection Framework\\AutomationPOMFramework\\AmazonScreenShots"+methodName+"_"+System.currentTimeMillis()+".png");
		File destination = new File(".\\screenshot\\"+methodName+"_"+System.currentTimeMillis()+".png");

		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+" Test Failed");
		
		ts =((TakesScreenshot) driver);
		File source = ts.getScreenshotAs(OutputType.FILE);	
		File destination = new File(System.getProperty("user.dir") + "/screenshots"+"screenshot"+methodName+"_"+System.currentTimeMillis()+".png");

		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
