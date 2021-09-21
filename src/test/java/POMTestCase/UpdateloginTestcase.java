package POMTestCase;

import PageObjectModel.UpdateloginPage;
import PageObjectModel.loginPage;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UpdateloginTestcase {
    @Test
    public void Update() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.phptravels.net/login");

        loginPage.username(driver).sendKeys("user@phptravels.com");
        loginPage.password(driver).sendKeys("demouser");
        Thread.sleep(2000);
        loginPage.login(driver).click();

        UpdateloginPage.myprofile(driver).click();
        UpdateloginPage.phone(driver).sendKeys("678901");
        UpdateloginPage.city(driver).sendKeys("chennai");
        UpdateloginPage.submit(driver).click();

    }
}
