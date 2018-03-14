package SeleniumPractise1;

import org.openqa.selenium.By;

public class WishList extends Utils{


    public void addwishlist() {


        driver.getCurrentUrl().contains("http://demo.nopcommerce.com/");
        clickElement(By.xpath("(//input[@value='Add to wishlist'])[3]"));
        System.out.println("Hello");
        waitForElementVisible(By.cssSelector("p.content"), 10);
        System.out.println("The product has been added to your wishlist");
//        clickElement(By.cssSelector("span.wishlist-lable"));
//        enterText(By.className("search-box-text ui-autocomplete-input"),"HTC One M8 Android L 5.0 Lollipop ");
//        clickElement(By.cssSelector("input.button-1.search-box-button"));
//        clickElement(By.id("add-to-wishlist-button-18"));
  //      clickElement(By.cssSelector("input.button-2.add-to-wishlist-button"));

//        clickElement(By.className("ico-login"));
//        enterText(By.id("Email"),"xyz334@gmail.com");
//        enterText(By.id("Password"),"Patel1234");
//        clickElement(By.className("button-1 login-button"));




    }

}

