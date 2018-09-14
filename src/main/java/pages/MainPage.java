package pages;

import com.sun.jna.platform.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import project.CheckFunctions;
import util.FileUtil;

import java.io.File;
import java.io.IOException;

/**
 * Created by anna on 04.09.2018.
 */
public class MainPage extends Page{
    //private WebDriver driver;

    public MainPage(WebDriver driver){
        super(driver);
    }

    private By vacancyLink = By.linkText("Вакансии дня");

    public VacanciesPage clickVacancyLink(){

        if (CheckFunctions.checkElement(4, "Вакансии дня", this.getClass()) == true)
        {
            CheckFunctions.element.click();
            FileUtil.doScreen("D:\\technoserv\\maven_test_checkFunc\\logs\\screenshots\\mainPage.png");

            return new VacanciesPage(driver);
        }
        return null;

    }
}
