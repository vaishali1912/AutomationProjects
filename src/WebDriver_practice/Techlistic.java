package WebDriver_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techlistic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\JArs\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		
		//first name text box click with id and name
		driver.findElement(By.name("firstname")).click();
		//first name text box input with id and name
		driver.findElement(By.name("firstname")).sendKeys("Vaishali");
		Thread.sleep(2500);
		//last name text box click with id and name
		driver.findElement(By.name("lastname")).click();
		//last name text box input with id and name
		driver.findElement(By.name("lastname")).sendKeys("Sonawane");
		Thread.sleep(2500);
		driver.close();
		

	}

}
