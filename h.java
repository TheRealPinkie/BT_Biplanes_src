import com.nokia.mid.sound.Sound;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.PrintStream;
import java.util.Timer;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.StopTimeControl;

public class h {
  private static byte[] a;
  private static int[] b;
  private static int c;
  private static int d;
  private static Player e;
  private static StopTimeControl f;
  private static Player g;
  private static StopTimeControl h;
  private static Sound[] i;
  private static Timer j = new Timer();
  public static final String[] k = { "audio/midi", "audio/x-wav" };

  public static void a(DataInputStream paramDataInputStream)
    throws Exception {
    int m = paramDataInputStream.readByte();
    int i2 = m;
    do {
      int n = paramDataInputStream.readByte();
      System.out.println("type = " + n);
      int i1;
      byte[] arrayOfByte;
      switch (n) {
      case 0:
      case 1:
        i1 = paramDataInputStream.readInt();
        arrayOfByte = new byte[i1];
        paramDataInputStream.readFully(arrayOfByte);
        ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
        if (n == 0) {
          System.out.println("midi file..");
          e = Manager.createPlayer(localByteArrayInputStream, k[n]);
          e.realize();
          e.prefetch();
          System.out.println("loaded midi file " + i1);
        }
        else {
          g = Manager.createPlayer(localByteArrayInputStream, k[n]);
          g.realize();
          g.prefetch();
        }
        break;
      case 2:
        int i4 = paramDataInputStream.readByte();
        i = new Sound[i4];
        for (int i5 = 0; i5 < i4; i5++) {
          i1 = paramDataInputStream.readInt();
          arrayOfByte = new byte[i1];
          paramDataInputStream.readFully(arrayOfByte);
          i[i5] = new Sound(arrayOfByte, 1);
        }
      }
      i2--;
    }
    while (i2 >= 0);
    c = paramDataInputStream.readShort();
    a = new byte[c];
    paramDataInputStream.readFully(a);
    b = new int[c << 1];
    for (int i3 = 0; i3 < c; i3++) {
      b[(i3 << 1)] = paramDataInputStream.readInt();
      b[((i3 << 1) + 1)] = paramDataInputStream.readInt();
    }
  }

  public static void a(int paramInt1, int paramInt2)
    throws Exception {
    int m = a[paramInt1];
    if (m == -1)
      return;
    if (m == 2) {
      i[b[(paramInt1 << 1)]].play(paramInt2);
      return;
    }
    Player localPlayer = e;
    StopTimeControl localStopTimeControl = f;
    switch (m) {
    case 1:
      localPlayer = g;
      localStopTimeControl = h;
    }
    if (localPlayer.getState() == 400)
      if ((d == 1) && (paramInt1 != 1))
        localPlayer.stop();
      else
        return;
    d = paramInt1;
    localPlayer.setMediaTime(b[(paramInt1 << 1)]);
    System.out.println("start time = " + b[(paramInt1 << 1)]);
    int n = b[(paramInt1 << 1)];
    int i1 = b[((paramInt1 << 1) + 1)];
    System.out.println("end time = " + i1);
    j.schedule(new k(localPlayer), (i1 - n) / 1000);
    localPlayer.start();
  }
}

/* Location:           /Users/ilya/4fun/Biplanes/Bluetooth_Biplanes.jar
 * Qualified Name:     h
 * JD-Core Version:    0.6.2
 */