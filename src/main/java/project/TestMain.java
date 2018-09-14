/*package project;//import junit.framework.Test;
//import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import pages.MainPage;
import pages.VacanciesPage;
import project.CheckFunctions;

import java.io.File;

public class TestMain {

  public static void main(String[] args) throws InterruptedException {
      FirefoxOptions options = new FirefoxOptions().setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
      //FirefoxBinary binary = new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox"));
      CheckFunctions checkFunc = new CheckFunctions();
      System.setProperty("webdriver.gecko.driver","D:\\technoserv\\maven_test\\drivers\\geckodriver.exe");
      System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
      System.setProperty("phantomjs.binary.path","D:\\technoserv\\maven_test\\drivers\\phantomjs.exe");
      File profileDir = new File("D:\\technoserv\\maven_test_checkFunc\\7jbadf22.test");
      FirefoxProfile firefoxProfile = new FirefoxProfile(profileDir);
      FirefoxOptions firefoxOptions = new FirefoxOptions().setProfile(firefoxProfile);

      WebDriver driver = new FirefoxDriver(firefoxOptions);
      CheckFunctions.driver = driver;
      driver.manage().window().maximize();
      //WebDriver driver = new PhantomJSDriver();
      String baseUrl = "https://gossluzhba.gov.ru/";
      driver.get(baseUrl);
      /*if (checkFunc.checkElement(4, "Вакансии дня") == true) {checkFunc.element.click();}
      try {
          Thread.sleep(2000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      if (checkFunc.checkElement(2, "p.title")== true) {checkFunc.element.click();}*/
      /*MainPage mainPage = new MainPage(driver);
      VacanciesPage vacanciesPage = mainPage.clickVacancyLink();
      try {
          Thread.sleep(2000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      if (vacanciesPage != null){vacanciesPage.clickFirstVacancy();}

      //driver.quit();
  }
}*/
