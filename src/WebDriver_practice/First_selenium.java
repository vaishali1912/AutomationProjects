package WebDriver_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_selenium {

	public static void main(String[] args) {
		int a=0;
		//Prerequisite (browser setup and open google page)
		System.setProperty("webdriver.chrome.driver", "D:\\JArs\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		if(a==0)
		{
		driver.get("https://www.google.com/");
		//click on search with id locator
	    driver.findElement(By.id("APjFqb")).click();
		//enter input into search field with id locator
		driver.findElement(By.id("APjFqb")).sendKeys("Nature images");
		
		//press enter button of keyboard
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		}
		else
			System.out.println("Bye bye");

	}

}
