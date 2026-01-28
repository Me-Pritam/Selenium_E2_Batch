package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UsingXpathBySurroundingInEasyMyTrip
{
    public static void main(String[] args)
    {
      try
      {
          ChromeOptions options = new ChromeOptions();

          options.addArguments("--disable-notifications");

          WebDriver driver = new ChromeDriver(options);

          driver.manage().window().maximize();

          Thread.sleep(2000);

          driver.get("https://www.easemytrip.com/");

          Thread.sleep(6000);

          driver.findElement(By.xpath("//div[@id='rdatelbl']"))
                  .click();

          Thread.sleep(1000);

          WebElement monthNameBox = driver.findElement(By.xpath("//div[@class='month2']"));

          for(int i=1; i>=0;i++)
          {
              if (monthNameBox.getText().equalsIgnoreCase("Mar 2026"))
              {
                  driver.findElement(By.xpath("//div[@class='month2']/../..//li[text()='10']"))
                          .click();
                  break;
              }

              Thread.sleep(2000);

              driver.findElement(By.xpath("(//div[@class='month3'])[2]"))
                      .click();
          }

      }
      catch (Exception e) {
          e.printStackTrace();
      }
    }

}
