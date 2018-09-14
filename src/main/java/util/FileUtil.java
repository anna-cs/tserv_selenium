package util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static project.CheckFunctions.driver;

/**
 * Created by anna on 14.09.2018.
 */
public class FileUtil {
    public static void screenDel(){

        File screen = new File("D:\\technoserv\\maven_test_checkFunc\\logs\\screenshots");
        if (screen.exists()) {
            String[] entries = screen.list();
            for (String s : entries) {
                File currentFile = new File(screen.getPath(), s);
                currentFile.delete();
            }

            screen.delete();
        }

    }

    public static void doScreen(String fileName){

        File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            org.apache.commons.io.FileUtils.copyFile(screen, new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
