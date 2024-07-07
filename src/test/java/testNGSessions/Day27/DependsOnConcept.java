package testNGSessions.Day27;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnConcept {

	//Should avoid using this dependsOnMethods and Priority in our frmework
	
	@Test
	public void loginToApp() throws Exception {
		System.out.println("BM -- log in to App ");
		Exception Exception = null;
		throw Exception ;
	}
	
	@Test(dependsOnMethods = "loginToApp")
	public void addtoCartTest() {
		System.out.println("T -- addtoCartTest ");
	}
	
	@Test(dependsOnMethods = "addtoCartTest")
	public void orderTest() {
		System.out.println("T -- orderTest ");
	}
}
