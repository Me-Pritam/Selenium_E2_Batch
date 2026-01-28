package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByAxesInMMT
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.makemytrip.com/");

            String monthName = "March 2026";
            String desiredDate = "10";

            Thread.sleep(4000);

            driver.findElement(By.xpath("//img[contains(@src,'https://jsak.mmtcdn.com/pwa/platform-myra-ui/static/sub_icons/close-icon.png')]"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//span[@data-cy='closeModal']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//span[@class='coachmark']"))
                            .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//div[contains(@class,'flt_fsw_inputBox dates inactiveWidget')]"))
                    .click();

            Thread.sleep(2000);

           WebElement monthNameBox = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']"));

           for(;;)
           {
               if (monthNameBox.getText().equals(monthName))
               {
                   driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/following::p[text()='"+desiredDate+"']"))
                           .click();
                   break;
               }

               Thread.sleep(1000);

               driver.findElement(By.xpath("//span[@aria-label='Next Month']"))
                       .click();
           }


        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
