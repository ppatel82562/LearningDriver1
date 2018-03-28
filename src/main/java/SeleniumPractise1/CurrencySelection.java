package SeleniumPractise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import javax.xml.bind.SchemaOutputResolver;
import java.util.List;

public class CurrencySelection extends Utils {
    SoftAssert softAssert = new SoftAssert();

    public void SelectEuroCurrency(){
        String currencySelected = "Euro";
        String currencySymbol = " ";

        selectbyValue(By.id("customerCurrency"),"/changecurrency/6?returnurl=%2F");
        System.out.println("Changed Currency");


        if ( currencySelected.equalsIgnoreCase("US Dollar")) {
            currencySymbol = "$";
        } else {
            currencySelected = "€";
        }

        List<WebElement> itemProduct = driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div"));

        System.out.println(itemProduct.size()); //inbuilt method
        for (WebElement currency : itemProduct) {
            String price = currency.findElement(By.xpath("div/div[2]/div[3]/div[1]/span")).getText();
            System.out.println(price);
            String symbolOfPrice = price.substring(0, 1);
        }

        String symbolOfPrice = new String();
        softAssert.assertEquals(symbolOfPrice,currencySymbol);
        }

//        softAssert.assertAll();



}
