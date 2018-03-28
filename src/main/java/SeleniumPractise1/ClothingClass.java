package SeleniumPractise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SourceType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ClothingClass extends Utils {

    public void ClothingPage (){
        selectByVisibleText(By.id("products-orderby"),"Price: High to Low");
        selectByVisibleText(By.id("products-pagesize"),"3");
        System.out.println("Total Prdoucts :- ");
       // List<WebElement>elementList = driver.findElements(By.xpath("//div[@class='product-grid']/div/div/div[@class='product-item']"));
        List<WebElement>elementList = driver.findElements(By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div"));
        System.out.println(elementList.size()); // inbuilt method

        int size = elementList.size();
        WebElement abc = elementList.get(0);

        String firstRowPrice = elementList.get(0).getText();
        String secondRowPrice = elementList.get(size-1).getText();
        double firstPrice = Double.parseDouble(firstRowPrice.replaceAll("[^0-9.]", "")); //Remove string and keep int
        double secondPrice = Double.parseDouble(secondRowPrice.replaceAll("[^0-9.]","")); // (^) symbol for keep int
        Assert.assertTrue(firstPrice > secondPrice,"not sorted High to Low");

        System.out.println("First Price is High\n Last Price is Low");











//        String priceOfProductFirst = "";
//        String priceOfProductLast = "";
//        for (int i = 0; i < elementList.size(); i = i+1) {
//
//            priceOfProductFirst = elementList.get(0).getText().replaceAll("[^\\d.]"," ");
//            priceOfProductLast = elementList.get(3).getText().replaceAll("[^\\d.]"," ");
//        }
//
//        Double price0 = Double.parseDouble(priceOfProductFirst);
//        Double price3 = Double.parseDouble(priceOfProductLast);
//
//        Assert.assertTrue(price0 >= price3, "Products are not sorted High to Low Prices");



    }
}
