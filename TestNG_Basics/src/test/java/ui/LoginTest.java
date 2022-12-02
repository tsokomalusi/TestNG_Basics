package ui;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	//exploring BeforeTest and AfterTest annotation with dummy test cases

	
	//This executes before any of the test cases is executed
	@BeforeTest
	public void loginToApplication()  {

        System.out.println("Login to application");
	}

	//This will execute after all the test cases have been executed
	@AfterTest
	public void logoutFromApplication()  {

        System.out.println("Logout from application");
	}

	@Test(priority=1,description="This is a login test")
	public void test1()  {

		System.out.println("Test1 Running");	
	}

	@Test(priority=2, description="This is a logout test")
	public void test2()  {

		System.out.println("Test2 Running");	
	}


}
