package WebDriver_practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;


public class Add_to_cart {

    public static void main(String[] args) throws InterruptedException {
        
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.ebay.com/");
    
    WebElement search=driver.findElement(By.cssSelector("#gh-ac"));
    search.sendKeys("handbag");
    search.sendKeys(Keys.ENTER);
//getting current window id or info    
    String mainpage=driver.getWindowHandle();
    System.out.println("mainpage="+mainpage);
    WebElement handbag=driver.findElement(By.xpath("//span[contains(text(),'Fashion Handbags Women Bags Shoulder Messenger Bag')]"));
    handbag.click();
  //  driver.get("https://www.ebay.com/itm/285572816624?itmmeta=01HYF7VWMS8MSFY8EYZDH2MZG9&hash=item427d775ef0:g:ETIAAOSw-6liupPU&itmprp=enc%3AAQAJAAAA4KNzcCQBCJHDelMstm7yFyBiLC5TZIFhijiuEWNDtDLWR%2FzYays%2B93BxUbUeBAdVhpGjKTEapqGtyEpYi8vHnmhQByBMHIpCORIWHt%2Bo1Zx9VoR8iBlBweuQzN%2F4j3UscXiuE6VWSjGeDy8tcTVd6aHUsgMBSohpm3%2BY7J42izounbXqR06ebDg%2FUX912aOYJA3EDU%2BGx2sRW7SewINAhYTrmjIc%2BotJ5EIB6MwopBWlcK81Ja6SfxHDFF1Ux1e1naoxLWxRbvRjhp38f32ksxrb2hANqwn%2BzL%2FQqW8EBG5z%7Ctkp%3ABFBM1Mrv5_Nj");
    
    Thread.sleep(500);
    //code for switching to new window
    Set <String> allpages=driver.getWindowHandles();
    for(String page: allpages) {
        if(!page.equals(mainpage)) {
            driver.switchTo().window(page);
            break;
            
        }
    }
    
    
    JavascriptExecutor js=(JavascriptExecutor)driver;
      js.executeScript("window.scrollBy(0,300)","");

      driver.findElement(By.name("personalizationMsg")).click();
    driver.findElement(By.name("personalizationMsg")).sendKeys("Add Name tag");
    driver.findElement(By.xpath("//*[@id=\"atcBtn_btn_1\"]")).click();
    WebElement alert= driver.findElement(By.xpath("//div[@id='RightSummaryPanel']//button[2]"));
    alert.click();
    Thread.sleep(1000);
    

    }

}