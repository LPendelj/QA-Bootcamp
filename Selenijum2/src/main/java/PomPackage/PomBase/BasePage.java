package PomPackage.PomBase;

import PomPackage.PomPages.LoginPage;
import PomPackage.PomPages.SideBarPage;
import PomPackage.PomPages.PracticePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wdw;
    public SideBarPage sideBarPage;
    public PracticePage practicePage;
    public LoginPage loginPage;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdw = new WebDriverWait(driver, Duration.ofSeconds(15));
        sideBarPage = new SideBarPage(driver, wdw);
        practicePage = new PracticePage(driver, wdw);
        loginPage = new LoginPage(driver, wdw);
    }

    @AfterClass
    public void tearDown(){

    }

}
