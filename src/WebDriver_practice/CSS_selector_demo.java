package WebDriver_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_selector_demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\JArs\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#state > div > div.css-1hwfws3")).click();
		 driver.findElement(By.cssSelector("input[id=\"react-select-3-input\"]")).sendKeys("Uttar Pradesh");
	     driver.findElement(By.cssSelector("input[id=\"react-select-3-input\"]")).sendKeys(Keys.ENTER);
	     //driver.findElement(By.cssSelector("#state > div > div.css-1hwfws3 > div.css-1uccc91-singleValue")).sendKeys(Keys.ENTER);
		
	}

}
