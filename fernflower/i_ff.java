public final class i {

public static boolean a;
public static final int[] b = new int[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, -10, -11, -13, -12, -20, -21, -1, -2, -3, -4, -6, -7, -5, 42, 35};
private static final int[][] c = new int[][]{{0}, {1}, {2, 10}, {3}, {4, 12}, {5, 14}, {6, 13}, {7}, {8, 11}, {9}, {10, 20}, {11, 21}, {12, 19}, {13}, {15}, {16}, {10, 20}, {11, 21}, {12, 19}, {13}, {15}, {16}, {14}, {17}, {18, 14}};
public static boolean[] d = new boolean[22];
private static int e = 0;
private static int f = 0;
private static int[] g = new int[20];


private static int[] d(int var0) {
   for(int var1 = 0; var1 < b.length; ++var1) {
      if(var0 == b[var1]) {
         return c[var1];
      }
   }

   return null;
}

public static void a(int var0) {
   int[] var1 = d(var0);
   if(var1 != null) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         int var3 = var1[var2];
         e(var3);
         d[var3] = true;
      }
   }

   a = true;
}

private static void e(int var0) {
   g[f++] = var0;
   if(f >= 20) {
      f = 0;
   }

   if(f == e) {
      ++e;
      if(e >= 20) {
         e = 0;
      }
   }

}

public static void b(int var0) {
   a = false;
   int[] var1 = d(var0);
   if(var1 != null) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         int var3 = var1[var2];
         if(d[var3]) {
            d[var3] = false;
         }
      }

   }
}

public static boolean c(int var0) {
   return d[var0];
}

public static int a() {
   if(e == f) {
      return -66;
   } else {
      int var0 = g[e++];
      if(e >= 20) {
         e = 0;
      }

      return var0;
   }
}

public static void b() {
   int var0 = 22;

   while(true) {
      --var0;
      if(var0 < 0) {
         a = false;
         return;
      }

      d[var0] = false;
   }
}

}*/