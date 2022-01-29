import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UploadImage {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();



        WebDriver driver = new ChromeDriver();

        WebDriverWait dw = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.navigate().to("https://crop-circle.imageonline.co");



        WebElement dugme = driver.findElement(By.id("inputImage"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dugme);
        dugme.sendKeys("C:\\Users\\Acer\\Desktop\\download.jpg");
    }

}
