package SeleniumPractise1;

import org.openqa.selenium.By;



public class BookPage extends Utils {

    public void orderBook (){
        selectByVisibleText(By.id("products-orderby"),"Name: A to Z");
        clickElement(By.xpath("//input[@value='Add to cart']"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(By.className("cart-label"));
        clickElement(By.id("termsofservice"));
        clickElement(By.id("checkout"));
        clickElement(By.xpath("//div[3]/input"));
        enterText(By.id("BillingNewAddress_FirstName"),"Royal");
        enterText(By.id("BillingNewAddress_LastName"),"Mail");
        enterText(By.id("BillingNewAddress_Email"),"royalmail@gmail.com");
        selectByVisibleText(By.id("BillingNewAddress_CountryId"),"United Kingdom");
        enterText(By.id("BillingNewAddress_City"),"London");
        enterText(By.id("BillingNewAddress_Address1"),"Harrow");
        enterText(By.id("BillingNewAddress_ZipPostalCode"),"HA2 6PY");
        enterText(By.id("BillingNewAddress_PhoneNumber"),"01234567891");
        clickElement(By.xpath("//input[@value='Continue']"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fill the Personal Details");
        clickElement(By.xpath("(//input[@value='Continue'])[3]"));
        clickElement(By.id("paymentmethod_1"));
        clickElement(By.xpath("(//input[@value='Continue'])[4]"));
        enterText(By.id("CardholderName"),"Royal");
        enterText(By.id("CardNumber"),"5385 6864 9327 3403");
        selectByVisibleText(By.id("ExpireYear"),"2019");
        enterText(By.id("CardCode"),"710");
        clickElement(By.xpath("(//input[@value='Continue'])[5]"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        clickElement(By.xpath("//input[@value='Confirm']"));
        System.out.println("Your order has been successfully");





    }
}
