package WebDriver_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_10199 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\JArs\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/automation-practice-form");
	    
	    driver.manage().window().maximize();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)","");
	    //Css Selector with id
	    driver.findElement(By.cssSelector("input[id=\"firstName\"]")).click();
	    driver.findElement(By.cssSelector("input[id=\"firstName\"]")).sendKeys("Neeva");
	    //CSS selector with attribute
	    driver.findElement(By.cssSelector("input#lastName[class=\" mr-sm-2 form-control\"]")).click();
	    driver.findElement(By.cssSelector("input#lastName[class=\" mr-sm-2 form-control\"]")).sendKeys("Sharma");
	// css slector with parent child
	    driver.findElement(By.cssSelector("div>input[id=\"userEmail\"]")).click();
	    driver.findElement(By.cssSelector("div>input[id=\"userEmail\"]")).sendKeys("abc@gmail.com");
	}

}
