import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DemoQALogin {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/login");


        Cookie kolacic = new Cookie("userID", "3ef74d82-ca69-43dc-ae86-ddc8f84d4caf");
        Cookie kolacic2 = new Cookie("userName", "LPendelj");
        Cookie kolacic3 = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IkxQZW5kZWxqIiwicGFzc3dvcmQiOiJRd2VydHkxMjMhIiwiaWF0IjoxNjQyMzQ1NzY3fQ.aivtg80YQrnMHhUnlt4ex_7tI8agTGrizM1OHnnLRfI");
        Cookie kolacic4 = new Cookie("expires", "2022-01-23T15%3A09%3A27.511Z");
        Cookie kolacic5 = new Cookie("IDE", "AHWqTUmEE-2cSaDeXwl-6d6HAEXt_TC2-27xjQVwpGl0ndqm2iYahV3btHy-_klVFR0");


        driver.manage().addCookie(kolacic);
        driver.manage().addCookie(kolacic2);
        driver.manage().addCookie(kolacic3);
        driver.manage().addCookie(kolacic4);
        driver.manage().addCookie(kolacic5);


        driver.navigate().refresh();

        WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/div/button"));


        Assert.assertTrue(button.isDisplayed());


        //userName LPendelj



    }
}
