package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class NewTest {

WebDriver driver;

@BeforeTest
public void setup(){
driver = new ChromeDriver();
}

@Test
public void testTitle(){

driver.get("https://www.selenium.dev/");
String title = driver.getTitle();

Assert.assertTrue(title.contains("Selenium"));

}

@AfterTest
public void close(){
driver.quit();
}

}
