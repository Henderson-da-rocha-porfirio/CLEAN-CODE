package boundaries.cleancode.test;

import java.util.logging.Logger;

       /* Learning Tests Are Better Than Free:
        The learning tests end up costing nothing.
        We had to learn the API anyway, and writing those tests was an easy and isolated way to get that knowledge.
        The learning tests were precise experiments that helped increase our understanding.
        Not only are learning tests free, they have a positive return on investment.
        When there are new releases of the third-party package, we run the learning tests to see whether there are behavioral differences.
        Learning tests verify that the third-party packages we are using work the way we expect them to.
        Once integrated, there are no guarantees that the third-party code will stay compatible with our needs.
        The original authors will have pressures to change their code to meet new needs of their own.
        They will fix bugs and add new capabilities. With each release comes new risk.
        If the third-party package changes in some way incompatible with our tests, we will find out right away.
        Whether you need the learning provided by the learning tests or not, a clean boundary should be supported by a set
        of outbound tests that exercise the workinginterfacesinapis the same way the production code does.
        Without these boundary tests to ease the migration, we might be tempted to stay with the old version longer than we should.*/

public class Log4JTest {

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
