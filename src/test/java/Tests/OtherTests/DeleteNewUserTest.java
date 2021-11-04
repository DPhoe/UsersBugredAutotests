package Tests.OtherTests;

import Tests.BasicTest.BasicTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteNewUserTest extends BasicTest {

    @BeforeTest
    public void beforeTest () {
        basicPage.open("http://users.bugred.ru/user/login/index.html");
        regLoginPage
                .existingUserLoginFields()
                .clickLoginButton();
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

    @Test
    public void checkIsDeleteNewUserWorking () {
        usersHomePage
                .deleteNewUserButtonClick();
        usersHomePage
                .checkIsDeleteNewUserButtonNotExist();
    }

}
