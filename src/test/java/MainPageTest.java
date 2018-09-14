import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import pages.MainPage;
import pages.VacanciesPage;
import project.CheckFunctions;
import util.FileUtil;
import util.LoggerUtil;

import java.io.File;

public class MainPageTest {
    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUp(){
        FirefoxOptions options = new FirefoxOptions().setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        System.setProperty("webdriver.gecko.driver","D:\\technoserv\\maven_test\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        File profileDir = new File("D:\\technoserv\\maven_test_checkFunc\\firefox_profile\\7jbadf22.test");
        LoggerUtil.initLog();
        FileUtil.screenDel();
        FirefoxProfile firefoxProfile = new FirefoxProfile(profileDir);
        FirefoxOptions firefoxOptions = new FirefoxOptions().setProfile(firefoxProfile);
        this.driver = new FirefoxDriver(firefoxOptions);
        CheckFunctions.driver = driver;
        driver.manage().window().maximize();
        String baseUrl = "https://gossluzhba.gov.ru/";
        driver.get(baseUrl);
        this.mainPage = new MainPage(driver);
    }

    @Test
    public void clickVacancy(){
        //MainPage mainPage = new MainPage(driver);
        VacanciesPage vacanciesPage = mainPage.clickVacancyLink();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (vacanciesPage != null){vacanciesPage.clickFirstVacancy();}
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
