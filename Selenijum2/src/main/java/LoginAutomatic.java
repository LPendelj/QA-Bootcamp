import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginAutomatic {
    public static void main(String[] args) throws InterruptedException {

        //https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");

        WebElement user = driver.findElement(By.xpath("//*[@id=\"usernameOrEmail\"]"));
        user.sendKeys("LPendelj");

        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[2]/button"));
        continueButton.click();

            Thread.sleep(1000);

        WebElement passBox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passBox.sendKeys("Qwerty123");

        continueButton.click();

       // Assert ass = new Assert();






    }
}
