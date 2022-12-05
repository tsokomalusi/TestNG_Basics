package ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import common.CommonDataSetUp;


@Test(groups="user_registration")
public class GroupsDemoTest extends CommonDataSetUp {


	@BeforeClass
	public void beforeClassTest()  {

		System.out.println("executes first before class test cases");
	}

	@AfterClass
	public void afterClassTest()  {

		System.out.println("executes after class test cases have run");
	}
	
	
	@BeforeGroups(value = "regression")
	public void beforeGroupTest() {
		
	   System.out.println("This method runs before regression group");
	}
	
	@AfterGroups(value = "regression")
	public void afterGroupTest() {
		
	   System.out.println("This method runs after regression group");
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
