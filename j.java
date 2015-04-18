import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Vector;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;
import javax.bluetooth.UUID;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.microedition.io.InputConnection;
import javax.microedition.io.OutputConnection;
import javax.microedition.io.StreamConnection;
import javax.microedition.io.StreamConnectionNotifier;

public class j
  implements Runnable {
  private static final UUID a = new UUID("6252233F8F1E4beb85DBEB178C94826D", false);
  public DataInputStream b = null;
  public DataOutputStream c = null;
  public static boolean d = false;
  public int e = 0;
  public Thread f = null;
  public StreamConnection g = null;

  public void a(boolean paramBoolean) {
    d = paramBoolean;
    this.e = 1;
    this.f = new Thread(this);
    this.f.start();
  }

  public void a(int paramInt, byte[] paramArrayOfByte) {
    try {
      this.c.writeInt(paramInt);
      this.c.writeInt(paramArrayOfByte.length);
      this.c.write(paramArrayOfByte);
      this.c.flush();
    }
    catch (Exception localException) {
    }
  }

  public void a() {
    a(-254, new byte[0]);
  }

  public void b()
    throws Exception {
    int i = this.b.readInt();
    switch (i) {
    case -254:
      a(-255, new byte[0]);
      try {
        Thread.sleep(2000L);
      }
      catch (Exception localException) {
      }
      d();
      b.a(true);
      this.e = 4;
      break;
    case -255:
      d();
      b.a(false);
      this.e = 4;
      break;
    default:
      b.a(i, this.b);
    }
  }

  private void d() {
    try {
      if (this.b != null)
        this.b.close();
      this.b = null;
    }
    catch (Exception localException1) {
    }
    try {
      if (this.c != null)
        this.c.close();
      this.c = null;
    }
    catch (Exception localException2) {
    }
    try {
      if (this.g != null)
        this.g.close();
      this.g = null;
    }
    catch (Exception localException3) {
    }
    try {
      LocalDevice.getLocalDevice().setDiscoverable(0);
    }
    catch (Exception localException4) {
    }
  }

  public boolean c()
    throws Exception {
    LocalDevice localLocalDevice = LocalDevice.getLocalDevice();
    DiscoveryAgent localDiscoveryAgent = localLocalDevice.getDiscoveryAgent();
    Object localObject1;
    if (!d) {
      b.a(b.bk[40]);
      localLocalDevice.setDiscoverable(10390272);
      localObject1 = "btspp://localhost:6252233F8F1E4beb85DBEB178C94826D;name=BIPLANES";
      StreamConnectionNotifier localStreamConnectionNotifier = (StreamConnectionNotifier)Connector.open((String)localObject1);
      try {
        this.g = localStreamConnectionNotifier.acceptAndOpen();
        this.b = new DataInputStream(this.g.openInputStream());
        this.c = new DataOutputStream(this.g.openOutputStream());
      }
      catch (Exception localException) {
      }
      localLocalDevice.setDiscoverable(0);
      b.a(b.bk[41]);
    }
    else {
      b.a(b.bk[42]);
      localLocalDevice.setDiscoverable(0);
      localObject1 = new l(this, null);
      synchronized (localObject1) {
        localDiscoveryAgent.startInquiry(10390272, (DiscoveryListener)localObject1);
        localObject1.wait();
      }
      if (((l)localObject1).a.size() == 0)
        return false;
      Enumeration localEnumeration = ((l)localObject1).a.elements();
      m localm = new m(this, null);
      int i = 0;
      RemoteDevice localRemoteDevice = null;
      while (localEnumeration.hasMoreElements()) {
        localRemoteDevice = (RemoteDevice)localEnumeration.nextElement();
        synchronized (localm) {
          i = localDiscoveryAgent.searchServices(new int[] { 256 }, new UUID[] { a }, localRemoteDevice, localm);
          localm.wait();
        }
      }
      if (localm.a.size() == 0) {
        b.a(b.bk[43]);
        return false;
      }
      ??? = (ServiceRecord)localm.a.elementAt(0);
      String str = ((ServiceRecord)???).getConnectionURL(0, false);
      this.g = ((StreamConnection)Connector.open(str));
      this.b = new DataInputStream(this.g.openInputStream());
      this.c = new DataOutputStream(this.g.openOutputStream());
      b.a(b.bk[41]);
    }
    return true;
  }

  public void run() {
    try {
      while (this.e != 4)
        switch (this.e) {
        case 0:
          Thread.yield();
          break;
        case 1:
          if (b.b(c()))
            this.e = 2;
          else
            this.e = 4;
          Thread.sleep(b.z);
          break;
        case 2:
          b();
          Thread.sleep(b.z);
        }
    }
    catch (Exception localException) {
      this.e = 4;
    }
  }
}

/* Location:           /Users/ilya/4fun/Biplanes/Bluetooth_Biplanes.jar
 * Qualified Name:     j
 * JD-Core Version:    0.6.2
 */