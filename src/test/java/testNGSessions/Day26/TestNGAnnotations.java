package testNGSessions.Day26;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	
	// global precondition
	// pre conditions
	// test steps + expected vs actual result
	// after steps
	// global after steps
	
	/*
	BS -- connect with DB 
	BT -- create User 
	BC -- launch Browser 
	
			BM -- log in to App 
			T -- add To Cart Test 
			AM -- logout from App 
			
			BM -- log in to App 
			T -- check Out Test 
			AM -- logout from App 
			
			BM -- log in to App 
			T -- search Test 
			AM -- logout from App 
			
	AC -- close Browser 
	AT -- delete User 
	AS -- disconnect with DB
	*/
	
	//1
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS -- connect with DB ");
	}
	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT -- create User ");
	}
	//3
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launch Browser ");
	}
	//Works with special mechanism it will execute before all @Test
	//4  //7  //10
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM -- log in to App ");
	}
	//11
	@Test
	public void searchTest() {
		System.out.println("T -- search Test ");
	}
	//5
	@Test
	public void addToCart() {
		System.out.println("T -- add To Cart Test ");
	}
	//8
	@Test
	public void checkOut() {
		System.out.println("T -- check Out Test ");
	}
	//6  //9 //12
	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout from App ");
	}
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- close Browser ");
	}
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- delete User ");
	}
	//15
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS -- disconnect with DB ");
	}
	
	
	
}
