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

        Utils utils = new Utils();
        utils.assertEquals(By.xpath("//span[2]/span"), "First name is required");
        utils.assertEquals(By.xpath("//div[3]/span[2]/span"), "Last name is required");
        utils.assertEquals(By.xpath("//div[5]/span[2]/span"), "Email is required");
        utils.assertEquals(By.xpath("//div[4]/div[2]/div/span[2]/span"), "Password is required");
        utils.assertEquals(By.xpath("//div[4]/div[2]/span[2]/span[2]/span"), "Password is Required");


    }
    }

