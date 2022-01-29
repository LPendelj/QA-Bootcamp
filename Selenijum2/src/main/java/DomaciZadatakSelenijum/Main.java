package DomaciZadatakSelenijum;

import DomaciZadatakSelenijum.PomPages.PhonesPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();



        WebDriver driver = new ChromeDriver();
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.navigate().to("https://www.demoblaze.com/index.html#");

        PhonesPage p = new PhonesPage(driver, wdw);

        p.printPhones();
        p.printLaptops();
        p.printMonitors();
    }
}
