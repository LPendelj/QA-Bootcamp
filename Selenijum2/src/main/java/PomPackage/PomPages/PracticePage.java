package PomPackage.PomPages;

import PomPackage.PomBase.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticePage  {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement testLoginPage;

    public PracticePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getTestLoginPage() {
        return driver.findElement(By.linkText("Test Login Page"));
    }

//--------------------------

    public void clickOnTestLoginPage() {
        this.getTestLoginPage().click();
    }
}
