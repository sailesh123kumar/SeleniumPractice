package testNGSessions.Day27;

import org.testng.annotations.Test;

public class PriorityConcept {
	
	@Test(priority=1,description="search test")
	public void searchTest() {
		System.out.println("T -- search Test ");
	}
	
	@Test(priority=5)
	public void addToCart() {
		System.out.println("T -- add To Cart Test ");
	}
	
	@Test(priority=2)
	public void checkOut() {
		System.out.println("T -- check Out Test ");
	}
	
	@Test
	public void paymentTest() {
		System.out.println("T -- paymentTest ");
	}
	
	@Test
	public void orderTest() {
		System.out.println("T -- orderTest ");
	}

}
