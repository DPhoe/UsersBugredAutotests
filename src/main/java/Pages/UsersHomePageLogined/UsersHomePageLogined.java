package Pages.UsersHomePageLogined;

import Pages.Basic.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static Basic.Config.registrationName;

public class UsersHomePageLogined extends BasicPage {

    public UsersHomePageLogined(WebDriver driver) {
        super(driver);
    }

    private final By registeredName = By.xpath("//li[@id='fat-menu']/a[@href='#']");

    public UsersHomePageLogined checkNameIdentical () {
        WebElement regName = driver.findElement(registeredName);
        String regNameText = regName.getText();
        Assert.assertEquals(regNameText ,registrationName);
        return this;
    }

}
