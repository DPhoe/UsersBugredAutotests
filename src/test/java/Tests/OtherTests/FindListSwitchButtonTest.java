package Tests.OtherTests;

import Tests.BasicTest.BasicTest;
import org.testng.annotations.Test;

public class FindListSwitchButtonTest extends BasicTest {

    @Test
    public void checkIsFindListSwitchWorking () {
        basicPage.open("http://users.bugred.ru/");
        usersHomePage
                .clickListSwitchButton()
                .checkIsClickedFindListButtonActive();
    }
}
