package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UsingRemainingGetters
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://chat.qspiders.com/");

          WebElement logINBtn =  driver.findElement(By.xpath("//button[text()='Login']"));

//            System.out.println(logINBtn.getLocation().y);
//            System.out.println(logINBtn.getSize().width);

            System.out.println(logINBtn.getRect().getDimension());

            System.out.println(driver.findElement(By.xpath("//input[@name='password']")).getDomAttribute("placeholder"));

            System.out.println(driver.findElement(By.name("username")).getTagName());




        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
