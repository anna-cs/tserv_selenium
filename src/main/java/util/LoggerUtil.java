package util;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Created by anna on 13.09.2018.
 */
public class LoggerUtil {
    public static Logger logger;
    public static void initLog() {
        logger = Logger.getLogger("MyLog");
        FileHandler fh;
        try {
            fh = new FileHandler("D:\\technoserv\\maven_test_checkFunc\\logs\\log.txt");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (SecurityException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
