package Tests.OtherTests;

import Tests.BasicTest.BasicTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ViewTaskHistoryTest extends BasicTest {
    @BeforeTest
    public void beforeTest() {
        basicPage.open("http://users.bugred.ru/user/login/index.html");
        regLoginPage
                .existingUserLoginFields()
                .clickLoginButton();
    }

    @Test
    public void checkIsTaskHistoryTabWorking () {
        usersTaskPage
                .clickTaskHistoryButton()
                .checkIsNotificationFieldPresent();
    }
}
