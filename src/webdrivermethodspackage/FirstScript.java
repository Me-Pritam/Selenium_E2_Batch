package webdrivermethodspackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript
{
    public static void main(String[] args)
    {
        try
        {
            ChromeDriver driver = new ChromeDriver();

            Thread.sleep(2000);

            driver.get("https://www.instagram.com/");

        } catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
