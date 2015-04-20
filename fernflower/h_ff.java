public class h {

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

}