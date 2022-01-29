import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Selenijum2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

      //  Zadatak 1 - Otvoriti 3 taba, svaki tab treba da odlazi na poseban URL (po vasoj zelji koji), sacekati 2 sekunde u svakom tabu i zatvoriti sve tabove


        js.executeScript("window.open()");
        js.executeScript("window.open()");


        ArrayList<String> listaTabova = new ArrayList<String>(driver.getWindowHandles());


        driver.switchTo().window(listaTabova.get(0)).get("https://www.google.com");

        driver.switchTo().window(listaTabova.get(1)).get("https://www.google.com");

        driver.switchTo().window(listaTabova.get(2)).get("https://www.google.com");
        Thread.sleep(2000);
        driver.close();

        driver.switchTo().window(listaTabova.get(1));
        Thread.sleep(2000);
        driver.close();

        driver.switchTo().window(listaTabova.get(0)).get("https://www.youtube.com");
        Thread.sleep(2000);
        driver.close();

    }
}
