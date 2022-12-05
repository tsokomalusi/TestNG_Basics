package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.CommonDataSetUp;

public class LoginTest extends CommonDataSetUp {
	
	//BeforeTest vs BeforeMethod and AfterTest vs AfterMethod annotations

	//#1 This will execute first before any method
	
	@BeforeTest
	public void loginToApplication()  {

        System.out.println("Login to application");
	}

	//This will execute after all the methods have executed
	
	@AfterTest
	public void logoutFromApplication()  {

        System.out.println("Logout from application");
	}
	
	//#2 This always execute first before each test case
	
	@BeforeMethod
	public void connectToDB()  {
		
		System.out.println("connecting to DB....");
	}
	
	//#3 This always executes after each test case has run
	
	@AfterMethod
	public void disconnectFromDB()   {
		
		System.out.println("disconnecting from DB....");
	}
	
	//test cases execute according to the provided attribute (priority) of @Test

	@Test(priority=1,description="This is a login test", groups="regression")
	public void test1()  {

		System.out.println("Test1 Running");	
	}

	@Test(priority=2, description="This is a logout test")
	public void test2()  {

		System.out.println("Test2 Running");	
	}


}
