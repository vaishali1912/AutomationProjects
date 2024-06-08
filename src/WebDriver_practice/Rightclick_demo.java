package WebDriver_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class Rightclick_demo {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\JArs\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://demoqa.com/buttons");
	        driver.manage().window().maximize();
	        // Action  Right click
	        WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
	       
	        Actions act=new Actions(driver);
	         act.contextClick(rightclick).perform();
	        

	}

}
