package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by kendsilva on 2/26/18.
 */
public class HomePage extends BasePage {

    @FindBy(id = "email")
    private WebElement emailTextBox;

    @FindBy(id = "login")
    private WebElement inviteButton;

    @FindBy(xpath = "//b[contains(text(),'Subscribing')]")
    private WebElement subscriptionMessage;

    @FindBy(xpath = "//strong[contains(text(),'Login')]")
    private WebElement loginLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage enterEmail(String name){
        waitForElementToBeClickable(emailTextBox);
        emailTextBox.sendKeys(name);
        return this;
    }

    public HomePage clickInviteButton(){
        inviteButton.click();
        return this;
    }

    public String getSubscriptionMessage() {
        waitForElementToBeDisplayed(subscriptionMessage);
        return subscriptionMessage.getText();
    }

    public void clickLoginlink(){
        waitForElementToBeClickable(loginLink);
        loginLink.click();
    }
}
