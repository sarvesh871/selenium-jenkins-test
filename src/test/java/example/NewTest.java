package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class NewTest {

WebDriver driver;

@BeforeTest
public void setup(){

System.out.println("=================================");
System.out.println("Starting Selenium Test Execution");
System.out.println("Launching Chrome Browser...");
System.out.println("=================================");

driver = new ChromeDriver();
}

@Test
public void testTitle() throws InterruptedException {

System.out.println("Opening website: https://www.selenium.dev/");

driver.get("https://www.selenium.dev/");

String title = driver.getTitle();

System.out.println("Page title retrieved from browser:");
System.out.println(title);

System.out.println("Verifying title contains the word 'Selenium'");

Assert.assertTrue(title.contains("Selenium"));

System.out.println("Title verification PASSED");

/* Wait for 10 seconds before finishing test */
System.out.println("Waiting 10 seconds before closing browser...");
Thread.sleep(10000);
}

@AfterTest
public void close(){

System.out.println("Closing browser...");
driver.quit();

System.out.println("=================================");
System.out.println("Selenium Test Execution Finished");
System.out.println("=================================");

}

}
