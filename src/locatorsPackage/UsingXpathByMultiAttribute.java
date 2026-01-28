package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByMultiAttribute
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.youtube.com/");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@name='search_query']"))
                    .sendKeys("Rolex Entry in Vikram");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[@aria-label='Search' and @class='ytSearchboxComponentSearchButton']"))
                    .click();

            Thread.sleep(4000);

            driver.findElement(By.xpath("//a[contains(@aria-label,'ఆరంభిద్దామా ! Suriya As Rolex Ultimate Entry Movie Climax Scene')]"))
                    .click();



        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
