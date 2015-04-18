import com.nokia.mid.ui.DeviceControl;
import com.nokia.mid.ui.FullCanvas;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Random;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

public final class b extends FullCanvas
  implements Runnable {
  public static int a;
  public static boolean b;
  public static boolean c;
  public static boolean d;
  public static boolean e;
  public static boolean f;
  public static boolean g;
  public static boolean h;
  public static boolean i;
  public static boolean j;
  public static boolean k;
  public static boolean l;
  public static boolean m;
  public static boolean n;
  public static int o;
  public static int p;
  public static int q;
  public static int r;
  public static int s;
  public static int t;
  public static int u;
  public static final int[] v = { 239, 16 };
  public static Random w;
  public static int x;
  public static int y = 10;
  public static int z;
  public static int[] aa;
  public static int[] ab;
  public static int[] ac;
  public static int[] ad;
  public static boolean[] ae;
  public static boolean[] af;
  public static boolean[] ag;
  public static long ah;
  public static int ai;
  public static int aj;
  public static int ak;
  public static int al;
  public static int am;
  public static int an;
  public static int ao;
  public static int ap;
  public static int aq;
  public static int ar;
  public static int as;
  public static int at;
  public static int au;
  public static int av;
  public static int aw;
  public static int ax;
  public static int ay;
  public static int az;
  public static int a0;
  public static int a1;
  public static int a2;
  public static int a3;
  public static int a4;
  public static DataInputStream a5;
  public static e[] a6;
  public static Image[] a7;
  public static Image[] a8;
  public static Image[] a9;
  public static Image ba;
  public static Image bb;
  public static Image bc;
  public static Image bd;
  public static Image be;
  public static Image bf;
  public static Graphics bg;
  public static Graphics bh;
  public static Graphics bi;
  public static Graphics bj;
  public static String[] bk;
  public static String[] bl;
  public static c bm;
  public static c bn;
  public static c bo;
  public static String bp;
  public static j bq;
  public static byte[] br;
  public static byte[] bs;
  public static byte bt;
  public static d[] bu;
  public static BluetoothBiplanes bv;
  public static e bw;
  public static e bx;
  public static e by;
  public static e bz;
  public static int b0;
  public static int b1;
  public Thread b2;
  public static final int[] b3 = { 9578383, 2593407, 281486 };
  public static final int[] b4 = { 16776704, 16768512, 16757760, 16711937 };
  public static int[] b5;
  public static int[] b6;
  public static int b7;
  public static int b8;
  public static int b9;
  public static int ca;
  public static int cb;
  public static int cc;
  public static int cd;
  public static int ce;
  public static int cf;
  public static int cg;
  public static Image ch;
  public static Image ci;
  public static Image cj;
  public static Image ck;
  public static Image cl;
  public static Image cm;
  public static Graphics cn;
  public static Graphics co;
  public static final String[] cp = { "Engine Sleep", "Engine Latency", "Bluetooth Sleep" };
  public static int cq;
  public static int cr = 12;
  public static int cs = 5;
  public static int ct = 0;
  public static int cu = 0;
  public static int cv = 13;
  public static int cw = 15;
  public static int cx = 7;
  public static int cy;
  public static int cz;
  public static int c0;
  public static int c1;
  public static String c2;
  public static int c3;
  public static int c4;
  public static int c5;
  public static boolean c6;
  public static boolean c7;
  public static int c8;
  public static int[] c9;
  public static int da;
  public static int db;
  private static int dc = 43;
  public static String[] dd = new String[40];
  private static byte[] de = new byte[8];
  private static byte[] df;
  private static byte[] dg = new byte[12];
  private static byte[] dh = new byte[15];
  private static byte[] di = new byte[4];
  private static int[] dj = new int[256];
  private static boolean dk = false;
  private static final int[] dl = { 0, 2, 4, 7, 9, 11, 13, 16, 18, 20, 22, 24, 27, 29, 31, 33, 35, 37, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 73, 75, 77, 79, 81, 82, 84, 86, 87, 89, 91, 92, 94, 95, 97, 98, 99, 101, 102, 104, 105, 106, 107, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 119, 120, 121, 122, 122, 123, 124, 124, 125, 125, 126, 126, 126, 127, 127, 127, 128, 128, 128, 128, 128 };
  private static final byte[][] dm = { { 45, 27, 18, 14, 11, 9, 8, 7, 6, 6 }, { 63, 45, 34, 27, 22, 18, 16, 14, 13, 11 }, { 72, 56, 45, 37, 31, 27, 23, 21, 18, 17 }, { 76, 63, 53, 45, 39, 34, 30, 27, 24, 22 }, { 79, 68, 59, 51, 45, 40, 36, 32, 29, 27 }, { 81, 72, 63, 56, 50, 45, 41, 37, 34, 31 }, { 82, 74, 67, 60, 54, 49, 45, 41, 38, 35 }, { 83, 76, 69, 63, 58, 53, 49, 45, 42, 39 }, { 84, 77, 72, 66, 61, 56, 52, 48, 45, 42 }, { 84, 79, 73, 68, 63, 59, 55, 51, 48, 45 } };
  private static int dn;
  private static int jdField_do;
  private static int dp;
  private static int dq;
  private static int dr;
  private static int ds;
  private static int dt;
  private static int du;
  private static int dv;
  private static int dw;
  private static StringBuffer[] dx;
  private static int[] dy;
  private static int[] dz;
  private static int[] d0;
  private static int[] d1;
  private static int[] d2;
  private static long d3;
  private static long d4;
  private static long d5;
  private static boolean d6;
  private static int d7;
  private static final char[][] d8 = { { '0', '_' }, { '1', '-', '@' }, { 'A', 'B', 'C', '2', 'a', 'b', 'c' }, { 'D', 'E', 'F', '3', 'd', 'e', 'f' }, { 'G', 'H', 'I', '4', 'g', 'h', 'i' }, { 'J', 'K', 'L', '5', 'j', 'k', 'l' }, { 'M', 'N', 'O', '6', 'm', 'n', 'o' }, { 'P', 'Q', 'R', 'S', '7', 'p', 'q', 'r', 's' }, { 'T', 'U', 'V', '8', 't', 'u', 'v' }, { 'W', 'X', 'Y', 'Z', '9', 'w', 'x', 'y', 'z' } };

  public b(BluetoothBiplanes paramBluetoothBiplanes) {
    bv = paramBluetoothBiplanes;
    r = getWidth();
    s = getHeight();
    if (r == 128)
      x = 50;
    else
      x = 25;
    dn = 5;
    jdField_do = dn + 3;
    dt = r - 3;
    ds = dt - 2;
    dq = ds - 6;
    dp = ds - 8;
    dr = 0;
    d6 = false;
    d5 = System.currentTimeMillis();
    d7 = 500;
    dz = new int[] { 2, 11 };
    d0 = new int[] { 10, 11 };
    d1 = new int[] { s - 48, s - 28 };
    d2 = new int[] { 1, 0 };
    dx = new StringBuffer[2];
    dy = new int[2];
    int i1 = 2;
    do {
      dx[i1] = new StringBuffer();
      i1--;
    }
    while (i1 >= 0);
    b1 = 666;
    br = new byte[18];
    w = new Random();
    bp = "";
    DeviceControl.setLights(0, 100);
    g = true;
    o();
    c();
    i = true;
  }

  public static void a(boolean paramBoolean) {
  }

  public static void a(String paramString) {
    bp = paramString;
  }

  public static void a(int paramInt, DataInputStream paramDataInputStream) {
    try {
      an = paramInt;
      e locale1 = a6[1];
      e locale2 = a6[0];
      paramDataInputStream.readFully(br);
      int i1 = 0;
      locale1.a = br[(i1++)];
      if (locale1.a == 2)
        locale1.p = 0;
      locale1.d = (br[(i1++)] & 0xFF);
      locale1.e = (br[(i1++)] & 0xFF);
      locale1.b = (locale1.d << 6);
      locale1.c = (locale1.e << 6);
      locale1.f = br[(i1++)];
      locale2.p = br[(i1++)];
      int i2 = 2;
      do {
        f localf = locale1.av[i2];
        localf.a = (br[(i1++)] & 0xFF);
        localf.b = (br[(i1++)] & 0xFF);
        i2--;
      }
      while (i2 >= 0);
      for (int i3 = aq; i3 < ar; i3++) {
        aa[i3] = ((br[(i1++)] & 0xFF) * 2);
        ab[i3] = ((br[(i1++)] & 0xFF) * 2);
      }
      locale1.v = br[(i1++)];
      if (locale1.v != 0) {
        locale1.w = ((br[(i1++)] & 0xFF) << 6);
        locale1.x = ((br[(i1++)] & 0xFF) << 6);
        locale1.aa = br[(i1++)];
        locale1.ac = br[(i1++)];
      }
      if (an > 1)
        locale1.a(br[(i1++)]);
      else
        locale1.ae = br[(i1++)];
      int i4 = br[(i1++)];
      if ((i4 & 0x1) != 0) {
        locale1.m -= 1;
        if (locale1.m < 0)
          locale1.m = 0;
        b(locale2);
        c(locale1);
      }
      if ((i4 & 0x2) != 0)
        locale1.f();
      if ((i4 & 0x4) != 0) {
        locale1.m -= 1;
        if (locale1.m < 0)
          locale1.m = 0;
        c(locale1);
        b(locale2);
      }
      if ((i4 & 0x8) != 0) {
        locale2.v = 3;
        locale2.aa = 0;
        locale1.m += 2;
        c(locale1);
        b(locale1);
      }
      if ((i4 & 0x10) != 0)
        locale1.ao.v = 5;
      if ((i4 & 0x20) != 0) {
        locale2.f();
        if (locale2.v == 0) {
          locale2.v = 3;
          locale2.aa = 0;
          locale1.m += 1;
          c(locale1);
          b(locale1);
          bt = (byte)(bt + 64);
        }
      }
      if ((i4 & 0x40) != 0) {
        locale2.m += 1;
        c(locale2);
        b(locale2);
      }
      if ((i4 & 0x80) != 0)
        g();
    }
    catch (Exception localException) {
      localException.printStackTrace();
    }
  }

  public static boolean b(boolean paramBoolean) {
    d = paramBoolean;
    if (d) {
      a6[1].ap = true;
      if (a6[0] == bx)
        o = 1;
      else
        o = 2;
    }
    else {
      bp = bk[44];
    }
    return d;
  }

  public void a() {
    switch (a) {
    case 7:
      if ((as == 1) || (by != bw)) {
        a = 2;
        return;
      }
      a = 8;
      if (!m)
        a();
      break;
    case 8:
      a = 9;
      if (!n)
        a();
      break;
    case 9:
      a = 10;
      if (!l)
        a();
      break;
    case 10:
      a = 2;
    }
    c();
  }

  private static void j(int paramInt) {
    af[paramInt] = true;
    n();
  }

  private static void n() {
    try {
      g.g = b("/tm");
      int i1 = 3;
      do {
        if (af[i1] == 0) {
          g.g[(4 + i1)] = bk[5];
          g.g[(27 + i1)] = bk[5];
          g.g[(38 + i1)] = bk[5];
          g.g[(43 + i1)] = bk[5];
        }
        i1--;
      }
      while (i1 >= 0);
    }
    catch (Exception localException) {
      localException.printStackTrace();
    }
  }

  private static void o() {
    try {
      bm = new c("/f");
      bn = new c("/fzr");
      bo = new c("/fzb");
      bk = b("/tg");
      bl = b("/tt");
      b5 = new int[3];
      b6 = new int[3];
      ac = new int[4];
      ad = new int[4];
      int i1 = 4;
      do {
        ad[i1] = 10;
        i1--;
      }
      while (i1 >= 0);
      ag = new boolean[4];
      af = new boolean[3];
      g = true;
      i = true;
      if (!b())
        c(true);
      cd = bm.a(bk[11] + " 100% ");
      cl = Image.createImage(cd, 15);
      cm = Image.createImage(cd, 15);
      cn = cl.getGraphics();
      co = cm.getGraphics();
      n();
      ak = 255 - r;
      al = 208 - s;
      bu = new d[50];
      int i2 = 50;
      do {
        bu[i2] = new d();
        i2--;
      }
      while (i2 >= 0);
      aa = new int[2];
      ab = new int[2];
      ae = new boolean[2];
      int i3 = 2;
      do {
        aa[i3] = c(255);
        ab[i3] = c(104);
        ae[i3] = (c(2) == 0 ? 1 : false);
        i3--;
      }
      while (i3 >= 0);
      ay = c(255) << 6;
      az = c(104);
      a6 = new e[2];
      int i4 = 2;
      do {
        a6[i4] = new e(i4 == 0);
        i4--;
      }
      while (i4 >= 0);
      a6[0].ao = a6[1];
      a6[1].ao = a6[0];
      a5 = new DataInputStream(a6.getClass().getResourceAsStream("/r"));
      byte[] arrayOfByte1 = m();
      x = arrayOfByte1[0];
      z = arrayOfByte1[1];
      bs = m();
      byte[] arrayOfByte2 = m();
      g.a(arrayOfByte2);
      i();
      a7 = d(32);
      ba = k();
      bb = k();
      Image localImage = k();
      t = localImage.getWidth();
      u = localImage.getHeight();
      bc = Image.createImage(t, u);
      bg = bc.getGraphics();
      bg.drawImage(localImage, 0, 0, 20);
      bd = Image.createImage(26, 9);
      bh = bd.getGraphics();
      a8 = d(72);
      a9 = e(1);
      int i5 = a8[69].getWidth();
      int i6 = a8[69].getHeight();
      be = Image.createImage(i5, i6);
      bi = be.getGraphics();
      bf = Image.createImage(128, 100);
      bj = bf.getGraphics();
      h.a(a5);
      a5.close();
      a5 = null;
      System.gc();
      cy = -1;
      a = 13;
    }
    catch (Exception localException) {
      localException.printStackTrace();
    }
  }

  public static void c(boolean paramBoolean) {
    try {
      k = true;
      RecordStore localRecordStore = RecordStore.openRecordStore("s", true);
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
      if (localRecordStore.getSizeAvailable() >= 600) {
        for (int i1 = 0; i1 < 3; i1++)
          localDataOutputStream.writeBoolean(af[i1]);
        for (int i2 = 0; i2 < 4; i2++) {
          localDataOutputStream.writeByte((byte)ac[i2]);
          localDataOutputStream.writeBoolean(ag[i2]);
          localDataOutputStream.writeByte((byte)ad[i2]);
        }
        localDataOutputStream.writeBoolean(g);
        localDataOutputStream.writeBoolean(i);
        byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
        if (paramBoolean)
          localRecordStore.addRecord(arrayOfByte, 0, arrayOfByte.length);
        else
          localRecordStore.setRecord(1, arrayOfByte, 0, arrayOfByte.length);
        k = false;
      }
      localRecordStore.closeRecordStore();
      localDataOutputStream.close();
      localByteArrayOutputStream.close();
    }
    catch (Exception localException) {
      localException.printStackTrace();
      k = true;
    }
  }

  public static boolean b() {
    try {
      System.gc();
      RecordStore localRecordStore = RecordStore.openRecordStore("s", true);
      if (localRecordStore.getNumRecords() > 0) {
        byte[] arrayOfByte = localRecordStore.getRecord(1);
        ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
        DataInputStream localDataInputStream = new DataInputStream(localByteArrayInputStream);
        for (int i1 = 0; i1 < 3; i1++)
          af[i1] = localDataInputStream.readBoolean();
        for (int i2 = 0; i2 < 4; i2++) {
          ac[i2] = localDataInputStream.readByte();
          ag[i2] = localDataInputStream.readBoolean();
          ad[i2] = localDataInputStream.readByte();
        }
        g = localDataInputStream.readBoolean();
        i = localDataInputStream.readBoolean();
        localRecordStore.closeRecordStore();
        localDataInputStream.close();
        localByteArrayInputStream.close();
        return true;
      }
      localRecordStore.closeRecordStore();
    }
    catch (Exception localException) {
    }
    return false;
  }

  public static void a(int paramInt1, int paramInt2) {
    try {
      if (g)
        h.a(paramInt1, paramInt2);
    }
    catch (Exception localException) {
      localException.printStackTrace();
    }
  }

  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    int i4 = 50;
    do {
      if (bu[i4].a == -1) {
        int i2 = paramInt5 - paramInt4;
        int i1 = c(i2) + paramInt4;
        i2 = paramInt7 - paramInt6;
        int i3 = c(i2) + paramInt6;
        bu[i4].a(paramInt2, paramInt3, i1, i3);
        paramInt1--;
        if (paramInt1 == 0)
          return;
      }
      i4--;
    }
    while (i4 >= 0);
  }

  public static void a(e parame) {
    if (as == 1) {
      if (j.d)
        parame.b(0, v[1], 180, 3);
      else
        parame.b(0, v[0], 180, 2);
    }
    else if (as == 0)
      if (parame == a6[0])
        parame.b(0, v[1], 180, 3);
      else
        parame.b(0, v[0], 180, 2);
  }

  public void run() {
    c = false;
    while (!c) {
      DeviceControl.setLights(0, 100);
      try {
        long l1 = System.currentTimeMillis() - ah;
        long l2 = x - l1;
        if (l2 > y)
          Thread.sleep(l2);
        ah = System.currentTimeMillis();
        e();
        if (cy >= 0)
          c();
        else
          switch (a) {
          case 14:
            p += 1;
            if (p == 50) {
              p = 0;
              q += 1;
              if (q == 3) {
                bv.destroyApp(true);
                bv.notifyDestroyed();
              }
              else {
                c();
              }
            }
            break;
          case 2:
            c();
            break;
          case 5:
          case 6:
          case 7:
            c();
            break;
          case 0:
            if (++a2 > 120)
              a = 2;
            break;
          case 13:
            if (a2 == 0)
              a(0, 1);
            if (++a2 > 120) {
              a2 = 0;
              a = 0;
              c();
            }
            break;
          case 3:
            c();
            break;
          case 1:
          case 4:
            if (as == 0)
              e = true;
            else if (as == 1)
              e = (!d) || (am - an < 2);
            if (!e) {
              a4 += 1;
              if (a4 > 50) {
                if (cy == -1)
                  a(bk[18], 0);
                a4 = 0;
              }
            }
            else {
              a4 = 0;
            }
            if ((e) && (d) && (as == 1)) {
              e locale = a6[0];
              int i1 = 0;
              br[(i1++)] = ((byte)locale.a);
              br[(i1++)] = ((byte)locale.d);
              br[(i1++)] = ((byte)locale.e);
              int i2 = locale.f;
              if (locale.i == 3)
                i2 += 16;
              br[(i1++)] = ((byte)i2);
              br[(i1++)] = ((byte)locale.ao.p);
              if (locale.ao.p > 2)
                locale.ao.p = 0;
              int i3 = 2;
              do {
                br[(i1++)] = ((byte)locale.av[i3].a);
                br[(i1++)] = ((byte)locale.av[i3].b);
                i3--;
              }
              while (i3 >= 0);
              for (int i4 = ao; i4 < ap; i4++) {
                br[(i1++)] = ((byte)(aa[i4] / 2));
                br[(i1++)] = ((byte)(ab[i4] / 2));
              }
              br[(i1++)] = ((byte)locale.v);
              if (locale.v != 0) {
                br[(i1++)] = ((byte)(locale.w >> 6));
                br[(i1++)] = ((byte)(locale.x >> 6));
                br[(i1++)] = ((byte)locale.aa);
                br[(i1++)] = ((byte)locale.ac);
              }
              if (am > 1)
                br[(i1++)] = ((byte)locale.af);
              else
                br[(i1++)] = ((byte)locale.ae);
              br[(i1++)] = bt;
              bt = 0;
              bq.c.writeInt(am);
              bq.c.write(br);
              bq.c.flush();
              am += 1;
            }
            c();
          case 8:
          case 9:
          case 10:
          case 11:
          case 12:
          }
      }
      catch (Exception localException) {
        localException.printStackTrace();
      }
    }
  }

  public void c() {
    serviceRepaints();
    repaint();
    Thread.yield();
  }

  public static void d() {
    bw.ap = true;
    bx.ap = true;
    if (o == 1) {
      a6[0].a(0, v[0], 180, 2);
      a6[1].a(0, v[1], 180, 3);
    }
    else {
      a6[0].a(0, v[1], 180, 3);
      a6[1].a(0, v[0], 180, 2);
    }
    am = 0;
    an = 0;
    a4 = 0;
    as = 1;
    a = 1;
  }

  public static void a(int paramInt) {
    switch (paramInt) {
    case 6:
      a(bk[36], 0);
      break;
    case 33:
      a(bk[37], 0);
      break;
    case 7:
      a = 11;
      break;
    case 21:
      if (as == 1) {
        bq.a();
        bp = "";
        o = 0;
        d = false;
      }
      break;
    case 13:
      a = 12;
      at = 0;
      break;
    case 8:
      i = true;
      c(false);
      break;
    case 9:
      i = false;
      c(false);
      break;
    case 10:
      g = true;
      c(false);
      break;
    case 11:
      g = false;
      c(false);
      break;
    case 20:
      a = 1;
      break;
    case 24:
    case 25:
    case 26:
    case 27:
      if ((paramInt == 24) || (af[(paramInt - 1 - 24)] != 0)) {
        bq = null;
        System.gc();
        bq = new j();
        bq.a(false);
        d = false;
        bx = a6[0];
        bw = a6[1];
        a6[1].ae = -1;
        a6[0].a(0, v[0], 180, 2);
        a6[1].a(0, v[1], 180, 3);
        bw.ap = false;
        am = 0;
        an = 0;
        a4 = 0;
        aq = 0;
        ar = 1;
        ao = 1;
        ap = 2;
        as = 1;
        a6[0].ae = (39 + paramInt - 24);
        a = 1;
        au = 30;
      }
      else {
        a(bk[8], 0);
        g.a(0);
      }
      break;
    case 28:
    case 29:
    case 30:
    case 31:
      if ((paramInt == 28) || (af[(paramInt - 1 - 28)] != 0)) {
        bq = null;
        System.gc();
        bq = new j();
        bq.a(true);
        d = false;
        bw = a6[0];
        bx = a6[1];
        a6[0].a(0, v[1], 180, 3);
        a6[1].a(0, v[0], 180, 2);
        bx.ap = false;
        a6[1].ae = -1;
        c(bx);
        am = 0;
        an = 0;
        a4 = 0;
        ao = 0;
        ap = 1;
        aq = 1;
        ar = 2;
        as = 1;
        a6[0].ae = (35 + paramInt - 28);
        a = 1;
        au = 30;
      }
      else {
        a(bk[8], 0);
        g.a(0);
      }
      break;
    case 0:
    case 1:
    case 2:
    case 3:
      if ((paramInt == 0) || (af[(paramInt - 1)] != 0)) {
        a6[0].ae = (35 + paramInt);
        g.a(25);
      }
      else {
        a(bk[8], 0);
      }
      break;
    case 16:
    case 17:
    case 18:
    case 19:
      if ((paramInt - 16 == 0) || (af[(paramInt - 16 - 1)] != 0)) {
        a6[1].ae = (39 + paramInt - 16);
        a6[1].u = (paramInt - 16);
        a6[0].a(0, v[1], 180, 3);
        a6[1].a(0, v[0], 180, 2);
        as = 0;
        g.a(33);
      }
      else {
        a(bk[8], 0);
      }
      break;
    case 23:
      j = true;
      a = 1;
      au = 30;
      break;
    case 22:
      j = false;
      a = 1;
      au = 30;
      break;
    case 32:
      d();
      break;
    case 5:
      g.a(41);
      break;
    case 4:
      g.a(36);
      break;
    case 14:
      ba = null;
      bb = null;
      System.gc();
      a = 14;
      p = 0;
      q = -1;
    case 12:
    case 15:
    }
  }

  public void e() {
    if (b0 > 0) {
      b0 -= 1;
      return;
    }
    int i1 = i.a();
    if (cy >= 0) {
      switch (i1) {
      case 10:
        b(1);
        cz = 0;
        break;
      case 11:
        b(2);
        cz = 0;
        break;
      case 16:
        if (c7) {
          cy = -1;
          c();
        }
        else {
          b(2);
          cz = 0;
        }
        break;
      }
      return;
    }
    switch (a) {
    case 11:
      if (i1 == 16) {
        a = 2;
        h = false;
      }
      if (i1 == 15)
        a(bk[21], 0);
      break;
    case 12:
      if (i1 == 16) {
        a = 2;
        h = false;
      }
      if (i1 == 15) {
        at += 1;
        if (at == 3)
          at = 0;
        c();
      }
      break;
    case 8:
    case 9:
    case 10:
      if (i1 == 16) {
        a();
        return;
      }
      break;
    case 5:
      if (i1 != -66) {
        a = 7;
        a1 = Math.max(r, s) >> 1;
      }
      break;
    case 3:
      switch (i1) {
      case 15:
        h = false;
        a = 2;
        break;
      case 16:
        String str = bk[3] + dx[0].toString();
        str = str + bk[4];
        a(dx[1].toString(), str);
        h = false;
        a = 2;
      }
      if (i1 == -66)
        return;
      int i2 = 0;
      int i3 = 666;
      for (int i4 = 0; i4 != 10; i4++)
        if (i1 == i4) {
          i3 = i4;
          i2 = 1;
          break;
        }
      d3 = System.currentTimeMillis() - d4;
      d4 = System.currentTimeMillis();
      int i5 = 1050;
      if (i2 == 0)
        if (i1 == 19) {
          i3 = 19;
        }
        else {
          if ((i1 == 20) && (dw > 0)) {
            i(dw - 1);
            b1 = i3;
            return;
          }
          if ((i1 == 21) && (dw < 1)) {
            i(dw + 1);
            b1 = i3;
            return;
          }
        }
      if (i3 == 666)
        return;
      if ((dx[dw].length() >= d0[dw]) && ((i2 == 0) || (d3 >= i5) || (b1 != i3) || (d2[dw] == 0))) {
        if (i2 != 0)
          return;
        if (i1 != 19)
          return;
      }
      int i6 = d2[dw];
      if (i6 == 0) {
        if (i2 != 0) {
          dx[dw].append(i3);
          du += 1;
        }
        else if (i1 == 19) {
          du -= 1;
          if (du < 0)
            du = 0;
          else
            dx[dw].deleteCharAt(du);
        }
      }
      else if (i2 != 0) {
        if ((d3 < i5) && (b1 == i3)) {
          d6 = false;
          d5 = System.currentTimeMillis() + d7;
          du -= 1;
          dv += 1;
          if (dv >= d8[i3].length)
            dv = 0;
          dx[dw].setCharAt(du, d8[i3][dv]);
          du += 1;
        }
        else {
          dv = 0;
          dx[dw].append(d8[i3][dv]);
          du += 1;
        }
      }
      else if (i1 == 19) {
        du -= 1;
        if (du < 0)
          du = 0;
        else
          dx[dw].deleteCharAt(du);
      }
      b1 = i3;
      break;
    case 2:
      switch (i1) {
      case 10:
        g.b(0);
        break;
      case 11:
        g.b(1);
        break;
      case 14:
      case 15:
        g.b(2);
        break;
      case 16:
        if ((g.a != 66) && (g.a != 50))
          g.a(0);
        break;
      case 12:
      case 13:
      }
      c();
      break;
    case 1:
    case 4:
      if (i.c(10)) {
        if (f) {
          cq -= 1;
          if (cq < 0)
            cq = 2;
          b0 = 3;
          return;
        }
        a6[0].c();
      }
      if (i.c(11)) {
        if (f) {
          cq += 1;
          b0 = 3;
          if (cq == 3)
            cq = 0;
          return;
        }
        a6[0].d();
      }
      if (i.c(12)) {
        if (f) {
          switch (cq) {
          case 0:
            x -= 1;
            if (x < 0)
              x = 0;
            break;
          case 1:
            y -= 1;
            if (y < 0)
              y = 0;
            break;
          case 2:
            z -= 1;
            if (z < 0)
              z = 0;
            break;
          }
          return;
        }
        a6[0].b(2);
      }
      if (i.c(13)) {
        if (f) {
          switch (cq) {
          case 0:
            x += 1;
            break;
          case 1:
            y += 1;
            break;
          case 2:
            z += 1;
          }
          return;
        }
        a6[0].b(3);
      }
      if (i.c(14))
        a6[0].a();
      switch (i1) {
      case 17:
        a6[0].b();
        break;
      case 16:
        g.a(30);
        a = 2;
      }
      break;
    case 6:
    case 7:
    }
  }

  public void f() {
    if (this.b2 == null) {
      this.b2 = new Thread(this);
      this.b2.start();
    }
    b = false;
  }

  public void keyPressed(int paramInt) {
    i.a(paramInt);
  }

  public void keyReleased(int paramInt) {
    i.b(paramInt);
  }

  public void a(Graphics paramGraphics) {
    if (a6[0].v == 0) {
      ai = a6[0].d - (r >> 1);
      aj = a6[0].e - (s >> 1);
    }
    else {
      ai = (a6[0].w >> 6) - (r >> 1);
      aj = (a6[0].x >> 6) - (s >> 1);
    }
    ai = ai > ak ? ak : ai < 0 ? 0 : ai;
    aj = aj > al ? al : aj < 0 ? 0 : aj;
    int i1 = 124;
    paramGraphics.setColor(52479);
    paramGraphics.fillRect(0, 0, r, i1);
    paramGraphics.translate(-ai, -aj);
    int i2 = 0;
    while (i2 < 255) {
      paramGraphics.drawImage(ba, i2, i1, 20);
      paramGraphics.drawImage(bb, i2, 0, 20);
      i2 += 128;
    }
    int i3 = ay >> 6;
    paramGraphics.drawImage(a8[57], i3, az, 20);
    paramGraphics.drawImage(bd, i3 + cw, az + cx, 20);
    if (e) {
      ay += 16;
      if (i3 > 255) {
        ay = -3200;
        az = c(104);
      }
    }
    int i4 = 2;
    do {
      e locale1 = a6[i4];
      if (locale1.ap) {
        if ((as == 0) && (i4 == 1))
          locale1.e();
        locale1.a(paramGraphics, (e) && ((as == 0) || (i4 == 0)));
      }
      i4--;
    }
    while (i4 >= 0);
    paramGraphics.drawImage(a8[1], 109, 168, 20);
    int i6 = 2;
    do {
      int i5 = 0;
      paramGraphics.drawImage(a9[0], aa[i6], ab[i6], 3);
      if (as == 1) {
        if (((j.d) && (i6 < ap)) || ((!j.d) && (i6 >= ao)))
          i5 = 1;
      }
      else
        i5 = 1;
      if ((i5 != 0) && (e) && (c(3) == 0))
        if (ae[i6] != 0) {
          aa[i6] -= 2;
          if (aa[i6] < -32) {
            aa[i6] = 287;
            ab[i6] = c(104);
          }
        }
        else {
          aa[i6] += 2;
          if (aa[i6] > 287) {
            aa[i6] = -32;
            ab[i6] = c(104);
          }
        }
      i6--;
    }
    while (i6 >= 0);
    int i7 = 50;
    do {
      if (bu[i7].a != -1)
        bu[i7].a(paramGraphics);
      i7--;
    }
    while (i7 >= 0);
    paramGraphics.translate(ai, aj);
    if (s < 208) {
      int i8 = r * r / 255;
      int i9 = ai * i8 / ak;
      paramGraphics.setColor(6684672);
      paramGraphics.fillRect(0, s - 2, r, 2);
      paramGraphics.setColor(16711680);
      paramGraphics.fillRect(i9, s - 2, i8, 2);
    }
    if ((a == 1) && ((as == 0) || (d))) {
      e locale2;
      if (as == 0)
        locale2 = bx;
      else
        locale2 = a6[1];
      int i10 = locale2.d;
      int i11 = locale2.e;
      if (!a(i10 - 8, i11 - 8, 16, 16)) {
        e locale3 = locale2.ao;
        int i12 = b(locale3.d, locale3.e, i10, i11);
        int i13;
        if ((i12 >= 45) && (i12 < 135)) {
          i13 = i11 - aj;
          if (i13 < 4)
            i13 = 4;
          else if (i13 > s - 4)
            i13 = s - 4;
          paramGraphics.drawImage(a8[63], r, i13, 10);
        }
        else if ((i12 >= 135) && (i12 < 225)) {
          i13 = i10 - ai;
          if (i13 < 4)
            i13 = 4;
          else if (i13 > r - 4)
            i13 = r - 4;
          paramGraphics.drawImage(a8[61], i13, s, 33);
        }
        else if ((i12 >= 225) && (i12 < 315)) {
          i13 = i11 - aj;
          if (i13 < 4)
            i13 = 4;
          else if (i13 > s - 4)
            i13 = s - 4;
          paramGraphics.drawImage(a8[62], 0, i13, 6);
        }
        else if ((i12 > 315) || (i12 < 45)) {
          i13 = i10 - ai;
          if (i13 < 4)
            i13 = 4;
          else if (i13 > r - 4)
            i13 = r - 4;
          paramGraphics.drawImage(a8[60], i13, 0, 17);
        }
      }
    }
    if (aw > 0) {
      if ((i) && ((as == 0) || (d)))
        if (ax == 3)
          paramGraphics.drawImage(bc, 2, 2, 20);
        else
          paramGraphics.drawImage(bc, r - 2, 2, 24);
      aw -= 1;
      if (aw == 0)
        g();
    }
    if (au > 0) {
      a(paramGraphics, bk[38], false);
      au -= 1;
    }
  }

  public static boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramInt1 >= ai - paramInt3) && (paramInt1 <= ai + r) && (paramInt2 >= aj - paramInt4) && (paramInt2 <= aj + s);
  }

  public static void g() {
    if ((as == 0) && (!j)) {
      if (a6[0].m >= 10) {
        by = a6[0];
        bz = a6[1];
        l = false;
        m = false;
        int i1 = 0;
        n = by.at;
        a3 = a6[1].u;
        if (bz.m < ad[a3]) {
          ad[a3] = bz.m;
          i1 = 1;
        }
        if (by.af > ac[a3]) {
          ac[a3] = by.af;
          m = true;
        }
        if (n)
          ag[a3] = true;
        if ((a3 < 3) && (af[a3] == 0)) {
          j(a3);
          l = true;
        }
        if ((l) || (m) || (n) || (i1 != 0))
          c(false);
        g.a(0);
        a = 4;
        if (as == 1)
          bt = (byte)(bt + 128);
      }
      else if (a6[1].m >= 10) {
        g.a(0);
        a = 4;
        by = a6[1];
        bz = a6[0];
      }
    }
    else if (as == 1)
      if (a6[0].m >= 10) {
        by = a6[0];
        bz = a6[1];
        g.a(0);
        a = 4;
      }
      else if (a6[1].m >= 10) {
        bz = a6[0];
        by = a6[1];
        g.a(0);
        a = 4;
      }
    if (a == 4)
      a1 = Math.max(r, s) >> 1;
  }

  public static void b(e parame) {
    aw = 45;
    if ((!i) || ((as == 1) && (!d)) || (parame.ae == -1))
      return;
    av = parame.ae;
    ax = parame.i;
    int i1 = (av - 35) * 4;
    if (parame.m < parame.ao.m)
      i1 += 2;
    i1 += c(2);
    String[] arrayOfString = bm.a(bl[i1], t - 12 - 32);
    bg.setColor(16777215);
    bg.fillRect(4, 2, t - 8 + 1, u - 4);
    Image localImage = a8[av];
    if (ax == 3) {
      bg.drawImage(localImage, 4, 4, 20);
      bm.a(bg, arrayOfString, 40, 4, 20);
    }
    else {
      bg.drawImage(localImage, t - 4, 4, 24);
      bm.a(bg, arrayOfString, t - 8 - 32, 4, 24);
    }
  }

  public static void b(Graphics paramGraphics) {
    paramGraphics.setColor(52479);
    paramGraphics.fillRect(0, 0, r, s);
    bi.setColor(16751203);
    bi.fillRect(2, 2, 103, 78);
    bi.drawImage(a8[69], 0, 0, 20);
    bi.fillRect(11, 58, 77, 18);
    int i1 = 8;
    for (int i2 = 0; i2 < 4; i2++) {
      bi.setColor(b4[i2]);
      bi.fillRect(4, i1, 96, 13);
      Image localImage = a8[(47 + i2)];
      if ((i2 > 0) && (af[(i2 - 1)] == 0))
        localImage = a8[52];
      bi.drawImage(localImage, 7, i1 - 1, 20);
      bm.a(bi, ac[i2] + "%", 65, i1 + 7, 6);
      if (ad[i2] < 10)
        bm.a(bi, "10-" + ad[i2], 26, i1 + 7, 6);
      if (ag[i2] != 0)
        bi.drawImage(a8[71], 87, i1 - 1, 20);
      i1 += 17;
    }
    bi.drawImage(a8[70], 50, 8, 20);
    int i3 = r >> 1;
    int i4 = s >> 1;
    paramGraphics.drawImage(be, i3, i4, 3);
    bm.a(paramGraphics, bk[19], i3 - (be.getWidth() >> 1) + 8, i4 - (be.getHeight() >> 1) - 4, 20);
    a(paramGraphics, bk[7], false);
    a(paramGraphics, bk[20], true);
  }

  public static void c(Graphics paramGraphics) {
    paramGraphics.setColor(52479);
    paramGraphics.fillRect(0, 0, r, s);
    bj.setColor(15466636);
    bj.fillRect(0, 0, 128, 100);
    bj.setColor(16751203);
    bj.fillRect(2, 2, 124, 96);
    bj.setColor(16776960);
    bj.fillRect(57, 7, 12, 60);
    bj.fillRect(7, 34, 114, 12);
    if (at == 0)
      bj.fillRect(5, 68, 12, 10);
    if (at != 2)
      bj.fillRect(5, 80, 12, 10);
    String[] arrayOfString;
    switch (at) {
    case 0:
      bj.drawImage(a7[17], 63, 39, 3);
      bm.a(bj, bk[22], 62, 14, 3);
      bm.a(bj, bk[23], 62, 60, 3);
      arrayOfString = bm.a(bk[25], 46);
      bm.a(bj, arrayOfString, 4, 32, 20);
      arrayOfString = bm.a(bk[24], 46);
      bm.a(bj, arrayOfString, 124, 32, 24);
      bm.a(bj, "#", 11, 73, 3);
      bm.a(bj, "*", 11, 85, 3);
      bm.a(bj, bk[26], 20, 73, 6);
      bm.a(bj, bk[27], 20, 85, 6);
      bm.a(bj, bk[23], 62, 60, 3);
      break;
    case 1:
      bj.drawImage(a8[21], 63, 42, 3);
      bj.drawImage(a8[28], 63, 32, 3);
      arrayOfString = bm.a(bk[28], 46);
      bm.a(bj, arrayOfString, 4, 32, 20);
      arrayOfString = bm.a(bk[29], 46);
      bm.a(bj, arrayOfString, 124, 32, 24);
      bm.a(bj, "*", 11, 85, 3);
      bm.a(bj, bk[30], 20, 85, 6);
      break;
    case 2:
      bj.setClip(46, 40, 33, 16);
      bj.drawImage(ba, 0, 60, 36);
      bj.setClip(0, 0, 128, 100);
      bj.drawImage(a8[23], 63, 37, 3);
      arrayOfString = bm.a(bk[28], 46);
      bm.a(bj, arrayOfString, 4, 32, 20);
      arrayOfString = bm.a(bk[29], 46);
      bm.a(bj, arrayOfString, 124, 32, 24);
      bm.a(bj, bk[31], 5, 87, 6);
    }
    a(paramGraphics, bk[7], false);
    a(paramGraphics, bk[6], true);
    paramGraphics.drawImage(bf, r >> 1, s >> 1, 3);
  }

  public static void d(Graphics paramGraphics) {
    paramGraphics.setColor(52479);
    paramGraphics.fillRect(0, 0, r, s);
    bi.setColor(b3[(a - 8)]);
    bi.fillRect(2, 2, 103, 78);
    bi.drawImage(a8[69], 0, 0, 20);
    bi.setColor(16777215);
    bi.fillRect(13, 60, 62, 14);
    bi.drawImage(a8[(by.ae + 8)], 6, 6, 20);
    int i1 = bz.ae + 8;
    if (a == 10)
      i1 = 48 + a3;
    bi.drawImage(a8[i1], 85, 60, 20);
    bm.a(bi, bk[(12 + a - 8)], 41, 66, 3);
    String[] arrayOfString = bm.a(bk[(15 + a - 8)], 78);
    bm.a(bi, arrayOfString, 25, 6, 20);
    if (a == 9)
      bi.drawImage(a8[68], 6, 23, 20);
    paramGraphics.drawImage(be, r >> 1, s >> 1, 3);
    a(paramGraphics, bk[7], false);
  }

  public static void e(Graphics paramGraphics) {
    int i1 = 124;
    paramGraphics.setColor(52479);
    paramGraphics.fillRect(0, 0, r, i1);
    paramGraphics.translate(-ce, 0);
    int i2 = 0;
    while (i2 < 255 + ce) {
      paramGraphics.drawImage(ba, i2, i1, 20);
      paramGraphics.drawImage(bb, i2, 0, 20);
      i2 += 128;
    }
    paramGraphics.translate(ce, 0);
    ce += 2;
    if (ce > 128)
      ce = 0;
    int i3 = 3;
    do {
      b5[i3] -= 1 + i3;
      paramGraphics.drawImage(a9[0], b5[i3], b6[i3], 3);
      if (b5[i3] < -32) {
        i4 = s / 3;
        b6[i3] = (i4 * i3 + c(i4));
        b5[i3] = (r + 32);
      }
      i3--;
    }
    while (i3 >= 0);
    int i4 = b7 >> 6;
    int i5 = b9 >> 6;
    int i6 = b8 >> 6;
    int i7 = cb >> 6;
    paramGraphics.drawImage(a8[64], i4, 20, 10);
    paramGraphics.drawImage(cj, i4 - 25, 17, 10);
    int i8 = c(3);
    int i9 = ca >> 6;
    paramGraphics.drawImage(a8[64], i5, 80 + i8 + i9, 10);
    paramGraphics.drawImage(ck, i5 - 25, 77 + i8 + i9, 10);
    paramGraphics.drawImage(a8[(14 + c(3))], i5 - 56, 75 + i9, 3);
    paramGraphics.drawImage(a8[(14 + c(3))], i5 - 14, 85 + i9, 3);
    paramGraphics.drawImage(a8[(14 + c(3))], i5 - 38, 93 + i9, 3);
    if (cf - 32 - (cd >> 1) < r >> 1)
      cf = i6;
    paramGraphics.drawImage(a8[65], cf - 24, 50, 10);
    paramGraphics.drawImage(cl, cf - 32, 50, 10);
    paramGraphics.drawImage(a8[66], cf - 32 - cd, 50, 10);
    paramGraphics.drawImage(ch, i6, 50, 10);
    if (cg - 32 - (cd >> 1) < r >> 1)
      cg = i7;
    paramGraphics.drawImage(a8[65], cg - 24, 110, 10);
    paramGraphics.drawImage(cm, cg - 32, 110, 10);
    paramGraphics.drawImage(a8[66], cg - 32 - cd, 110, 10);
    paramGraphics.drawImage(ci, i7, 110, 10);
    cc += 1;
    if (cc > 350)
      a = 7;
    if ((cc > 0) && ((b7 >> 6 < (r >> 1) + (r >> 2)) || (cc > 300)))
      b7 += 50;
    if (cc > 70)
      b8 += 120;
    if (cc > 100) {
      if ((b9 >> 6 < (r >> 1) + (r >> 2)) || (cc > 300))
        b9 += 50;
      if (i5 > (r >> 1) + (r >> 2))
        ca += 60;
    }
    if (cc > 170)
      cb += 120;
  }

  public static void a(e parame1, e parame2) {
    a = 6;
    a1 = 0;
    b8 = b.b9 = b.cb = b.ca = b.cc = b.cf = b.cg = 0;
    b7 = 1024;
    if (parame1.i == 3)
      ch = a7[16];
    else
      ch = a8[67];
    if (parame2.i == 3)
      ci = a7[16];
    else
      ci = a8[67];
    cj = a8[(parame1.ae + 8)];
    ck = a8[(parame2.ae + 8)];
    cn.setColor(16514043);
    cn.fillRect(0, 0, cd, 15);
    cn.setColor(4671303);
    cn.drawLine(0, 0, cd, 0);
    cn.drawLine(0, 14, cd, 14);
    co.setColor(16514043);
    co.fillRect(0, 0, cd, 15);
    co.setColor(4671303);
    co.drawLine(0, 0, cd, 0);
    co.drawLine(0, 14, cd, 14);
    bm.a(cn, bk[11] + by.an, cd >> 1, 7, 3);
    bm.a(co, bk[11] + bz.an, cd >> 1, 7, 3);
    int i1 = 3;
    do {
      b5[i1] = c(r);
      int i2 = s / 3;
      b6[i1] = (i2 * i1 + c(i2));
      i1--;
    }
    while (i1 >= 0);
    if (as == 1) {
      bq.a();
      bp = "";
      o = 0;
      d = false;
    }
    a(4, 0);
  }

  public static void f(Graphics paramGraphics) {
    int i1 = 5;
    int i2 = 130;
    int i3 = 40;
    int i4 = 20;
    int i5 = 10;
    int i6 = 20;
    paramGraphics.setColor(3355545);
    paramGraphics.fillRect(i1 - i5, i3 - i5 - i6, r - (i1 << 1) + (i5 << 1), i4 * 3 + (i5 << 1) + i6);
    paramGraphics.setColor(16777215);
    String str1 = "MASTER";
    if (!j.d)
      str1 = "SLAVE";
    paramGraphics.drawString(str1, i1, i3 - i6, 20);
    for (int i7 = 0; i7 < 3; i7++) {
      if (i7 == cq)
        paramGraphics.fillRect(i1 - 10, i3 + i7 * i4, 8, 10);
      paramGraphics.drawString(cp[i7], i1, i3 + i7 * i4, 20);
      String str2 = "";
      switch (i7) {
      case 0:
        str2 = Integer.toString(x);
        break;
      case 1:
        str2 = Integer.toString(y);
        break;
      case 2:
        str2 = Integer.toString(z);
      }
      paramGraphics.drawString(str2, i2, i3 + i7 * i4, 20);
    }
  }

  public static void c(e parame) {
    if (a == 4)
      return;
    int i1 = ct;
    if (parame.i == 2)
      i1 = cv;
    bh.setColor(15131619);
    bh.fillRect(i1, cu, cr, cs);
    bh.setColor(16777215);
    bh.fillRect(i1, cu + cs, cr, cs);
    c localc = bn;
    if (parame == bw)
      localc = bo;
    String str = Integer.toString(parame.m);
    if (str.length() == 1)
      str = "0" + str;
    localc.a(bh, str, i1 + 2, cu, 20);
    a0 = 30;
  }

  public static void a(Graphics paramGraphics, String paramString, boolean paramBoolean) {
    int i1 = bm.a(paramString) + 4;
    int i2 = bm.a + 4;
    int i3 = 0;
    if (!paramBoolean)
      i3 = r - i1;
    paramGraphics.setColor(6488245);
    paramGraphics.fillRect(i3, s - i2, i1, i2);
    paramGraphics.setColor(16776960);
    paramGraphics.fillRect(i3 + 1, s - i2 + 1, i1 - 2, i2 - 2);
    bm.a(paramGraphics, paramString, i3 + 2, s - i2 + 2, 20);
  }

  public void paint(Graphics paramGraphics) {
    try {
      if (cy >= 0) {
        g(paramGraphics);
        String str1 = bk[6];
        if (c7)
          str1 = bk[7];
        a(paramGraphics, str1, false);
        return;
      }
      int i3;
      int i4;
      switch (a) {
      case 14:
        if (q == -1) {
          paramGraphics.setColor(39663);
          paramGraphics.fillRect(0, 0, r, s);
          bm.a(paramGraphics, bk[45], r >> 1, s >> 1, 3);
        }
        else {
          ba = Image.createImage("/ad" + q + ".png");
          paramGraphics.drawImage(ba, 0, 0, 20);
        }
        break;
      case 13:
        int i1 = bm.a + 2;
        int i2 = s - (i1 << 2) >> 1;
        paramGraphics.setColor(39663);
        paramGraphics.fillRect(0, 0, r, s);
        bm.a(paramGraphics, bk[32], r >> 1, i2, 17);
        bm.a(paramGraphics, bk[33], r >> 1, i2 + i1, 17);
        bm.a(paramGraphics, bk[34], r >> 1, i2 + (i1 << 1), 17);
        bm.a(paramGraphics, bk[35], r >> 1, i2 + i1 * 3, 17);
        paramGraphics.drawImage(a7[1], r - 4, s + 2, 40);
        break;
      case 12:
        c(paramGraphics);
        break;
      case 11:
        b(paramGraphics);
        break;
      case 8:
      case 9:
      case 10:
        d(paramGraphics);
        break;
      case 5:
        e(paramGraphics);
        break;
      case 0:
        paramGraphics.drawImage(a8[0], 0, 0, 20);
        break;
      case 3:
        break;
      case 2:
        if (!h) {
          e = false;
          a(paramGraphics);
          h = true;
        }
        g.a(paramGraphics, r, s, r, 1, 2, 4, (g.a == 14) || (g.a == 60) || (g.a == 92) || (g.a == 82) ? 16 : bm.a + 4, bm);
        if ((g.a != 66) && (g.a != 50))
          a(paramGraphics, bk[1], false);
        a(paramGraphics, bk[39], true);
        break;
      case 4:
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 0, r, s);
        i3 = bw.d - ai;
        i4 = bw.e - aj;
        paramGraphics.setClip(i3 - a1, i4 - a1, a1 << 1, a1 << 1);
        a1 -= 8;
        if (a1 <= 0)
          a(by, bz);
        a(paramGraphics);
        break;
      case 6:
      case 7:
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 0, r, s);
        i3 = r >> 1;
        i4 = s >> 1;
        paramGraphics.setClip(i3 - a1, i4 - a1, a1 << 1, a1 << 1);
        e(paramGraphics);
        if (a == 6) {
          a1 += 8;
          if (a1 > r << 1)
            a = 5;
        }
        else {
          a1 -= 8;
          if (a1 < 0) {
            a();
            c();
          }
        }
        break;
      case 1:
        a(paramGraphics);
        if (f)
          f(paramGraphics);
        if (a0 > 0) {
          a0 -= 1;
          String str2 = bw.m + " - " + bx.m;
          bm.a(paramGraphics, str2, r >> 1, s >> 1, 3);
        }
        break;
      }
      if ((!d) && (a == 1))
        bm.a(paramGraphics, bp, r >> 1, 0, 17);
    }
    catch (Exception localException) {
      localException.printStackTrace();
    }
  }

  public static void a(String paramString, int paramInt) {
    cy = paramInt;
    if (c2 == paramString) {
      if (paramInt >= 0)
        cz = 0;
      else
        cz = 2;
      c8 = 0;
      return;
    }
    c2 = paramString;
    int i1 = bm.a(paramString);
    if (i1 > 94) {
      a(paramString, 94, 58);
      c0 = 100;
    }
    else {
      c0 = i1 + 4 + 2;
      a(paramString, i1, 58);
    }
    c1 = c4 + 4 + 2;
    cz = 2;
  }

  public static void g(Graphics paramGraphics) {
    if (cz > -1) {
      int i1 = h() != 0 ? 1 : 0;
      int i2 = c0;
      int i3 = c1;
      i2 >>= cz;
      i3 >>= cz;
      int i4 = r - i2 >> 1;
      int i5;
      if (al - aj < c1)
        i5 = (s >> 1) - i3 + bm.a + 8;
      else
        i5 = s - i3 - bm.a - 8;
      paramGraphics.setColor(6724044);
      int i6 = i2;
      if (i1 != 0)
        i6 += 9;
      paramGraphics.fillRect(i4, i5, i6, i3 + 1);
      i4++;
      i5++;
      paramGraphics.setColor(6488245);
      int i7 = i4 + i2 - 2;
      int i8 = i3 - 2;
      paramGraphics.drawRect(i4, i5, i7 - i4, i8);
      if (i1 != 0)
        paramGraphics.drawRect(i7, i5, 8, i8);
      if (cz == 0) {
        i4 += 2;
        i5 += 2;
        a(paramGraphics, i4, i5);
        paramGraphics.setColor(16777215);
        int i9 = i4 + i2 - 2;
        if ((h() & 0x1) != 0)
          paramGraphics.drawImage(a8[58], i9, i5, 20);
        if ((h() & 0x2) != 0)
          paramGraphics.drawImage(a8[59], i9, i5 + i3 - 1 - 2 - 5, 20);
      }
      cz -= 1;
    }
  }

  public void showNotify() {
    i.b();
    if (a == 1) {
      g.a(30);
      a = 2;
      h = false;
      g.h = 2;
    }
    g.h = 2;
  }

  public static void a(String paramString, int paramInt1, int paramInt2) {
    c8 = 0;
    c3 = paramInt1;
    c4 = paramInt2;
    db = 0;
    int i1 = 40;
    char[] arrayOfChar = paramString.toCharArray();
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    while (i7 == 0) {
      c10 = arrayOfChar[i2];
      if (c10 == ' ') {
        i5 += bm.b;
        i3 = i2;
        i6 = 0;
      }
      else if (c10 == '\n') {
        i8 = 1;
        i3 = i2;
        i6 = 0;
      }
      else {
        i9 = bm.a(c10) + 0;
        i6 += i9;
        i5 += i9;
        if (i5 > paramInt1)
          i8 = 1;
      }
      if (i2 == arrayOfChar.length - 1) {
        i3 = i2 + 1;
        i8 = 1;
        i7 = 1;
        if (i4 > i2);
      }
      else if (i8 != 0) {
        i9 = i3 <= i4 ? 1 : 0;
        if (i9 != 0)
          i3 = i2;
        dd[db] = new String(arrayOfChar, i4, i3 - i4);
        if (i9 != 0) {
          i4 = i3;
          i5 = 0;
        }
        else {
          i4 = i3 + 1;
          i5 = i6;
        }
        i8 = 0;
        db += 1;
      }
      i2++;
    }
    c9 = new int[12];
    char c10 = '\000';
    int i9 = 0;
    c5 = 0;
    int i10 = 0;
    int i11 = 0;
    while (i10 < db) {
      String str = dd[i10];
      int i12 = 0;
      i12 = bm.a + 1;
      if (i12 + i11 > c4)
        i9 = 1;
      i11 += i12;
      if (((i9 != 0) || (i10 == db - 1)) && (i11 > c5))
        c5 = i11;
      if (i9 != 0) {
        c9[(c10++)] = i10;
        i11 = i12;
        i9 = 0;
      }
      i10++;
    }
    da = c10;
    c9[(c10++)] = db;
    if (da > 0)
      c5 -= bm.a + 1;
    c4 = c5;
    c7 = da == 0;
  }

  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    c6 = true;
    int i1 = 0;
    int i2 = 0;
    while (true) {
      if (i1 == c9[i2]) {
        i2++;
        if (i2 > c8)
          break;
      }
      String str = dd[i1];
      if (i2 == c8) {
        bm.a(paramGraphics, str, paramInt1, paramInt2, 20);
        paramInt2 += bm.a + 1;
      }
      i1++;
    }
  }

  public static void b(int paramInt) {
    if (paramInt == 2) {
      if (c8 < da)
        c8 += 1;
      if (c8 == da)
        c7 = true;
    }
    else if ((paramInt == 1) && (c8 > 0)) {
      c8 -= 1;
    }
    c6 = false;
  }

  public static int h() {
    int i1 = 0;
    if (c8 > 0)
      i1 |= 1;
    if (c8 < da)
      i1 |= 2;
    return i1;
  }

  public static int c(int paramInt) {
    return Math.abs(w.nextInt() % paramInt);
  }

  public static void i()
    throws IOException {
    a5.readFully(de);
    a5.readFully(dh);
    a5.readFully(di);
    df = new byte[(a5.readShort() & 0xFFFF) + 13];
    a5.readFully(df);
    a5.readFully(dg);
  }

  public static byte[] j()
    throws IOException {
    int i1 = a5.readShort() & 0xFFFF;
    byte[] arrayOfByte1 = new byte[i1];
    a5.readFully(arrayOfByte1);
    int i2 = df.length;
    byte[] arrayOfByte2 = new byte[33 + df.length + i1 + 12 + 12];
    int i3 = 0;
    System.arraycopy(de, 0, arrayOfByte2, i3, 8);
    i3 = 8;
    i3 += 3;
    System.arraycopy(dh, 0, arrayOfByte2, i3, 15);
    i3 = 8;
    i3 += 10;
    arrayOfByte2[(i3++)] = a5.readByte();
    arrayOfByte2[(i3++)] = a5.readByte();
    i3 += 2;
    arrayOfByte2[(i3++)] = a5.readByte();
    arrayOfByte2[(i3++)] = a5.readByte();
    a(arrayOfByte2, 12, 17);
    i3 = 33;
    System.arraycopy(df, 0, arrayOfByte2, i3, i2);
    i3 += i2;
    i3 += 2;
    arrayOfByte2[(i3++)] = ((byte)(i1 >> 8));
    arrayOfByte2[(i3++)] = ((byte)i1);
    System.arraycopy(di, 0, arrayOfByte2, i3, 4);
    i3 += 4;
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, i3, i1);
    a(arrayOfByte2, i3 - 4, i1 + 4);
    i3 += i1 + 4;
    System.arraycopy(dg, 0, arrayOfByte2, i3, 12);
    return arrayOfByte2;
  }

  public static Image[] d(int paramInt)
    throws IOException {
    Image[] arrayOfImage = new Image[paramInt];
    for (int i1 = 0; i1 < paramInt; i1++)
      arrayOfImage[i1] = k();
    return arrayOfImage;
  }

  public static Image k()
    throws IOException {
    byte[] arrayOfByte = j();
    Image localImage = Image.createImage(arrayOfByte, 0, arrayOfByte.length);
    return localImage;
  }

  public static Image[] e(int paramInt)
    throws IOException {
    Image[] arrayOfImage = new Image[paramInt];
    for (int i1 = 0; i1 < paramInt; i1++)
      arrayOfImage[i1] = l();
    return arrayOfImage;
  }

  public static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2) {
    long l1 = 4294967295L;
    if (!dk) {
      int i2 = 256;
      do {
        long l2 = i2;
        for (int i3 = 0; i3 < 8; i3++)
          if ((l2 & 1L) != 0L)
            l2 = 0xEDB88320 ^ l2 >> 1;
          else
            l2 >>= 1;
        dj[i2] = ((int)l2);
        i2--;
      }
      while (i2 >= 0);
      dk = true;
    }
    for (int i1 = 0; i1 < paramInt2; i1++)
      l1 = dj[((int)((l1 ^ paramArrayOfByte[(paramInt1 + i1)] & 0xFF) & 0xFF))] & 0xFFFFFFFF ^ l1 >> 8;
    l1 ^= 4294967295L;
    paramInt1 += paramInt2;
    paramArrayOfByte[paramInt1] = ((byte)(int)(l1 >> 24));
    paramArrayOfByte[(paramInt1 + 1)] = ((byte)(int)(l1 >> 16));
    paramArrayOfByte[(paramInt1 + 2)] = ((byte)(int)(l1 >> 8));
    paramArrayOfByte[(paramInt1 + 3)] = ((byte)(int)l1);
  }

  public static String[] b(String paramString)
    throws IOException {
    DataInputStream localDataInputStream = new DataInputStream(paramString.getClass().getResourceAsStream(paramString));
    int i1 = localDataInputStream.readInt();
    String[] arrayOfString = new String[i1];
    for (int i2 = 0; i2 < i1; i2++)
      arrayOfString[i2] = localDataInputStream.readUTF();
    return arrayOfString;
  }

  public static Image l() {
    try {
      int i1 = a5.readInt();
      byte[] arrayOfByte = new byte[i1];
      a5.readFully(arrayOfByte);
      return Image.createImage(arrayOfByte, 0, i1);
    }
    catch (Exception localException) {
      localException.printStackTrace();
    }
    return null;
  }

  public static byte[] m() {
    try {
      int i1 = a5.readInt();
      byte[] arrayOfByte = new byte[i1];
      a5.readFully(arrayOfByte);
      return arrayOfByte;
    }
    catch (Exception localException) {
      localException.printStackTrace();
    }
    return null;
  }

  public static int f(int paramInt) {
    try {
      paramInt = g(paramInt + 90);
      return h(paramInt);
    }
    catch (Exception localException) {
      System.out.println("cos: " + localException);
    }
    return 0;
  }

  public static int g(int paramInt) {
    if (paramInt < 0)
      return 360 + paramInt;
    if (paramInt > 359)
      return paramInt - 360;
    return paramInt;
  }

  public static int h(int paramInt) {
    try {
      if (paramInt < 90)
        return dl[paramInt];
      if (paramInt == 90)
        return 128;
      if (paramInt < 180)
        return dl[(180 - paramInt)];
      if (paramInt == 180)
        return 0;
      if (paramInt < 270)
        return -dl[(paramInt - 180)];
      if (paramInt == 270)
        return -128;
      if (paramInt < 360)
        return -dl[(360 - paramInt)];
      return 1;
    }
    catch (Exception localException) {
      System.out.println("sin: " + localException);
    }
    return 1;
  }

  public static int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i1 = 1;
    int i2 = 1;
    int i3 = paramInt1 - paramInt3;
    int i4 = paramInt2 - paramInt4;
    if (i4 < 0)
      i2 = 0;
    if (i3 < 0)
      i1 = 0;
    if (i3 == 0)
      return i4 >= 0 ? 0 : 180;
    if (i4 == 0)
      return i3 >= 0 ? 270 : 90;
    i3 = Math.abs(i3);
    i4 = Math.abs(i4);
    int i5 = i3 + i4;
    i3 = i3 * 10 / i5;
    i4 = i4 * 10 / i5;
    if ((i1 == 0) && (i2 != 0))
      return dm[i3][i4];
    if ((i1 == 0) && (i2 == 0))
      return 90 + dm[i4][i3];
    if ((i1 != 0) && (i2 == 0))
      return 180 + dm[i3][i4];
    if ((i1 != 0) && (i2 != 0))
      return 270 + dm[i4][i3];
    return -1;
  }

  public static int b(int paramInt1, int paramInt2) {
    if (Math.abs(paramInt1 - paramInt2) <= e.a0)
      return 0;
    if (paramInt2 >= paramInt1) {
      i1 = paramInt2 - paramInt1;
      i2 = 360 - paramInt2 + paramInt1;
      if (i1 <= i2)
        return 3;
      return 2;
    }
    int i1 = paramInt1 - paramInt2;
    int i2 = 360 - paramInt1 + paramInt2;
    if (i1 <= i2)
      return 2;
    return 3;
  }

  public void a(String paramString1, String paramString2) {
  }

  public static void i(int paramInt) {
    du = dx[paramInt].length();
    dv = 0;
    d6 = true;
    d5 = System.currentTimeMillis() + d7;
    dw = paramInt;
    du = dx[dw].length();
    dv = 0;
  }
}

/* Location:           /Users/ilya/4fun/Biplanes/Bluetooth_Biplanes.jar
 * Qualified Name:     b
 * JD-Core Version:    0.6.2
 */