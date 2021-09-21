package POMTestCase;

import PageObjectModel.loginPageFindby;
import PageObjectModel.updatepagefindby;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class updatefindbyTestcase {
@Test
    public void update() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
    WebDriver driver=new ChromeDriver();

    driver.get("https://www.phptravels.net/login");

    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

    PageFactory.initElements(driver,loginPageFindby.class);
    loginPageFindby.username.sendKeys("user@phptravels.com");
    loginPageFindby.password.sendKeys("demouser");
    loginPageFindby.login.click();


    Thread.sleep(2000);

    PageFactory.initElements(driver,updatepagefindby.class);
    updatepagefindby.myprofile().click();
    updatepagefindby.City().sendKeys("chennai");
    updatepagefindby.phonenumber().sendKeys("123890");
    updatepagefindby.submit().click();

}
}
