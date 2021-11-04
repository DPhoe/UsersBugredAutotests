package Tests.OtherTests;

import Pages.Basic.BasicPage;
import Tests.BasicTest.BasicTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SearchFilteredTest extends BasicTest {

    @Test
    public void checkIsFilteredFindWork () {
        basicPage.open("http://users.bugred.ru/");
        usersHomePage
                .enterAllFindFields()
                .clickFindButton()
                .checkIsFindResultEqualExpected();
    }

    @AfterTest
    public void after () {
        usersHomePage
                .clickResetFilters();
    }
}
