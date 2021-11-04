package Pages.UsersHomePage;

import Pages.Basic.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static Basic.Config.*;

//URL:http://users.bugred.ru/
public class UsersHomePage extends BasicPage {

    public UsersHomePage(WebDriver driver) {
        super(driver);
    }

    private final By registeredName = By.xpath("//li[@id='fat-menu']/a[@href='#']");
    private final By taskButton = By.xpath("//a[@href='/tasks/index.html']");
    private final By createUserButton = By.xpath("//a[text()='Добавить пользователя']");
    private final By deleteNewUserButton = By.xpath("//a[text()='Удалить']");
    private final By editNewUserButton = By.xpath("//a[text()='Изменить']");
    private final By findFieldFromDate = By.xpath("//input[@name='date_start']");
    private final By findFieldToDate = By.xpath("//input[@name='date_end']");
    private final By findEmailOrNameField = By.xpath("//input[@placeholder='Введите email или имя']");
    private final By findButton = By.xpath("//button[@class='btn btn-submit']");
    private final By resetFiltersLink = By.xpath("//a[text()='Сбросить фильтры']");
    private final By searchResults = By.xpath("//tbody[@class='ajax_load_row']/tr");
    private final By companyButton = By.xpath("//a[@href='/companys/index.html']");
    private final By findListSwitchButton = By.xpath("//a[@href='/?page_mg=4']");
    private final By liTagForAssert = By.xpath("//a[@href='/?page_mg=4']/..");
    private final By inspectUserButton = By.xpath("//a[text()='Посмотреть']");
    private final By emailForAssert = By.xpath("//td[text()='Email']");


    public UsersHomePage checkNameIdentical () {
        WebElement regName = driver.findElement(registeredName);
        String regNameText = regName.getText();
        Assert.assertEquals(regNameText ,registrationName);
        return this;
    }

    public UsersHomePage checkTaskButtonPresent () {
        WebElement taskBut = driver.findElement(taskButton);
        Assert.assertNotEquals(taskBut, null);
        return this;
    }

    public UsersHomePage clickCreateUserButton () {
        WebElement createUserBut = driver.findElement(createUserButton);
        waitElementIsVisible(createUserBut).click();
        return this;
    }

    public UsersHomePage deleteNewUserButtonClick () {
        WebElement deleteButton = driver.findElement(deleteNewUserButton);
        waitElementIsVisible(deleteButton).click();
        return this;
    }

    public UsersHomePage editNewUserButtonClick () {
        WebElement editButton = driver.findElement(editNewUserButton);
        waitElementIsVisible(editButton).click();
        return this;
    }

    public UsersHomePage checkIsDeleteNewUserButtonExist () {
        WebElement delButt = driver.findElement(deleteNewUserButton);
        Assert.assertNotNull(delButt, null);
        return this;
    }

    public UsersHomePage checkIsDeleteNewUserButtonNotExist() {
        List dButt = driver.findElements(deleteNewUserButton);
        int s = dButt.size();
        Assert.assertEquals(s, 0);
        return this;
    }

    public UsersHomePage enterAllFindFields () {
        WebElement dateFrom = driver.findElement(findFieldFromDate);
        waitElementIsVisible(dateFrom).sendKeys(dateF);
        driver.findElement(findFieldToDate).sendKeys(dateT);
        driver.findElement(findEmailOrNameField).sendKeys(nameEmailSearch);
        return this;
    }

    public UsersHomePage clickFindButton () {
        WebElement editButton = driver.findElement(findButton);
        waitElementIsVisible(editButton).click();
        return this;
    }

    public UsersHomePage clickResetFilters () {
        WebElement editButton = driver.findElement(resetFiltersLink);
        waitElementIsVisible(editButton).click();
        return this;
    }

    public UsersHomePage checkIsFindResultEqualExpected() {
        List searchElements = driver.findElements(searchResults);
        int s = searchElements.size();
        Assert.assertEquals(s, 10);
        return this;
    }

    public UsersHomePage clickCompanyButton () {
        WebElement companyButt = driver.findElement(companyButton);
        waitElementIsVisible(companyButt).click();
        return this;
    }

    public UsersHomePage clickListSwitchButton () {
        WebElement listSwitch = driver.findElement(findListSwitchButton);
        waitElementIsVisible(listSwitch).click();
        return this;
    }

    public UsersHomePage checkIsClickedFindListButtonActive () {
        WebElement listSwitchB = driver.findElement(liTagForAssert);
        Assert.assertEquals(waitElementIsVisible(listSwitchB).getAttribute("class"), "active");
        return this;
    }

    public UsersHomePage clickInspectUserButton () {
        WebElement inspectUserB = driver.findElement(inspectUserButton);
        waitElementIsVisible(inspectUserB).click();
        return this;
    }

    public UsersHomePage checkInspectUserButtonWorking () {
        List elems = driver.findElements(emailForAssert);
        int s = elems.size();
        Assert.assertEquals(s, 1);
        return this;
    }

    public UsersHomePage clickCreateTaskButton () {
        WebElement taskBut = driver.findElement(taskButton);
        waitElementIsVisible(taskBut).click();
        return this;
    }
}
