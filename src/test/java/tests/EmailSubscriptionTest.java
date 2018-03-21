package tests;

import base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

/**
 * Created by kendsilva on 3/20/18.
 */
public class EmailSubscriptionTest extends BaseTest {
    //testing invite user case/subscription case
    @Test
    public void emailSubscriptionTest(){
        driver.get(data.getSnaptrudeUrl());

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.enterEmail(data.getEmailId())
                .clickInviteButton();

        //asserting for sucessful completion of invite flow
        Assert.assertEquals(data.getSubscriptionMessage(),homePage.getSubscriptionMessage());

    }
}
