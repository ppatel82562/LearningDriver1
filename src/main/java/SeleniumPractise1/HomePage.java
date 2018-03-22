package SeleniumPractise1;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class HomePage extends Utils  {

    public void navigateToBookPage (){
        driver.get("http://demo.nopcommerce.com/books");
    }

    public void navigateToClothingPage (){
        driver.get("http://demo.nopcommerce.com/clothing");
    }

    public void navigateToRegisterPage () {

        clickElement (By.linkText("Register"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void navigateToSerchBox() {

        clickElement(By.className("Serch"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }


    public void navigateToHomePage() {
    }
}
