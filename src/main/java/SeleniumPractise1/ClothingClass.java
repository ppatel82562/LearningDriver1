package SeleniumPractise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ClothingClass extends Utils {

    public void ClothingPage (){
        selectByVisibleText(By.id("products-orderby"),"Price: High to Low");
        selectByVisibleText(By.id("products-pagesize"),"3");
        System.out.println("Total Prdoucts :- ");
        List<WebElement>_countProducts = driver.findElements(By.xpath("//div[@class='product-grid']/div/div/div[@class='product-item']"));
        System.out.println(_countProducts.size());

    }
}
