package WebDriver_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class QADemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Chrome driver setup
		System.setProperty("webdriver.chrome.driver", "D:\\JArs\\chromedriver-win64\\chromedriver.exe");
		//WebDriver object creation
		WebDriver driver=new ChromeDriver();
		//open respective web page by  using get method
		driver.get("https://demoqa.com/automation-practice-form");
		//Maximize window
		driver.manage().window().maximize();
		
		//Click on First name Text field and enter valid input using sendkeys
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Vaishali");

		//Click on Last name Text field and enter valid input using sendkeys
		driver.findElement(By.id("lastName")).click();
		driver.findElement(By.id("lastName")).sendKeys("Sonawane");
		//Click on Email Text field and enter valid input using sendkeys
	    driver.findElement(By.id("userEmail")).click();
	    driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
		//JavaScript code for scrolldown
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)","");
		//Click on radio button  with xpath ( //node[@attribute="att value"])
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
	    //Click on Mobile number Text field and enter valid Mobile number using sendkeys
		driver.findElement(By.id("userNumber")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9876543210");
		
		Thread.sleep(1000);
		//click on date of birth field
		driver.findElement(By.id("dateOfBirthInput")).click();
		//click on year list and select year using select class
	    WebElement year=	driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
	    Select sel=new Select(year);
	    sel.selectByVisibleText("2000");
	    //click on month list and select month using select class
	    WebElement selmonth=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
	    Select month=new Select(selmonth) ;
	    month.selectByVisibleText("December");
	 
	    //click on date field by using xpath
	    driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[2]")).click();
	    // click on subject field then enter input and keys.Enter(From keyboard) using CSS selector
	    driver.findElement(By.cssSelector("input[id=\"subjectsInput\"]")).click();
		driver.findElement(By.cssSelector("input[id=\"subjectsInput\"]")).sendKeys("phy");
		driver.findElement(By.cssSelector("input[id=\"subjectsInput\"]")).sendKeys(Keys.ENTER);
        //Click on hobbies check box using xpath
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();		
	    // Create webelement then click on upload image and select image by passing location of that image
	    WebElement im=driver.findElement(By.id("uploadPicture"));
	    im.sendKeys("D:\\Desktop\\images.jpg");
	    //create webelement and enter valid Address
	    WebElement add=driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
	    add.sendKeys("Sreenath plaza fc road,pune");
	    
	    //Screen scroll down
		js.executeScript("window.scrollBy(0,400)","");
		 driver.findElement(By.cssSelector("#state > div > div.css-1hwfws3 > div.css-1wa3eu0-placeholder")).click();
	        driver.findElement(By.cssSelector("input[id=\"react-select-3-input\"]")).sendKeys("NCR");
	        driver.findElement(By.cssSelector("input[id=\"react-select-3-input\"]")).sendKeys(Keys.ENTER);
		//click on state and city listbox using css selector
		driver.findElement(By.cssSelector("#city > div > div.css-1hwfws3 > div.css-1wa3eu0-placeholder")).click();
        driver.findElement(By.cssSelector("input[id=\"react-select-4-input\"]")).sendKeys("Delhi");
        driver.findElement(By.cssSelector("input[id=\"react-select-4-input\"]")).sendKeys(Keys.ENTER);
        
        //validate submit button
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button#submit[type='submit'][class='btn btn-primary']")).click();
        Thread.sleep(1000);
        
	      File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(screenshotFile, new File("image.png"));
	        
	        js.executeScript("window.scrollBy(0,1000)","");
	        Thread.sleep(2000);
	        File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(screenshotFile1, new File("image1.png"));
	
		Thread.sleep(2500);		
		driver.close();

	}

}
