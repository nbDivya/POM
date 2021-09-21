package POMTestCase;

import PageObjectModel.loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class loginTestcase {
    @Test
    public void login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("https://www.phptravels.net/login");
        Thread.sleep(3000);

        loginPage.username(driver).sendKeys("user@phptravels.com");
        loginPage.password(driver).sendKeys("demouser");

        Thread.sleep(3000);
        loginPage.login(driver).click();

    }
}
