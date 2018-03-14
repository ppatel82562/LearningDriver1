package SeleniumPractise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static SeleniumPractise1.Utils.clickElement;
import static SeleniumPractise1.Utils.enterText;

public class ElectronicHomePage {

    public void productUser (){

        clickElement(By.linkText("Electronics"));
        clickElement(By.cssSelector("a[title=\"Show products in category Camera & photo\"]"));
        clickElement(By.xpath("(//input[@value='Add to cart'])[2]"));
        clickElement(By.id("topcartlink"));

        System.out.println("The product has been added to your shopping cart");


    }
}
