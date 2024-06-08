package WebDriver_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_forward {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\JArs\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"s0-1-0-48-1-3-5-10-0[0]-2-@match-media-0-@ebay-carousel-container\"]/button[1]")).click();
	    driver.findElement(By.xpath("//*[@id=\"s0-1-0-48-1-3-5-10-0[0]-2-@match-media-0-@ebay-carousel-next\"]")).sendKeys(Keys.ARROW_RIGHT);
	}

}
