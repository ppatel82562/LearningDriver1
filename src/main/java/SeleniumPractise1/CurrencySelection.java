package SeleniumPractise1;

import org.openqa.selenium.By;

public class CurrencySelection extends Utils {

    public void SelectTextFromDropDown(){
        selectbyValue(By.id("customerCurrency"),"/changecurrency/6?returnurl=%2F");
        System.out.println("Changed Currency");

    }
}
