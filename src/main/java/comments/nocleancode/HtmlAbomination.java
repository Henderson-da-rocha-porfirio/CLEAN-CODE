package src.main.java.comments.nocleancode;

/* HTML in source code comments is an abomination,
as you can tell by reading the code below.
It makes the comments hard to read in the one place where they should be easy to read— the editor/ IDE.
If comments are going to be extracted by some tool (like Javadoc) to appear in a Web page,
then it should be the responsibility of that tool, and not the programmer,
to adorn the comments with appropriate HTML: */


/* * Task to run fit tests.
 *  * This task runs fitnesse tests and publishes the results.
 *  * < p/ >
 *  * < pre >
 *  * Usage:
 *  * &lt; taskdef name =& quot; execute-fitnesse-tests& quot;
 *  */

public class HtmlAbomination {
    // Utility method that returns when this.closed is true. Throws an exception
    // if the timeout is reached.
    public synchronized void waitForClose(final long timeoutMillis) throws Exception {
        if (!closed) {
            wait(timeoutMillis);
            if (!closed)
                throw new Exception(" MockResponseSender could not be closed");
        }
    }
}
