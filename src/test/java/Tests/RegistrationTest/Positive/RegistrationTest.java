package Tests.RegistrationTest.Positive;

import Tests.BasicTest.BasicTest;
import org.testng.annotations.Test;

public class RegistrationTest extends BasicTest {
    @Test
    public void checkIsRegistrationValid () {
        basicPage.open("http://users.bugred.ru/user/login/index.html");
        regLoginPage
                .newUserRegistrationFields()
                .clickRegButton();

        usersHomePageLogined.checkNameIdentical();
    }
}
