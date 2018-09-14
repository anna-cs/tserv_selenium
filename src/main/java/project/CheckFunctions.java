package project;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Page;
import sun.util.logging.PlatformLogger;
import sun.util.logging.PlatformLogger.Level;
import util.LoggerUtil;

import java.util.List;

/**
 * Created by anna on 27.08.2018.
 */
public class CheckFunctions{
    private static long waitTime=60000;
    //private int longWaitTime;
    public static WebElement element;
    public static WebDriver driver;

    public static boolean checkElement(int fieldType, String fieldText, Class cl) {
        element = null;
        long start=System.currentTimeMillis();
        long current;
        long period;
        switch (fieldType) {
            case (4): {
                do {
                    current = System.currentTimeMillis();
                    period = current-start;
                    try {
                        if ((element = driver.findElement(By.linkText(fieldText))) != null) {System.out.println(element.getText());
                            return true;
                        }
                    } catch (Exception e) {
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }

                }while (period<waitTime);

            }
           break;
            case (2): {
                do {
                    current = System.currentTimeMillis();
                    period = current - start;
                    try {
                        if ((element = driver.findElement(By.cssSelector(fieldText))) != null) {
                            System.out.println(element.getText());
                            return true;
                        }
                    } catch (Exception e) {
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }

                }while (period<waitTime);
            }

            break;

            case (3): {
                do {
                    current = System.currentTimeMillis();
                    period = current-start;
                    try {
                        if ((element = driver.findElement(By.name(fieldText))) != null) {System.out.println(element.getText());
                            return true;
                        }
                    } catch (Exception e) {
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }

                }while (period<waitTime);

            }
            break;

            case (1): {
                do {
                    current = System.currentTimeMillis();
                    period = current-start;
                    try {
                        if ((element = driver.findElement(By.xpath(fieldText))) != null) {System.out.println(element.getText());
                            return true;
                        }
                    } catch (Exception e) {
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }

                }while (period<waitTime);

            }
            break;
        }

        LoggerUtil.logger.log(java.util.logging.Level.SEVERE, "Object not found: "+"locator_type="+fieldType+", field="+fieldText+", page="+cl.getSimpleName());
        Assert.fail();
        return false;

    }
}
