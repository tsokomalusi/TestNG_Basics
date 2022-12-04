package ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


@Test(groups="user_registration")
public class GroupsDemoTest {

	//Exploring BeforeClass and AfterClass annotations

	@BeforeClass
	public void beforeClassTest()  {

		System.out.println("executes first before class test cases");
	}

	@AfterClass
	public void afterClassTest()  {

		System.out.println("executes after class test cases have run");
	}

	//Grouping test cases at method level

	@Test(priority=1, groups="regression")
	public void test1()  {

		System.out.println("Test1 Running");	
	}

	@Test(priority=2, groups="regression")
	public void test2()  {

		System.out.println("Test2 Running");	
	}

	//a test case belonging to multiple groups

	@Test(priority=3, groups= {"regression", "bvt"})
	public void test3()   {

		System.out.println("Test3 Running");
	}

	@Test(priority=3, groups= "bvt")
	public void test4()  {

		System.out.println("Test4 Running");
	}

}
