package Pages;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
    public WebDriver driver;
    public WebDriverWait wdwait;

/*    public WebElement name;
    public WebElement surname;
    public WebElement genderMale;
    public WebElement genderFemale;
    public WebElement YearsOfExp;*/



    public RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy( xpath = "//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div[3]/input")
    public WebElement name;

    @FindBy ( name = "lastname")
    WebElement lastname;

    @FindBy ( id = "sex-0")
    WebElement GenderMale;

    @FindBy ( id = "sex-1")
    WebElement GenderFemale;

    @FindBy (id = "exp-4")
    WebElement exp;

    @FindBy(id = "datepicker")
    WebElement datePicker;



    public WebElement getName() {
        return driver.findElement(By.name("firstname"));
    }

    public WebElement getLastname() {
        return lastname;
    }

    public WebElement getGenderMale() {
        return GenderMale;
    }

    public WebElement getGenderFemale() {
        return GenderFemale;
    }

    public WebElement getExp() {
        return exp;
    }

    public WebElement getDatePicker() {
        return datePicker;
    }

    /*   driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).sendKeys("Wood");
    // Select Gender
        driver.findElement(By.id("sex-0")).click();
    // Select Experience
        driver.findElement(By.id("exp-4")).click();
    // Enter Date
        driver.findElement(By.id("datepicker")).click();
        driver.findElement(By.id("datepicker")).sendKeys("16-10-2020");
    // Select Profession
        driver.findElement(By.id("profession-1")).click();
    // Select Automation Tool
        driver.findElement(By.id("tool-2")).click();*/

    public void enterName(String ime){
        this.name.sendKeys(ime);
    }

    public void enterLastName(String name){
        this.lastname.sendKeys(name);
    }

    public void selectMale(){
        this.GenderMale.click();
    }

    public void selectfemale(){
        this.GenderFemale.click();
    }

    public void selectExp(){
        this.exp.click();
    }


}
