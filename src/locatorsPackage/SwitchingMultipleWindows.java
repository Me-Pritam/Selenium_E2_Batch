package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.AllPermission;
import java.time.Duration;
import java.util.Set;

public class SwitchingMultipleWindows
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            //Thread.sleep(2000);

            driver.get("https://www.flipkart.com/");

            //Thread.sleep(2000);

            String parentId = driver.getWindowHandle();

            driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Vivo x200 pro");

            //Thread.sleep(3000);

            driver.findElement(By.xpath("//button[contains(@aria-label,'Search for Products, Brands and More')]"))
                    .click();

            //Thread.sleep(2000);

            driver.findElement(By.xpath("//div[contains(text(),'vivo X200 Pro 5G (Titanium Grey, 512 GB)')]"))
                    .click();

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
            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[text()='Add to cart']"))
                    .click();

            //Thread.sleep(2000);

            driver.close();

            driver.switchTo().window(parentId);
 
            Thread.sleep(2000);

            driver.findElement(By.xpath("//div[contains(text(),'vivo X200 Pro 5G (Cosmos Black, 512 GB)')]"))
                    .click();



        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}
