package Basic;

public class Config {
    /**
     * Only Windows OS is supported yet
     * Input "winChrome" for Google Chrome browser
     * Input "winFirefox" for Mozilla Firefox browser
     * Input "winOpera" for Opera browser
     */
    public static final String platformBrowser = "winChrome";

    /**
     * Input fields data (String) and selectors index (int)
     */
    public static final String registrationName = "autotesting9"; // registration name on login page
    public static final String registrationEmail = "atest@mail.ru"; // registration and login email
    public static final String registrationPass = "111"; // registration and login pass
    public static final String newUserName = "Alex101"; // new user name on user creation page
    public static final String newUserEmail = "atesta@mail.ru"; // new user email on user creation page
    public static final String newUserPass = "good"; // new user pass on user creation page
    public static final String registrationBirthDate = "21031991"; // format day-month-year in one string
    public static final int genderSelect = 1; // gender select: 0 - "Неизвестно", 1 - "Мужской", 2 - "Женский"
    public static final String JobStartDate = "21122012"; // format day-month-year in one string
    public static final String hobby = "i like to make things"; // free text field
    public static final String actualName = "Perdo";
    public static final String surname = "Eliato";
    public static final String fatherName = "Esposito";
    public static final String cat = "Tac";
    public static final String dog = "God";
    public static final String parrot = "Tarrop";
    public static final String cavy = "Yvac";
    public static final String hamster = "Retsmah";
    public static final String squirrel = "Lerriuqs";
    public static final String phoneNumber = "+380506978855"; // phoneNumber in format +123456789012
    public static final String address = "Citizen of Earth"; // address, free format
    public static final String INN = "500100732259"; // 10-char number for Russia
    public static final String dateF = "12122020"; // format day-month-year in one string
    public static final String dateT = "12122021"; // format day-month-year in one string
    public static final String nameEmailSearch = "mail"; // name and/or email for search
    public static final int companyTypeIndex = 2; // 0 - "ИП" 1 - "ООО" 2 - "ОАО"
    public static final String companyName = "Рога и Рога";
    public static final String companyINN = "0009998887"; // 10-char number for Russia
    public static final String companyORGN = "1313131313131"; // 13-char number for Russia
    public static final String companyKPP = "999999999"; // 9-char number for Russia
    public static final String companyPhone = "+380506975555"; // phoneNumber in format +123456789012
    public static final String companyAddress = "Новобобруйк-13"; // address, free format
    public static final int companyEmployeesIndex = 5;
    public static final String taskNameF = "Дверь мне запили";
    public static final String taskDescriptionF = "Нужно запилить дверь";
    public static final String taskHours = "12"; // 0-23
    public static final String taskMinutes = "30"; // 0-59
    public static final int monthSelectIndex = 5; // 0-11
    public static final int daysSelectIndex = 2; // 0-30
    public static final int daysWeekSelectIndex = 3; // 0-6

    /**
     * Enable clean cookies and local session storage after test if "true"
     */
    public static final Boolean cookiesStorageClean = false;

    /**
     * Close browser after each test suite if "true"
     */
    public static final Boolean closeBrowserSuite = false;

    /**
     * Close browser after each test if "true"
     */
    public static final Boolean closeBrowserTest = false;
}
