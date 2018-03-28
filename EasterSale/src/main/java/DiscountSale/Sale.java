package DiscountSale;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Sale extends Utils {

    public void adminUser (){
        enterText(By.id("Email"),"admin@yourstore.com");
        enterText(By.id("Password"),"admin");
        clickElement(By.xpath("//input[@type='submit']"));
        clickElement(By.linkText("Promotions"));
        clickElement(By.linkText("Discounts"));
        clickElement(By.xpath("//a[@href='/Admin/Discount/Create']"));
        enterText(By.id("Name"),"Easter Sale");
        clickElement(By.id("UsePercentage"));
        enterText(By.id("DiscountPercentage"),"10.0000");
        clickElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[3]/div/div/div/div[1]/div/div/div/div[9]/div[2]/span[1]/span/span/span[1]"));
        enterText(By.id("StartDateUtc"),"3/25/2018 12:00 AM");
        clickElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[3]/div/div/div/div[1]/div/div/div/div[10]/div[2]/span[1]/span/span/span[1]"));
        enterText(By.id("EndDateUtc"),"3/30/2018 12:00 AM");
        clickElement(By.name("save"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }

}
