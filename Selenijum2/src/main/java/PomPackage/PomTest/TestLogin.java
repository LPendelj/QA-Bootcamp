package PomPackage.PomTest;

import PomPackage.PomBase.BasePage;
import PomPackage.PomPages.SideBarPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin extends BasePage {




    @BeforeMethod
    public void setUpPage(){

        driver.manage().window().maximize();
        driver.navigate().to("https://practicetestautomation.com");
    }

    @Test
    public void homeTextTest() {

        String expectedText = "HOME";
        Assert.assertEquals(sideBarPage.getHomeText().toUpperCase(), expectedText);
    }
    @Test
    public void goToLoginPage() {
        sideBarPage.clickPractice();
        practicePage.clickOnTestLoginPage();
    }

    @Test
    public void userCanLogIn() {
        goToLoginPage();
        loginPage.testHappyFlow();
    }


}
