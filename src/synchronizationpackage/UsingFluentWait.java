package synchronizationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingFluentWait
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://www.shoppersstack.com/");

            FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
            wait.pollingEvery(Duration.ofSeconds(2));
            wait.ignoring(Exception.class);
            wait.withTimeout(Duration.ofSeconds(10));

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Electronic']")))
                    .click();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
