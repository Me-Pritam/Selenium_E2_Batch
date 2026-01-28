package switchingpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class UsingSwtichToInFlipKart
{
    public static void main(String[] args) {

       try {

           WebDriver driver = new ChromeDriver();

           driver.manage().window().maximize();

           Thread.sleep(2000);

           driver.get("https://www.flipkart.com/");

           Thread.sleep(2000);

           String parentId = driver.getWindowHandle();

           driver.findElement(By.xpath("//input[@name='q']"))
                   .sendKeys("vivo x300 pro");

           Thread.sleep(2000);
           driver.findElement(By.xpath("//button[contains(@aria-label,'Search for Products, Brands and More')]"))
                   .click();

           Thread.sleep(2000);

           driver.findElement(By.xpath("//div[contains(text(),'vivo X300 Pro (Dune Gold, 512 GB)')]"))
                   .click();

           Thread.sleep(2000);

           Set<String> allPageId = driver.getWindowHandles();

           for(String pageId : allPageId)
           {
               if (pageId.equals(parentId))
               {
                   continue;
               }
               else {

                   driver.switchTo().window(pageId);
                   break;
               }
           }

          driver.findElement(By.xpath("//button[contains(@class,'dSM5Ub ugg2XR IUmgrZ')]"))
                  .click();

       } catch (Exception e) {
           e.printStackTrace();
       }

    }
}
