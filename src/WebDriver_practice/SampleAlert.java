package WebDriver_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\JArs\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/alerts");
	  driver.findElement(By.id("alertButton")).click();
	  Thread.sleep(2000);
	   driver.switchTo().alert().accept();
	   Thread.sleep(2500);
	   driver.close();
	    
	}

}
