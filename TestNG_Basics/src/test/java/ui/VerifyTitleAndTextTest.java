package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleAndTextTest {
	
     //Introducing SoftAssert into the test case
	 //SoftAssert ensures that script executes full without stopping
	 //SoftAssert also reports mutliple assertion failure (assertAll() method is key)
	//If both assertion points fail, then title message and text message in this test test case
	//will be printed
	
	@Test
	public void titleAndTextTest() throws InterruptedException {
		
		SoftAssert softAssert =  new SoftAssert();
		//String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		
		//create error to see the effect of SoftAssert
		
        String expectedTitle = "Electronics, rrrtCars, Fashion, Collectibles & More | eBay";
        
       // String expectedText = "Search";
        //make another assertion failure to see if SoftAssert will report it
		String expectedText = "xxxxSearch";
		String textMessage = "Text verification failed";
		String titleMessage = "Title verification failed";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualTitle = driver.getTitle();
		System.out.println("Verifying title");
		softAssert.assertEquals(actualTitle, expectedTitle, titleMessage);
		String actualText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		System.out.println("Verifying text");
		softAssert.assertEquals(actualText, expectedText, textMessage);
		System.out.println("Closing the browser");
		driver.close();	
		
		//very key in reporting assertion failure(s),if omitted test script gets executed fully
		// but assertion failure(s) are not reported
		
	    softAssert.assertAll();  
	}

}

