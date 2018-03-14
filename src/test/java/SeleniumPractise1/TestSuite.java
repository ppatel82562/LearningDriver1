package SeleniumPractise1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPageNLogOut registerPage = new RegisterPageNLogOut();
    WishList wishList = new WishList();
    SerchBox serchBox = new SerchBox();
    ElectronicHomePage product = new ElectronicHomePage ();
    CompareProduct appleProduct = new CompareProduct();
    Utils utils = new Utils();
    EmailFriend emailFriend = new EmailFriend();


    String expectedRegisterUrl = "http://demo.nopcommerce.com/register1";
    // String ExpextedSucMsg ="Thank you for registration";

    @Test
    public void userShouldBeAbleToSendEmailToFriend (){


        //registerPage.massage();
        emailFriend.massage();

    }
    @Test
    public void userShouldBeAbleToClearProductFromComparisonList (){

        appleProduct.macPro();
        appleProduct.clearList();
        utils.assertEquals(By.className("clear-list"),"CLEAR LIST");

    }

    @Test

    public void verifyUserShouldBeAbleToNavigateToRegisterPage() {

        homePage.navigateToRegisterPage();
        registerPage.registerUser();
        utils.assertEquals(By.className("result"), "Your registration completed");



    }

    @Test
    public void verifyUserShouldBeAbleToProductInWishList() {
        wishList.addwishlist();
        utils.assertEquals(By.className("content"),"The product has been added to your wishlist");
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
       utils.assertEquals(By.className("content"), "The product has been added to your shopping cart");

    }
    @Test
    public void verifyUserShouldBeAbleToCompareTheProduct(){
        appleProduct.macPro();
    }
}




