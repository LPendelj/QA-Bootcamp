package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public WebDriver driver;
    public WebDriverWait wd;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

   /* public void LoginPage(WebDriver driver){

    }*/

    @FindBy(name = "username")
    WebElement username;

   //
   @FindBy(name = "password" )
   WebElement password;

   // password

    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/input")
    WebElement loginButton;


    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
}
