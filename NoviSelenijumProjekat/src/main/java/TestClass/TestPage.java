package TestClass;

import BasePage.BasePage;
import Pages.RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BasePage.ExcelReader;

import java.io.IOException;
import java.time.Duration;

public class TestPage extends BasePage {
        WebDriverWait webDriverWait;
        RegistrationPage registrationPage;

    @BeforeMethod
    public void setUpPage() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdw = new WebDriverWait(driver, Duration.ofSeconds(15));
        registrationPage = new RegistrationPage(driver);

        ExcelReader er = new ExcelReader("C:\\Users\\Acer\\IdeaProjects\\NoviSelenijumProjekat\\src\\main\\resources\\data.xlsx");

        String url = er.getStringData("URL", 1, 0);

        driver.navigate().to(url);
        driver.manage().window().maximize();



    }


    @Test
    public void enterName() throws InterruptedException, IOException {

        for(int i=1; i<5; i++) {
            // WebElement name = driver.findElement(By.name("firstname"));
            //driver.navigate().refresh();

            ExcelReader er = new ExcelReader("C:\\Users\\Acer\\IdeaProjects\\NoviSelenijumProjekat\\src\\main\\resources\\data.xlsx");
            String ime = er.getStringData("names", i, 0);
            // registrationPage.getName().click();
            //name.sendKeys(ime);


            registrationPage.enterName(ime);

        }
    }

    @Test
    public void enterLastName() throws InterruptedException {


        // WebElement name = driver.findElement(By.name("firstname"));
        String prezime = "Prezime";
        // registrationPage.getName().click();
        //name.sendKeys(ime);
    //        WebElement element = driver.findElement(By.name("firstname"));
    //        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        registrationPage.enterLastName(prezime);
    }

    @Test
    public void selectGender() throws InterruptedException {


        // WebElement name = driver.findElement(By.name("firstname"));
        String prezime = "Prezime";
        // registrationPage.getName().click();
        //name.sendKeys(ime);
        //        WebElement element = driver.findElement(By.name("firstname"));
        //        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        registrationPage.selectfemale();
        registrationPage.selectMale();
    }

    @Test
    public void selectExp() {
        registrationPage.selectExp();
    }




}
