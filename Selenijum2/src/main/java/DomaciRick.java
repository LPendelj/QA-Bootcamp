import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DomaciRick {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();



        WebDriver driver = new ChromeDriver();

        WebDriverWait dw = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");

        Thread.sleep(5000);
        // driver.wait(5000);

        WebElement searchBox = driver.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input"));

        searchBox.sendKeys("Rick Astley - Never gonna give you up");

        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon"));
        searchButton.click();

        Thread.sleep(3000);

        WebElement song = driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]"));
        song.click();

    }
}
