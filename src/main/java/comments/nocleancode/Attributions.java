package src.main.java.comments.nocleancode;

/* Source code control systems are very good at remembering who added what, when.
There is no need to pollute the code with little bylines. You might think that such comments would be useful in order
to help others know who to talk to about the code.
But the reality is that they tend to stay around for years and years, getting less and less accurate and relevant.
Again, the source code control system is a better place for this kind of information: */

/* Added by Henderson */
public class Attributions {
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
