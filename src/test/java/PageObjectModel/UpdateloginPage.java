package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateloginPage {
    public static WebElement myprofile(WebDriver driver)
    {
      return  driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/ul/li[4]/a"));

    }

    public static WebElement phone(WebDriver driver)
    {
        return  driver.findElement(By.xpath("//input[@name='phone']"));

   }

    public static WebElement city(WebDriver driver)
    {
        return  driver.findElement(By.xpath("//input[@name='city']"));

    }

    public static WebElement submit(WebDriver driver)
    {
        return  driver.findElement(By.linkText("/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button"));

    }


}
