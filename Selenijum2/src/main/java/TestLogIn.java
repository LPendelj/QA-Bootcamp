import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class TestLogIn {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        WebDriverWait dw = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @BeforeMethod
    void pageSetUp (){
        driver.manage().window().maximize();
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
    }

    @Test(priority = 10)
    void testHappyFlow () {
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("student");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");

        WebElement button = driver.findElement(By.id("submit"));
        button.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://practicetestautomation.com/logged-in-successfully/");
    }

    @Test(priority = 20)
    void prazanUser () {
        //WebElement userName = driver.findElement(By.id("username"));
        //userName.sendKeys("student");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");

        WebElement button = driver.findElement(By.id("submit"));
        button.click();

        Assert.assertNotEquals(driver.getCurrentUrl(), "https://practicetestautomation.com/logged-in-successfully/");
    }
    @Test(priority = 30)
    void prazanPass () {
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("student");

        //WebElement password = driver.findElement(By.id("password"));
        //password.sendKeys("Password123");

        WebElement button = driver.findElement(By.id("submit"));
        button.click();

        Assert.assertNotEquals(driver.getCurrentUrl(), "https://practicetestautomation.com/logged-in-successfully/");
    }

    @Test(priority = 40)
    void pogresanPass () {
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("student");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("/");

        WebElement button = driver.findElement(By.id("submit"));
        button.click();

        Assert.assertNotEquals(driver.getCurrentUrl(), "https://practicetestautomation.com/logged-in-successfully/");
    }

    @Test(priority = 50)
    void pogresanUser () {
        WebElement userName = driver.findElement(By.id("username"));
        userName.clear();
        userName.sendKeys("/");


        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("Password123");

        WebElement button = driver.findElement(By.id("submit"));
        button.click();

        Assert.assertNotEquals(driver.getCurrentUrl(), "https://practicetestautomation.com/logged-in-successfully/");
    }


    @AfterMethod
    void vratiSe() throws InterruptedException {

        Thread.sleep(3000);
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
    }

    //error


    /*@AfterClass
    //tearDown
    void after() {
        driver.close();
        driver.quit();
    }*/


}
