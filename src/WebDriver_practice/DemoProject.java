package WebDriver_practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DemoProject {
	WebDriver driver;
	 @BeforeTest
	  public void beforeTest() {
		 System.setProperty("webdriver.chrome.driver", "D:\\JArs\\chromedriver-win64\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get("https://www.amazon.in/");
	  }
  @Test
  public void f() {
	  
  }
 

  @AfterTest
  public void afterTest() {
  }

}
