package SeleniumPractise1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class BaseTest extends BasePage {


    @BeforeMethod

    public void openBrowser(){
       System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
       driver = new FirefoxDriver();

//       System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
//        driver = new ChromeDriver();

//        System.setProperty("webdriver.ie.driver","src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
//        driver = new InternetExplorerDriver();

        driver.get("http://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void closeBrowser(){

        driver.close();
    }


   // @Parameters("browser")
//    @BeforeMethod

    //String browser = "chrome";

//    public void openBrowser(String browserName){
//
//        if(browserName.equalsIgnoreCase("firefox"))
//        {
//           // System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
//            driver = new FirefoxDriver();
//        }
//          else if (browserName.equalsIgnoreCase("chrome")) {
//            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
//            driver = new ChromeDriver();
//        }
//        else if (browserName.equalsIgnoreCase("IE")) {
//            System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
//            driver = new InternetExplorerDriver();
//        }
//        else {
//            System.out.println("invlid browswe");
//        }

//        driver.get("http://demo.nopcommerce.com/");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();

//        driver.manage().window().maximize();
//        driver.get("http://demo.nopcommerce.com/");
//        System.out.println(driver.getTitle());
//        driver.quit();

  //  }
}


