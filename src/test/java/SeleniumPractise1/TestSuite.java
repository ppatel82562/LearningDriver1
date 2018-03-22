package SeleniumPractise1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    WishList wishList = new WishList();
    SerchBox serchBox = new SerchBox();
    ElectronicHomePage product = new ElectronicHomePage ();
    CompareProduct appleProduct = new CompareProduct();
    Utils utils = new Utils();
    EmailFriend emailFriend = new EmailFriend();
    Review review = new Review();
    CurrencySelection currencySelection = new CurrencySelection();
    ClothingClass clothingClass = new ClothingClass();
    BookPage bookPage = new BookPage();


   // String expectedRegisterUrl = "http://demo.nopcommerce.com/register1";
    // String ExpextedSucMsg ="Thank you for registration";

    @Test
    public void userShouldBeAbleToOrderBookAndCheckOutSuccessFully (){
        homePage.navigateToBookPage();
        bookPage.orderBook();
        Assert.assertEquals(driver.findElement(By.linkText("Your order has been successfully processed!")),"Your order has been successfully processed!");

    }

    @Test
    public void userShouldbeAbleToSelectSortByPricesHighToLow (){
        homePage.navigateToClothingPage();
        clothingClass.ClothingPage();
       Assert.assertEquals(driver.findElement(By.xpath("//div[3]/div/span")),"From $35.00");
       Assert.assertEquals(driver.findElement(By.xpath("//div[3]/div/div[2]/div[3]/div/span")), "$15");



    }

    @Test
    public void userAbleToChangeCurrencyInEuro(){
       currencySelection.SelectTextFromDropDown();
       Assert.assertEquals(driver.findElement(By.className("price actual-price")),"€1140.00");

    }

    @Test

    public void userShoudBeVisibleAllTheErrorMassageOnRegesterPageWithoutInsertDate(){

        homePage.navigateToRegisterPage();
        registerPage.registerWithOutEnterData();
        }

    @Test
    public void userShouldBeAbleToLogOutSuccessFully (){

        homePage.navigateToRegisterPage();
       registerPage.registerUser();
       registerPage.logOut();

       String actaulloginButtonText = driver.findElement(By.className("ico-login")).getText();
        System.out.println(actaulloginButtonText);
        Assert.assertEquals(actaulloginButtonText,"Log in");
    }

    @Test
    public void userShouldBeAbleToSendEmailToFriend (){


        //registerPage.massage();
        emailFriend.massage();

    }
    @Test
    public void userShouldBeAbleToWriteSuccessFullyReview (){


        review.successfully();
    }



    @Test
    public void userShouldBeAbleToClearProductFromComparisonList (){

        appleProduct.macPro();
        appleProduct.clearList();
        Assert.assertEquals(By.className("clear-list"),"CLEAR LIST");

    }

    @Test

    public void verifyUserShouldBeAbleToNavigateToRegisterPage() {

        homePage.navigateToRegisterPage();
        registerPage.registerUser();
        Assert.assertEquals(By.className("result"), "Your registration completed");



    }

    @Test
    public void verifyUserShouldBeAbleToProductInWishList() {
        wishList.addwishlist();
        Assert.assertEquals(By.className("content"),"The product has been added to your wishlist");
    }


    @Test
    public void verifyUserShouldBeAbleToSerchItemFromSerchBox() {
        serchBox.serchBoxUser();

        //String expectedProductUrl = "http://demo.nopcommerce.com/search?q=computer";
       // String ExpectedSucMsg = "Thank you for choosiung item";

      //  Assert.assertEquals(driver.getCurrentUrl().contains(expectedProductUrl),"Product Url is correct\n");
        //Assert.assertEquals("Thank you for choosing item",ExpectedSucMsg);

    }
    @Test
    public void verifyUserAbleToAddProductInAddCartSuccessFylly(){
       product.productUser();
       Assert.assertEquals(By.className("content"), "The product has been added to your shopping cart");

    }
    @Test
    public void verifyUserShouldBeAbleToCompareTheProduct(){
        appleProduct.macPro();
    }


}




