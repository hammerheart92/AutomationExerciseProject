package loggerUtility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtility {

    private Logger logger = LogManager.getLogger();

    //method indicating the start of the test
    public void startTest(String testName){
        logger.info("*********** EXECUTION STARTED: " + testName + "***********");
    }
    //method that logs an info

    public void infoLog(String message){
        logger.info(message);
    }
    //method that logs an error

    public void errorLog(String message){
        logger.error(message);
    }
    //method indicating the end of the test
    public void finishTest(String testName){
        logger.info("*********** EXECUTION FINISHED: " + testName + "***********");
    }
}
