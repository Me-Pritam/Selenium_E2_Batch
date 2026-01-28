package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UsingValidationMethods
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://demo.automationtesting.in/Register.html");

            WebElement hockeyCheckBox = driver.findElement(By.xpath("//label[text()='Hockey']/preceding-sibling::input"));

            if (hockeyCheckBox.isDisplayed())
            {
                System.out.println("The Hockey Checkbox is Displayed");

                if (hockeyCheckBox.isSelected())
                {
                    System.out.println("The Hockey Checkbox is selected");
                }
                else {
                    System.out.println("The Hockey Chrckbox is not selected");
                    hockeyCheckBox.click();
                    System.out.println("Now the Hockey Checkbox is clicked");
                }
            }
            else {
                System.out.println("The Hockey CHeckBox is not Displayed");
            }

            WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submitbtn']"));

            if (submitBtn.isEnabled())
            {
                System.out.println("The submit button is enabled");
                submitBtn.click();
                System.out.println("Now the Submit button is clicked");

            }
            else {
                System.out.println("The Submit button is disabled");
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
