package WebDriver_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\JArs\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    
	    WebElement motors=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
	    WebElement sports=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[6]/a"));
	    WebElement fashion=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
	    Actions act=new Actions(driver);
	    act.moveToElement(motors).perform();
	    Thread.sleep(2500);
	    act.moveToElement(sports).perform();
	    Thread.sleep(2500);
	    act.moveToElement(fashion).build().perform();
	}

}
