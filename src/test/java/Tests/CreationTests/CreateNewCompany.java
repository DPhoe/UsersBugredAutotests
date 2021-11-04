package Tests.CreationTests;

import Tests.BasicTest.BasicTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateNewCompany extends BasicTest {

    @BeforeTest
    public void beforeTest() {
        basicPage.open("http://users.bugred.ru/user/login/index.html");
        regLoginPage
                .existingUserLoginFields()
                .clickLoginButton();
    }

    @Test
    public void checkIsCreateNewCompanyWorking () {
        usersHomePage
                .clickCompanyButton();
        usersCompanyPage
                .clickCreateCompanyButton()
                .enterTextFields()
                .companyTypeSelection()
                .clickCreateNewCompanyButton()
                .checkIsCompanyCreateWorking();
    }

    @AfterTest
    public void after () {
        usersCompanyPage
                .clickDeleteCompanyButton();
    }

}