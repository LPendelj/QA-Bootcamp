package Test;

import Base.BasePage;
import Base.ExcelReader;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class PetShopTest extends BasePage {


    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
    }


    @Test
    public void verifyThatUserCanLogin(){
        homepage.getSignIn().click();

        loginPage.getUsername().clear();

        loginPage.getUsername().sendKeys("921921");

        loginPage.getPassword().clear();

        loginPage.getPassword().sendKeys("Test1");
        loginPage.getLoginButton().click();

        String tekst = homepage.getSignIn().getText();


        //testiramo da li je dugme sign out vidljivo - trebalo bi da jeste
        Assert.assertEquals(tekst, "Sign Out");

        String tekst2 = homepage.getMyAcc().getText();

        //testiramo da li je dugme my account vidljivo - trebalo bi da jeste
        Assert.assertEquals(tekst2, "My Account");

    }


    @Test
    public void verifyThatUnregisteredUserCannotLogIn() throws IOException {
        homepage.getSignIn().click();
        ExcelReader er = new ExcelReader("C:\\Users\\Acer\\IdeaProjects\\PetShopTest\\src\\main\\resources\\Podaci.xlsx");

        for(int i = 1; i<=3; i++){
            loginPage.getUsername().clear();
            String user = er.getStringData("Data", i, 3);
            String pass = er.getStringData("Data", 1, 3);

            loginPage.getUsername().sendKeys(user);

            loginPage.getPassword().clear();

            loginPage.getPassword().sendKeys(pass);
            loginPage.getLoginButton().click();

            String tekst = homepage.getSignIn().getText();


            //testiramo da li je dugme sign out vidljivo - trebalo bi da nije
            Assert.assertNotEquals(tekst, "Sign Out");
        }

    }

    @Test
    public void verifyThatFishCategoryShowsUp(){
        driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");

        homepage.getFishCat().click();
        String naslov = categoryPage.getNaslov().getText();


        //testiramo da li je se kategorija Fish pojavljuje kad kliknemo na nju.
        Assert.assertEquals(naslov, "Fish");
    }

    @Test
    public void verifyLoggedInUserCanAddProducts(){
        verifyThatUserCanLogin();
        verifyThatFishCategoryShowsUp();

        categoryPage.getPrviElement().click();
        categoryPage.getDodajUKorpu().click();

        homepage.getCart().click();

        boolean ima =  categoryPage.getElement().isDisplayed();

        //proveravamo da li je element vidljiv
        Assert.assertEquals(ima, true);

        categoryPage.getCheckoutButton().click();

        boolean vidiSe = categoryPage.getPayButton().isDisplayed();
            //proveravamo da li se vidi dugme za placanje
        Assert.assertEquals(vidiSe, true);



    }

    @Test
    public void verifyNotLoggedInUserCannotAddProducts(){
        String tekst = homepage.getSignIn().getText();
        if( tekst.equals("Sign Out")){
            homepage.getSignIn().click();
        }

        verifyThatFishCategoryShowsUp();

        categoryPage.getPrviElement().click();
        categoryPage.getDodajUKorpu().click();

        //homepage.getCart().click();

        categoryPage.getAddToCartButton().click();

        boolean ima = loginPage.getLoginButton().isDisplayed();
        boolean ima2 = loginPage.getUsername().isDisplayed();
        boolean ima3 = loginPage.getPassword().isDisplayed();

        //proveravamo da li smo redirektovani na login page
        Assert.assertEquals(ima, true);
        Assert.assertEquals(ima2, true);
        Assert.assertEquals(ima3, true);




    }

    @AfterClass
    public void shutDown(){
        driver.quit();
    }

}
