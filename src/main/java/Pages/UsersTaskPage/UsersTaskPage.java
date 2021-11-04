package Pages.UsersTaskPage;

import Pages.Basic.BasicPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

import static Basic.Config.*;

public class UsersTaskPage extends BasicPage {

    public UsersTaskPage(WebDriver driver) {
        super(driver);
    }

    public final By addTask = new By.ByXPath("//a[text()='Добавить задачу']");
    public final By taskNameField = new By.ByXPath("//input[@name='name']");
    public final By descriptionField = new By.ByXPath("//textarea[@name='description']");
    public final By submitButton = new By.ByXPath("//input[@type='submit']");
    public final By addSchedule = new By.ByXPath("//a[text()='Добавить в расписание']");
    public final By deleteTask = new By.ByXPath("//a[text()='Удалить']");
    public final By editTask = new By.ByXPath("//a[text()='Изменить']");
    public final By scheduleTask = new By.ByXPath("//a[text()='Добавить в расписание']");
    public final By taskHistory = new By.ByXPath("//a[@href='/tasks/notify/index.html']");
    public final By notifications = new By.ByXPath("//td[text()='Уведомление']");
    public final By timeHoursFiled = new By.ByXPath("//input[@name='hours']");
    public final By timeMinutesFiled = new By.ByXPath("//input[@name='minuts']");
    public final By monthSelect = new By.ByXPath("//select[@name='month']");
    public final By daysCalendarSelect = new By.ByXPath("//select[@name='days']");
    public final By daysWeekSelect = new By.ByXPath("//select[@name='dayweek']");
    public final By addTaskToSchedule = new By.ByXPath("//input[@value='Добавить расписание']");
    public final By deleteScheduleButton = new By.ByXPath("//a[text()='[x]']");


    public UsersTaskPage enterTaskNameDescription () {
        WebElement tName = driver.findElement(taskNameField);
        waitElementIsVisible(tName).sendKeys(taskNameF);
        driver.findElement(descriptionField).sendKeys(taskDescriptionF);
        return this;
    }

    public UsersTaskPage clickAddTaskButton () {
        WebElement addTButt = driver.findElement(addTask);
        waitElementIsVisible(addTButt).click();
        return this;
    }
    public UsersTaskPage clickCreateNewTuskButton () {
        WebElement createNTask = driver.findElement(submitButton);
        waitElementIsVisible(createNTask).click();
        return this;
    }

    public UsersTaskPage checkIsAddScheduleButtonExist () {
        List sButt = driver.findElements(addSchedule);
        int s = sButt.size();
        Assert.assertNotEquals(s, 0);
        return this;
    }

    public UsersTaskPage clickEditTaskButton () {
        WebElement ediTask = driver.findElement(editTask);
        waitElementIsVisible(ediTask).click();
        return this;
    }

    public UsersTaskPage clickScheduleTaskButton () {
        WebElement schedTask = driver.findElement(scheduleTask);
        waitElementIsVisible(schedTask).click();
        return this;
    }

    public UsersTaskPage clickDeleteTaskButton () {
        WebElement delTask = driver.findElement(deleteTask);
        waitElementIsVisible(delTask).click();
        return this;
    }

    public UsersTaskPage clickTaskHistoryButton () {
        WebElement taskHistoryButt = driver.findElement(taskHistory);
        waitElementIsVisible(taskHistoryButt).click();
        return this;
    }

    public UsersTaskPage checkIsNotificationFieldPresent () {
        List not = driver.findElements(notifications);
        int s = not.size();
        Assert.assertEquals(s, 1);
        return this;
    }

    public UsersTaskPage fillHoursMinutesField () {
        WebElement hoursTimeField = driver.findElement(timeHoursFiled);
        waitElementIsVisible(hoursTimeField).sendKeys(taskHours);
        driver.findElement(timeMinutesFiled).sendKeys(taskMinutes);
        return this;
    }

    public UsersTaskPage selectMonthDayWeekFields () {
        Select montSelect = new Select (driver.findElement(monthSelect));
        montSelect.selectByIndex(monthSelectIndex);
        Select daySelect = new Select (driver.findElement(daysCalendarSelect));
        daySelect.selectByIndex(monthSelectIndex);
        Select dayWeekSelect = new Select (driver.findElement(daysWeekSelect));
        dayWeekSelect.selectByIndex(monthSelectIndex);
        return this;
    }

    public UsersTaskPage clickAddScheduleToTaskButton () {
        WebElement taskSButt = driver.findElement(addTaskToSchedule);
        waitElementIsVisible(taskSButt).click();
        return this;
    }

    public UsersTaskPage clickDeleteScheduleButton () {
        WebElement delS = driver.findElement(deleteScheduleButton);
        waitElementIsVisible(delS).click();
        return this;
    }

    public UsersTaskPage checkIsDeleteScheduleButtonPresent () {
        List not = driver.findElements(deleteScheduleButton);
        int s = not.size();
        Assert.assertNotEquals(s, 0);
        return this;
    }

}
