package Tests.CreationTests;

import Tests.BasicTest.BasicTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddTaskTest extends BasicTest {

    @BeforeTest
    public void checkIsLoginWorking () {
        basicPage.open("http://users.bugred.ru/user/login/index.html");
        regLoginPage
                .existingUserLoginFields()
                .clickLoginButton();
    }

    @Test
    public void checkIsAddTaskFunctionWorking () {
        usersHomePage
                .clickCreateTaskButton();
        usersTaskPage
                .clickAddTaskButton()
                .enterTaskNameDescription()
                .clickCreateNewTuskButton()
                .checkIsAddScheduleButtonExist();
    }
}
