package WebDriver_practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promptalert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\JArs\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/alerts");
	    driver.manage().window().maximize();
	  driver.findElement(By.id("promtButton")).click();
	  Thread.sleep(2000);
	   Alert alert=driver.switchTo().alert();
	  alert.sendKeys("Selenium");
	  alert.accept();
	   
	   Thread.sleep(2500);
	   //driver.close();
	}

}
