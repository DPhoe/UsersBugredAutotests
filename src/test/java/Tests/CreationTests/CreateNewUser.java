package Tests.CreationTests;

import Tests.BasicTest.BasicTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateNewUser extends BasicTest {

    @BeforeTest
    public void beforeTest () {
        basicPage.open("http://users.bugred.ru/user/login/index.html");
        regLoginPage
                .existingUserLoginFields()
                .clickLoginButton();
    }

    @Test
    public void checkIsCreateNewUserWorking () {
        usersHomePage
                .clickCreateUserButton();
        usersCreateNewUserPage
                .enterAllTextFields()
                .enterBirthDate()
                .genderSelection()
                .enterJobStartDate()
                .addNewUserButtonClick();
        usersHomePage
                .checkIsDeleteNewUserButtonExist();
    }

    @AfterTest
    public void checkIsDeleteNewUserWorking () {
        usersHomePage
                .deleteNewUserButtonClick();
        usersHomePage
                .checkIsDeleteNewUserButtonNotExist();
    }

}
