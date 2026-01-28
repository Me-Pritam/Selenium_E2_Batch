package actionsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingClick_Doubleclick_ContextClick_Method
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            driver.get("https://excalidraw.com/");

            Actions action = new Actions(driver);

            action.click(driver.findElement(By.xpath("//button[@title='More tools']")))
                    .perform();

            Thread.sleep(2000);


            driver.get("https://demoqa.com/buttons");

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
           WebElement doubleButton =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='doubleClickBtn']")));


//            action.doubleClick(doubleButton).perform();
//
//            Thread.sleep(2000);

            action.contextClick(driver.findElement(By.xpath("//button[@id='rightClickBtn']")))
                    .perform();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
