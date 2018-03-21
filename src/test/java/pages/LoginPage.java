package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by kendsilva on 2/26/18.
 */
public class LoginPage extends BasePage {

    @FindBy(id = "login_username")
    private WebElement userName;

    @FindBy(id = "login_password")
    private WebElement password;

    @FindBy(id = "loginForm")
    private WebElement signInButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage enterUsername(String name){
        waitForElementToBeDisplayed(userName);
        userName.sendKeys(name);
        return this;
    }

    public LoginPage enterPassword(String password){
        waitForElementToBeDisplayed(this.password);
        this.password.sendKeys(password);
        return this;
    }

    public void clickSignInButton() {
        signInButton.click();
    }
}
