package Base;

import Pages.CategoryPage;
import Pages.HomePage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wd;
    public HomePage homepage;
    public LoginPage loginPage;
    public CategoryPage categoryPage;


    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        wd = new WebDriverWait(driver, Duration.ofSeconds(15));

        homepage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        categoryPage = new CategoryPage(driver);





        ExcelReader er = new ExcelReader("src/main/resources/Podaci.xlsx");

        String url = er.getStringData("URL", 0, 0);



        driver.navigate().to(url);


    }

}
