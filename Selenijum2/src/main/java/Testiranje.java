import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Testiranje {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        WebDriverWait dw = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @BeforeMethod void pageSetUp (){
        driver.manage().window().maximize();
        driver.navigate().to("www.google.com");
    }

    @Test
    public void test(){

    }


}
