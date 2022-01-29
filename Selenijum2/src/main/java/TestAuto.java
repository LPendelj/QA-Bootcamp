import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestAuto {

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
        driver.navigate().to("https://crop-circle.imageonline.co");
    }

    @Test
    void test (){


        WebElement dugme = driver.findElement(By.id("inputImage"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dugme);
        dugme.sendKeys("C:\\Users\\Acer\\Desktop\\download.jpg");

    }

    @AfterTest void end() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }



}
