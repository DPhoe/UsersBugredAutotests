package Pages.UsersRegestrationLoginPage;

import Pages.Basic.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Basic.Config.*;
//URL:http://users.bugred.ru/user/login/index.html
public class UsersRegLoginPage extends BasicPage {

    public UsersRegLoginPage(WebDriver driver) {
        super(driver);
    }

    private final By RegName = new By.ByXPath("//h2[text()='Регистрация']/parent::div//input[@name='name']");
    private final By RegEmail = new By.ByXPath("//h2[text()='Регистрация']/parent::div//input[@name='email']");
    private final By RegPass = new By.ByXPath("//h2[text()='Регистрация']/parent::div//input[@name='password']");
    private final By RegButton = new By.ByXPath("//input[@value='Зарегистрироваться']");
    private final By LoginEmail = new By.ByXPath("//input[@name='login']");
    private final By LoginPass = new By.ByXPath("//form[@action='/user/login/index.html']//input[@name='password']");
    private final By LoginButton = new By.ByXPath("//input[@value='Авторизоваться']");

    public UsersRegLoginPage newUserRegistrationFields() {
        driver.findElement(RegName).sendKeys(registrationName);
        driver.findElement(RegEmail).sendKeys(registrationEmail);
        driver.findElement(RegPass).sendKeys(registrationPass);
        return this;
    }

    public UsersRegLoginPage clickRegButton() {
        WebElement ButtonReg = driver.findElement(RegButton);
        waitElementIsVisible(ButtonReg).click();
        return this;
    }

    public UsersRegLoginPage existingUserLoginFields() {
        driver.findElement(LoginEmail).sendKeys(registrationEmail);
        driver.findElement(LoginPass).sendKeys(registrationPass);
        return this;
    }

    public UsersRegLoginPage clickLoginButton() {
        WebElement ButtonReg = driver.findElement(LoginButton);
        waitElementIsVisible(ButtonReg).click();
        return this;
    }
}
