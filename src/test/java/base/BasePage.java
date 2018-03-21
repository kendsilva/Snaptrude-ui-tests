package base;

import models.Config;
import models.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.YamlReader;

/**
 * Created by kendsilva on 2/26/18.
 */
public class BasePage {

    public WebDriver driver;
    protected static Data data;
    protected static Config config;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        data = new YamlReader("data.yaml").readData();
        config = new YamlReader("config.yaml").readConfig();
    }

    public void waitForElementToBeClickable(WebElement element){
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementToBeDisplayed(WebElement element){
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }
}
