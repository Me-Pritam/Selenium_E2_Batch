package actionsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingScrollToElementMethod
{
    public static void main(String[] args)
    {
       try
       {
           WebDriver driver = new ChromeDriver();

           driver.manage().window().maximize();

           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

           driver.get("https://www.amazon.in/");

           WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='twotabsearchtextbox']")));


           Actions action = new Actions(driver);

//           action.scrollToElement(driver.findElement(By.xpath("//span[text()='Most searched for on Flipkart']")))
//                   .click(driver.findElement(By.xpath("//a[@href='/brands']")))
//                   .perform();



           action.scrollByAmount(0,3000).perform();

       } catch (Exception e)
       {
         e.printStackTrace();
       }
    }
}
