package SeleniumPractise1;

import org.openqa.selenium.By;

import static SeleniumPractise1.Utils.clickElement;
import static SeleniumPractise1.Utils.enterText;

public class Review {

    public void successfully() {

        enterText(By.id("FirstName"), "Rajesh");
        enterText(By.id("LastName") , "Patel");
        enterText(By.id("Email"), "patel@email.com");
        //String email = "Rajesh"+randomDate()+"patel@email.com";
        enterText(By.id("Password"), "Patel1234");
        enterText(By.id("ConfirmPassword"), "Patel1234");
        clickElement(By.id("register-button"));
        clickElement(By.linkText("Desktops"));
        clickElement(By.linkText("Build your own computer"));
        clickElement(By.xpath("//a[contains(@href, '/productreviews/1')]"));
        enterText(By.id("AddProductReview_Title"), "Computer");
        enterText(By.id("AddProductReview_ReviewText"), "Good Computer");
        clickElement(By.id("addproductrating_5"));
        clickElement(By.xpath("//input[@name='add-review']"));





    }


}
