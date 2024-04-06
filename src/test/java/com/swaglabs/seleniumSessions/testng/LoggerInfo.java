package testng;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerInfo {
    public static void main(String[] args) {

        Logger log = LogManager.getLogger("LoggerInfo");
        System.out.println("This is log sample file");
        log.info("For info only");
        log.debug("for debug");
        log.error("for error");
        log.warn("for warning");
        log.fatal("for fatal");
        
    }
}
