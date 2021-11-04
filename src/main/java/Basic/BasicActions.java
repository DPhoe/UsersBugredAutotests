package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;

import java.time.Duration;

import static Basic.Config.platformBrowser;
import static Constants.Constant.TimeoutVariable.implicitlyWaitSec;

public  class BasicActions {
    public static WebDriver createDriver() {
        WebDriver driver = null;
        switch (platformBrowser) {
            case "winChrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "winFirefox":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "winOpera":
                System.setProperty("webdriver.opera.driver", "src/main/resources/operadriver.exe");
                driver = new OperaDriver();
                break;
            default:
                Assert.fail("Incorrect platform or browser name" + platformBrowser);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWaitSec));
        return driver;
    }
}
