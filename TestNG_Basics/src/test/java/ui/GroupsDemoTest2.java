package ui;


import org.testng.annotations.Test;

import common.CommonDataSetUp;



public class GroupsDemoTest2 extends CommonDataSetUp {


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
