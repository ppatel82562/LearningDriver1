package SeleniumPractise1;

import org.openqa.selenium.By;

import static SeleniumPractise1.Utils.clickElement;

public class CompareProduct extends Utils {


    public void macPro() {
        clickElement(By.xpath("(//input[@value='Add to compare list'])[2]"));
        clickElement(By.xpath("//input[@value='Add to compare list']"));
        clickElement(By.linkText("product comparison"));

    }

    public void clearList (){

        clickElement(By.className("clear-list"));
        System.out.println("Clear List");
    }
}
