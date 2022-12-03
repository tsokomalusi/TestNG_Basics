package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleAndTextTest {
	
	//Introducing multiple HardAssert(assertions) into the test case(s)
	//HardAssert stops script execution at that failed assertion pont, other remaining asserts
	//and statments ahead won't be considered
	
	@Test
	public void titleTest() throws InterruptedException {
		
		//String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		
		//make an error deliberately to see the effect of HardAssert
		//THEN title message and/or textmessage get printed on the console
		
		String expectedTitle = "Electronics, rrrtCars, Fashion, Collectibles & More | eBay";
		
		String expectedText = "Search";
		String textMessage = "Text verification failed";
		String titleMessage = "Title verification failed";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualTitle = driver.getTitle();
		
		//if this verification point (assertion) fails executions stops immediately
		//Other assertion points (hard assert) and statements too wont be considered
		
		Assert.assertEquals(actualTitle, expectedTitle, titleMessage);
		String actualText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		Assert.assertEquals(actualText, expectedText, textMessage);
		
		driver.close();	
	}

}
