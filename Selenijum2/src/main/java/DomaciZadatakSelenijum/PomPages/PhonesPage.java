package DomaciZadatakSelenijum.PomPages;

import DomaciZadatakSelenijum.Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class PhonesPage extends Base {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public PhonesPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }



    public void printPhones() throws InterruptedException {
        ArrayList<String> listaTelefona = new ArrayList<String>();

        System.out.println("---------------------------");
        System.out.println("Lista modela telefona je:");

        Thread.sleep(2000);

        for( int i = 1; i <= 7; i++) {
            String s = "/html/body/div[5]/div/div[2]/div/div[" + i + "]/div/div/h4/a";

            WebElement tel1 = driver.findElement(By.xpath(s));
            listaTelefona.add(tel1.getText());

        }

        for(String s : listaTelefona) {
            System.out.println(s);
        }
    }

    public void printLaptops() throws InterruptedException {

        WebElement link = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]"));
        link.click();

        ArrayList<String> listaLaptopovi = new ArrayList<String>();

        System.out.println("---------------------------");
        System.out.println("Lista modela laptopova je:");

        Thread.sleep(2000);

        for( int i = 1; i <= 6; i++) {
            String s = "/html/body/div[5]/div/div[2]/div/div[" + i + "]/div/div/h4/a";

            WebElement tel1 = driver.findElement(By.xpath(s));
            listaLaptopovi.add(tel1.getText());

        }

        for(String s : listaLaptopovi) {
            System.out.println(s);
        }
    }

    public void printMonitors() throws InterruptedException {
        WebElement link = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[4]"));
        link.click();

        ArrayList<String> listaMonitori = new ArrayList<String>();



        System.out.println("---------------------------");
        System.out.println("Lista modela monitora je:");

        Thread.sleep(2000);

        for( int i = 1; i <= 2; i++) {
            String s = "/html/body/div[5]/div/div[2]/div/div[" + i + "]/div/div/h4/a";

            WebElement tel1 = driver.findElement(By.xpath(s));
            listaMonitori.add(tel1.getText());

        }

        for(String s : listaMonitori) {
            System.out.println(s);
        }
    }


    ///html/body/div[5]/div/div[2]/div/div[1]/div/div/h4/a
    ///html/body/div[5]/div/div[2]/div/div[2]/div/div/h4/a



}
