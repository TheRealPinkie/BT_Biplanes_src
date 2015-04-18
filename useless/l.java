import java.util.Vector;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;

public class l
    implements DiscoveryListener {
    public Vector a;
    private final j b;

    private l(j paramj) {
        this.b = paramj;
        this.a = new Vector();
    }

    public void deviceDiscovered(RemoteDevice paramRemoteDevice, DeviceClass paramDeviceClass) {
        this.a.addElement(paramRemoteDevice);
    }

    public void inquiryCompleted(int paramInt) {
        synchronized (this) {
            notify();
        }
    }

    public void servicesDiscovered(int paramInt, ServiceRecord[] paramArrayOfServiceRecord) {
    }

    public void serviceSearchCompleted(int paramInt1, int paramInt2) {
    }

    public l(j paramj, n paramn) {
        this(paramj);
    }
}

/* Location:           /Users/ilya/4fun/Biplanes/Bluetooth_Biplanes.jar
 * Qualified Name:     l
 * JD-Core Version:    0.6.2
 */