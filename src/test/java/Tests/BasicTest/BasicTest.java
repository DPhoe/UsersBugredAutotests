package Tests.BasicTest;

import Basic.BasicActions;
import Pages.Basic.BasicPage;
import Pages.UsersCompanysPage.UsersCompanyPage;
import Pages.UsersCreateNewUserPage.UsersCreateNewUserPage;
import Pages.UsersEditNewUserPage.UsersEditNewUserPage;
import Pages.UsersHomePage.UsersHomePage;
import Pages.UsersRegestrationLoginPage.UsersRegLoginPage;
import Pages.UsersTaskPage.UsersTaskPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import static Basic.Config.*;

public class BasicTest {
    protected WebDriver driver = BasicActions.createDriver();
    protected BasicPage basicPage = new BasicPage(driver);
    protected UsersRegLoginPage regLoginPage = new UsersRegLoginPage(driver);
    protected UsersHomePage usersHomePage = new UsersHomePage(driver);
    protected UsersCreateNewUserPage usersCreateNewUserPage = new UsersCreateNewUserPage(driver);
    protected UsersEditNewUserPage usersEditNewUserPage = new UsersEditNewUserPage(driver);
    protected UsersCompanyPage usersCompanyPage = new UsersCompanyPage(driver);
    protected UsersTaskPage usersTaskPage = new UsersTaskPage(driver);

    @AfterSuite
    public void clearCookiesAndLocalStorage() {
        if (cookiesStorageClean) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite(alwaysRun = true)
    public void browserCloseSuite() {
        if (closeBrowserSuite) {
            driver.quit();
        }
    }

    @AfterTest(alwaysRun = false)
    public void browserCloseTest() {
        if (closeBrowserTest) {
            driver.quit();
        }
    }
}
