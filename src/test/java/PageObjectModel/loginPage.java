package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

    public static WebElement username(WebDriver driver)
    {
       return driver.findElement(By.name("email"));

    }
    public static WebElement password(WebDriver driver)
    {
        return driver.findElement(By.name("password"));
    }

    public static WebElement login(WebDriver driver)
    {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
    }



}
