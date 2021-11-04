package Pages.UsersEditNewUserPage;

import Pages.UsersCreateNewUserPage.UsersCreateNewUserPage;
import Pages.UsersHomePage.UsersHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UsersEditNewUserPage extends UsersCreateNewUserPage {

    public UsersEditNewUserPage(WebDriver driver) {
        super(driver);
    }

    private final By saveChangesButton = By.xpath("//input[@value='Сохранить']");

    public UsersEditNewUserPage clickSaveChangesButton () {
        WebElement saveButton = driver.findElement(saveChangesButton);
        waitElementIsVisible(saveButton).click();
        return this;
    }
}
