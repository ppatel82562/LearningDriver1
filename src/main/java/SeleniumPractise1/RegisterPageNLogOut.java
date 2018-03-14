package SeleniumPractise1;

import org.openqa.selenium.By;

public class RegisterPageNLogOut extends Utils {

    public void registerUser (){

        String email = "Rajesh"+randomDate()+"patel@email.com";
        System.out.println(email);

        enterText(By.id("FirstName"), "Rajesh");
        enterText(By.id("LastName") , "Patel");
        enterText(By.id("Email"), "xyz635@yahoo.com");
        enterText(By.id("Password"), "Patel1234");
        enterText(By.id("ConfirmPassword"), "Patel1234");
        clickElement(By.id("register-button"));
        clickElement(By.className("ico-logout"));

    }


}
