public class g {

public static int a;
public static int bb;
public static int c;
private static String d;
private static byte[] e;
private static byte[] f;
public static String[] g;
public static int h;
public static int i;
public static boolean j;


public static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, c var8) {
   int var9 = 0;
   if(d != null) {
      var9 = var8.a(d);
   }

   int var12 = bb;

   while(true) {
      --var12;
      if(var12 < 0) {
         int var13 = bb;
         if(d != null) {
            ++var13;
         }

         int var14 = var13 * var7 + 2 + 4 - 6;
         int var15 = var9 + 4 + 4;
         if(var15 < var3) {
            var15 = var3;
         }

         int var16 = 0;
         int var17 = 0;
         switch(var4) {
         case 1:
            var16 = var1 - var15 >> 1;
            break;
         case 4:
            var16 = 0;
            break;
         case 8:
            var16 = var1 - var15;
         }

         switch(var5) {
         case 2:
            var17 = var2 - var14 >> 1;
            break;
         case 16:
            var17 = 0;
            break;
         case 32:
            var17 = var2 - var14;
         }

         int var18;
         int var19;
         int var20;
         int var21;
         if(h > 0) {
            var0.setColor(new Color(6488245));
            var0.fillRect(var16, var17, var15, var14);
            var0.setColor(new Color(16671843));
            var0.fillRect(var16 + 2, var17 + 2, var15 - 4, var14 - 4);
            var18 = var17 + 2 + 2;
            var19 = var16 + 2 + 2;
            switch(var6) {
            case 1:
               var19 = var16 + (var15 >> 1);
            case 8:
            default:
               var20 = var7 - (var7 >> 1);
               if(d != null) {
                  var0.setColor(new Color(6724044));
                  var0.fillRect(var16 + 2, var18 - 2, var15 - 4, var20 + 2);
                  var8.a(var0, d, var19, var18 - 7, var6);
                  var18 += var20;
               }

               var21 = 0;
            }

            for(; var21 < bb; ++var21) {
               if(var21 == c) {
                  var0.setColor(new Color(16776960));
                  var0.fillRect(var16 + 2, var18, var15 - 4, var7);
               }

               if(a(var0, var21, var19, var18)) {
                  var19 += 18;
               }

               var8.a(var0, g[e[var21]], var19, var18 + (var7 >> 1), var6 | 2);
               var18 += var7;
               if(a == 14 || a == 60 || a == 92 || a == 82) {
                  var19 -= 18;
               }
            }

            --h;
         }

         var18 = var17 + 2 + 2 + c * var7;
         var19 = var16 + 2 + 2;
         if(d != null) {
            var20 = var7 - (var7 >> 1);
            var18 += var20;
         }

         var20 = var15 - 4;
         boolean var26 = false;
         boolean var22 = false;
         int var23 = 0;
         var21 = var20 / 24;
         int var27 = var21 * 24;
         if(var27 < var20) {
            var23 = var20 - var27;
         }

         int var24 = 0;
         boolean var25 = false;

         for(int var28 = 0; var28 < 24; ++var28) {
            a(var0, var28, true);
            var0.fillRect(var16 + 2 + var24, var18, var21, var7);
            a(var0, var28, false);
            var0.fillRect(var16 + 2 + var24, var18 + 1, var21, var7 - 2);
            var24 += var21;
         }

         if(var23 != 0) {
            a(var0, 24, true);
            var0.fillRect(var16 + 2 + var24, var18, var23, var7);
            a(var0, 24, false);
            var0.fillRect(var16 + 2 + var24, var18 + 1, var23, var7 - 2);
         }

         if(a(var0, c, var19, var18)) {
            var19 += 18;
         }

         var8.a(var0, g[e[c]], var19, var18 + (var7 >> 1), var6 | 2);
         if(!j) {
            ++i;
            if(i > 24) {
               j = true;
            }
         } else {
            --i;
            if(i < 0) {
               j = false;
            }
         }

         return;
      }

      int var10 = var8.a(g[e[var12]]);
      if(var10 > var9) {
         var9 = var10;
      }
   }
}

public static void a(Graphics var0, int var1, boolean var2) {
   int var6 = Math.abs(i - var1);
   if(var2) {
      var6 = 24 - var6;
   }

   short var7 = 256;
   int var8 = (24 - var6) * var7 / 24;
   int var3 = var8 * 255 + (var7 - var8) * 67;
   int var4 = var8 * 255 + (var7 - var8) * 137;
   int var5 = var8 * 0 + (var7 - var8) * 67;
   var3 /= var7;
   var4 /= var7;
   var5 /= var7;
   if(var2) {
      var3 -= 32;
      var4 -= 32;
      var5 -= 32;
   }

   var3 = var3 < 0?0:var3;
   var4 = var4 < 0?0:var4;
   var5 = var5 < 0?0:var5;
   var0.setColor(new Color(var3, var4, var5));
}

public static boolean a(Graphics var0, int var1, int var2, int var3) {
   if(a != 14 && a != 92) {
      if(a != 60 && a != 82) {
         return false;
      } else {
         if(var1 != 0 && !b.af[var1 - 1]) {
            var0.drawImage(b.a8[52], var2, var3, new Color(20), null);
         } else {
            var0.drawImage(b.a8[47 + var1], var2, var3, new Color(20), null);
         }

         var2 += 18;
         return true;
      }
   } else {
      if(var1 != 0 && !b.af[var1 - 1]) {
         var0.drawImage(b.a8[51], var2, var3, new Color(20), null);
      } else {
         var0.drawImage(b.a8[43 + var1], var2, var3, new Color(20), null);
      }

      var2 += 18;
      return true;
   }
}

public static void a(int var0) {
   b.hh = false;
   h = 2;
   a = var0 << 1;
   a();
}

public static void b(int var0) {
   switch(var0) {
   case 0:
      --c;
      if(c < 0) {
         c = bb - 1;
      }
      break;
   case 1:
      ++c;
      if(c == bb) {
         c = 0;
      }
      break;
   case 2:
      int var1 = e[c] << 1;
      switch(f[var1]) {
      case 3:
         a(0);
         byte var2 = f[var1 + 1];
         b.a(var2);
         break;
      default:
         if(b.o != 0) {
            ;
         }

         b.hh = false;
         a = var1;
         a();
      }
   }

   h = 2;
}

private static void a(boolean var0) {
   int var1 = f[a + 1];
   if(!var0) {
      switch(f[a]) {
      case 0:
         d = null;
         break;
      case 1:
         d = g[a >> 1];
         break;
      case 2:
         a += 2;
         d = g[a >> 1];
      }
   }

   a += 2;

   while(a < f.length && var1 > 0) {
      byte var3 = f[a];
      switch(var3) {
      case 0:
      case 1:
      case 2:
         if(!var0) {
            e[bb] = (byte)(a >> 1);
            ++bb;
         }

         --var1;
         a(true);
         break;
      case 3:
         if(!var0) {
            e[bb] = (byte)(a >> 1);
            ++bb;
         }

         --var1;
      default:
         a += 2;
      }
   }

}

public static void a() {
   h = 2;
   bb = 0;
   c = 0;
   a(false);
}

public static void a(byte[] var0) {
   f = var0;
   e = new byte[6];
   a(false);
}
}