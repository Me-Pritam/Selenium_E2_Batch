package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssSelector
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.instagram.com/");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("input[name='username']")).sendKeys("");

            Thread.sleep(1000);

            driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("button._aswp._aswr._aswu._asw_._asx2")).click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
