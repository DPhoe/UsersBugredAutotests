package Tests.CreationTests;

import Tests.BasicTest.BasicTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddScheduleToTaskTest extends BasicTest {

    @BeforeTest
    public void before () {
        basicPage.open("http://users.bugred.ru/user/login/index.html");
        regLoginPage
                .existingUserLoginFields()
                .clickLoginButton();
        usersHomePage
                .clickCreateTaskButton();
        usersTaskPage
                .clickAddTaskButton()
                .enterTaskNameDescription()
                .clickCreateNewTuskButton();
    }

    @Test
    public void checkIsAddScheduleWorking () {
        usersTaskPage
                .clickScheduleTaskButton()
                .fillHoursMinutesField()
                .selectMonthDayWeekFields()
                .clickAddScheduleToTaskButton()
                .checkIsDeleteScheduleButtonPresent();
    }

    @AfterTest
    public void after () {
        usersTaskPage
                .clickDeleteScheduleButton();
    }
}
