package WebDriver_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		int a;
		System.setProperty("webdriver.chrome.driver", "D:\\JArs\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://zero.webappsecurity.com/login.html");
	    WebElement user=driver.findElement(By.id("user_login"));
	    user.sendKeys("usern");
	    
	    WebElement pass=driver.findElement(By.id("user_password"));
	    pass.sendKeys("paff");
	    WebElement submit=driver.findElement(By.name("submit"));
	    submit.click();
	    System.out.println(submit);

	}

}
