package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathBySurroundingInTGSRTC
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.tgsrtcbus.in/");

            Thread.sleep(6000);

            driver.findElement(By.xpath("//div[@class='close_icon']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//div[contains(@class,'ant-form-item onward-date css-p8b6i ant-form-item-has-success')]"))
                    .click();

            Thread.sleep(2000);

           WebElement monthBox = driver.findElement(By.xpath("//div[@class='ant-picker-header-view']"));


           for(;;)
           {
               if (monthBox.getText().contains("Mar") && monthBox.getText().contains("2026"))
               {
                   driver.findElement(By.xpath("//div[@class='ant-picker-header-view']/../..//div[text()='10']"))
                           .click();
                   break;
               }
               else
               {
                  Thread.sleep(2000);

                  driver.findElement(By.xpath("//button[@aria-label='next-year']"))
                          .click();
               }
           }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
