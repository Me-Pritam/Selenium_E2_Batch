package actionsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DragAndDropUsingClickAndHoldMethod
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://testautomationcentral.com/demo/drag_and_drop.html");

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));


            WebElement draggableBox = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='draggable']"))));
            WebElement dropBox = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='droppable']"))));

            int xPoint = dropBox.getLocation().x - draggableBox.getLocation().x;
            int yPoint = dropBox.getLocation().y - draggableBox.getLocation().y;

            Actions action = new Actions(driver);

            action.clickAndHold(draggableBox)
                    .pause(Duration.ofSeconds(2))
                    .moveByOffset(xPoint,yPoint)
                    .release().perform();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
