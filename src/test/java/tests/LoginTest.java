package tests;

import base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;

/**
 * Created by kendsilva on 2/26/18.
 */
public class LoginTest extends BaseTest {
    //testing login case
    @Test
    public void loginTest() {
        driver.get(data.getSnaptrudeUrl());

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickLoginlink();

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.enterUsername(data.getEmailId())
                .enterPassword(data.getMyPassword())
                .clickSignInButton();

        LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);

        //asserting for successful completion of login flow
        Assert.assertTrue(landingPage.isProjectIconVisible());

        landingPage.clickSignout();
    }
}
