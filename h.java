import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
//import java.io.PrintStream;
import java.util.Timer;

public class h {
    private static byte[] a;
    private static int[] b;
    private static int c;
    private static int d;
//    private static Player e;
//    private static StopTimeControl f;
//    private static Player g;
//    private static StopTimeControl h;
//    private static Sound[] i;
    private static Timer j = new Timer();
    public static final String[] k = { "audio/midi", "audio/x-wav" };

    public static void a(DataInputStream paramDataInputStream)
        throws Exception {
        int m = paramDataInputStream.readByte();
        int i2 = m;
        do {
            i2--;
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
//                ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
                if (n == 0) {
                    System.out.println("midi file..");
//                    e = Manager.createPlayer(localByteArrayInputStream, k[n]);
//                    e.realize();
//                    e.prefetch();
                    System.out.println("loaded midi file " + i1);
                }
                else {
//                    g = Manager.createPlayer(localByteArrayInputStream, k[n]);
//                    g.realize();
//                    g.prefetch();
                }
                break;
            case 2:
                int i4 = paramDataInputStream.readByte();
                //i = new Sound[i4];
                for (int i5 = 0; i5 < i4; i5++) {
                    i1 = paramDataInputStream.readInt();
                    arrayOfByte = new byte[i1];
                    paramDataInputStream.readFully(arrayOfByte);
//                    i[i5] = new Sound(arrayOfByte, 1);
                }
            }
        }
        while (i2 > 0);
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
//            i[b[(paramInt1 << 1)]].play(paramInt2);
            return;
        }
//        Player localPlayer = e;
//        StopTimeControl localStopTimeControl = f;
        switch (m) {
        case 1:
//            localPlayer = g;
//            localStopTimeControl = h;
        }
//        if (localPlayer.getState() == 400)
//            if ((d == 1) && (paramInt1 != 1))
//                localPlayer.stop();
//            else
//                return;
        d = paramInt1;
//        localPlayer.setMediaTime(b[(paramInt1 << 1)]);
        System.out.println("start time = " + b[(paramInt1 << 1)]);
        int n = b[(paramInt1 << 1)];
        int i1 = b[((paramInt1 << 1) + 1)];
        System.out.println("end time = " + i1);
//        j.schedule(new k(localPlayer), (i1 - n) / 1000);
//        localPlayer.start();
    }
}

/* Location:           /Users/ilya/4fun/Biplanes/Bluetooth_Biplanes.jar
 * Qualified Name:     h
 * JD-Core Version:    0.6.2
 */

/*public class h {

private static byte[] a;
private static int[] b;
private static int c;
private static int d;
//private static Player e;
//private static StopTimeControl f;
//private static Player g;
//private static StopTimeControl h;
//private static Sound[] i;
private static Timer j = new Timer();
public static final String[] k = new String[]{"audio/midi", "audio/x-wav"};


public static void a(DataInputStream var0) throws Exception {
   byte var1 = var0.readByte();
   int var5 = var1;

   while(true) {
      --var5;
      if(var5 < 0) {
         c = var0.readShort();
         a = new byte[c];
         var0.readFully(a);
         b = new int[c << 1];

         for(int var9 = 0; var9 < c; ++var9) {
            b[var9 << 1] = var0.readInt();
            b[(var9 << 1) + 1] = var0.readInt();
         }

         return;
      }

      byte var2 = var0.readByte();
      System.out.println("type = " + var2);
      int var3;
      byte[] var4;
      switch(var2) {
      case 0:
      case 1:
         var3 = var0.readInt();
         var4 = new byte[var3];
         var0.readFully(var4);
         ByteArrayInputStream var6 = new ByteArrayInputStream(var4);
         if(var2 == 0) {
            System.out.println("midi file..");
//            e = Manager.createPlayer(var6, k[var2]);
//            e.realize();
//            e.prefetch();
            System.out.println("loaded midi file " + var3);
         } else {
//            g = Manager.createPlayer(var6, k[var2]);
//            g.realize();
//            g.prefetch();
         }
         break;
      case 2:
         byte var7 = var0.readByte();
//         i = new Sound[var7];

         for(int var8 = 0; var8 < var7; ++var8) {
            var3 = var0.readInt();
            var4 = new byte[var3];
            var0.readFully(var4);
//            i[var8] = new Sound(var4, 1);
         }
      }
   }
}

public static void a(int var0, int var1) throws Exception {
   byte var2 = a[var0];
   if(var2 != -1) {
      if(var2 == 2) {
//         i[b[var0 << 1]].play(var1);
      } else {
//         Player var3 = e;
//         StopTimeControl var4 = f;
         switch(var2) {
         case 1:
//            var3 = g;
//            var4 = h;
         }

//         if(var3.getState() == 400) {
//            if(d != 1 || var0 == 1) {
//               return;
//            }
//
//            var3.stop();
//         }

         d = var0;
//         var3.setMediaTime((long)b[var0 << 1]);
         System.out.println("start time = " + b[var0 << 1]);
         int var5 = b[var0 << 1];
         int var6 = b[(var0 << 1) + 1];
         System.out.println("end time = " + var6);
//         j.schedule(new k(var3), (long)((var6 - var5) / 1000));
//         var3.start();
      }
   }
}

}*/