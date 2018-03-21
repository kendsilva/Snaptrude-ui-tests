package base;

import models.Config;
import models.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import util.YamlReader;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by kendsilva on 2/26/18.
 */
public class BaseTest {

    public static WebDriver driver;
    protected static Data data;
    protected static Config config;

    static  {
        data = new YamlReader("data.yaml").readData();
        config = new YamlReader("config.yaml").readConfig();
    }

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        driver = new RemoteWebDriver(new URL(config.getNodeUrl()),capabilities);
        System.setProperty(config.getDriver(), config.getPath());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

}
