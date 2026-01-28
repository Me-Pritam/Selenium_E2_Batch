package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByContains
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://x.com/");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//a[@data-testid='signupButton']"))
                    .click();

            Thread.sleep(4000);

            driver.findElement(By.xpath("(//input[contains(@class,'r-30o5oe r-1dz5y72 r-13qz1uu r-1niwhzg r-17gur6a')])[1]"))
                    .sendKeys("John Doe");

            Thread.sleep(2000);

            driver.findElement(By.xpath("(//input[contains(@class,'r-30o5oe r-1dz5y72 r-13qz1uu r-1niwhzg r-17gur6a')])[2]"))
                    .sendKeys("john@gmail.com");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
