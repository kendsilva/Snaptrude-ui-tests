package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by kendsilva on 3/20/18.
 */
public class LandingPage extends BasePage {

    @FindBy(xpath = "//a[@href='/login/']")
    private WebElement projectIcon;

    @FindBy(xpath = "//a[contains(text(),'Sign out')]")
    private WebElement signoutLink;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProjectIconVisible(){
        if(projectIcon.isDisplayed()){
            return true;
        }
        return false;
    }

    public void clickSignout(){
        signoutLink.click();
    }
}
