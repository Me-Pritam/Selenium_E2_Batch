package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformFollowInInstaUsingXpath
{
    public static void main(String[] args) {
        try
        {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.instagram.com/");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@name='username']"))
                    .sendKeys("");

            Thread.sleep(500);

            driver.findElement(By.xpath("//input[@name='password']"))
                    .sendKeys("");
            Thread.sleep(500);
             
            driver.findElement(By.xpath("//button[contains(@class,' _aswp _aswr _aswu _asw_ _asx2')]"))
                    .click();

            Thread.sleep(10000);

            driver.findElement(By.xpath("//span[@aria-describedby='_r_3_']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@aria-label='Search input']"))
                    .sendKeys("ssrajamouli");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//span[text()='ssrajamouli']"))
                    .click();


        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
