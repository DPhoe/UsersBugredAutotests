package Pages.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Constants.Constant.TimeoutVariable.explicitlyWaitSec;

public class BasicPage {
    protected WebDriver driver;
    public BasicPage (WebDriver driver) {
        this.driver = driver;
    }

    public void open(String url) {
        driver.get(url);
    }

    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, explicitlyWaitSec).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
