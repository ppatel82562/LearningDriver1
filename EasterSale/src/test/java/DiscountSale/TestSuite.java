package DiscountSale;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {

    HomePage homePage = new HomePage();
    Sale sale = new Sale();

    @Test
    private void adminAbleToAddDiscount(){
        homePage.navigateToHomePage();
        sale.adminUser();
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div[2]/div/div/div[2]/div/div/table/tbody/tr[2]/td[1]")).getText(),"Easter Sale");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div[2]/div/div/div[2]/div/div/table/tbody/tr[2]/td[2]")).getText(),"Assigned to order total");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Admin able to add the Discount.");
    }
}
