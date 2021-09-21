package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class updatepagefindby {

    @FindBy(xpath="/html/body/div[1]/div/div[3]/ul/li[4]/a")
    public static WebElement myprofile();


    @FindBy(name="phone")
    public static WebElement phonenumber();

    @FindBy(name="city")
    public static WebElement City();

    @FindBy(xpath="//button[@type='submit']")
    public static WebElement submit();

}



