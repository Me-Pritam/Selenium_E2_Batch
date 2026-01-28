package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class usingGetCssValue
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://tinder.com/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            System.out.println(driver.findElement(By.xpath("//button[@class='c1p6lbu0 Mt(20px)']/descendant::div[@class='c9iqosj']")).getCssValue("font-family"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
