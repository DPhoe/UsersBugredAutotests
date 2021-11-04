package Pages.UsersCompanysPage;

import Pages.Basic.BasicPage;
import Pages.UsersCreateNewUserPage.UsersCreateNewUserPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static Basic.Config.*;

//URL:http://users.bugred.ru/companys/index.html - for company basic page
//URL:http://users.bugred.ru/companys/add.html - for company creation page
public class UsersCompanyPage extends BasicPage {

    public UsersCompanyPage(WebDriver driver) {
        super(driver);
    }

    private final By createNewCompanyButton = By.xpath("//a[text()='Добавить компанию']");
    private final By companyNameField = By.xpath("//input[@name='name']");
    private final By companyTypeSelector = By.xpath("//select[@name='type']");
    private final By companyINNField = By.xpath("//input[@name='inn']");
    private final By companyOGRNField = By.xpath("//input[@name='ogrn']");
    private final By companyKPPField = By.xpath("//input[@name='kpp']");
    private final By companyPhoneField = By.xpath("//input[@name='phone']");
    private final By companyAddressField = By.xpath("//input[@name='adress']");
    private final By companyEmployeesField = By.xpath("//ul[@class='select2-selection__rendered']");
    private final By companySuggestedEmployeesEmailField = By.xpath("//ul[@class='select2-results__options']/li"); //only after click on companyEmployeesField
    private final By companyCreateButton = By.xpath("//input[@type='submit']");
    private final By companyDeleteButton = By.xpath("//a[text()='Удалить']");

    public UsersCompanyPage companyTypeSelection() {
        Select typeField = new Select(driver.findElement(companyTypeSelector));
        typeField.selectByIndex(companyTypeIndex);
        return this;
    }

    public UsersCompanyPage clickCreateNewCompanyButton() {
        WebElement companyNewCreateButton = driver.findElement(companyCreateButton);
        waitElementIsVisible(companyNewCreateButton).click();
        return this;
    }

    public UsersCompanyPage clickCreateCompanyButton() {
        WebElement companyCreateButton = driver.findElement(createNewCompanyButton);
        waitElementIsVisible(companyCreateButton).click();
        return this;
    }

    public UsersCompanyPage enterTextFields() {
        WebElement nameF = driver.findElement(companyNameField);
        waitElementIsVisible(nameF).sendKeys(companyName);
        driver.findElement(companyINNField).sendKeys(companyINN);
        driver.findElement(companyOGRNField).sendKeys(companyORGN);
        driver.findElement(companyKPPField).sendKeys(companyKPP);
        driver.findElement(companyPhoneField).sendKeys(companyPhone);
        driver.findElement(companyAddressField).sendKeys(companyAddress);
        return this;
    }

    public UsersCompanyPage companyEmployeesSelection() {
        Select empField = new Select(driver.findElement(companyEmployeesField));
        empField.selectByIndex(companyEmployeesIndex);
        return this;
    }

    public UsersCompanyPage checkIsCompanyCreateWorking() {
        WebElement delButton = driver.findElement(companyDeleteButton);
        Assert.assertNotNull(delButton, null);
        return this;
    }

    public UsersCompanyPage clickDeleteCompanyButton() {
        WebElement delButton = driver.findElement(companyDeleteButton);
        waitElementIsVisible(delButton).click();
        return this;
    }
}