package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathBySurroundingInClearTrip
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.cleartrip.com/");

            Thread.sleep(2000);

//            driver.findElement(By.xpath("//*[name()='svg' and @data-testid='closeIcon']"))
//                    .click();
//
//            Thread.sleep(2000);
//
//            driver.findElement(By.xpath("//div[@data-testid='dateSelectOnward']"))
//                    .click();
//
//            Thread.sleep(2000);
//
//            while(true)
//            {
//                WebElement monthBox = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']"));
//
//                if (monthBox.getText().equals("April 2026"))
//                {
//                    driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/..//div[text()='20']"))
//                            .click();
//                    break;
//                }
//                else {
//                    Thread.sleep(1000);
//
//                    driver.findElement(By.xpath("//*[name()='svg' and @data-testid='rightArrow']"))
//                            .click();
//                }
//            }


            for(int i=1; i<=5;i++)
            {
                driver.switchTo().newWindow(WindowType.TAB);
            }





        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
