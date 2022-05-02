package src.main.java.formatting.nocleancode.vertical;

/*point. If you look about halfway down the listing, you will see two instance variables declared there.
        It would be hard to hide them in a better place.
        Someone reading this code would have to stumble across the declarations by accident (as I did).*/

public class InstanceOnTop {
    static public Test createTest(Class<? extends TestCase> theClass, String name) { …}

    public static Constructor<? extends TestCase> getTestConstructor(Class<? extends TestCase> theClass) throws NoSuchMethodException { …}

    public static Test warning(final String message) { …}

    private static String exceptionToString(Throwable t) { …}

    private String fName;
    private Vector<Test> fTests = new Vector<Test>(10);

    public TestSuite() {
    }

    public TestSuite(final Class<? extends TestCase> theClass) { …}

    public TestSuite(Class<? extends TestCase> theClass, String name) {
        …
    }
    … … … … …
}
}
