package Tests.OtherTests;

import Tests.BasicTest.BasicTest;
import org.testng.annotations.Test;

public class InspectUserTest extends BasicTest {

    @Test
    public void checkIsInspectUserButtonWorking () {
        basicPage.open("http://users.bugred.ru/");
        usersHomePage
                .clickInspectUserButton()
                .checkInspectUserButtonWorking();
    }
}
