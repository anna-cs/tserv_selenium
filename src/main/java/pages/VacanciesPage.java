package pages;

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
public class VacanciesPage extends Page{
    //private WebDriver driver;

    public VacanciesPage(WebDriver driver){
        super(driver);
    }

    private By firstVacancy = By.cssSelector("p.title");

    public void clickFirstVacancy(){

        if (CheckFunctions.checkElement(2, "p.title", this.getClass())== true) {CheckFunctions.element.click();}
        FileUtil.doScreen("D:\\technoserv\\maven_test_checkFunc\\logs\\screenshots\\vacanciesPage.png");


    }
}
