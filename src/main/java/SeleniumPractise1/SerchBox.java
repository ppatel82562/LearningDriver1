package SeleniumPractise1;

import org.openqa.selenium.By;

public class SerchBox extends Utils {

    public void serchBoxUser (){
        driver.getCurrentUrl().contains("http://demo.nopcommerce.com/");

        enterText(By.xpath("//input[@type='text']"),"computer");
        clickElement(By.xpath("//input[@value='Search']"));
    }

}
