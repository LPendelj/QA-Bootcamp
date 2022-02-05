package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoryPage {
    public WebDriver driver;
    public WebDriverWait wd;

    public CategoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }




    @FindBy(xpath = "//*[@id=\"Catalog\"]/h2")
    WebElement naslov;

    public WebElement getNaslov() {
        return naslov;
    }

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    WebElement prviElement;

    public WebElement getPrviElement() {
        return prviElement;
    }

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")
    WebElement dodajUKorpu;

    public WebElement getDodajUKorpu() {
        return dodajUKorpu;
    }

    @FindBy(xpath = "//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[1]/a")
    WebElement element;

    public WebElement getElement() {
        return element;
    }


    @FindBy(xpath = "//*[@id=\"Cart\"]/a")
    WebElement addToCartButton;


    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/a")
    WebElement checkoutButton;

    public WebElement getCheckoutButton() {
        return checkoutButton;
    }

    @FindBy(name = "newOrder")
    WebElement payButton;

    public WebElement getPayButton() {
        return payButton;
    }
}
