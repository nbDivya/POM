package POMTestCase;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class withoutFindby {
    @Test
    public void without()
    {
        public static WebElement txtUsername;
        public static WebElement txtPassword;
        public static WebElement btnLogin;

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

        PageFactory.initElements(driver,withoutFindby.class);
        txtUsername.sendKeys("Admin");
        txtPassword.sendKeys("admin123");
        btnLogin.click();

    }
}
