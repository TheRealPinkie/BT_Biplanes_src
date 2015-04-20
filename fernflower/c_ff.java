public class c {

public final int a;
public final int b;
private Image c;
private short[] d;
private short[] e;
private byte[] f;
private int[][] g = new int[16][];
private static int h = 43;
public static int[] i = null;


public c(String var1) {
   try {
      DataInputStream var2 = new DataInputStream(this.getClass().getResourceAsStream(var1));
      var2.readByte();
      byte var3 = var2.readByte();
      byte var4 = var2.readByte();
      byte var5 = var2.readByte();
      this.a = var5;
      this.b = var4 >> 1;
      char[] var6 = var2.readUTF().toCharArray();
      int var7 = var6.length;
      this.d = new short[var7];
      this.e = new short[var7];
      int[] var8 = new int[16];

      for(int var9 = 0; var9 < var7; ++var9) {
         char var10 = var6[var9];
         ++var8[var10 & 15];
      }

      int var17 = 16;

      while(true) {
         --var17;
         if(var17 < 0) {
            var8 = new int[16];

            for(int var11 = 0; var11 < var7; ++var11) {
               char var12 = var6[var11];
               this.d[var11] = (short)(var11 % var3 * var4);
               this.e[var11] = (short)(var11 / var3 * var5);
               int var13 = var12 & 15;
               int[] var14 = this.g[var13];
               int var15 = var8[var13];
               var14[var15] = var12;
               var14[var15 + 1] = var11;
               var8[var13] += 2;
            }

            this.f = new byte[var7];
            var2.readFully(this.f);
            int var18 = var2.readInt();
            byte[] var19 = new byte[var18];
            var2.readFully(var19);
            this.c = ImageIO.read(new ByteArrayInputStream(var19));
//            this.c = Image.createImage(var19, 0, var19.length);
            var2.close();
            return;
         }

         this.g[var17] = new int[var8[var17] << 1];
      }
   } catch (Exception var16) {
      var16.printStackTrace();
      throw new IllegalArgumentException();
   }
}

public String[] a(String var1, int var2) {
   String[] var3 = new String[10];
   int var4 = 0;
   int var5 = 10;
   char[] var6 = var1.toCharArray();
   int var7 = 0;
   int var8 = 0;
   int var9 = 0;
   int var10 = 0;
   int var11 = 0;
   boolean var12 = false;
   boolean var13 = false;
   boolean var14 = false;

   int var17;
   String[] var18;
   for(boolean var15 = false; !var12; ++var7) {
      if(var7 == var6.length) {
         var8 = var7;
         var13 = true;
         var12 = true;
         if(var9 > var7) {
            continue;
         }
      } else {
         char var16 = var6[var7];
         if(var14) {
            if(var16 == 110) {
               var9 = var7 + 1;
            } else {
               var13 = true;
               var15 = true;
               if(var16 != 105 && var16 != 103) {
                  var8 = var7 + 1;
                  var9 = var7 - 1;
               } else {
                  var8 = var7 + 3;
                  var9 = var7 - 1;
               }

               var11 = 0;
            }

            var14 = false;
         } else if(var16 == 10) {
            var13 = true;
            var8 = var7;
            var11 = 0;
         } else if(var16 == 92) {
            var14 = true;
            if(var9 < var7 || var6[var7 + 1] == 110) {
               var13 = true;
               var8 = var7;
               var11 = 0;
            }
         } else if(var16 == 32) {
            var10 += this.b;
            var8 = var7;
            var11 = 0;
         } else {
            var17 = this.a(var16) + 0;
            var11 += var17;
            var10 += var17;
            if(var10 > var2) {
               var13 = true;
            }
         }
      }

      if(var13) {
         if(var4 >= var5) {
            var5 += 5;
            var18 = new String[var5];
            var17 = var3.length;

            while(true) {
               --var17;
               if(var17 < 0) {
                  var3 = var18;
                  break;
               }

               var18[var17] = var3[var17];
            }
         }

         boolean var19 = var8 <= var9;
         if(var19) {
            var8 = var7;
         }

         var3[var4] = new String(var6, var9, var8 - var9);
         if(!var19 && !var15) {
            var9 = var8 + 1;
            var10 = var11;
         } else {
            var9 = var8;
            var10 = 0;
         }

         var13 = false;
         var15 = false;
         ++var4;
      }
   }

   var18 = new String[var4];
   var17 = var4;

   while(true) {
      --var17;
      if(var17 < 0) {
         return var18;
      }

      var18[var17] = var3[var17];
   }
}

public int a(String var1) {
   return this.a(var1.toCharArray(), 0, var1.length());
}

public int a(char[] var1, int var2, int var3) {
   int var4 = 0;
   int var5 = var3;

   while(true) {
      --var5;
      if(var5 < 0) {
         return var4;
      }

      char var6 = var1[var2];
      var4 += this.a(var6);
      if(var6 != 32 && var5 != 0) {
         var4 += 0;
      }

      ++var2;
   }
}

public int a(char var1) {
   if(var1 == 32) {
      return this.b;
   } else {
      int var2 = this.a((int)var1);
      return var2 == -1?0:this.f[var2];
   }
}

private int a(int var1) {
   int var2 = -1;
   int[] var3 = this.g[var1 & 15];

   for(int var4 = var3.length - 2; var4 >= 0; var4 -= 2) {
      int var5 = var3[var4];
      if(var5 == var1) {
         var2 = var3[var4 + 1];
         break;
      }
   }

   return var2;
}

public void a(Graphics var1, String[] var2, int var3, int var4, int var5) {
   int var6 = var2.length;

   for(int var7 = 0; var7 < var6; ++var7) {
      this.a(var1, var2[var7].toCharArray(), var3, var4, var5);
      var4 += this.a + 0;
   }

}

public void a(Graphics var1, String var2, int var3, int var4, int var5) {
   this.a(var1, var2.toCharArray(), var3, var4, var5);
}

public void a(Graphics var1, char[] var2, int var3, int var4, int var5) {
   if((var5 & h) > 0) {
      int var6 = this.a(var2, 0, var2.length);
      if((var5 & 8) > 0) {
         var3 -= var6;
      } else if((var5 & 1) > 0) {
         var3 -= var6 / 2;
      }

      if((var5 & 32) > 0) {
         var4 -= this.a;
      } else if((var5 & 2) > 0) {
         var4 -= this.a / 2;
      }
   }

   this.a(var1, var2, var3, var4);
}

private void a(Graphics var1, char[] var2, int var3, int var4) {
	  Rectangle tmp = var1.getClipBounds();
   int var5 = tmp.x;
   int var6 = tmp.y;
   int var7 = tmp.width;
   int var8 = tmp.height;
   int var9 = var2.length;
   int var10 = 0;
   var1.setClip(var5, var6, var7, var8);

   for(int var11 = 0; var11 < var9; ++var11) {
      char var12 = var2[var11];
      if(i != null) {
         var10 = i[var11];
      }

      if(var12 == 32) {
         var3 += this.b;
      } else {
         int var13 = this.a((int)var12);
         if(var13 != -1) {
            byte var14 = this.f[var13];
            int var15 = var4 + var10;
            var1.clipRect(var3, var15, var14, this.a);
            var1.drawImage(this.c, var3 - this.d[var13], var15 - this.e[var13], new Color(20), null);
            var1.setClip(var5, var6, var7, var8);
            var3 += var14 + 0;
         }
      }
   }

   var1.setClip(var5, var6, var7, var8);
}

}