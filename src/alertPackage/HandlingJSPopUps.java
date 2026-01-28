package alertPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandlingJSPopUps
{
    public static void main(String[] args) {
        try
        {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://demo.automationtesting.in/Alerts.html");

            driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]"))
                    .click();

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
            wait.until(ExpectedConditions.alertIsPresent());

            Alert alert = driver.switchTo().alert();


            alert.dismiss();

            driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();

            driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]"))
                    .click();
            Thread.sleep(2000);

            wait.until(ExpectedConditions.alertIsPresent()).dismiss();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]"))
                    .click();

            driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]"))
                    .click();

            Thread.sleep(2000);

            Alert promptAlert = driver.switchTo().alert();

            promptAlert.sendKeys("Demo Tester");

            promptAlert.dismiss();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
