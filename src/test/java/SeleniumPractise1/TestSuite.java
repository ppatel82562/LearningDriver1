package SeleniumPractise1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();                            //Create object for homepage
    RegisterPage registerPage = new RegisterPage();                //Create object for registerpage and use for login,log out,without details
    ElectronicHomePage product = new ElectronicHomePage ();        //Create object for add product in add to cart also use for serch box
    CompareProduct appleProduct = new CompareProduct();            //Create object for compare product and used for clear list and add to wishlist
    Utils utils = new Utils();                                     //Create object for Assert perpose but do not use Utils method
    CurrencySelection currencySelection = new CurrencySelection(); //Create object for currency selection (dollar & euro)
    ClothingClass clothingClass = new ClothingClass();             //Create object for to check High to Low price
    BookPage bookPage = new BookPage();                            //Create object for user able to order online


   // String expectedRegisterUrl = "http://demo.nopcommerce.com/register1";
    // String ExpextedSucMsg ="Thank you for registration";

    @Test
    public void verifyuserShouldBeAbleToOrderBookAndCheckOutSuccessFully (){
        homePage.navigateToBookPage();  //used homepage object to navigate to bookspage
        bookPage.orderBook();
        try {                                           //try & catch put for find element for the load next page
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(driver.findElement(By.xpath("//h1")).getText(),"Thank you");
        System.out.println("User able to order online");

    }

    @Test
    public void verifyuserShouldbeAbleToSelectSortByPricesHighToLow (){
        homePage.navigateToClothingPage();     //used homepage object to navigate to clothing page
        clothingClass.ClothingPage();
        System.out.println("User able to select High to Low Price");
    }

    @Test
    public void verifyuserAbleToChangeCurrencyInEuro(){
       currencySelection.SelectEuroCurrency();
        System.out.println("Customer able to change currency from currency drop box");
    }

    @Test

    public void verifyuserShoudBeVisibleAllTheErrorMassageOnRegisterPageWithoutInsertDate(){

        homePage.navigateToRegisterPage();              //used homepage object to navigate to register page
        registerPage.registerWithOutEnterData();
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[2]/span[2]/span")).getText(),"First name is required.");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[3]/span[2]/span")).getText(),"Last name is required.");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[5]/span[2]/span")).getText(),"Email is required.");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[4]/div[2]/div[1]/span[2]/span")).getText(),"Password is required.");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[4]/div[2]/div[2]/span[2]/span")).getText(),"Password is required.");
        System.out.println("User not able to registration without details");
    }

    @Test
    public void verifyuserShouldBeAbleToLogOutSuccessFully (){

       homePage.navigateToRegisterPage();
       registerPage.registerUser();  //Called registerpage method
       registerPage.logOut();        //Called register homepage method

       String actaulloginButtonText = driver.findElement(By.className("ico-login")).getText();
        System.out.println(actaulloginButtonText);
        Assert.assertEquals(actaulloginButtonText,"Log in");
        System.out.println("User able to log out successfully");
    }

    @Test
    public void verifyuserShouldBeAbleToSendEmailToFriend (){
        homePage.navigateToRegisterPage(); //Called navigate to homepage method
        registerPage.registerUser();      //Called registerPage method
        registerPage.emailFriend();       //Called register homepage method
        Assert.assertEquals(driver.findElement(By.cssSelector(".result")).getText(),"Your message has been sent.");
        registerPage.logOut();            //Called log out method
        System.out.println("Email massage sent successfully");
    }

    @Test
    public void verifyuserShouldBeAbleToWriteSuccessFullyReview (){
        homePage.navigateToRegisterPage();  //Called naviagate to homepage method
        registerPage.registerUser();        //Called registerPage method
        registerPage.review();              //called registerPage method
        Assert.assertEquals(driver.findElement(By.cssSelector("div.result")).getText(),"Product review is successfully added.");
        System.out.println("Review is successfully added");
    }

    @Test
    public void verifyuserShouldBeAbleToClearProductFromComparisonList (){

        appleProduct.macPro();
        appleProduct.clearList(); //Called macPro method
        Assert.assertEquals(driver.findElement(By.className("clear-list")).getText(),"CLEAR LIST");
        System.out.println("User able to clear the list");
    }

    @Test

    public void verifyUserShouldBeAbleToNavigateToRegisterPage() {

        homePage.navigateToRegisterPage();
        registerPage.registerUser();
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/form/div/div[2]/div[1]")).getText(),"Your registration completed");
        System.out.println("User able to do successful registration");
    }

    @Test
    public void verifyUserShouldBeAbleToProductInWishList() {
        appleProduct.addWishList(); //Called macPro method
        Assert.assertEquals(driver.findElement(By.cssSelector(".content")).getText(),"The product has been added to your wishlist");
        System.out.println("User able to add item in wishlist");
    }


    @Test
    public void verifyUserShouldBeAbleToSerchItemFromSerchBox() {
        product.serchBoxUser();  //Called Electronic home page method
        System.out.println("User able to serch item");
    }

    @Test
    public void verifyUserAbleToAddProductInAddCartSuccessFully(){
       product.productUser();
        //This assert i have commented because i cound not found locators i have tried too many time
        // Assert.assertEquals(driver.findElement(By.cssSelector(".content")).getText(), "The product has been added to your shopping cart");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[2]/span")).getText(),"APPLE_CAM");
        System.out.println("The product APPLE_CAM has been added in shopping cart ");


    }
    @Test
    public void verifyUserShouldBeAbleToCompareTheProduct(){
        appleProduct.macPro();
        Assert.assertEquals(driver.findElement(By.xpath("//a[contains(@href,'/compareproducts')]")).getText(),"Compare products list");
        System.out.println("User successfully compare 2 products");
    }


}




