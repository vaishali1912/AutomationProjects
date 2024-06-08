package WebDriver_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\JArs\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        // Action  double click
        WebElement source=driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
        WebElement target=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        Actions act=new Actions(driver);
       act.dragAndDrop(source, target).perform();

	}

}
