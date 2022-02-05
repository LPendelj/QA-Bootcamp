package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    public WebDriver driver;
    public WebDriverWait wd;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

   /* public void HomePage(WebDriver driver){

    }*/

    @FindBy(id = "LogoContent")
    WebElement logo;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/a[1]/img")
    WebElement cart;

    @FindBy(xpath= "//*[@id=\"MenuContent\"]/a[2]")
    WebElement signIn;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/a[4]")
    WebElement help;

    @FindBy(xpath = "//*[@id=\"MenuContent\"]/a[3]")
    WebElement MyAcc;

    @FindBy(xpath = "//*[@id=\"SidebarContent\"]/a[1]/img")
    WebElement fishCat;

    public WebElement getLogo() {
        return logo;
    }

    public WebElement getCart() {
        return cart;
    }

    public WebElement getSignIn() {
        return signIn;
    }

    public WebElement getHelp() {
        return help;
    }

    public WebElement getMyAcc() {
        return MyAcc;
    }

    public WebElement getFishCat() {
        return fishCat;
    }
}
