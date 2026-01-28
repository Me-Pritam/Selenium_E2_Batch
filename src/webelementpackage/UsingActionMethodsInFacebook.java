package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UsingActionMethodsInFacebook
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

          driver.get("https://www.facebook.com/");



          WebElement logInButton = driver.findElement(By.xpath("//button[@name='login']"));

          System.out.println(logInButton.getCssValue("background-color"));

          Thread.sleep(2000);

//          driver.get("https://x.com/i/flow/login");
//
//          driver.findElement(By.xpath("//input[@name='text']"))
//                  .sendKeys("9988776655");
//
//          driver.findElement(By.xpath("//span[text()='Next']")).click();
      }
      catch (Exception e) {
          e.printStackTrace();
      }
    }
}
