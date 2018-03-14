package SeleniumPractise1;

import org.openqa.selenium.By;

import static SeleniumPractise1.Utils.clickElement;
import static SeleniumPractise1.Utils.enterText;

public class EmailFriend {


    public void massage() {

            clickElement(By.linkText("Build your own computer"));
            clickElement(By.xpath("//input[@value='Email a friend']"));
            enterText(By.id("FriendEmail"), "xyz123@gmail.com");
            enterText(By.id("YourEmailAddress"),"wxyz@gmail.com");
            enterText(By.id("PersonalMessage"),"This gift for u to buy");
            clickElement(By.xpath("//input[@name='send-email']"));

        }
    }
