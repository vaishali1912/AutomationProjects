package WebDriver_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class DoubleClick_demo {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\JArs\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://demoqa.com/buttons");
	        driver.manage().window().maximize();
	        // Action  double click
	        WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
	       
	        Actions act=new Actions(driver);
	         act.doubleClick(doubleclick).perform();
	         Thread.sleep(2000);
	       // driver.close();

	}

}
