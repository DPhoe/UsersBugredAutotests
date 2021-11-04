package Pages.UsersCreateNewUserPage;

import Pages.Basic.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Basic.Config.*;

//URL: http://users.bugred.ru/user/admin/index/create.html
public class UsersCreateNewUserPage extends BasicPage {

    public UsersCreateNewUserPage(WebDriver driver) {
        super(driver);
    }

    private final By nameField = By.xpath("//input[@name='noibiz_name']");
    private final By emailField = By.xpath("//input[@name='noibiz_email']");
    private final By passwordField = By.xpath("//input[@name='noibiz_password']");
    private final By birthdayField = By.xpath("//input[@name='noibiz_birthday']");
    private final By genderField = By.xpath("//select[@name='noibiz_gender']");
    private final By jobStartDateField = By.xpath("//input[@name='noibiz_date_start']");
    private final By name1Field = By.xpath("//input[@name='noibiz_name1']");
    private final By hobbyField = By.xpath("//textarea");
    private final By surname1Field = By.xpath("//input[@name='noibiz_surname1']");
    private final By fatherName1Field = By.xpath("//input[@data-myname='noibiz_fathername1']");
    private final By catField = By.xpath("//input[@name='noibiz_cat']");
    private final By dogField = By.xpath("//input[@name='noibiz_dog']");
    private final By parrotField = By.xpath("//input[@name='noibiz_parrot']");
    private final By cavyField = By.xpath("//input[@name='noibiz_cavy']");
    private final By hamsterField = By.xpath("//input[@name='noibiz_hamster']");
    private final By squirrelField = By.xpath("//input[@name='noibiz_squirrel']");
    private final By phoneField = By.xpath("//input[@name='noibiz_phone']");
    private final By addressField = By.xpath("//input[@name='noibiz_adres']");
    private final By innField = By.xpath("//input[@name='noibiz_inn']");
    private final By addUserButton = By.xpath("//input[@type='submit']");



    public UsersCreateNewUserPage enterBirthDate() {
        WebElement birthField = driver.findElement(birthdayField);
        waitElementIsVisible(birthField).sendKeys(registrationBirthDate);
        return this;
    }

    public UsersCreateNewUserPage genderSelection() {
        Select genField = new Select(driver.findElement(genderField));
        genField.selectByIndex(genderSelect);
        return this;
    }

    public UsersCreateNewUserPage enterJobStartDate() {
        WebElement JobSField = driver.findElement(jobStartDateField);
        waitElementIsVisible(JobSField).sendKeys(JobStartDate);
        return this;
    }

    public UsersCreateNewUserPage enterAllTextFields() {
        WebElement name = driver.findElement(nameField);
        waitElementIsVisible(name).sendKeys(newUserName);
        driver.findElement(emailField).sendKeys(newUserEmail);
        driver.findElement(passwordField).sendKeys(newUserPass);
        driver.findElement(hobbyField).sendKeys(hobby);
        driver.findElement(name1Field).sendKeys(actualName);
        driver.findElement(surname1Field).sendKeys(surname);
        WebElement fatherNameF = driver.findElement(fatherName1Field);
        waitElementIsVisible(fatherNameF).sendKeys(fatherName);
        driver.findElement(catField).sendKeys(cat);
        driver.findElement(dogField).sendKeys(dog);
        driver.findElement(parrotField).sendKeys(parrot);
        driver.findElement(cavyField).sendKeys(cavy);
        driver.findElement(hamsterField).sendKeys(hamster);
        driver.findElement(squirrelField).sendKeys(squirrel);
        driver.findElement(phoneField).sendKeys(phoneNumber);
        driver.findElement(addressField).sendKeys(address);
        driver.findElement(innField).sendKeys(INN);
        return this;
    }

    public UsersCreateNewUserPage addNewUserButtonClick () {
        WebElement newUserButton = driver.findElement(addUserButton);
        waitElementIsVisible(newUserButton).click();
        return this;
    }
}
