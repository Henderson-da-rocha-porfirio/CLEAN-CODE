package boundaries.cleancode.log4j;

import java.util.logging.Logger;

       /* A bit more googling, reading, and testing, and we eventually wind up with Listing.
        We’ve discovered a great deal about the way that log4j works,
        and we’ve encoded that knowledge into a set of simple unit tests.
        Now we know how to get a simple console logger initialized,
        and we can encapsulate that knowledge into our own logger class so that the rest
        of our application is isolated from the log4j boundary workinginterfacesinapis.*/

public class LogTest {

    private Logger logger;

    @Before
    public void initialize() {
        logger = Logger.getLogger(“ logger”); logger.removeAllAppenders();
        Logger.getRootLogger().removeAllAppenders();
    }

    @Test
    public void basicLogger() {
        BasicConfigurator.configure();
        logger.info(“ basicLogger”);
    }

    @Test
    public void addAppenderWithStream() {
        logger.addAppender(new ConsoleAppender(new PatternLayout(“ % p % t % m % n”),
                ConsoleAppender.SYSTEM_OUT));
        logger.info(“ addAppenderWithStream”);
    }

    @Test
    public void addAppenderWithoutStream() {
        logger.addAppender(new ConsoleAppender(new PatternLayout(“ % p % t % m % n”)));
        logger.info(“ addAppenderWithoutStream”);
    }
}
