package common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonDataSetUp {
	
	@BeforeSuite
	public void dataSetup()  {
		
		System.out.println("Common data setup");
	}
	
	@AfterSuite
	public void tearDown()  {
		
		System.out.println("Common data cleanup");	
	}

}
