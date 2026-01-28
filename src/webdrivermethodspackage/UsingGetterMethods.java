package webdrivermethodspackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetterMethods
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          Thread.sleep(1000);

          String url = "https://chat.qspiders.com/";

          driver.get(url);

          if(driver.getTitle().equals("Qtalk"))
          {
              System.out.println("The Title is as expected ");
          }
          else
          {
              System.out.println("The Title is wrong");
          }
          if(driver.getCurrentUrl().equals(url))
          {
              System.out.println("The Url is as expected");
          }
          else {
              System.out.println("Different URL is opened");
          }

         //8+ System.out.println(driver.getPageSource());

      } catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
