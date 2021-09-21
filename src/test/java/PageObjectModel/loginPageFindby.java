package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPageFindby {


        @FindBy(name="email")
        public static WebElement username;


         @FindBy(name="password")

        public static WebElement password;

        @FindBy(xpath="//button[@type='submit']")
         public static WebElement login;



    }


