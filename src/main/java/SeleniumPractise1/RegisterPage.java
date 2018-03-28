package SeleniumPractise1;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends Utils {

    public void registerUser (){

        String email = "Rajesh"+randomDate()+"patel@gmail.com";

        email = "Rajesh"+randomDate()+"patel@email.com";

        enterText(By.id("FirstName"), "Rajesh");
        enterText(By.id("LastName") , "Patel");
        enterText(By.id("Email"), email);
        enterText(By.id("Password"), "Patel1234");
        enterText(By.id("ConfirmPassword"), "Patel1234");
        clickElement(By.id("register-button"));
        System.out.println(email);


    }

    public void logOut (){

        clickElement(By.className("ico-logout"));

    }


    public void registerWithOutEnterData() {

        clickElement(By.xpath("//input[@id='register-button']"));

    }

    public void emailFriend() {

        clickElement(By.linkText("Computers"));
        clickElement(By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/div/a"));
        clickElement(By.linkText("Build your own computer"));
        clickElement(By.xpath("//input[@value='Email a friend']"));
        enterText(By.id("FriendEmail"), "xyz123@gmail.com");
        enterText(By.id("YourEmailAddress"),"wxyz@gmail.com");
        enterText(By.id("PersonalMessage"),"This gift for u to buy");
        clickElement(By.xpath("//input[@name='send-email']"));

    }

    public void review() {
        clickElement(By.linkText("Computers"));
        clickElement(By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/div/a"));
        clickElement(By.linkText("Build your own computer"));
        clickElement(By.xpath("//a[contains(@href, '/productreviews/1')]"));
        enterText(By.id("AddProductReview_Title"), "Computer");
        enterText(By.id("AddProductReview_ReviewText"), "Good Computer");
        clickElement(By.id("addproductrating_5"));
        clickElement(By.xpath("//input[@name='add-review']"));
    }
}


