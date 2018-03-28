package SeleniumPractise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static SeleniumPractise1.Utils.clickElement;
import static SeleniumPractise1.Utils.enterText;

public class ElectronicHomePage extends Utils {

    public void productUser (){

        clickElement(By.linkText("Electronics"));
        clickElement(By.cssSelector("a[title=\"Show products in category Camera & photo\"]"));
        clickElement(By.xpath("(//input[@value='Add to cart'])[2]"));
        try {
            Thread.sleep(5000);                 //try & catch put because have to wait for notification disappear
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        clickElement(By.id("topcartlink"));
        }

    public void serchBoxUser (){

        enterText(By.xpath("//input[@type='text']"),"computer");
        clickElement(By.xpath("//input[@value='Search']"));
    }
}
