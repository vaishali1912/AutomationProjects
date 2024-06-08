package WebDriver_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\JArs\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://testautomationpractice.blogspot.com/");
	    
	    WebElement rc=driver.findElement(By.id("slider"));
	    Actions move=new Actions(driver);
	   
	    Thread.sleep(2500);
	    move.dragAndDropBy(rc, 50, 0).perform();
	    Thread.sleep(2500);
	    move.dragAndDropBy(rc, 0, 30).perform();

	}

}
