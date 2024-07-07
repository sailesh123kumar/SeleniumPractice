package testNGSessions.Day27;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	
	String name;
	
	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void addToCart() {
		System.out.println("T -- add To Cart Test ");
		
		int i=9/3; // 9/0 //Program get terminated  ArithmeticException.class
		System.out.println("Hello");
		ExpectedExceptionConcept obj=null; //NullPointerException.class
		System.out.println(obj.name);
		
	}

}
