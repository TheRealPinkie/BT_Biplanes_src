import java.applet.Applet;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Canvas;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.awt.Color;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class b extends Applet implements Runnable {
	private static final long serialVersionUID = 1L;

   public void start() {
       if (this.b2 == null) {
           this.b2 = new Thread(this);
           this.b2.start();
       }
       bbb = false;
   }
   
   public static int aaa;
   public static boolean bbb;
   public static boolean ccc;
   public static boolean ddd;
   public static boolean ee;
   public static boolean ff;
   public static boolean gg;
   public static boolean hh;
   public static boolean ii;
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
 //public static j bq;
   public static byte[] br;
   public static byte[] bs;
   public static byte bt;
   public static d[] bu;
   //public static BluetoothBiplanes bv;
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

   //public b(BluetoothBiplanes var1) {
   public b() {
   //   bv = var1;
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
       dx[0] = new StringBuffer();
       dx[1] = new StringBuffer();
       b1 = 666;
       br = new byte[18];
       w = new Random();
//     bq.a();
       bp = "";
       gg = true;
       o();
       c();
       ii = true;
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
           locale1.bb = (locale1.d << 6);
           locale1.c = (locale1.e << 6);
           locale1.f = br[(i1++)];
           locale2.p = br[(i1++)];
           int i2 = 2;
           do {
               i2--;
               f localf = locale1.av[i2];
               localf.a = (br[(i1++)] & 0xFF);
               localf.bb = (br[(i1++)] & 0xFF);
           }
           while (i2 > 0);
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
       ddd = paramBoolean;
       if (ddd) {
           a6[1].ap = true;
           if (a6[0] == bx)
               o = 1;
           else
               o = 2;
       }
       else {
           bp = bk[44];
       }
       return ddd;
   }

   public void a() {
       switch (aaa) {
       case 7:
           if ((as == 1) || (by != bw)) {
               aaa = 2;
               return;
           }
           aaa = 8;
           if (!m)
               a();
           break;
       case 8:
           aaa = 9;
           if (!n)
               a();
           break;
       case 9:
           aaa = 10;
           if (!l)
               a();
           break;
       case 10:
           aaa = 2;
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
               i1--;
               if (af[i1] == false) {
                   g.g[(4 + i1)] = bk[5];
                   g.g[(27 + i1)] = bk[5];
                   g.g[(38 + i1)] = bk[5];
                   g.g[(43 + i1)] = bk[5];
               }
           }
           while (i1 > 0);
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
           for (int i1 = 0; i1 < 4; i1++)
               ad[i1] = 10;
           ag = new boolean[4];
           af = new boolean[3];
           gg = true;
           ii = true;
           if (!b())
               c(true);
           cd = bm.a(bk[11] + " 100% ");
           BufferedImage buf = new BufferedImage(cd, 15, BufferedImage.TYPE_INT_ARGB);
           cl = (Image) buf;
           buf = new BufferedImage(cd, 15, BufferedImage.TYPE_INT_ARGB);
           cm = (Image) buf;
           cn = cl.getGraphics();
           co = cm.getGraphics();
           n();
           ak = 255 - r;
           al = 208 - s;
           bu = new d[50];
           int i2 = 50;
           do {
               i2--;
               bu[i2] = new d();
           }
           while (i2 > 0);
           aa = new int[2];
           ab = new int[2];
           ae = new boolean[2];
           int i3 = 2;
           do {
               i3--;
               aa[i3] = c(255);
               ab[i3] = c(104);
               ae[i3] = (c(2) == 0 ? true : false);
           }
           while (i3 > 0);
           ay = c(255) << 6;
           az = c(104);
           a6 = new e[2];
           int i4 = 2;
           do {
               i4--;
               a6[i4] = new e(i4 == 0);
           }
           while (i4 > 0);
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
           t = localImage.getWidth(null);
           u = localImage.getHeight(null);
           buf = new BufferedImage(t, u, BufferedImage.TYPE_INT_ARGB);
           bc = (Image) buf;
           bg = bc.getGraphics();
           bg.drawImage(localImage, 0, 0, new Color(20), null);
           buf = new BufferedImage(26, 9, BufferedImage.TYPE_INT_ARGB);
           bd = (Image) buf;
           bh = bd.getGraphics();
           a8 = d(72);
           a9 = e(1);
           int i5 = a8[69].getWidth(null);
           int i6 = a8[69].getHeight(null);
           buf = new BufferedImage(i5, i6, BufferedImage.TYPE_INT_ARGB);
           be = (Image) buf;
           bi = be.getGraphics();
           buf = new BufferedImage(128, 100, BufferedImage.TYPE_INT_ARGB);
           bf = (Image) buf;
           bj = bf.getGraphics();
           h.a(a5);
           a5.close();
           a5 = null;
           System.gc();
           cy = -1;
           aaa = 13;
       }
       catch (Exception localException) {
           localException.printStackTrace();
       }
   }

   public static void c(boolean paramBoolean) {
       try {
           k = true;
//         RecordStore var1 = RecordStore.openRecordStore("s", true);
//         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
//         DataOutputStream var3 = new DataOutputStream(var2);
//         if(var1.getSizeAvailable() >= 600) {
//            for(int var4 = 0; var4 < 3; ++var4) {
//               var3.writeBoolean(af[var4]);
//            }
//
//            for(int var5 = 0; var5 < 4; ++var5) {
//               var3.writeByte((byte)ac[var5]);
//               var3.writeBoolean(ag[var5]);
//               var3.writeByte((byte)ad[var5]);
//            }
//
//            var3.writeBoolean(gg);
//            var3.writeBoolean(i);
//            byte[] var6 = var2.toByteArray();
//            if(var0) {
//               var1.addRecord(var6, 0, var6.length);
//            } else {
//               var1.setRecord(1, var6, 0, var6.length);
//            }
//
//            k = false;
//         }
//
//         var1.closeRecordStore();
//         var3.close();
//         var2.close();
       }
       catch (Exception localException) {
           localException.printStackTrace();
           k = true;
       }
   }

   public static boolean b() {
       try {
           System.gc();
//         RecordStore var0 = RecordStore.openRecordStore("s", true);
//         if(var0.getNumRecords() > 0) {
//            byte[] var1 = var0.getRecord(1);
//            ByteArrayInputStream var2 = new ByteArrayInputStream(var1);
//            DataInputStream var3 = new DataInputStream(var2);
//
//            for(int var4 = 0; var4 < 3; ++var4) {
//               af[var4] = var3.readBoolean();
//            }
//
//            for(int var5 = 0; var5 < 4; ++var5) {
//               ac[var5] = var3.readByte();
//               ag[var5] = var3.readBoolean();
//               ad[var5] = var3.readByte();
//            }
//
//            gg = var3.readBoolean();
//            ii = var3.readBoolean();
//            var0.closeRecordStore();
//            var3.close();
//            var2.close();
//            return true;
//         }
//
//         var0.closeRecordStore();
       }
       catch (Exception localException) {
       }
       return false;
   }

   public static void a(int paramInt1, int paramInt2) {
       try {
           if (gg)
               h.a(paramInt1, paramInt2);
       }
       catch (Exception localException) {
           localException.printStackTrace();
       }
   }

   public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
       int i4 = 50;
       do {
           i4--;
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
       }
       while (i4 > 0);
   }

   public static void a(e parame) {
       if (as == 1) {
//         if(j.d) {
//         var0.b(0, v[1], 180, 3);
//      } else {
//         var0.b(0, v[0], 180, 2);
//      }
       }
       else if (as == 0)
           if (parame == a6[0])
               parame.b(0, v[1], 180, 3);
           else
               parame.b(0, v[0], 180, 2);
   }

   public void run() {
       ccc = false;
       while (!ccc) {
           try {
               long l1 = System.currentTimeMillis() - ah;
               long l2 = x - l1;
               if (l2 > y)
                   Thread.sleep(l2);
               ah = System.currentTimeMillis();
               e();
               System.out.println(aaa);
               if (cy >= 0)
                   c();
               else
                   switch (aaa) {
                   case 14:
                       p += 1;
                       if (p == 50) {
                           p = 0;
                           q += 1;
                           if (q == 3) {
//                               int qwe = 1/0;
//                             bv.destroyApp(true);
//                             bv.notifyDestroyed();
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
                           aaa = 2;
                       break;
                   case 13:
                       if (a2 == 0)
                           a(0, 1);
                       if (++a2 > 120) {
                           a2 = 0;
                           aaa = 0;
                           c();
                       }
                       break;
                   case 3:
                       c();
                       break;
                   case 1:
                   case 4:
                       if (as == 0)
                           ee = true;
                       else if (as == 1)
                           ee = (!ddd) || (am - an < 2);
                       if (!ee) {
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
                       if ((ee) && (ddd) && (as == 1)) {
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
                               i3--;
                               br[(i1++)] = ((byte)locale.av[i3].a);
                               br[(i1++)] = ((byte)locale.av[i3].bb);
                           }
                           while (i3 > 0);
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
//                         bq.c.writeInt(am);
//                         bq.c.write(br);
//                         bq.c.flush();
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
       repaint();
       //Thread.yield();
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
       aaa = 1;
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
           aaa = 11;
           break;
       case 21:
           if (as == 1) {
               bp = "";
               o = 0;
               ddd = false;
           }
           break;
       case 13:
           aaa = 12;
           at = 0;
           break;
       case 8:
           ii = true;
           c(false);
           break;
       case 9:
           ii = false;
           c(false);
           break;
       case 10:
           gg = true;
           c(false);
           break;
       case 11:
           gg = false;
           c(false);
           break;
       case 20:
           aaa = 1;
           break;
       case 24:
       case 25:
       case 26:
       case 27:
           if ((paramInt == 24) || (af[(paramInt - 1 - 24)] != false)) {
//             bq = null;
               System.gc();
//               bq = new j();
//               bq.a(false);
               ddd = false;
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
               aaa = 1;
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
           if ((paramInt == 28) || (af[(paramInt - 1 - 28)] != false)) {
//             bq = null;
               System.gc();
//               bq = new j();
//               bq.a(true);
//               d = false;
               ddd = false;
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
               aaa = 1;
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
           if ((paramInt == 0) || (af[(paramInt - 1)] != false)) {
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
           if ((paramInt - 16 == 0) || (af[(paramInt - 16 - 1)] != false)) {
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
           aaa = 1;
           au = 30;
           break;
       case 22:
           j = false;
           aaa = 1;
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
           aaa = 14;
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
       switch (aaa) {
       case 11:
           if (i1 == 16) {
               aaa = 2;
               hh = false;
           }
           if (i1 == 15)
               a(bk[21], 0);
           break;
       case 12:
           if (i1 == 16) {
               aaa = 2;
               hh = false;
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
               aaa = 7;
               a1 = Math.max(r, s) >> 1;
           }
           break;
       case 3:
           switch (i1) {
           case 15:
               hh = false;
               aaa = 2;
               break;
           case 16:
               String str = bk[3] + dx[0].toString();
               str = str + bk[4];
               a(dx[1].toString(), str);
               hh = false;
               aaa = 2;
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
               if (ff) {
                   cq -= 1;
                   if (cq < 0)
                       cq = 2;
                   b0 = 3;
                   return;
               }
               a6[0].c();
           }
           if (i.c(11)) {
               if (ff) {
                   cq += 1;
                   b0 = 3;
                   if (cq == 3)
                       cq = 0;
                   return;
               }
               a6[0].d();
           }
           if (i.c(12)) {
               if (ff) {
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
               if (ff) {
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
               aaa = 2;
           }
           break;
       case 6:
       case 7:
       }
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
       paramGraphics.setColor(new Color(52479));
       paramGraphics.fillRect(0, 0, r, i1);
       paramGraphics.translate(-ai, -aj);
       int i2 = 0;
       while (i2 < 255) {
           paramGraphics.drawImage(ba, i2, i1, new Color(20), null);
           paramGraphics.drawImage(bb, i2, 0, new Color(20), null);
           i2 += 128;
       }
       int i3 = ay >> 6;
       paramGraphics.drawImage(a8[57], i3, az, new Color(20), null);
       paramGraphics.drawImage(bd, i3 + cw, az + cx, new Color(20), null);
       if (ee) {
           ay += 16;
           if (i3 > 255) {
               ay = -3200;
               az = c(104);
           }
       }
       int i4 = 2;
       do {
           i4--;
           e locale1 = a6[i4];
           if (locale1.ap) {
               if ((as == 0) && (i4 == 1))
                   locale1.e();
               locale1.a(paramGraphics, (ee) && ((as == 0) || (i4 == 0)));
           }
       }
       while (i4 > 0);
       paramGraphics.drawImage(a8[1], 109, 168, new Color(20), null);
       int i6 = 2;
       do {
           i6--;
           int i5 = 0;
           paramGraphics.drawImage(a9[0], aa[i6], ab[i6], new Color(3), null);
           if (as == 1) {
//             if(j.d && var7 < ap || !j.d && var7 >= ao) {
//             var15 = true;
//          }
           }
           else
               i5 = 1;
           if ((i5 != 0) && (ee) && (c(3) == 0))
               if (ae[i6] != false) {
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
       }
       while (i6 > 0);
       int i7 = 50;
       do {
           i7--;
           if (bu[i7].a != -1)
               bu[i7].a(paramGraphics);
       }
       while (i7 > 0);
       paramGraphics.translate(ai, aj);
       if (s < 208) {
           int i8 = r * r / 255;
           int i9 = ai * i8 / ak;
           paramGraphics.setColor(new Color(6684672));
           paramGraphics.fillRect(0, s - 2, r, 2);
           paramGraphics.setColor(new Color(16711680));
           paramGraphics.fillRect(i9, s - 2, i8, 2);
       }
       if ((aaa == 1) && ((as == 0) || (ddd))) {
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
                   paramGraphics.drawImage(a8[63], r, i13, new Color(10), null);
               }
               else if ((i12 >= 135) && (i12 < 225)) {
                   i13 = i10 - ai;
                   if (i13 < 4)
                       i13 = 4;
                   else if (i13 > r - 4)
                       i13 = r - 4;
                   paramGraphics.drawImage(a8[61], i13, s, new Color(33), null);
               }
               else if ((i12 >= 225) && (i12 < 315)) {
                   i13 = i11 - aj;
                   if (i13 < 4)
                       i13 = 4;
                   else if (i13 > s - 4)
                       i13 = s - 4;
                   paramGraphics.drawImage(a8[62], 0, i13, new Color(6), null);
               }
               else if ((i12 > 315) || (i12 < 45)) {
                   i13 = i10 - ai;
                   if (i13 < 4)
                       i13 = 4;
                   else if (i13 > r - 4)
                       i13 = r - 4;
                   paramGraphics.drawImage(a8[60], i13, 0, new Color(17), null);
               }
           }
       }
       if (aw > 0) {
           if ((ii) && ((as == 0) || (ddd)))
               if (ax == 3)
                   paramGraphics.drawImage(bc, 2, 2, new Color(20), null);
               else
                   paramGraphics.drawImage(bc, r - 2, 2, new Color(24), null);
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
               if ((a3 < 3) && (af[a3] == false)) {
                   j(a3);
                   l = true;
               }
               if ((l) || (m) || (n) || (i1 != 0))
                   c(false);
               g.a(0);
               aaa = 4;
               if (as == 1)
                   bt = (byte)(bt + 128);
           }
           else if (a6[1].m >= 10) {
               g.a(0);
               aaa = 4;
               by = a6[1];
               bz = a6[0];
           }
       }
       else if (as == 1)
           if (a6[0].m >= 10) {
               by = a6[0];
               bz = a6[1];
               g.a(0);
               aaa = 4;
           }
           else if (a6[1].m >= 10) {
               bz = a6[0];
               by = a6[1];
               g.a(0);
               aaa = 4;
           }
       if (aaa == 4)
           a1 = Math.max(r, s) >> 1;
   }

   public static void b(e parame) {
       aw = 45;
       if ((!ii) || ((as == 1) && (!ddd)) || (parame.ae == -1))
           return;
       av = parame.ae;
       ax = parame.i;
       int i1 = (av - 35) * 4;
       if (parame.m < parame.ao.m)
           i1 += 2;
       i1 += c(2);
       String[] arrayOfString = bm.a(bl[i1], t - 12 - 32);
       bg.setColor(new Color(16777215));
       bg.fillRect(4, 2, t - 8 + 1, u - 4);
       Image localImage = a8[av];
       if (ax == 3) {
           bg.drawImage(localImage, 4, 4, new Color(20), null);
           bm.a(bg, arrayOfString, 40, 4, 20);
       }
       else {
           bg.drawImage(localImage, t - 4, 4, new Color(24), null);
           bm.a(bg, arrayOfString, t - 8 - 32, 4, 24);
       }
   }

   public static void b(Graphics paramGraphics) {
       paramGraphics.setColor(new Color(52479));
       paramGraphics.fillRect(0, 0, r, s);
       bi.setColor(new Color(16751203));
       bi.fillRect(2, 2, 103, 78);
       bi.drawImage(a8[69], 0, 0, new Color(20), null);
       bi.fillRect(11, 58, 77, 18);
       int i1 = 8;
       for (int i2 = 0; i2 < 4; i2++) {
           bi.setColor(new Color(b4[i2]));
           bi.fillRect(4, i1, 96, 13);
           Image localImage = a8[(47 + i2)];
           if ((i2 > 0) && (af[(i2 - 1)] == false))
               localImage = a8[52];
           bi.drawImage(localImage, 7, i1 - 1, new Color(20), null);
           bm.a(bi, ac[i2] + "%", 65, i1 + 7, 6);
           if (ad[i2] < 10)
               bm.a(bi, "10-" + ad[i2], 26, i1 + 7, 6);
           if (ag[i2] != false)
               bi.drawImage(a8[71], 87, i1 - 1, new Color(20), null);
           i1 += 17;
       }
       bi.drawImage(a8[70], 50, 8, new Color(20), null);
       int i3 = r >> 1;
       int i4 = s >> 1;
       paramGraphics.drawImage(be, i3, i4, new Color(3), null);
       bm.a(paramGraphics, bk[19], i3 - (be.getWidth(null) >> 1) + 8, i4 - (be.getHeight(null) >> 1) - 4, 20);
       a(paramGraphics, bk[7], false);
       a(paramGraphics, bk[20], true);
   }

   public static void c(Graphics paramGraphics) {
       paramGraphics.setColor(new Color(52479));
       paramGraphics.fillRect(0, 0, r, s);
       bj.setColor(new Color(15466636));
       bj.fillRect(0, 0, 128, 100);
       bj.setColor(new Color(16751203));
       bj.fillRect(2, 2, 124, 96);
       bj.setColor(new Color(16776960));
       bj.fillRect(57, 7, 12, 60);
       bj.fillRect(7, 34, 114, 12);
       if (at == 0)
           bj.fillRect(5, 68, 12, 10);
       if (at != 2)
           bj.fillRect(5, 80, 12, 10);
       String[] arrayOfString;
       switch (at) {
       case 0:
           bj.drawImage(a7[17], 63, 39, new Color(3), null);
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
           bj.drawImage(a8[21], 63, 42, new Color(3), null);
           bj.drawImage(a8[28], 63, 32, new Color(3), null);
           arrayOfString = bm.a(bk[28], 46);
           bm.a(bj, arrayOfString, 4, 32, 20);
           arrayOfString = bm.a(bk[29], 46);
           bm.a(bj, arrayOfString, 124, 32, 24);
           bm.a(bj, "*", 11, 85, 3);
           bm.a(bj, bk[30], 20, 85, 6);
           break;
       case 2:
           bj.setClip(46, 40, 33, 16);
           bj.drawImage(ba, 0, 60, new Color(36), null);
           bj.setClip(0, 0, 128, 100);
           bj.drawImage(a8[23], 63, 37, new Color(3), null);
           arrayOfString = bm.a(bk[28], 46);
           bm.a(bj, arrayOfString, 4, 32, 20);
           arrayOfString = bm.a(bk[29], 46);
           bm.a(bj, arrayOfString, 124, 32, 24);
           bm.a(bj, bk[31], 5, 87, 6);
       }
       a(paramGraphics, bk[7], false);
       a(paramGraphics, bk[6], true);
       paramGraphics.drawImage(bf, r >> 1, s >> 1, new Color(3), null);
   }

   public static void d(Graphics paramGraphics) {
       paramGraphics.setColor(new Color(52479));
       paramGraphics.fillRect(0, 0, r, s);
       bi.setColor(new Color(b3[(aaa - 8)]));
       bi.fillRect(2, 2, 103, 78);
       bi.drawImage(a8[69], 0, 0, new Color(20), null);
       bi.setColor(new Color(16777215));
       bi.fillRect(13, 60, 62, 14);
       bi.drawImage(a8[(by.ae + 8)], 6, 6, new Color(20), null);
       int i1 = bz.ae + 8;
       if (aaa == 10)
           i1 = 48 + a3;
       bi.drawImage(a8[i1], 85, 60, new Color(20), null);
       bm.a(bi, bk[(12 + aaa - 8)], 41, 66, 3);
       String[] arrayOfString = bm.a(bk[(15 + aaa - 8)], 78);
       bm.a(bi, arrayOfString, 25, 6, 20);
       if (aaa == 9)
           bi.drawImage(a8[68], 6, 23, new Color(20), null);
       paramGraphics.drawImage(be, r >> 1, s >> 1, new Color(3), null);
       a(paramGraphics, bk[7], false);
   }

   public static void e(Graphics paramGraphics) {
       int i1 = 124;
       paramGraphics.setColor(new Color(52479));
       paramGraphics.fillRect(0, 0, r, i1);
       paramGraphics.translate(-ce, 0);
       int i2 = 0;
       while (i2 < 255 + ce) {
           paramGraphics.drawImage(ba, i2, i1, new Color(20), null);
           paramGraphics.drawImage(bb, i2, 0, new Color(20), null);
           i2 += 128;
       }
       paramGraphics.translate(ce, 0);
       ce += 2;
       if (ce > 128)
           ce = 0;
       int i3 = 3;
       do {
           i3--;
           b5[i3] -= 1 + i3;
           paramGraphics.drawImage(a9[0], b5[i3], b6[i3], new Color(3), null);
           if (b5[i3] < -32) {
               int i4 = s / 3;
               b6[i3] = (i4 * i3 + c(i4));
               b5[i3] = (r + 32);
           }
       }
       while (i3 > 0);
       int i4 = b7 >> 6;
       int i5 = b9 >> 6;
       int i6 = b8 >> 6;
       int i7 = cb >> 6;
       paramGraphics.drawImage(a8[64], i4, 20, new Color(10), null);
       paramGraphics.drawImage(cj, i4 - 25, 17, new Color(10), null);
       int i8 = c(3);
       int i9 = ca >> 6;
       paramGraphics.drawImage(a8[64], i5, 80 + i8 + i9, new Color(10), null);
       paramGraphics.drawImage(ck, i5 - 25, 77 + i8 + i9, new Color(10), null);
       paramGraphics.drawImage(a8[(14 + c(3))], i5 - 56, 75 + i9, new Color(3), null);
       paramGraphics.drawImage(a8[(14 + c(3))], i5 - 14, 85 + i9, new Color(3), null);
       paramGraphics.drawImage(a8[(14 + c(3))], i5 - 38, 93 + i9, new Color(3), null);
       if (cf - 32 - (cd >> 1) < r >> 1)
           cf = i6;
       paramGraphics.drawImage(a8[65], cf - 24, 50, new Color(10), null);
       paramGraphics.drawImage(cl, cf - 32, 50, new Color(10), null);
       paramGraphics.drawImage(a8[66], cf - 32 - cd, 50, new Color(10), null);
       paramGraphics.drawImage(ch, i6, 50, new Color(10), null);
       if (cg - 32 - (cd >> 1) < r >> 1)
           cg = i7;
       paramGraphics.drawImage(a8[65], cg - 24, 110, new Color(10), null);
       paramGraphics.drawImage(cm, cg - 32, 110, new Color(10), null);
       paramGraphics.drawImage(a8[66], cg - 32 - cd, 110, new Color(10), null);
       paramGraphics.drawImage(ci, i7, 110, new Color(10), null);
       cc += 1;
       if (cc > 350)
           aaa = 7;
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
       aaa = 6;
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
       cn.setColor(new Color(16514043));
       cn.fillRect(0, 0, cd, 15);
       cn.setColor(new Color(4671303));
       cn.drawLine(0, 0, cd, 0);
       cn.drawLine(0, 14, cd, 14);
       co.setColor(new Color(16514043));
       co.fillRect(0, 0, cd, 15);
       co.setColor(new Color(4671303));
       co.drawLine(0, 0, cd, 0);
       co.drawLine(0, 14, cd, 14);
       bm.a(cn, bk[11] + by.an, cd >> 1, 7, 3);
       bm.a(co, bk[11] + bz.an, cd >> 1, 7, 3);
       int i1 = 3;
       do {
           i1--;
           b5[i1] = c(r);
           int i2 = s / 3;
           b6[i1] = (i2 * i1 + c(i2));
       }
       while (i1 > 0);
       if (as == 1) {
           bp = "";
           o = 0;
           ddd = false;
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
       paramGraphics.setColor(new Color(3355545));
       paramGraphics.fillRect(i1 - i5, i3 - i5 - i6, r - (i1 << 1) + (i5 << 1), i4 * 3 + (i5 << 1) + i6);
       paramGraphics.setColor(new Color(16777215));
       String str1 = "MASTER";
//       if (!j.d)
//           str1 = "SLAVE";
       paramGraphics.setColor(new Color(20));
       paramGraphics.drawString(str1, i1, i3 - i6);
       for (int i7 = 0; i7 < 3; i7++) {
    	   paramGraphics.setColor(new Color(16777215));
           if (i7 == cq)
               paramGraphics.fillRect(i1 - 10, i3 + i7 * i4, 8, 10);
           paramGraphics.setColor(new Color(20));
           paramGraphics.drawString(cp[i7], i1, i3 + i7 * i4);
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
           paramGraphics.drawString(str2, i2, i3 + i7 * i4);
       }
   }

   public static void c(e parame) {
       if (aaa == 4)
           return;
       int i1 = ct;
       if (parame.i == 2)
           i1 = cv;
       bh.setColor(new Color(15131619));
       bh.fillRect(i1, cu, cr, cs);
       bh.setColor(new Color(16777215));
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
       paramGraphics.setColor(new Color(6488245));
       paramGraphics.fillRect(i3, s - i2, i1, i2);
       paramGraphics.setColor(new Color(16776960));
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
           switch (aaa) {
           case 14:
               if (q == -1) {
                   paramGraphics.setColor(new Color(39663));
                   paramGraphics.fillRect(0, 0, r, s);
                   bm.a(paramGraphics, bk[45], r >> 1, s >> 1, 3);
               }
               else {
                   ba = ImageIO.read(new File("/ad" + q + ".png"));
                   paramGraphics.drawImage(ba, 0, 0, new Color(20), null);
               }
               break;
           case 13:
               int i1 = bm.a + 2;
               int i2 = s - (i1 << 2) >> 1;
               paramGraphics.setColor(new Color(39663));
               paramGraphics.fillRect(0, 0, r, s);
               bm.a(paramGraphics, bk[32], r >> 1, i2, 17);
               bm.a(paramGraphics, bk[33], r >> 1, i2 + i1, 17);
               bm.a(paramGraphics, bk[34], r >> 1, i2 + (i1 << 1), 17);
               bm.a(paramGraphics, bk[35], r >> 1, i2 + i1 * 3, 17);
               paramGraphics.drawImage(a7[1], r - 4, s + 2, new Color(40), null);
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
               paramGraphics.drawImage(a8[0], 0, 0, new Color(20), null);
               break;
           case 3:
               break;
           case 2:
               if (!hh) {
                   ee = false;
                   a(paramGraphics);
                   hh = true;
               }
               g.a(paramGraphics, r, s, r, 1, 2, 4, (g.a == 14) || (g.a == 60) || (g.a == 92) || (g.a == 82) ? 16 : bm.a + 4, bm);
               if ((g.a != 66) && (g.a != 50))
                   a(paramGraphics, bk[1], false);
               a(paramGraphics, bk[39], true);
               break;
           case 4:
               paramGraphics.setColor(new Color(0));
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
               paramGraphics.setColor(new Color(0));
               paramGraphics.fillRect(0, 0, r, s);
               i3 = r >> 1;
               i4 = s >> 1;
               paramGraphics.setClip(i3 - a1, i4 - a1, a1 << 1, a1 << 1);
               e(paramGraphics);
               if (aaa == 6) {
                   a1 += 8;
                   if (a1 > r << 1)
                       aaa = 5;
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
               if (ff)
                   f(paramGraphics);
               if (a0 > 0) {
                   a0 -= 1;
                   String str2 = bw.m + " - " + bx.m;
                   bm.a(paramGraphics, str2, r >> 1, s >> 1, 3);
               }
               break;
           }
           if ((!ddd) && (aaa == 1))
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
           paramGraphics.setColor(new Color(6724044));
           int i6 = i2;
           if (i1 != 0)
               i6 += 9;
           paramGraphics.fillRect(i4, i5, i6, i3 + 1);
           i4++;
           i5++;
           paramGraphics.setColor(new Color(6488245));
           int i7 = i4 + i2 - 2;
           int i8 = i3 - 2;
           paramGraphics.drawRect(i4, i5, i7 - i4, i8);
           if (i1 != 0)
               paramGraphics.drawRect(i7, i5, 8, i8);
           if (cz == 0) {
               i4 += 2;
               i5 += 2;
               a(paramGraphics, i4, i5);
               paramGraphics.setColor(new Color(16777215));
               int i9 = i4 + i2 - 2;
               if ((h() & 0x1) != 0)
                   paramGraphics.drawImage(a8[58], i9, i5, new Color(20), null);
               if ((h() & 0x2) != 0)
                   paramGraphics.drawImage(a8[59], i9, i5 + i3 - 1 - 2 - 5, new Color(20), null);
           }
           cz -= 1;
       }
   }

   public void showNotify() {
       i.b();
       if (aaa == 1) {
           g.a(30);
           aaa = 2;
           hh = false;
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
           char c10 = arrayOfChar[i2];
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
               int i9 = bm.a(c10) + 0;
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
               int i9 = i3 <= i4 ? 1 : 0;
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
       byte[] arrayOfByte2 = new byte[33 + df.length + i1 + 24];
       System.arraycopy(de, 0, arrayOfByte2, 0, 8);
       System.arraycopy(dh, 0, arrayOfByte2, 11, 15);
       arrayOfByte2[18] = a5.readByte();
       arrayOfByte2[19] = a5.readByte();
       arrayOfByte2[22] = a5.readByte();
       arrayOfByte2[23] = a5.readByte();
       a(arrayOfByte2, 12, 17);
       int i3 = 33;
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
       Image localImage = ImageIO.read(new ByteArrayInputStream(arrayOfByte));
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
               i2--;
               long l2 = i2;
               for (int i3 = 0; i3 < 8; i3++)
                   if ((l2 & 1L) != 0L)
                       l2 = 0xEDB88320 ^ l2 >> 1;
                   else
                       l2 >>= 1;
               dj[i2] = ((int)l2);
           }
           while (i2 > 0);
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
           return ImageIO.read(new ByteArrayInputStream(arrayOfByte));
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
           int i1 = paramInt2 - paramInt1;
           int i2 = 360 - paramInt2 + paramInt1;
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


/*public class b extends Applet implements Runnable {

public static int aaa;
public static boolean bbb;
public static boolean ccc;
public static boolean ddd;
public static boolean ee;
public static boolean ff;
public static boolean gg;
public static boolean hh;
public static boolean ii;
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
public static final int[] v = new int[]{239, 16};
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
//public static j bq;
public static byte[] br;
public static byte[] bs;
public static byte bt;
public static d[] bu;
//public static BluetoothBiplanes bv;
public static e bw;
public static e bx;
public static e by;
public static e bz;
public static int b0;
public static int b1;
public Thread b2;
public static final int[] b3 = new int[]{9578383, 2593407, 281486};
public static final int[] b4 = new int[]{16776704, 16768512, 16757760, 16711937};
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
public static final String[] cp = new String[]{"Engine Sleep", "Engine Latency", "Bluetooth Sleep"};
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
private static final int[] dl = new int[]{0, 2, 4, 7, 9, 11, 13, 16, 18, 20, 22, 24, 27, 29, 31, 33, 35, 37, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 73, 75, 77, 79, 81, 82, 84, 86, 87, 89, 91, 92, 94, 95, 97, 98, 99, 101, 102, 104, 105, 106, 107, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 119, 120, 121, 122, 122, 123, 124, 124, 125, 125, 126, 126, 126, 127, 127, 127, 128, 128, 128, 128, 128};
private static final byte[][] dm = new byte[][]{{(byte)45, (byte)27, (byte)18, (byte)14, (byte)11, (byte)9, (byte)8, (byte)7, (byte)6, (byte)6}, {(byte)63, (byte)45, (byte)34, (byte)27, (byte)22, (byte)18, (byte)16, (byte)14, (byte)13, (byte)11}, {(byte)72, (byte)56, (byte)45, (byte)37, (byte)31, (byte)27, (byte)23, (byte)21, (byte)18, (byte)17}, {(byte)76, (byte)63, (byte)53, (byte)45, (byte)39, (byte)34, (byte)30, (byte)27, (byte)24, (byte)22}, {(byte)79, (byte)68, (byte)59, (byte)51, (byte)45, (byte)40, (byte)36, (byte)32, (byte)29, (byte)27}, {(byte)81, (byte)72, (byte)63, (byte)56, (byte)50, (byte)45, (byte)41, (byte)37, (byte)34, (byte)31}, {(byte)82, (byte)74, (byte)67, (byte)60, (byte)54, (byte)49, (byte)45, (byte)41, (byte)38, (byte)35}, {(byte)83, (byte)76, (byte)69, (byte)63, (byte)58, (byte)53, (byte)49, (byte)45, (byte)42, (byte)39}, {(byte)84, (byte)77, (byte)72, (byte)66, (byte)61, (byte)56, (byte)52, (byte)48, (byte)45, (byte)42}, {(byte)84, (byte)79, (byte)73, (byte)68, (byte)63, (byte)59, (byte)55, (byte)51, (byte)48, (byte)45}};
private static int dn;
private static int doo;
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
private static final char[][] d8 = new char[][]{{'0', '_'}, {'1', '-', '@'}, {'A', 'B', 'C', '2', 'a', 'b', 'c'}, {'D', 'E', 'F', '3', 'd', 'e', 'f'}, {'G', 'H', 'I', '4', 'g', 'h', 'i'}, {'J', 'K', 'L', '5', 'j', 'k', 'l'}, {'M', 'N', 'O', '6', 'm', 'n', 'o'}, {'P', 'Q', 'R', 'S', '7', 'p', 'q', 'r', 's'}, {'T', 'U', 'V', '8', 't', 'u', 'v'}, {'W', 'X', 'Y', 'Z', '9', 'w', 'x', 'y', 'z'}};


//public b(BluetoothBiplanes var1) {
public b() {
//   bv = var1;
   r = this.getWidth();
   s = this.getHeight();
   if(r == 128) {
      x = 50;
   } else {
      x = 25;
   }

   dn = 5;
   doo = dn + 3;
   dt = r - 3;
   ds = dt - 2;
   dq = ds - 6;
   dp = ds - 8;
   dr = 0;
   d6 = false;
   d5 = System.currentTimeMillis();
   d7 = 500;
   dz = new int[]{2, 11};
   d0 = new int[]{10, 11};
   d1 = new int[]{s - 48, s - 28};
   d2 = new int[]{1, 0};
   dx = new StringBuffer[2];
   dy = new int[2];
   int var2 = 2;

   while(true) {
      --var2;
      if(var2 < 0) {
         b1 = 666;
         br = new byte[18];
         w = new Random();
         bp = "";
//         DeviceControl.setLights(0, 100);
         gg = true;
         o();
         this.c();
         ii = true;
         return;
      }

      dx[var2] = new StringBuffer();
   }
}

public static void a(boolean var0) {}

public static void a(String var0) {
   bp = var0;
}

public static void a(int var0, DataInputStream var1) {
   try {
      an = var0;
      e var2 = a6[1];
      e var3 = a6[0];
      var1.readFully(br);
      byte var4 = 0;
      int var10 = var4 + 1;
      var2.a = br[var4];
      if(var2.a == 2) {
         var2.p = 0;
      }

      var2.d = br[var10++] & 255;
      var2.e = br[var10++] & 255;
      var2.bb = var2.d << 6;
      var2.c = var2.e << 6;
      var2.f = br[var10++];
      var3.p = br[var10++];
      int var6 = 2;

      while(true) {
         --var6;
         if(var6 < 0) {
            for(int var7 = aq; var7 < ar; ++var7) {
               aa[var7] = (br[var10++] & 255) * 2;
               ab[var7] = (br[var10++] & 255) * 2;
            }

            var2.v = br[var10++];
            if(var2.v != 0) {
               var2.w = (br[var10++] & 255) << 6;
               var2.x = (br[var10++] & 255) << 6;
               var2.aa = br[var10++];
               var2.ac = br[var10++];
            }

            if(an > 1) {
               var2.a(br[var10++]);
            } else {
               var2.ae = br[var10++];
            }

            byte var8 = br[var10++];
            if((var8 & 1) != 0) {
               --var2.m;
               if(var2.m < 0) {
                  var2.m = 0;
               }

               b(var3);
               c(var2);
            }

            if((var8 & 2) != 0) {
               var2.f();
            }

            if((var8 & 4) != 0) {
               --var2.m;
               if(var2.m < 0) {
                  var2.m = 0;
               }

               c(var2);
               b(var3);
            }

            if((var8 & 8) != 0) {
               var3.v = 3;
               var3.aa = 0;
               var2.m += 2;
               c(var2);
               b(var2);
            }

            if((var8 & 16) != 0) {
               var2.ao.v = 5;
            }

            if((var8 & 32) != 0) {
               var3.f();
               if(var3.v == 0) {
                  var3.v = 3;
                  var3.aa = 0;
                  ++var2.m;
                  c(var2);
                  b(var2);
                  bt = (byte)(bt + 64);
               }
            }

            if((var8 & 64) != 0) {
               ++var3.m;
               c(var3);
               b(var3);
            }

            if((var8 & 128) != 0) {
               g();
            }
            break;
         }

         f var5 = var2.av[var6];
         var5.a = br[var10++] & 255;
         var5.bb = br[var10++] & 255;
      }
   } catch (Exception var9) {
      var9.printStackTrace();
   }

}

public static boolean b(boolean var0) {
   ddd = var0;
   if(ddd) {
      a6[1].ap = true;
      if(a6[0] == bx) {
         o = 1;
      } else {
         o = 2;
      }
   } else {
      bp = bk[44];
   }

   return ddd;
}

public void a() {
   switch(aaa) {
   case 7:
      if(as == 1 || by != bw) {
         aaa = 2;
         return;
      }

      aaa = 8;
      if(!m) {
         this.a();
      }
      break;
   case 8:
      aaa = 9;
      if(!n) {
         this.a();
      }
      break;
   case 9:
      aaa = 10;
      if(!l) {
         this.a();
      }
      break;
   case 10:
      aaa = 2;
   }

   this.c();
}

private static void j(int var0) {
   af[var0] = true;
   n();
}

private static void n() {
   try {
      g.g = b("/tm");
      int var0 = 3;

      while(true) {
         --var0;
         if(var0 < 0) {
            break;
         }

         if(!af[var0]) {
            g.g[4 + var0] = bk[5];
            g.g[27 + var0] = bk[5];
            g.g[38 + var0] = bk[5];
            g.g[43 + var0] = bk[5];
         }
      }
   } catch (Exception var1) {
      var1.printStackTrace();
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
      int var0 = 4;

      while(true) {
         --var0;
         if(var0 < 0) {
            ag = new boolean[4];
            af = new boolean[3];
            gg = true;
            ii = true;
            if(!b()) {
               c(true);
            }

            cd = bm.a(bk[11] + " 100% ");
            BufferedImage buf = new BufferedImage(cd, 15, BufferedImage.TYPE_INT_ARGB);
            cl = (Image) buf;
            buf = new BufferedImage(cd, 15, BufferedImage.TYPE_INT_ARGB);
            cm = (Image) buf;
            cn = cl.getGraphics();
            co = cm.getGraphics();
            n();
            ak = 255 - r;
            al = 208 - s;
            bu = new d[50];
            int var1 = 50;

            while(true) {
               --var1;
               if(var1 < 0) {
                  aa = new int[2];
                  ab = new int[2];
                  ae = new boolean[2];
                  int var2 = 2;

                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        ay = c(255) << 6;
                        az = c(104);
                        a6 = new e[2];
                        int var3 = 2;

                        while(true) {
                           --var3;
                           if(var3 < 0) {
                              a6[0].ao = a6[1];
                              a6[1].ao = a6[0];
                              a5 = new DataInputStream(a6.getClass().getResourceAsStream("/r"));
                              byte[] var4 = m();
                              x = var4[0];
                              z = var4[1];
                              bs = m();
                              byte[] var5 = m();
                              g.a(var5);
                              i();
                              a7 = d(32);
                              ba = k();
                              bb = k();
                              Image var6 = k();
                              t = var6.getWidth(null);
                              u = var6.getHeight(null);
                              buf = new BufferedImage(t, u, BufferedImage.TYPE_INT_ARGB);
                              bc = (Image) buf;
                              bg = bc.getGraphics();
                              bg.drawImage(var6, 0, 0, new Color(20), null);
                              buf = new BufferedImage(26, 9, BufferedImage.TYPE_INT_ARGB);
                              bd = (Image) buf;
                              bh = bd.getGraphics();
                              a8 = d(72);
                              a9 = e(1);
                              int var7 = a8[69].getWidth(null);
                              int var8 = a8[69].getHeight(null);
                              buf = new BufferedImage(var7, var8, BufferedImage.TYPE_INT_ARGB);
                              be = (Image) buf;
                              bi = be.getGraphics();
                              buf = new BufferedImage(128, 100, BufferedImage.TYPE_INT_ARGB);
                              bf = (Image) buf;
                              bj = bf.getGraphics();
                              h.a(a5);
                              a5.close();
                              a5 = null;
                              System.gc();
                              cy = -1;
//                              aaa = 13;
                              aaa = 1;
                              return;
                           }

                           a6[var3] = new e(var3 == 0);
                        }
                     }

                     aa[var2] = c(255);
                     ab[var2] = c(104);
                     ae[var2] = c(2) == 0;
                  }
               }

               bu[var1] = new d();
            }
         }

         ad[var0] = 10;
      }
   } catch (Exception var9) {
      var9.printStackTrace();
   }
}

public static void c(boolean var0) {
   try {
      k = true;
//      RecordStore var1 = RecordStore.openRecordStore("s", true);
//      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
//      DataOutputStream var3 = new DataOutputStream(var2);
//      if(var1.getSizeAvailable() >= 600) {
//         for(int var4 = 0; var4 < 3; ++var4) {
//            var3.writeBoolean(af[var4]);
//         }
//
//         for(int var5 = 0; var5 < 4; ++var5) {
//            var3.writeByte((byte)ac[var5]);
//            var3.writeBoolean(ag[var5]);
//            var3.writeByte((byte)ad[var5]);
//         }
//
//         var3.writeBoolean(gg);
//         var3.writeBoolean(i);
//         byte[] var6 = var2.toByteArray();
//         if(var0) {
//            var1.addRecord(var6, 0, var6.length);
//         } else {
//            var1.setRecord(1, var6, 0, var6.length);
//         }
//
//         k = false;
//      }
//
//      var1.closeRecordStore();
//      var3.close();
//      var2.close();
   } catch (Exception var7) {
      var7.printStackTrace();
      k = true;
   }

}

public static boolean b() {
   try {
      System.gc();
//      RecordStore var0 = RecordStore.openRecordStore("s", true);
//      if(var0.getNumRecords() > 0) {
//         byte[] var1 = var0.getRecord(1);
//         ByteArrayInputStream var2 = new ByteArrayInputStream(var1);
//         DataInputStream var3 = new DataInputStream(var2);
//
//         for(int var4 = 0; var4 < 3; ++var4) {
//            af[var4] = var3.readBoolean();
//         }
//
//         for(int var5 = 0; var5 < 4; ++var5) {
//            ac[var5] = var3.readByte();
//            ag[var5] = var3.readBoolean();
//            ad[var5] = var3.readByte();
//         }
//
//         gg = var3.readBoolean();
//         ii = var3.readBoolean();
//         var0.closeRecordStore();
//         var3.close();
//         var2.close();
//         return true;
//      }
//
//      var0.closeRecordStore();
   } catch (Exception var6) {
      ;
   }

   return false;
}

public static void a(int var0, int var1) {
   try {
      if(gg) {
         h.a(var0, var1);
      }
   } catch (Exception var3) {
      var3.printStackTrace();
   }

}

public static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
   int var10 = 50;

   while(true) {
      --var10;
      if(var10 < 0) {
         return;
      }

      if(bu[var10].a == -1) {
         int var8 = var4 - var3;
         int var7 = c(var8) + var3;
         var8 = var6 - var5;
         int var9 = c(var8) + var5;
         bu[var10].a(var1, var2, var7, var9);
         --var0;
         if(var0 == 0) {
            return;
         }
      }
   }
}

public static void a(e var0) {
   if(as == 1) {
//      if(j.d) {
//         var0.b(0, v[1], 180, 3);
//      } else {
//         var0.b(0, v[0], 180, 2);
//      }
   } else if(as == 0) {
      if(var0 == a6[0]) {
         var0.b(0, v[1], 180, 3);
      } else {
         var0.b(0, v[0], 180, 2);
      }
   }

}

public void run() {
   ccc = false;

   while(!ccc) {
//      DeviceControl.setLights(0, 100);

      try {
         long var1 = System.currentTimeMillis() - ah;
         long var3 = (long)x - var1;
         if(var3 > (long)y) {
            Thread.sleep(var3);
         }

         ah = System.currentTimeMillis();
         this.e();
         if(cy >= 0) {
            this.c();
         } else {
            switch(aaa) {
            case 0:
               if(++a2 > 120) {
                  aaa = 2;
               }
               break;
            case 1:
            case 4:
               if(as == 0) {
                  ee = true;
               } else if(as == 1) {
                  ee = !ddd || am - an < 2;
               }

               if(!ee) {
                  ++a4;
                  if(a4 > 50) {
                     if(cy == -1) {
                        a(bk[18], 0);
                     }

                     a4 = 0;
                  }
               } else {
                  a4 = 0;
               }

               if(ee && ddd && as == 1) {
                  e var5 = a6[0];
                  byte var6 = 0;
                  int var11 = var6 + 1;
                  br[var6] = (byte)var5.a;
                  br[var11++] = (byte)var5.d;
                  br[var11++] = (byte)var5.e;
                  int var7 = var5.f;
                  if(var5.i == 3) {
                     var7 += 16;
                  }

                  br[var11++] = (byte)var7;
                  br[var11++] = (byte)var5.ao.p;
                  if(var5.ao.p > 2) {
                     var5.ao.p = 0;
                  }

                  int var8 = 2;

                  while(true) {
                     --var8;
                     if(var8 < 0) {
                        for(int var9 = ao; var9 < ap; ++var9) {
                           br[var11++] = (byte)(aa[var9] / 2);
                           br[var11++] = (byte)(ab[var9] / 2);
                        }

                        br[var11++] = (byte)var5.v;
                        if(var5.v != 0) {
                           br[var11++] = (byte)(var5.w >> 6);
                           br[var11++] = (byte)(var5.x >> 6);
                           br[var11++] = (byte)var5.aa;
                           br[var11++] = (byte)var5.ac;
                        }

                        if(am > 1) {
                           br[var11++] = (byte)var5.af;
                        } else {
                           br[var11++] = (byte)var5.ae;
                        }

                        br[var11++] = bt;
                        bt = 0;
//                        bq.c.writeInt(am);
//                        bq.c.write(br);
//                        bq.c.flush();
                        ++am;
                        break;
                     }

                     br[var11++] = (byte)var5.av[var8].a;
                     br[var11++] = (byte)var5.av[var8].bb;
                  }
               }

               this.c();
               break;
            case 2:
               this.c();
               break;
            case 3:
               this.c();
               break;
            case 5:
            case 6:
            case 7:
               this.c();
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
               break;
            case 13:
               if(a2 == 0) {
                  a(0, 1);
               }

               if(++a2 > 120) {
                  a2 = 0;
                  aaa = 0;
                  this.c();
               }
               break;
            case 14:
               ++p;
               if(p == 50) {
                  p = 0;
                  ++q;
                  if(q == 3) {
                 	 int qwe = 1/0;
//                     bv.destroyApp(true);
//                     bv.notifyDestroyed();
                  } else {
                     this.c();
                  }
               }
            }
         }
      } catch (Exception var10) {
         var10.printStackTrace();
      }
   }

}

public void c() {
//   this.serviceRepaints();
   this.repaint();
   Thread.yield();
}

public static void d() {
   bw.ap = true;
   bx.ap = true;
   if(o == 1) {
      a6[0].a(0, v[0], 180, 2);
      a6[1].a(0, v[1], 180, 3);
   } else {
      a6[0].a(0, v[1], 180, 3);
      a6[1].a(0, v[0], 180, 2);
   }

   am = 0;
   an = 0;
   a4 = 0;
   as = 1;
   aaa = 1;
}

public static void a(int var0) {
   switch(var0) {
   case 0:
   case 1:
   case 2:
   case 3:
      if(var0 != 0 && !af[var0 - 1]) {
         a(bk[8], 0);
      } else {
         a6[0].ae = 35 + var0;
         g.a(25);
      }
      break;
   case 4:
      g.a(36);
      break;
   case 5:
      g.a(41);
      break;
   case 6:
      a(bk[36], 0);
      break;
   case 7:
      aaa = 11;
      break;
   case 8:
      ii = true;
      c(false);
      break;
   case 9:
      ii = false;
      c(false);
      break;
   case 10:
      gg = true;
      c(false);
      break;
   case 11:
      gg = false;
      c(false);
   case 12:
   case 15:
   default:
      break;
   case 13:
      aaa = 12;
      at = 0;
      break;
   case 14:
      ba = null;
      bb = null;
      System.gc();
      aaa = 14;
      p = 0;
      q = -1;
      break;
   case 16:
   case 17:
   case 18:
   case 19:
      if(var0 - 16 != 0 && !af[var0 - 16 - 1]) {
         a(bk[8], 0);
      } else {
         a6[1].ae = 39 + var0 - 16;
         a6[1].u = var0 - 16;
         a6[0].a(0, v[1], 180, 3);
         a6[1].a(0, v[0], 180, 2);
         as = 0;
         g.a(33);
      }
      break;
   case 20:
      aaa = 1;
      break;
   case 21:
      if(as == 1) {
//         bq.a();
         bp = "";
         o = 0;
         ddd = false;
      }
      break;
   case 22:
      j = false;
      aaa = 1;
      au = 30;
      break;
   case 23:
      j = true;
      aaa = 1;
      au = 30;
      break;
   case 24:
   case 25:
   case 26:
   case 27:
      if(var0 != 24 && !af[var0 - 1 - 24]) {
         a(bk[8], 0);
         g.a(0);
      } else {
//         bq = null;
         System.gc();
//         bq = new j();
//         bq.a(false);
         ddd = false;
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
         a6[0].ae = 39 + var0 - 24;
         aaa = 1;
         au = 30;
      }
      break;
   case 28:
   case 29:
   case 30:
   case 31:
      if(var0 != 28 && !af[var0 - 1 - 28]) {
         a(bk[8], 0);
         g.a(0);
      } else {
//         bq = null;
         System.gc();
//         bq = new j();
//         bq.a(true);
//         d = false;
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
         a6[0].ae = 35 + var0 - 28;
         aaa = 1;
         au = 30;
      }
      break;
   case 32:
      d();
      break;
   case 33:
      a(bk[37], 0);
   }

}

public void e() {
   if(b0 > 0) {
      --b0;
   } else {
      int var1 = i.a();
      if(cy >= 0) {
         switch(var1) {
         case 10:
            b(1);
            cz = 0;
            break;
         case 11:
            b(2);
            cz = 0;
            break;
         case 16:
            if(c7) {
               cy = -1;
               this.c();
            } else {
               b(2);
               cz = 0;
            }
         }

      } else {
         switch(aaa) {
         case 1:
         case 4:
            if(i.c(10)) {
               if(ff) {
                  --cq;
                  if(cq < 0) {
                     cq = 2;
                  }

                  b0 = 3;
                  return;
               }

               a6[0].c();
            }

            if(i.c(11)) {
               if(ff) {
                  ++cq;
                  b0 = 3;
                  if(cq == 3) {
                     cq = 0;
                  }

                  return;
               }

               a6[0].d();
            }

            if(i.c(12)) {
               if(ff) {
                  switch(cq) {
                  case 0:
                     --x;
                     if(x < 0) {
                        x = 0;
                     }
                     break;
                  case 1:
                     --y;
                     if(y < 0) {
                        y = 0;
                     }
                     break;
                  case 2:
                     --z;
                     if(z < 0) {
                        z = 0;
                     }
                  }

                  return;
               }

               a6[0].b(2);
            }

            if(i.c(13)) {
               if(ff) {
                  switch(cq) {
                  case 0:
                     ++x;
                     break;
                  case 1:
                     ++y;
                     break;
                  case 2:
                     ++z;
                  }

                  return;
               }

               a6[0].b(3);
            }

            if(i.c(14)) {
               a6[0].a();
            }

            switch(var1) {
            case 16:
               g.a(30);
               aaa = 2;
               return;
            case 17:
               a6[0].b();
               return;
            default:
               return;
            }
         case 2:
            switch(var1) {
            case 10:
               g.b(0);
               break;
            case 11:
               g.b(1);
            case 12:
            case 13:
            default:
               break;
            case 14:
            case 15:
               g.b(2);
               break;
            case 16:
               if(g.a != 66 && g.a != 50) {
                  g.a(0);
               }
            }

            this.c();
            break;
         case 3:
            switch(var1) {
            case 15:
               hh = false;
               aaa = 2;
               break;
            case 16:
               String var2 = bk[3] + dx[0].toString();
               var2 = var2 + bk[4];
               this.a(dx[1].toString(), var2);
               hh = false;
               aaa = 2;
            }

            if(var1 == -66) {
               return;
            }

            boolean var3 = false;
            int var4 = 666;

            for(int var5 = 0; var5 != 10; ++var5) {
               if(var1 == var5) {
                  var4 = var5;
                  var3 = true;
                  break;
               }
            }

            d3 = System.currentTimeMillis() - d4;
            d4 = System.currentTimeMillis();
            short var6 = 1050;
            if(!var3) {
               if(var1 == 19) {
                  var4 = 19;
               } else {
                  if(var1 == 20 && dw > 0) {
                     i(dw - 1);
                     b1 = var4;
                     return;
                  }

                  if(var1 == 21 && dw < 1) {
                     i(dw + 1);
                     b1 = var4;
                     return;
                  }
               }
            }

            if(var4 == 666) {
               return;
            }

            if(dx[dw].length() >= d0[dw] && (!var3 || d3 >= (long)var6 || b1 != var4 || d2[dw] == 0)) {
               if(var3) {
                  return;
               }

               if(var1 != 19) {
                  return;
               }
            }

            int var7 = d2[dw];
            if(var7 == 0) {
               if(var3) {
                  dx[dw].append(var4);
                  ++du;
               } else if(var1 == 19) {
                  --du;
                  if(du < 0) {
                     du = 0;
                  } else {
                     dx[dw].deleteCharAt(du);
                  }
               }
            } else if(var3) {
               if(d3 < (long)var6 && b1 == var4) {
                  d6 = false;
                  d5 = System.currentTimeMillis() + (long)d7;
                  --du;
                  ++dv;
                  if(dv >= d8[var4].length) {
                     dv = 0;
                  }

                  dx[dw].setCharAt(du, d8[var4][dv]);
                  ++du;
               } else {
                  dv = 0;
                  dx[dw].append(d8[var4][dv]);
                  ++du;
               }
            } else if(var1 == 19) {
               --du;
               if(du < 0) {
                  du = 0;
               } else {
                  dx[dw].deleteCharAt(du);
               }
            }

            b1 = var4;
            break;
         case 5:
            if(var1 != -66) {
               aaa = 7;
               a1 = Math.max(r, s) >> 1;
            }
         case 6:
         case 7:
         default:
            break;
         case 8:
         case 9:
         case 10:
            if(var1 == 16) {
               this.a();
               return;
            }
            break;
         case 11:
            if(var1 == 16) {
               aaa = 2;
               hh = false;
            }

            if(var1 == 15) {
               a(bk[21], 0);
            }
            break;
         case 12:
            if(var1 == 16) {
               aaa = 2;
               hh = false;
            }

            if(var1 == 15) {
               ++at;
               if(at == 3) {
                  at = 0;
               }

               this.c();
            }
         }

      }
   }
}

public void f() {
   if(this.b2 == null) {
      this.b2 = new Thread(this);
      this.b2.start();
   }

   bbb = false;
}

public void keyPressed(int var1) {
   i.a(var1);
}

public void keyReleased(int var1) {
   i.b(var1);
}

public void a(Graphics var1) {
   if(a6[0].v == 0) {
      ai = a6[0].d - (r >> 1);
      aj = a6[0].e - (s >> 1);
   } else {
      ai = (a6[0].w >> 6) - (r >> 1);
      aj = (a6[0].x >> 6) - (s >> 1);
   }

   ai = ai < 0?0:(ai > ak?ak:ai);
   aj = aj < 0?0:(aj > al?al:aj);
   byte var2 = 124;
   var1.setColor(new Color('\uccff'));
   var1.fillRect(0, 0, r, var2);
   var1.translate(-ai, -aj);

   for(int var3 = 0; var3 < 255; var3 += 128) {
      var1.drawImage(ba, var3, var2, new Color(20), null);
      var1.drawImage(bb, var3, 0, new Color(20), null);
   }

   int var4 = ay >> 6;
   var1.drawImage(a8[57], var4, az, new Color(20), null);
   var1.drawImage(bd, var4 + cw, az + cx, new Color(20), null);
   if(ee) {
      ay += 16;
      if(var4 > 255) {
         ay = -3200;
         az = c(104);
      }
   }

   int var5 = 2;

   while(true) {
      --var5;
      if(var5 < 0) {
         var1.drawImage(a8[1], 109, 168, new Color(20), null);
         int var7 = 2;

         while(true) {
            --var7;
            if(var7 < 0) {
               int var8 = 50;

               while(true) {
                  --var8;
                  if(var8 < 0) {
                     var1.translate(ai, aj);
                     if(s < 208) {
                        int var9 = r * r / 255;
                        int var10 = ai * var9 / ak;
                        var1.setColor(new Color(6684672));
                        var1.fillRect(0, s - 2, r, 2);
                        var1.setColor(new Color(16711680));
                        var1.fillRect(var10, s - 2, var9, 2);
                     }

                     if(aaa == 1 && (as == 0 || ddd)) {
                        e var16;
                        if(as == 0) {
                           var16 = bx;
                        } else {
                           var16 = a6[1];
                        }

                        int var11 = var16.d;
                        int var12 = var16.e;
                        if(!a(var11 - 8, var12 - 8, 16, 16)) {
                           e var17 = var16.ao;
                           int var13 = b(var17.d, var17.e, var11, var12);
                           int var14;
                           if(var13 >= 45 && var13 < 135) {
                              var14 = var12 - aj;
                              if(var14 < 4) {
                                 var14 = 4;
                              } else if(var14 > s - 4) {
                                 var14 = s - 4;
                              }

                              var1.drawImage(a8[63], r, var14, new Color(10), null);
                           } else if(var13 >= 135 && var13 < 225) {
                              var14 = var11 - ai;
                              if(var14 < 4) {
                                 var14 = 4;
                              } else if(var14 > r - 4) {
                                 var14 = r - 4;
                              }

                              var1.drawImage(a8[61], var14, s, new Color(33), null);
                           } else if(var13 >= 225 && var13 < 315) {
                              var14 = var12 - aj;
                              if(var14 < 4) {
                                 var14 = 4;
                              } else if(var14 > s - 4) {
                                 var14 = s - 4;
                              }

                              var1.drawImage(a8[62], 0, var14, new Color(6), null);
                           } else if(var13 > 315 || var13 < 45) {
                              var14 = var11 - ai;
                              if(var14 < 4) {
                                 var14 = 4;
                              } else if(var14 > r - 4) {
                                 var14 = r - 4;
                              }

                              var1.drawImage(a8[60], var14, 0, new Color(17), null);
                           }
                        }
                     }

                     if(aw > 0) {
                        if(ii && (as == 0 || ddd)) {
                           if(ax == 3) {
                              var1.drawImage(bc, 2, 2, new Color(20), null);
                           } else {
                              var1.drawImage(bc, r - 2, 2, new Color(24), null);
                           }
                        }

                        --aw;
                        if(aw == 0) {
                           g();
                        }
                     }

                     if(au > 0) {
                        a(var1, bk[38], false);
                        --au;
                     }

                     return;
                  }

                  if(bu[var8].a != -1) {
                     bu[var8].a(var1);
                  }
               }
            }

            boolean var15 = false;
            var1.drawImage(a9[0], aa[var7], ab[var7], new Color(3), null);
            if(as == 1) {
//               if(j.d && var7 < ap || !j.d && var7 >= ao) {
//                  var15 = true;
//               }
            } else {
               var15 = true;
            }

            if(var15 && ee && c(3) == 0) {
               if(ae[var7]) {
                  aa[var7] -= 2;
                  if(aa[var7] < -32) {
                     aa[var7] = 287;
                     ab[var7] = c(104);
                  }
               } else {
                  aa[var7] += 2;
                  if(aa[var7] > 287) {
                     aa[var7] = -32;
                     ab[var7] = c(104);
                  }
               }
            }
         }
      }

      e var6 = a6[var5];
      if(var6.ap) {
         if(as == 0 && var5 == 1) {
            var6.e();
         }

         var6.a(var1, ee && (as == 0 || var5 == 0));
      }
   }
}

public static boolean a(int var0, int var1, int var2, int var3) {
   return var0 >= ai - var2 && var0 <= ai + r && var1 >= aj - var3 && var1 <= aj + s;
}

public static void g() {
   if(as == 0 && !j) {
      if(a6[0].m >= 10) {
         by = a6[0];
         bz = a6[1];
         l = false;
         m = false;
         boolean var0 = false;
         n = by.at;
         a3 = a6[1].u;
         if(bz.m < ad[a3]) {
            ad[a3] = bz.m;
            var0 = true;
         }

         if(by.af > ac[a3]) {
            ac[a3] = by.af;
            m = true;
         }

         if(n) {
            ag[a3] = true;
         }

         if(a3 < 3 && !af[a3]) {
            j(a3);
            l = true;
         }

         if(l || m || n || var0) {
            c(false);
         }

         g.a(0);
         aaa = 4;
         if(as == 1) {
            bt = (byte)(bt + 128);
         }
      } else if(a6[1].m >= 10) {
         g.a(0);
         aaa = 4;
         by = a6[1];
         bz = a6[0];
      }
   } else if(as == 1) {
      if(a6[0].m >= 10) {
         by = a6[0];
         bz = a6[1];
         g.a(0);
         aaa = 4;
      } else if(a6[1].m >= 10) {
         bz = a6[0];
         by = a6[1];
         g.a(0);
         aaa = 4;
      }
   }

   if(aaa == 4) {
      a1 = Math.max(r, s) >> 1;
   }

}

public static void b(e var0) {
   aw = 45;
   if(ii && (as != 1 || ddd) && var0.ae != -1) {
      av = var0.ae;
      ax = var0.i;
      int var1 = (av - 35) * 4;
      if(var0.m < var0.ao.m) {
         var1 += 2;
      }

      var1 += c(2);
      String[] var2 = bm.a(bl[var1], t - 12 - 32);
      bg.setColor(new Color(16777215));
      bg.fillRect(4, 2, t - 8 + 1, u - 4);
      Image var3 = a8[av];
      if(ax == 3) {
         bg.drawImage(var3, 4, 4, new Color(20), null);
         bm.a(bg, var2, 40, 4, 20);
      } else {
         bg.drawImage(var3, t - 4, 4, new Color(24), null);
         bm.a(bg, var2, t - 8 - 32, 4, 24);
      }

   }
}

public static void b(Graphics var0) {
   var0.setColor(new Color('\uccff'));
   var0.fillRect(0, 0, r, s);
   bi.setColor(new Color(16751203));
   bi.fillRect(2, 2, 103, 78);
   bi.drawImage(a8[69], 0, 0, new Color(20), null);
   bi.fillRect(11, 58, 77, 18);
   int var1 = 8;

   for(int var3 = 0; var3 < 4; ++var3) {
      bi.setColor(new Color(b4[var3]));
      bi.fillRect(4, var1, 96, 13);
      Image var2 = a8[47 + var3];
      if(var3 > 0 && !af[var3 - 1]) {
         var2 = a8[52];
      }

      bi.drawImage(var2, 7, var1 - 1, new Color(20), null);
      bm.a(bi, ac[var3] + "%", 65, var1 + 7, 6);
      if(ad[var3] < 10) {
         bm.a(bi, "10-" + ad[var3], 26, var1 + 7, 6);
      }

      if(ag[var3]) {
         bi.drawImage(a8[71], 87, var1 - 1, new Color(20), null);
      }

      var1 += 17;
   }

   bi.drawImage(a8[70], 50, 8, new Color(20), null);
   int var4 = r >> 1;
   int var5 = s >> 1;
   var0.drawImage(be, var4, var5, new Color(3), null);
   bm.a(var0, bk[19], var4 - (be.getWidth(null) >> 1) + 8, var5 - (be.getHeight(null) >> 1) - 4, 20);
   a(var0, bk[7], false);
   a(var0, bk[20], true);
}

public static void c(Graphics var0) {
   var0.setColor(new Color('\uccff'));
   var0.fillRect(0, 0, r, s);
   bj.setColor(new Color(15466636));
   bj.fillRect(0, 0, 128, 100);
   bj.setColor(new Color(16751203));
   bj.fillRect(2, 2, 124, 96);
   bj.setColor(new Color(16776960));
   bj.fillRect(57, 7, 12, 60);
   bj.fillRect(7, 34, 114, 12);
   if(at == 0) {
      bj.fillRect(5, 68, 12, 10);
   }

   if(at != 2) {
      bj.fillRect(5, 80, 12, 10);
   }

   String[] var1;
   switch(at) {
   case 0:
      bj.drawImage(a7[17], 63, 39, new Color(3), null);
      bm.a(bj, bk[22], 62, 14, 3);
      bm.a(bj, bk[23], 62, 60, 3);
      var1 = bm.a(bk[25], 46);
      bm.a(bj, var1, 4, 32, 20);
      var1 = bm.a(bk[24], 46);
      bm.a(bj, var1, 124, 32, 24);
      bm.a(bj, "#", 11, 73, 3);
      bm.a(bj, "*", 11, 85, 3);
      bm.a(bj, bk[26], 20, 73, 6);
      bm.a(bj, bk[27], 20, 85, 6);
      bm.a(bj, bk[23], 62, 60, 3);
      break;
   case 1:
      bj.drawImage(a8[21], 63, 42, new Color(3), null);
      bj.drawImage(a8[28], 63, 32, new Color(3), null);
      var1 = bm.a(bk[28], 46);
      bm.a(bj, var1, 4, 32, 20);
      var1 = bm.a(bk[29], 46);
      bm.a(bj, var1, 124, 32, 24);
      bm.a(bj, "*", 11, 85, 3);
      bm.a(bj, bk[30], 20, 85, 6);
      break;
   case 2:
      bj.setClip(46, 40, 33, 16);
      bj.drawImage(ba, 0, 60, new Color(36), null);
      bj.setClip(0, 0, 128, 100);
      bj.drawImage(a8[23], 63, 37, new Color(3), null);
      var1 = bm.a(bk[28], 46);
      bm.a(bj, var1, 4, 32, 20);
      var1 = bm.a(bk[29], 46);
      bm.a(bj, var1, 124, 32, 24);
      bm.a(bj, bk[31], 5, 87, 6);
   }

   a(var0, bk[7], false);
   a(var0, bk[6], true);
   var0.drawImage(bf, r >> 1, s >> 1, new Color(3), null);
}

public static void d(Graphics var0) {
   var0.setColor(new Color('\uccff'));
   var0.fillRect(0, 0, r, s);
   bi.setColor(new Color(b3[aaa - 8]));
   bi.fillRect(2, 2, 103, 78);
   bi.drawImage(a8[69], 0, 0, new Color(20), null);
   bi.setColor(new Color(16777215));
   bi.fillRect(13, 60, 62, 14);
   bi.drawImage(a8[by.ae + 8], 6, 6, new Color(20), null);
   int var1 = bz.ae + 8;
   if(aaa == 10) {
      var1 = 48 + a3;
   }

   bi.drawImage(a8[var1], 85, 60, new Color(20), null);
   bm.a(bi, bk[12 + aaa - 8], 41, 66, 3);
   String[] var2 = bm.a(bk[15 + aaa - 8], 78);
   bm.a(bi, var2, 25, 6, 20);
   if(aaa == 9) {
      bi.drawImage(a8[68], 6, 23, new Color(20), null);
   }

   var0.drawImage(be, r >> 1, s >> 1, new Color(3), null);
   a(var0, bk[7], false);
}

public static void e(Graphics var0) {
   byte var1 = 124;
   var0.setColor(new Color('\uccff'));
   var0.fillRect(0, 0, r, var1);
   var0.translate(-ce, 0);

   for(int var2 = 0; var2 < 255 + ce; var2 += 128) {
      var0.drawImage(ba, var2, var1, new Color(20), null);
      var0.drawImage(bb, var2, 0, new Color(20), null);
   }

   var0.translate(ce, 0);
   ce += 2;
   if(ce > 128) {
      ce = 0;
   }

   int var3 = 3;

   while(true) {
      --var3;
      int var4;
      if(var3 < 0) {
         var4 = b7 >> 6;
         int var5 = b9 >> 6;
         int var6 = b8 >> 6;
         int var7 = cb >> 6;
         var0.drawImage(a8[64], var4, 20, new Color(10), null);
         var0.drawImage(cj, var4 - 25, 17, new Color(10), null);
         int var8 = c(3);
         int var9 = ca >> 6;
         var0.drawImage(a8[64], var5, 80 + var8 + var9, new Color(10), null);
         var0.drawImage(ck, var5 - 25, 77 + var8 + var9, new Color(10), null);
         var0.drawImage(a8[14 + c(3)], var5 - 56, 75 + var9, new Color(3), null);
         var0.drawImage(a8[14 + c(3)], var5 - 14, 85 + var9, new Color(3), null);
         var0.drawImage(a8[14 + c(3)], var5 - 38, 93 + var9, new Color(3), null);
         if(cf - 32 - (cd >> 1) < r >> 1) {
            cf = var6;
         }

         var0.drawImage(a8[65], cf - 24, 50, new Color(10), null);
         var0.drawImage(cl, cf - 32, 50, new Color(10), null);
         var0.drawImage(a8[66], cf - 32 - cd, 50, new Color(10), null);
         var0.drawImage(ch, var6, 50, new Color(10), null);
         if(cg - 32 - (cd >> 1) < r >> 1) {
            cg = var7;
         }

         var0.drawImage(a8[65], cg - 24, 110, new Color(10), null);
         var0.drawImage(cm, cg - 32, 110, new Color(10), null);
         var0.drawImage(a8[66], cg - 32 - cd, 110, new Color(10), null);
         var0.drawImage(ci, var7, 110, new Color(10), null);
         ++cc;
         if(cc > 350) {
            aaa = 7;
         }

         if(cc > 0 && (b7 >> 6 < (r >> 1) + (r >> 2) || cc > 300)) {
            b7 += 50;
         }

         if(cc > 70) {
            b8 += 120;
         }

         if(cc > 100) {
            if(b9 >> 6 < (r >> 1) + (r >> 2) || cc > 300) {
               b9 += 50;
            }

            if(var5 > (r >> 1) + (r >> 2)) {
               ca += 60;
            }
         }

         if(cc > 170) {
            cb += 120;
         }

         return;
      }

      b5[var3] -= 1 + var3;
      var0.drawImage(a9[0], b5[var3], b6[var3], new Color(3), null);
      if(b5[var3] < -32) {
         var4 = s / 3;
         b6[var3] = var4 * var3 + c(var4);
         b5[var3] = r + 32;
      }
   }
}

public static void a(e var0, e var1) {
   aaa = 6;
   a1 = 0;
   cg = 0;
   cf = 0;
   cc = 0;
   ca = 0;
   cb = 0;
   b9 = 0;
   b8 = 0;
   b7 = 1024;
   if(var0.i == 3) {
      ch = a7[16];
   } else {
      ch = a8[67];
   }

   if(var1.i == 3) {
      ci = a7[16];
   } else {
      ci = a8[67];
   }

   cj = a8[var0.ae + 8];
   ck = a8[var1.ae + 8];
   cn.setColor(new Color(16514043));
   cn.fillRect(0, 0, cd, 15);
   cn.setColor(new Color(4671303));
   cn.drawLine(0, 0, cd, 0);
   cn.drawLine(0, 14, cd, 14);
   co.setColor(new Color(16514043));
   co.fillRect(0, 0, cd, 15);
   co.setColor(new Color(4671303));
   co.drawLine(0, 0, cd, 0);
   co.drawLine(0, 14, cd, 14);
   bm.a(cn, bk[11] + by.an, cd >> 1, 7, 3);
   bm.a(co, bk[11] + bz.an, cd >> 1, 7, 3);
   int var2 = 3;

   while(true) {
      --var2;
      if(var2 < 0) {
         if(as == 1) {
//            bq.a();
            bp = "";
            o = 0;
            ddd = false;
         }

         a(4, 0);
         return;
      }

      b5[var2] = c(r);
      int var3 = s / 3;
      b6[var2] = var3 * var2 + c(var3);
   }
}

public static void f(Graphics var0) {
   byte var1 = 5;
   short var2 = 130;
   byte var3 = 40;
   byte var4 = 20;
   byte var5 = 10;
   byte var6 = 20;
   var0.setColor(new Color(3355545));
   var0.fillRect(var1 - var5, var3 - var5 - var6, r - (var1 << 1) + (var5 << 1), var4 * 3 + (var5 << 1) + var6);
   var0.setColor(new Color(16777215));
   String var7 = "MASTER";
//   if(!j.d) {
//      var7 = "SLAVE";
//   }

   var0.drawString(var7, var1, var3 - var6, 20);

   for(int var8 = 0; var8 < 3; ++var8) {
      if(var8 == cq) {
         var0.fillRect(var1 - 10, var3 + var8 * var4, 8, 10);
      }

      var0.drawString(cp[var8], var1, var3 + var8 * var4/*, 20);
      String var9 = "";
      switch(var8) {
      case 0:
         var9 = Integer.toString(x);
         break;
      case 1:
         var9 = Integer.toString(y);
         break;
      case 2:
         var9 = Integer.toString(z);
      }

      var0.drawString(var9, var2, var3 + var8 * var4/*, 20);
   }

}

public static void c(e var0) {
   if(aaa != 4) {
      int var1 = ct;
      if(var0.i == 2) {
         var1 = cv;
      }

      bh.setColor(new Color(15131619));
      bh.fillRect(var1, cu, cr, cs);
      bh.setColor(new Color(16777215));
      bh.fillRect(var1, cu + cs, cr, cs);
      c var2 = bn;
      if(var0 == bw) {
         var2 = bo;
      }

      String var3 = Integer.toString(var0.m);
      if(var3.length() == 1) {
         var3 = "0" + var3;
      }

      var2.a(bh, var3, var1 + 2, cu, 20);
      a0 = 30;
   }
}

public static void a(Graphics var0, String var1, boolean var2) {
   int var3 = bm.a(var1) + 4;
   int var4 = bm.a + 4;
   int var5 = 0;
   if(!var2) {
      var5 = r - var3;
   }

   var0.setColor(new Color(6488245));
   var0.fillRect(var5, s - var4, var3, var4);
   var0.setColor(new Color(16776960));
   var0.fillRect(var5 + 1, s - var4 + 1, var3 - 2, var4 - 2);
   bm.a(var0, var1, var5 + 2, s - var4 + 2, 20);
}

public void paint(Graphics var1) {
   try {
      if(cy >= 0) {
         g(var1);
         String var8 = bk[6];
         if(c7) {
            var8 = bk[7];
         }

         a(var1, var8, false);
         return;
      }

      int var4;
      int var5;
      switch(aaa) {
      case 0:
         var1.drawImage(a8[0], 0, 0, new Color(20), null);
         break;
      case 1:
         this.a(var1);
         if(ff) {
            f(var1);
         }

         if(a0 > 0) {
            --a0;
            String var6 = bw.m + " - " + bx.m;
            bm.a(var1, var6, r >> 1, s >> 1, 3);
         }
         break;
      case 2:
         if(!hh) {
            ee = false;
            this.a(var1);
            hh = true;
         }

         g.a(var1, r, s, r, 1, 2, 4, g.a != 14 && g.a != 60 && g.a != 92 && g.a != 82?bm.a + 4:16, bm);
         if(g.a != 66 && g.a != 50) {
            a(var1, bk[1], false);
         }

         a(var1, bk[39], true);
      case 3:
      default:
         break;
      case 4:
         var1.setColor(new Color(0));
         var1.fillRect(0, 0, r, s);
         var4 = bw.d - ai;
         var5 = bw.e - aj;
         var1.setClip(var4 - a1, var5 - a1, a1 << 1, a1 << 1);
         a1 -= 8;
         if(a1 <= 0) {
            a(by, bz);
         }

         this.a(var1);
         break;
      case 5:
         e(var1);
         break;
      case 6:
      case 7:
         var1.setColor(new Color(0));
         var1.fillRect(0, 0, r, s);
         var4 = r >> 1;
         var5 = s >> 1;
         var1.setClip(var4 - a1, var5 - a1, a1 << 1, a1 << 1);
         e(var1);
         if(aaa == 6) {
            a1 += 8;
            if(a1 > r << 1) {
               aaa = 5;
            }
         } else {
            a1 -= 8;
            if(a1 < 0) {
               this.a();
               this.c();
            }
         }
         break;
      case 8:
      case 9:
      case 10:
         d(var1);
         break;
      case 11:
         b(var1);
         break;
      case 12:
         c(var1);
         break;
      case 13:
         int var2 = bm.a + 2;
         int var3 = s - (var2 << 2) >> 1;
         var1.setColor(new Color('\u9aef'));
         var1.fillRect(0, 0, r, s);
         bm.a(var1, bk[32], r >> 1, var3, 17);
         bm.a(var1, bk[33], r >> 1, var3 + var2, 17);
         bm.a(var1, bk[34], r >> 1, var3 + (var2 << 1), 17);
         bm.a(var1, bk[35], r >> 1, var3 + var2 * 3, 17);
         var1.drawImage(a7[1], r - 4, s + 2, new Color(40), null);
         break;
      case 14:
         if(q == -1) {
            var1.setColor(new Color('\u9aef'));
            var1.fillRect(0, 0, r, s);
            bm.a(var1, bk[45], r >> 1, s >> 1, 3);
         } else {
            ba = ImageIO.read(new File("/ad" + q + ".png"));
            var1.drawImage(ba, 0, 0, new Color(20), null);
         }
      }

      if(!ddd && aaa == 1) {
         bm.a(var1, bp, r >> 1, 0, 17);
      }
   } catch (Exception var7) {
      var7.printStackTrace();
   }

}

public static void a(String var0, int var1) {
   cy = var1;
   if(c2 == var0) {
      if(var1 >= 0) {
         cz = 0;
      } else {
         cz = 2;
      }

      c8 = 0;
   } else {
      c2 = var0;
      int var2 = bm.a(var0);
      if(var2 > 94) {
         a(var0, 94, 58);
         c0 = 100;
      } else {
         c0 = var2 + 4 + 2;
         a(var0, var2, 58);
      }

      c1 = c4 + 4 + 2;
      cz = 2;
   }
}

public static void g(Graphics var0) {
   if(cz > -1) {
      boolean var1 = h() != 0;
      int var2 = c0;
      int var3 = c1;
      var2 >>= cz;
      var3 >>= cz;
      int var4 = r - var2 >> 1;
      int var5;
      if(al - aj < c1) {
         var5 = (s >> 1) - var3 + bm.a + 8;
      } else {
         var5 = s - var3 - bm.a - 8;
      }

      var0.setColor(new Color(6724044));
      int var6 = var2;
      if(var1) {
         var6 = var2 + 9;
      }

      var0.fillRect(var4, var5, var6, var3 + 1);
      ++var4;
      ++var5;
      var0.setColor(new Color(6488245));
      int var7 = var4 + var2 - 2;
      int var8 = var3 - 2;
      var0.drawRect(var4, var5, var7 - var4, var8);
      if(var1) {
         var0.drawRect(var7, var5, 8, var8);
      }

      if(cz == 0) {
         var4 += 2;
         var5 += 2;
         a(var0, var4, var5);
         var0.setColor(new Color(16777215));
         int var9 = var4 + var2 - 2;
         if((h() & 1) != 0) {
            var0.drawImage(a8[58], var9, var5, new Color(20), null);
         }

         if((h() & 2) != 0) {
            var0.drawImage(a8[59], var9, var5 + var3 - 1 - 2 - 5, new Color(20), null);
         }
      }

      --cz;
   }

}

public void showNotify() {
   i.b();
   if(aaa == 1) {
      g.a(30);
      aaa = 2;
      hh = false;
      g.h = 2;
   }

   g.h = 2;
}

public static void a(String var0, int var1, int var2) {
   c8 = 0;
   c3 = var1;
   c4 = var2;
   db = 0;
   boolean var3 = true;
   char[] var4 = var0.toCharArray();
   int var5 = 0;
   int var6 = 0;
   int var7 = 0;
   int var8 = 0;
   int var9 = 0;
   boolean var10 = false;

   boolean var19;
   for(boolean var11 = false; !var10; ++var5) {
      char var12 = var4[var5];
      if(var12 == 32) {
         var8 += bm.b;
         var6 = var5;
         var9 = 0;
      } else if(var12 == 10) {
         var11 = true;
         var6 = var5;
         var9 = 0;
      } else {
         int var10000 = bm.a(var12);
         c var10001 = bm;
         int var13 = var10000 + 0;
         var9 += var13;
         var8 += var13;
         if(var8 > var1) {
            var11 = true;
         }
      }

      if(var5 == var4.length - 1) {
         var6 = var5 + 1;
         var11 = true;
         var10 = true;
         if(var7 > var5) {
            continue;
         }
      }

      if(var11) {
         var19 = var6 <= var7;
         if(var19) {
            var6 = var5;
         }

         dd[db] = new String(var4, var7, var6 - var7);
         if(var19) {
            var7 = var6;
            var8 = 0;
         } else {
            var7 = var6 + 1;
            var8 = var9;
         }

         var11 = false;
         ++db;
      }
   }

   c9 = new int[12];
   int var18 = 0;
   var19 = false;
   c5 = 0;
   int var14 = 0;

   for(int var15 = 0; var14 < db; ++var14) {
      String var20 = dd[var14];
      boolean var17 = false;
      int var21 = bm.a + 1;
      if(var21 + var15 > c4) {
         var19 = true;
      }

      var15 += var21;
      if((var19 || var14 == db - 1) && var15 > c5) {
         c5 = var15;
      }

      if(var19) {
         c9[var18++] = var14;
         var15 = var21;
         var19 = false;
      }
   }

   da = var18;
   c9[var18++] = db;
   if(da > 0) {
      c5 -= bm.a + 1;
   }

   c4 = c5;
   c7 = da == 0;
}

public static void a(Graphics var0, int var1, int var2) {
   c6 = true;
   int var3 = 0;
   int var4 = 0;

   while(true) {
      if(var3 == c9[var4]) {
         ++var4;
         if(var4 > c8) {
            return;
         }
      }

      String var5 = dd[var3];
      if(var4 == c8) {
         bm.a(var0, var5, var1, var2, 20);
         var2 += bm.a + 1;
      }

      ++var3;
   }
}

public static void b(int var0) {
   if(var0 == 2) {
      if(c8 < da) {
         ++c8;
      }

      if(c8 == da) {
         c7 = true;
      }
   } else if(var0 == 1 && c8 > 0) {
      --c8;
   }

   c6 = false;
}

public static int h() {
   int var0 = 0;
   if(c8 > 0) {
      var0 |= 1;
   }

   if(c8 < da) {
      var0 |= 2;
   }

   return var0;
}

public static int c(int var0) {
   return Math.abs(w.nextInt() % var0);
}

public static void i() throws IOException {
   a5.readFully(de);
   a5.readFully(dh);
   a5.readFully(di);
   df = new byte[(a5.readShort() & '\uffff') + 13];
   a5.readFully(df);
   a5.readFully(dg);
}

public static byte[] j() throws IOException {
   int var0 = a5.readShort() & '\uffff';
   byte[] var1 = new byte[var0];
   a5.readFully(var1);
   int var2 = df.length;
   byte[] var3 = new byte[33 + df.length + var0 + 12 + 12];
   byte var4 = 0;
   System.arraycopy(de, 0, var3, var4, 8);
   var4 = 8;
   int var5 = var4 + 3;
   System.arraycopy(dh, 0, var3, var5, 15);
   var4 = 8;
   var5 = var4 + 10;
   var3[var5++] = a5.readByte();
   var3[var5++] = a5.readByte();
   var5 += 2;
   var3[var5++] = a5.readByte();
   var3[var5++] = a5.readByte();
   a(var3, 12, 17);
   var4 = 33;
   System.arraycopy(df, 0, var3, var4, var2);
   var5 = var4 + var2;
   var5 += 2;
   var3[var5++] = (byte)(var0 >> 8);
   var3[var5++] = (byte)var0;
   System.arraycopy(di, 0, var3, var5, 4);
   var5 += 4;
   System.arraycopy(var1, 0, var3, var5, var0);
   a(var3, var5 - 4, var0 + 4);
   var5 += var0 + 4;
   System.arraycopy(dg, 0, var3, var5, 12);
   return var3;
}

public static Image[] d(int var0) throws IOException {
   Image[] var1 = new Image[var0];

   for(int var3 = 0; var3 < var0; ++var3) {
      var1[var3] = k();
   }

   return var1;
}

public static Image k() throws IOException {
   byte[] var0 = j();
   Image var1 = ImageIO.read(new ByteArrayInputStream(var0));
   return var1;
}

public static Image[] e(int var0) throws IOException {
   Image[] var1 = new Image[var0];

   for(int var2 = 0; var2 < var0; ++var2) {
      var1[var2] = l();
   }

   return var1;
}

public static void a(byte[] var0, int var1, int var2) {
   long var3 = 4294967295L;
   if(!dk) {
      int var7 = 256;

      while(true) {
         --var7;
         if(var7 < 0) {
            dk = true;
            break;
         }

         long var5 = (long)var7;

         for(int var8 = 0; var8 < 8; ++var8) {
            if((var5 & 1L) != 0L) {
               var5 = 3988292384L ^ var5 >> 1;
            } else {
               var5 >>= 1;
            }
         }

         dj[var7] = (int)var5;
      }
   }

   for(int var9 = 0; var9 < var2; ++var9) {
      var3 = (long)dj[(int)((var3 ^ (long)(var0[var1 + var9] & 255)) & 255L)] & 4294967295L ^ var3 >> 8;
   }

   var3 ^= 4294967295L;
   var1 += var2;
   var0[var1] = (byte)((int)(var3 >> 24));
   var0[var1 + 1] = (byte)((int)(var3 >> 16));
   var0[var1 + 2] = (byte)((int)(var3 >> 8));
   var0[var1 + 3] = (byte)((int)var3);
}

public static String[] b(String var0) throws IOException {
   DataInputStream var1 = new DataInputStream(var0.getClass().getResourceAsStream(var0));
   int var2 = var1.readInt();
   String[] var3 = new String[var2];

   for(int var4 = 0; var4 < var2; ++var4) {
      var3[var4] = var1.readUTF();
   }

   return var3;
}

public static Image l() {
   try {
      int var0 = a5.readInt();
      byte[] var1 = new byte[var0];
      a5.readFully(var1);
      return ImageIO.read(new ByteArrayInputStream(var1));
//      return Image.createImage(var1, 0, var0);
   } catch (Exception var2) {
      var2.printStackTrace();
      return null;
   }
}

public static byte[] m() {
   try {
      int var0 = a5.readInt();
      byte[] var1 = new byte[var0];
      a5.readFully(var1);
      return var1;
   } catch (Exception var2) {
      var2.printStackTrace();
      return null;
   }
}

public static int f(int var0) {
   try {
      var0 = g(var0 + 90);
      return h(var0);
   } catch (Exception var2) {
      System.out.println("cos: " + var2);
      return 0;
   }
}

public static int g(int var0) {
   return var0 < 0?360 + var0:(var0 > 359?var0 - 360:var0);
}

public static int h(int var0) {
   try {
      return var0 < 90?dl[var0]:(var0 == 90?128:(var0 < 180?dl[180 - var0]:(var0 == 180?0:(var0 < 270?-dl[var0 - 180]:(var0 == 270?-128:(var0 < 360?-dl[360 - var0]:1))))));
   } catch (Exception var2) {
      System.out.println("sin: " + var2);
      return 1;
   }
}

public static int b(int var0, int var1, int var2, int var3) {
   boolean var4 = true;
   boolean var5 = true;
   int var6 = var0 - var2;
   int var7 = var1 - var3;
   if(var7 < 0) {
      var5 = false;
   }

   if(var6 < 0) {
      var4 = false;
   }

   if(var6 == 0) {
      return var7 >= 0?0:180;
   } else if(var7 == 0) {
      return var6 >= 0?270:90;
   } else {
      var6 = Math.abs(var6);
      var7 = Math.abs(var7);
      int var8 = var6 + var7;
      var6 = var6 * 10 / var8;
      var7 = var7 * 10 / var8;
      return !var4 && var5?dm[var6][var7]:(!var4 && !var5?90 + dm[var7][var6]:(var4 && !var5?180 + dm[var6][var7]:(var4 && var5?270 + dm[var7][var6]:-1)));
   }
}

public static int b(int var0, int var1) {
   if(Math.abs(var0 - var1) <= e.a0) {
      return 0;
   } else {
      int var2;
      int var3;
      if(var1 >= var0) {
         var2 = var1 - var0;
         var3 = 360 - var1 + var0;
         return var2 <= var3?3:2;
      } else {
         var2 = var0 - var1;
         var3 = 360 - var0 + var1;
         return var2 <= var3?2:3;
      }
   }
}

public void a(String var1, String var2) {}

public static void i(int var0) {
   du = dx[var0].length();
   dv = 0;
   d6 = true;
   d5 = System.currentTimeMillis() + (long)d7;
   dw = var0;
   du = dx[dw].length();
   dv = 0;
}

}*/