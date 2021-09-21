package POMTestCase;

import PageObjectModel.loginPageFindby;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class loginfindbyTestcase {
    @Test
    public void loginfindby()
    {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.phptravels.net/login");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

        PageFactory.initElements(driver, loginPageFindby.class);

        loginPageFindby.username.sendKeys("user@phptravels.com");
        loginPageFindby.password.sendKeys("demouser");
        loginPageFindby.login.click();

    }
}
