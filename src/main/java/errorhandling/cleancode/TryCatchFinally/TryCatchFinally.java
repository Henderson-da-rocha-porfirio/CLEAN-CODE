package src.main.java.errorhandling.cleancode.TryCatchFinally;

/* Our LocalPort class is just a simple wrapper that catches and
    translates exceptions thrown by the ACMEPort class: */
 */
public class TryCatchFinally {

    private ACMEPort innerPort;

    public LocalPort(int portNumber) {
        innerPort = new ACMEPort(portNumber);
    }

    public void open() {
        try {
            innerPort.open();
        } catch (DeviceResponseException e) {
            throw new PortDeviceFailure(e);
        } catch (ATM1212UnlockedException e) {
            throw new PortDeviceFailure(e);
        } catch (GMXError e) {
            throw new PortDeviceFailure(e);
        }
    } …
}
