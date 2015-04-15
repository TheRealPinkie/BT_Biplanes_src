import java.util.Vector;
import javax.bluetooth.DataElement;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;

public class m
  implements DiscoveryListener
{
  public Vector a;
  private final j b;

  private m(j paramj)
  {
    this.b = paramj;
    this.a = new Vector();
  }

  public void servicesDiscovered(int paramInt, ServiceRecord[] paramArrayOfServiceRecord)
  {
    DataElement localDataElement = null;
    for (int i = 0; i < paramArrayOfServiceRecord.length; i++)
    {
      localDataElement = paramArrayOfServiceRecord[i].getAttributeValue(256);
      if ((localDataElement != null) && (localDataElement.getDataType() == 32) && (((String)localDataElement.getValue()).equals("BIPLANES")) && (!this.a.contains(paramArrayOfServiceRecord[i])))
      {
        this.a.addElement(paramArrayOfServiceRecord[i]);
        break;
      }
    }
  }

  public void serviceSearchCompleted(int paramInt1, int paramInt2)
  {
    synchronized (this)
    {
      notify();
    }
  }

  public void deviceDiscovered(RemoteDevice paramRemoteDevice, DeviceClass paramDeviceClass)
  {
  }

  public void inquiryCompleted(int paramInt)
  {
  }

  public m(j paramj, n paramn)
  {
    this(paramj);
  }
}

/* Location:           /Users/ilya/4fun/Biplanes/Bluetooth_Biplanes.jar
 * Qualified Name:     m
 * JD-Core Version:    0.6.2
 */