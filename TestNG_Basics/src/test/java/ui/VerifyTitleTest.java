package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {
	
	//Will employ Assert class methods of org.testng API in the test case(s)
	
	@Test
	public void titleTest() {
		
		//String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		
		//make the test fail and check if it fails
		
		String expectedTitle = "Electronics, xxxxxCars, Fashion, Collectibles & More | eBay";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.close();
		
	}

}
