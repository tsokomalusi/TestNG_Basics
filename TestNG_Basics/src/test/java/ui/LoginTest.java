package ui;

import org.testng.annotations.Test;

public class LoginTest {
	
	//Prioritizing test cases using the priority attribute of @Test
	//loginTest must execute first before logoutTest
	
	@Test(priority=1)
	public void loginTest()  {
		
	  System.out.println("Login is successful");	
		
	}
	
	@Test(priority=2)
	public void logoutTest()  {
		
	System.out.println("Logout is successful");	
		
	}

}
