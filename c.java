import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
import javax.imageio.ImageIO;

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

    public c(String paramString) {
        try {
            DataInputStream localDataInputStream = new DataInputStream(getClass().getResourceAsStream(paramString));
            localDataInputStream.readByte();
            int j = localDataInputStream.readByte();
            int k = localDataInputStream.readByte();
            int m = localDataInputStream.readByte();
            this.a = m;
            this.b = (k >> 1);
            char[] arrayOfChar = localDataInputStream.readUTF().toCharArray();
            int n = arrayOfChar.length;
            this.d = new short[n];
            this.e = new short[n];
            int[] arrayOfInt1 = new int[16];
            for (int i1 = 0; i1 < n; i1++) {
                char i2 = arrayOfChar[i1];
                arrayOfInt1[(i2 & 0xF)] += 1;
            }
            for (int i2 = 0; i2 < 16; i2++)
                this.g[i2] = new int[arrayOfInt1[i2] << 1];
            
            arrayOfInt1 = new int[16];
            for (int i3 = 0; i3 < n; i3++) {
                char i4 = arrayOfChar[i3];
                this.d[i3] = ((short)(i3 % j * k));
                this.e[i3] = ((short)(i3 / j * m));
                int i5 = i4 & 0xF;
                int[] arrayOfInt2 = this.g[i5];
                int i6 = arrayOfInt1[i5];
                arrayOfInt2[i6] = i4;
                arrayOfInt2[(i6 + 1)] = i3;
                arrayOfInt1[i5] += 2;
            }
            this.f = new byte[n];
            localDataInputStream.readFully(this.f);
            int i4 = localDataInputStream.readInt();
            byte[] arrayOfByte = new byte[i4];
            localDataInputStream.readFully(arrayOfByte);
            this.c = ImageIO.read(new ByteArrayInputStream(arrayOfByte));
            localDataInputStream.close();
        }
        catch (Exception localException) {
            localException.printStackTrace();
            throw new IllegalArgumentException();
        }
    }

    public String[] a(String paramString, int paramInt) {
        String[] localObject = new String[10];
        int j = 0;
        int k = 10;
        char[] arrayOfChar = paramString.toCharArray();
        int m = 0;
        int n = 0;
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        label413: 
        while (i4 == 0) {
            if (m == arrayOfChar.length) {
                n = m;
                i5 = 1;
                i4 = 1;
                if (i1 > m)
                    break label413;
            }
            else {
                char c1 = arrayOfChar[m];
                if (i6 != 0) {
                    if (c1 == 'n') {
                        i1 = m + 1;
                    }
                    else {
                        i5 = 1;
                        i7 = 1;
                        if ((c1 == 'i') || (c1 == 'g')) {
                            n = m + 3;
                            i1 = m - 1;
                        }
                        else {
                            n = m + 1;
                            i1 = m - 1;
                        }
                        i3 = 0;
                    }
                    i6 = 0;
                }
                else if (c1 == '\n') {
                    i5 = 1;
                    n = m;
                    i3 = 0;
                }
                else if (c1 == '\\') {
                    i6 = 1;
                    if ((i1 < m) || (arrayOfChar[(m + 1)] == 'n')) {
                        i5 = 1;
                        n = m;
                        i3 = 0;
                    }
                }
                else if (c1 == ' ') {
                    i2 += this.b;
                    n = m;
                    i3 = 0;
                }
                else {
                    int i9 = a(c1) + 0;
                    i3 += i9;
                    i2 += i9;
                    if (i2 > paramInt)
                        i5 = 1;
                }
            }
            if (i5 != 0) {
                if (j >= k) {
                    k += 5;
                    String[] arrayOfString1 = new String[k];
                    int i9 = localObject.length;
                    do {
                        i9--;
                        arrayOfString1[i9] = localObject[i9];
                    }
                    while (i9 > 0);
                    localObject = arrayOfString1;
                }
                int i8 = n <= i1 ? 1 : 0;
                if (i8 != 0)
                    n = m;
                localObject[j] = new String(arrayOfChar, i1, n - i1);
                if ((i8 != 0) || (i7 != 0)) {
                    i1 = n;
                    i2 = 0;
                }
                else {
                    i1 = n + 1;
                    i2 = i3;
                }
                i5 = 0;
                i7 = 0;
                j++;
            }
            m++;
        }
        String[] arrayOfString2 = new String[j];
        int i9 = j;
        do {
            i9--;
            arrayOfString2[i9] = localObject[i9];
        }
        while (i9 > 0);
        return arrayOfString2;
    }

    public int a(String paramString) {
        return a(paramString.toCharArray(), 0, paramString.length());
    }

    public int a(char[] paramArrayOfChar, int paramInt1, int paramInt2) {
        int j = 0;
        int k = paramInt2;
        do {
            k--;
            char c1 = paramArrayOfChar[paramInt1];
            j += a(c1);
            if ((c1 != ' ') && (k != 0))
                j += 0;
            paramInt1++;
        }
        while (k > 0);
        return j;
    }

    public int a(char paramChar) {
        if (paramChar == ' ')
            return this.b;
        int j = a((int)paramChar);
        if (j == -1)
            return 0;
         return this.f[j];
    }

    private int a(int paramInt) {
        int j = -1;
        int[] arrayOfInt = this.g[(paramInt & 0xF)];
        for (int k = arrayOfInt.length - 2; k >= 0; k -= 2) {
            int m = arrayOfInt[k];
            if (m == paramInt) {
                j = arrayOfInt[(k + 1)];
                break;
            }
        }
        return j;
    }

    public void a(Graphics paramGraphics, String[] paramArrayOfString, int paramInt1, int paramInt2, int paramInt3) {
        int j = paramArrayOfString.length;
        for (int k = 0; k < j; k++) {
            a(paramGraphics, paramArrayOfString[k].toCharArray(), paramInt1, paramInt2, paramInt3);
            paramInt2 += this.a + 0;
        }
    }

    public void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3) {
        a(paramGraphics, paramString.toCharArray(), paramInt1, paramInt2, paramInt3);
    }

    public void a(Graphics paramGraphics, char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3) {
        if ((paramInt3 & h) > 0) {
            int j = a(paramArrayOfChar, 0, paramArrayOfChar.length);
            if ((paramInt3 & 0x8) > 0)
                paramInt1 -= j;
            else if ((paramInt3 & 0x1) > 0)
                paramInt1 -= j / 2;
            if ((paramInt3 & 0x20) > 0)
                paramInt2 -= this.a;
            else if ((paramInt3 & 0x2) > 0)
                paramInt2 -= this.a / 2;
        }
        a(paramGraphics, paramArrayOfChar, paramInt1, paramInt2);
    }

    private void a(Graphics paramGraphics, char[] paramArrayOfChar, int paramInt1, int paramInt2) {
    	Rectangle tmp = paramGraphics.getClipBounds();
        int j = tmp.x;
        int k = tmp.y;
        int m = tmp.width;
        int n = tmp.height;
        int i1 = paramArrayOfChar.length;
        int i2 = 0;
        paramGraphics.setClip(j, k, m, n);
        for (int i3 = 0; i3 < i1; i3++) {
            int i4 = paramArrayOfChar[i3];
            if (i != null)
                i2 = i[i3];
            if (i4 == 32) {
                paramInt1 += this.b;
            }
            else {
                int i5 = a(i4);
                if (i5 != -1) {
                    int i6 = this.f[i5];
                    int i7 = paramInt2 + i2;
                    paramGraphics.clipRect(paramInt1, i7, i6, this.a);
                    paramGraphics.drawImage(this.c, paramInt1 - this.d[i5], i7 - this.e[i5], new Color(20), null);
                    paramGraphics.setClip(j, k, m, n);
                    paramInt1 += i6 + 0;
                }
            }
        }
        paramGraphics.setClip(j, k, m, n);
    }
}

/* Location:           /Users/ilya/4fun/Biplanes/Bluetooth_Biplanes.jar
 * Qualified Name:     c
 * JD-Core Version:    0.6.2
 */


/*public class c {

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

}*/