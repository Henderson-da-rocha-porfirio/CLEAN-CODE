package src.main.java.comments.cleancode;

/*Sometimes it is useful to warn other programmers about certain consequences.
        For example, here is a comment that explains why a particular test case is turned off:*/
public class WarningConsequences {
    // Don't run unless you
    // have some time to kill.
    public void _testWithReallyBigFile() {
        writeLinesToFile(10000000);
        response.setBody(testFile);
        response.readyToSend(this);
        String responseString = output.toString();
        assertSubString(" Content-Length: 1000000000", responseString);
        assertTrue(bytesSent > 1000000000);
    }
}

/*Nowadays, of course, we’d turn off the test case by using the @Ignore attribute with an appropriate explanatory string.
@Ignore(” Takes too long to run”). But back in the days before JUnit 4, putting an underscore in front of the method name was a common convention.
        The comment, while flippant, makes the point pretty well.*/
