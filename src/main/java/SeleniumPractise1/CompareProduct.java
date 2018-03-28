package SeleniumPractise1;

import org.openqa.selenium.By;

import static SeleniumPractise1.Utils.clickElement;

public class CompareProduct extends Utils {


    public void macPro() {
        clickElement(By.xpath("//input[@value='Add to compare list']"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(By.xpath("(//input[@value='Add to compare list'])[2]"));

        clickElement(By.linkText("product comparison"));



    }

    public void clearList (){

        clickElement(By.className("clear-list"));
        System.out.println("Clear List");
    }

    public void addWishList() {
        driver.getCurrentUrl().contains("http://demo.nopcommerce.com/");
        clickElement(By.xpath("(//input[@value='Add to wishlist'])[3]"));
        System.out.println("Hello");
        waitForElementVisible(By.cssSelector("p.content"), 10);
        System.out.println("The product has been added to your wishlist");


    }
}
