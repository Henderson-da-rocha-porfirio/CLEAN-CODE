package src.main.java.errorhandling.cleancode;

/* Notice how much cleaner it is. This isn’t just a matter of aesthetics.
 The code is better because two concerns that were tangled,
  the algorithm for device shutdown and error handling, are now separated.
  You can look at each of those concerns and understand them independently.
 */
public class WithException {

    ...

    public void sendShutDown() {
        try {
            tryToShutDown();
        } catch (DeviceShutDownError e) {
            logger.log(e);
        }
    }

    private void tryToShutDown() throws DeviceShutDownError {
        DeviceHandle handle = getHandle(DEV1);
    }

    DeviceRecord record = retrieveDeviceRecord(handle);

    pauseDevice(handle);

    clearDeviceWorkQueue(handle);

    closeDevice(handle);

    private DeviceHandle getHandle(DeviceID id) {
    ...
    throw new DeviceShutDownError(“ Invalid handle for: ”id.toString());
    ...
    }

    ...
}
