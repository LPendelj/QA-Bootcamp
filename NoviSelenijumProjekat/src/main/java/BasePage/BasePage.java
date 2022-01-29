package BasePage;

import Pages.RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wdw;

    public RegistrationPage registrationPage;


    //metoda koja se poziva prilikom pokretanja programa kako bi se setovalo okruzenje za test.
    @BeforeClass
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdw = new WebDriverWait(driver, Duration.ofSeconds(15));



        driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");

    }


}
