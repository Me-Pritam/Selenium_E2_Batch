package autosuggestionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HandlingAmazonAutoSuggestion
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
          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='twotabsearchtextbox']")))
                  .sendKeys("Samsung");

         List<WebElement> allOPs =  wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//div[@role='row']/descendant::div[contains(@class,'s-suggestion s-suggestion-ellipsis-direction')]"))));

         for(WebElement option :allOPs)
         {
             if (option.getText().contains("s24 fe 5g"))
             {
                 option.click();
                 break;
             }
         }

      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
