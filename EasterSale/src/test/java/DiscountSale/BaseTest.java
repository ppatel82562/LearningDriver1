package DiscountSale;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends BasePage {


    @BeforeMethod

    public void openBrowser() {
        System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\Browser\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeBrowser() {

        driver.close();
    }
}

