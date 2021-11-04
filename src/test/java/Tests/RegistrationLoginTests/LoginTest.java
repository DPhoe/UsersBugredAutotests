package Tests.RegistrationLoginTests;

import Tests.BasicTest.BasicTest;
import org.testng.annotations.Test;

public class LoginTest extends BasicTest {

    @Test
    public void checkIsLoginWorking () {
        basicPage.open("http://users.bugred.ru/user/login/index.html");
        regLoginPage
                .existingUserLoginFields()
                .clickLoginButton();

        usersHomePage
                .checkTaskButtonPresent();
    }
}
