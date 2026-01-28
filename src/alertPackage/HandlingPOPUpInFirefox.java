package alertPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class HandlingPOPUpInFirefox
{
    public static void main(String[] args) {

        try
        {
            FirefoxOptions options = new FirefoxOptions();

//            options.addPreference("dom.webnotifications.enabled",false);
//            options.addPreference("dom.popup.enabled",false);
//            options.addPreference("geo.enabled",false);
//            options.addPreference("signon.rememberSignons",false);

            WebDriver driver = new FirefoxDriver();

            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.findElement(By.xpath("//input[@id='user-name']"))
                    .sendKeys("standard_user");

            driver.findElement(By.xpath("//input[@id='password']"))
                    .sendKeys("secret_sauce");

            driver.findElement(By.xpath("//input[@id='login-button']"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
