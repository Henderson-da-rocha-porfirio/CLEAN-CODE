package src.main.java.comments.nocleancode;

/*shows a simple function with a header comment that is completely redundant.
        The comment probably takes longer to read than the code itself.*/

public class Useless {
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
