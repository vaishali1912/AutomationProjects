package WebDriver_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEmOQA_webelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\JArs\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		WebElement fname=driver.findElement(By.id("firstName"));
		fname.sendKeys("Vaishali");
		
		WebElement lname=driver.findElement(By.id("lastName"));
		lname.sendKeys("Sonawane");
	
		Thread.sleep(2000);
		driver.close();
	}

}
