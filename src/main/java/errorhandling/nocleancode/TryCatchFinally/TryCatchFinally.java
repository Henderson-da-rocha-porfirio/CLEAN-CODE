package src.main.java.errorhandling.nocleancode.TryCatchFinally;

/* Let’s look at an example of poor exception classification.
  Here is a try-catch-finally statement for a third-party library call.
  It covers all of the exceptions that the calls can throw: */
public class TryCatchFinally {

    ACMEPort port = new ACMEPort(12);

    try {
        port.open();
    } catch(
    DeviceResponseException e)

    {
        reportPortError(e);
        logger.log(“ Device response exception”, e);
    } catch(
    ATM1212UnlockedException e)

    {
        reportPortError(e);
        logger.log(“ Unlock exception”, e);
    } catch(
    GMXError e)

    {
        reportPortError(e);
        logger.log(“ Device response exception”);
    } finally

    {
        …
    }
}
