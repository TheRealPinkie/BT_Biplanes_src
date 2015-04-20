public class e {

public int a;
public int bb;
public int c;
public int d;
public int e;
public int f;
public int g;
public int h;
public int i;
public int j;
public int k;
public int l;
public int m;
public int n;
public int o;
public int p;
public int q;
public int r;
public int s;
public int t;
public int u;
public int v;
public int w;
public int x;
public int y;
public int z;
public int aa;
public int ab;
public int ac;
public int ad;
public int ae;
public int af;
public int ag;
public int ah;
public int ai;
public int aj;
public int ak;
public int al;
public int am;
public String an = "";
public e ao;
public boolean ap;
public boolean aq;
public boolean ar;
public boolean as;
public boolean at;
public boolean au;
public f[] av = new f[2];
public int[] aw;
public int[] ax;
public int[] ay;
public static final int[] az = new int[32];
public static final int a0 = 22;


public e(boolean var1) {
   int var2 = 2;

   while(true) {
      --var2;
      if(var2 < 0) {
         this.aw = new int[6];
         this.ax = new int[6];
         this.ay = new int[6];
         int var3 = 6;

         while(true) {
            --var3;
            if(var3 < 0) {
               this.ap = false;
               this.aq = var1;
               return;
            }

            this.aw[var3] = -1;
         }
      }

      this.av[var2] = new f(this);
   }
}

public void a() {
   if(this.k <= 0 && this.v == 0) {
      if(this.a == 1) {
         int var1 = 2;

         while(true) {
            --var1;
            if(var1 < 0) {
               break;
            }

            if(this.av[var1].bb == 255) {
               this.av[var1].a(this.bb, this.c, this.h);
               this.k = 10;
               return;
            }
         }
      }

   }
}

public void a(int var1) {
   this.af = var1;
   this.an = Integer.toString(var1) + "%";
}

public void a(boolean var1) {
   ++this.n;
   if(var1) {
      ++this.o;
   }

   this.af = this.o * 100 / this.n;
   this.an = Integer.toString(this.af) + "%";
}

public void b() {
   if(this.a != 2) {
      if(this.a == 1 && this.v == 0) {
         b.a(5, 1);
         this.w = this.bb;
         this.x = this.c;
         this.v = 1;
         int var1;
         if(this.i == 2) {
            var1 = b.g(this.h + 90);
         } else {
            var1 = b.g(this.h - 90);
         }

         this.y = b.h(var1) * 300 >> 7;
         this.z = -(b.f(var1) * 300) >> 7;
      } else {
         if(this.v == 1) {
            this.z += -60;
            if(this.z < 20) {
               this.z = 20;
            }

            this.v = 2;
            this.ac = 1;
         }

      }
   }
}

public void a(int var1, int var2, int var3, int var4) {
   this.i = var4;
   if(var4 == 3) {
      b.bw = this;
   } else {
      b.bx = this;
   }

   this.m = 0;
   this.n = 0;
   this.o = 0;
   this.af = 0;
   this.an = "000%";
   b.c(this);
   this.at = true;
   int var5 = this.u * 7;
   this.ag = b.bs[var5++];
   this.ah = b.bs[var5++];
   this.ai = b.bs[var5++];
   this.aj = b.bs[var5++];
   this.ak = b.bs[var5++];
   this.al = b.bs[var5++];
   this.am = b.bs[var5++];
   this.b(var1, var2, var3, var4);
   this.d = var2;
   this.e = var3;
}

public void b(int var1, int var2, int var3, int var4) {
   this.a = var1;
   this.bb = var2 << 6;
   this.c = var3 << 6;
   this.g = 0;
   this.p = 0;
   this.r = 255;
   this.s = 0;
   switch(var1) {
   case 0:
      this.f = 1;
      if(var4 == 2) {
         this.h = 270;
      } else {
         this.h = 90;
      }
   default:
      this.au = false;
      this.ap = true;
      this.ar = false;
      this.as = false;
      this.v = 0;
      int var5 = 6;

      while(true) {
         --var5;
         if(var5 < 0) {
            int var6 = 2;

            while(true) {
               --var6;
               if(var6 < 0) {
                  return;
               }

               this.av[var6].bb = 255;
            }
         }

         this.aw[var5] = -1;
      }
   }
}

public void b(int var1) {
   if(this.j <= 0 && this.v == 0) {
      if(this.a != 0) {
         if((this.i != 2 || var1 != 2) && (this.i != 3 || var1 != 3)) {
            ++this.f;
            if(this.f == 16) {
               this.f = 0;
            }
         } else {
            --this.f;
            if(this.f < 0) {
               this.f = 15;
            }
         }

         if(this.i == 2) {
            this.h = az[this.f];
         } else {
            this.h = az[this.f + 16];
         }

         this.j = 2;
      }
   } else {
      switch(this.v) {
      case 2:
         if(var1 == 2) {
            this.y -= 10;
            if(this.y < -45) {
               this.y = -45;
            }

            this.ac = 0;
         } else {
            this.y += 10;
            if(this.y > 45) {
               this.y = 45;
            }

            this.ac = 2;
         }
         break;
      case 4:
         if(var1 == 2) {
            this.w -= 100;
            if(this.aa == 2) {
               this.aa = 3;
            } else {
               this.aa = 2;
            }
         } else {
            this.w += 100;
            if(this.aa == 4) {
               this.aa = 5;
            } else {
               this.aa = 4;
            }
         }

         int var2 = this.w >> 6;
         if(var2 > 109 && var2 < 145) {
            b.a(this);
         }
      }

   }
}

public void c() {
   if(this.v == 0) {
      this.as = true;
      switch(this.a) {
      case 0:
         this.g += 16;
         if(this.f == 1 && this.g > 125) {
            this.c -= 128;
            this.f = 0;
         }

         if(this.g > 250) {
            this.c -= 64;
            this.g = 250;
            this.a = 1;
            this.as = false;
         }
         break;
      case 1:
         if(this.g > 250) {
            return;
         }

         this.g += Math.abs(b.h(this.h)) * 8 >> 7;
         if(this.g > 250) {
            this.g = 250;
         }
      }

   }
}

public void d() {
   if(this.v == 0) {
      this.as = false;
      switch(this.a) {
      case 1:
         this.g -= 8;
         if(this.g < 0) {
            this.g = 0;
         }
      default:
      }
   }
}

public void e() {
   switch(this.a) {
   case 0:
      this.c();
      if(this.g >= 250 && this.f < 2) {
         this.b(3);
      }
      break;
   case 1:
      if(this.g < 250) {
         this.c();
      }

      boolean var1 = false;
      if((this.e > 182 - this.ah || this.d > 109 - this.ah && this.d < 145 + this.ah && this.e > 168 - this.ah) && (this.am == 0 || b.c(this.am) == 0)) {
         if(this.f < 4) {
            this.b(3);
         } else if(this.f > 4 && this.f < 12) {
            this.b(2);
         } else if(this.f > 11) {
            this.b(3);
         }

         var1 = true;
      }

      if(this.e < this.al) {
         if(this.f < 5) {
            this.b(2);
         } else if(this.f > 4 && this.f < 9) {
            this.b(3);
         }

         var1 = true;
      }

      int var3;
      if(!var1 && (this.ag == 0 || b.c(this.ag) == 0)) {
         int var2;
         if(this.ao.v == 0) {
            var2 = b.b(this.bb, this.c, this.ao.bb, this.ao.c);
         } else {
            var2 = b.b(this.bb, this.c, this.ao.w, this.ao.x);
         }

         var3 = b.b(this.h, var2);
         if(var3 >= 2) {
            this.b(var3);
         } else {
            this.a();
         }
      }

      if(this.v == 0 && this.p == 2) {
         int var5 = 2;

         while(true) {
            --var5;
            if(var5 < 0) {
               break;
            }

            f var7 = this.ao.av[var5];
            if(var7.bb != 255 && this.ao.ap) {
               var3 = Math.abs(var7.a - this.d);
               int var4 = Math.abs(var7.bb - this.e);
               int var6 = var3 * var3 + var4 * var4;
               if(var6 < 80 + this.ai) {
                  this.ar = true;
               }
            }
         }
      }

      if(this.ar && (this.f > 12 || this.f < 4)) {
         this.b();
      }
   }

   switch(this.v) {
   case 1:
      if(b.c(this.aj) == 0) {
         this.b();
      }
      break;
   case 2:
      if(this.t >= 2) {
         this.b(this.t);
      }

      if(b.c(this.ak) == 0) {
         this.t = b.c(4);
      }
   case 3:
   default:
      break;
   case 4:
      if(this.w >> 6 < 127) {
         this.b(3);
      } else {
         this.b(2);
      }
   }

}

public void f() {
   b.a(3, 1);
   this.a = 2;
   this.f = 0;
   this.at = false;
   this.au = false;
   this.p = 0;
   int var1 = b.h(this.h) >> 1;
   b.a(25, this.d, this.e, var1 - 100, var1 + 100, -270, -50);
}

public void a(Graphics var1, boolean var2) {
   int var4;
   int var5;
   int var6;
   if(var2 && !this.au) {
      if(this.as) {
         this.c();
      }

      switch(this.a) {
      case 0:
         if(this.i == 2) {
            this.bb -= this.g;
         } else {
            this.bb += this.g;
         }
         break;
      case 1:
         this.bb += b.h(this.h) * this.g >> 7;
         int var3 = 0;
         var4 = b.f(this.h) * this.g >> 7;
         this.c -= var4;
         if(this.f > 1 && this.f < 7) {
            this.g -= b.f(this.h) >> 5;
            if(this.g < 0) {
               this.g = 0;
            }
         } else if(this.f > 9 && this.f < 15) {
            this.g -= b.f(this.h) >> 5;
            if(this.g > 350) {
               this.g = 350;
            }
         }

         if(this.g < 230) {
            var3 = 250 * (230 - this.g) / 230;
            this.c += var3;
         }

         if(var3 > var4) {
            this.as = false;
         }
      case 2:
      default:
         break;
      case 3:
         ++this.l;
         if(this.l > 50) {
            this.l = 0;
            if(this.v == 0) {
               b.a(this);
            }
         }
      }

      switch(this.v) {
      case 1:
      case 5:
         this.w += this.y;
         this.x += this.z;
         this.z += 10;
         if(this.y > 8) {
            this.y -= 8;
         } else if(this.y < -8) {
            this.y += 8;
         }

         if(this.aa == 0) {
            this.aa = 1;
         } else {
            this.aa = 0;
         }
         break;
      case 2:
         this.w += this.y;
         this.x += this.z;
         ++this.ad;
         if(this.ad > 1) {
            this.ad = 0;
            this.z += -15;
            if(this.z < 70) {
               this.z = 70;
            }
         }

         if(this.y > 8) {
            this.y -= 8;
         } else if(this.y < -8) {
            this.y += 8;
         } else {
            this.ac = 1;
         }

         ++this.ab;
         if(this.ab > 3) {
            this.ab = 0;
            if(this.aa == 0) {
               this.aa = 1;
            } else {
               this.aa = 0;
            }
         }
         break;
      case 3:
         this.x -= 30;
         if(this.aa != 3) {
            ++this.ab;
            if(this.ab > 1) {
               this.ab = 0;
               ++this.aa;
               if(this.aa == 3) {
                  this.aa = 0;
               }
            }

            ++this.ad;
            if(this.ad == 40) {
               this.ad = 0;
               this.aa = 3;
            }
         } else {
            ++this.ad;
            if(this.ad > 3) {
               this.ad = 0;
               b.a(this);
            }
         }
      case 4:
      }

      if(this.j > 0) {
         --this.j;
      }

      if(this.k > 0) {
         --this.k;
      }

      this.d = this.bb >> 6;
      this.e = this.c >> 6;
      var5 = this.w >> 6;
      var6 = this.x >> 6;
      if(this.a < 2 && (this.e > 182 || this.e > 164 && this.d > 104 && this.d < 150)) {
         this.f();
         b.bt = (byte)(b.bt + 2);
         if(this.v == 0) {
            ++b.bt;
            --this.m;
            if(this.m < 0) {
               this.m = 0;
            }

            b.c(this);
         }
      }

      if((this.v == 1 || this.v == 2 || this.v == 5) && var6 > 185) {
         this.x = 11840;
         if(this.z > 160) {
            b.bt = (byte)(b.bt + 4);
            this.v = 3;
            --this.m;
            if(this.m < 0) {
               this.m = 0;
            }

            b.b(this.ao);
            b.c(this);
         } else {
            this.v = 4;
            if(var5 > 109 && var5 < 145) {
               b.a(this);
            }
         }
      }

      if(this.v != 0 && this.j == 0) {
         if(this.f >= 5 && this.f <= 12) {
            if(this.f > 4 && this.f < 12) {
               ++this.f;
            }
         } else {
            --this.f;
            if(this.f == -1) {
               this.f = 15;
            }
         }

         if(this.i == 2) {
            this.h = az[this.f];
         } else {
            this.h = az[this.f + 16];
         }

         this.j = 5;
      }

      if(this.d < 0) {
         this.d = 255;
         this.bb = this.d << 6;
      } else if(this.d > 255) {
         this.d = 0;
         this.bb = this.d << 6;
      }

      if(var5 < 0) {
         short var14 = 255;
         this.w = var14 << 6;
      } else if(var5 > 255) {
         byte var15 = 0;
         this.w = var15 << 6;
      }

      if(this.e < 0) {
         this.e = 0;
         this.c = this.e << 6;
         this.g -= 10;
      } else if(this.e > 208) {
         this.e = 0;
         this.c = this.e << 6;
      }
   }

   if(this.r != 255) {
      var1.drawImage(b.a8[30 + this.s], this.r, 189, new Color(33), null);
      ++this.s;
      if(this.s == 5) {
         this.r = 255;
         this.s = 0;
      }
   }

   var4 = this.ao.bb >> 6;
   var5 = this.ao.c >> 6;
   var6 = 0;
   int var8 = this.ao.w >> 6;
   int var9 = this.ao.x >> 6;
   int var10 = 2;

   while(true) {
      --var10;
      int var11;
      if(var10 < 0) {
         switch(this.a) {
         case 0:
         case 1:
            var11 = this.f;
            if(this.i == 3 && this.aq) {
               var11 += 16;
            }

            var1.drawImage(b.a7[var11], this.d, this.e, new Color(3), null);
            break;
         case 2:
            if(this.f < 7) {
               var1.drawImage(b.a8[this.f + 2], this.d, this.e, new Color(3), null);
               ++this.f;
            } else {
               this.a = 3;
               if(this.v == 0) {
                  b.b(this.ao);
               }
            }
         }

         switch(this.v) {
         case 2:
            var1.drawImage(b.a8[27 + this.ac], this.w >> 6, (this.x >> 6) - 10, new Color(3), null);
         case 1:
         case 4:
         case 5:
            var1.drawImage(b.a8[21 + this.aa], this.w >> 6, this.x >> 6, new Color(3), null);
            break;
         case 3:
            var1.drawImage(b.a8[17 + this.aa], this.w >> 6, this.x >> 6, new Color(3), null);
         }

         if(this.a < 2 && this.p > 0) {
            if(this.p == 2) {
               var1.drawImage(b.a8[14 + this.q], this.d, this.e, new Color(3), null);
               ++this.q;
               if(this.q > 2) {
                  this.q = 0;
               }
            }

            int var12 = 6;

            while(true) {
               --var12;
               if(var12 < 0) {
                  break;
               }

               if(this.aw[var12] == -1) {
                  if(b.c(12) < this.p * 2) {
                     this.aw[var12] = this.bb >> 6;
                     this.ax[var12] = this.c >> 6;
                     this.ay[var12] = 0;
                     return;
                  }
               } else {
                  var1.drawImage(b.a8[this.ay[var12] + 9], this.aw[var12], this.ax[var12], new Color(3), null);
                  ++this.ay[var12];
                  if(this.ay[var12] > 4) {
                     this.aw[var12] = -1;
                  }
               }
            }
         }

         return;
      }

      f var13 = this.av[var10];
      var13.a(var1, var2);
      if((b.as == 1 && this.aq || b.as == 0) && var13.bb != 255 && this.ao.ap) {
         int var7;
         if(this.ao.a < 2) {
            var6 = Math.abs(var13.a - var4);
            var7 = Math.abs(var13.bb - var5);
            var11 = var6 * var6 + var7 * var7;
            if(var11 < 80) {
               ++this.ao.p;
               this.ao.at = false;
               if(this.ao.p > 2) {
                  this.ao.f();
                  if(this.ao.v == 0) {
                     if(b.as == 0) {
                        ++this.m;
                        System.out.println("updating score.. now = " + this.m);
                        b.c(this);
                     } else {
                        b.bt = (byte)(b.bt + 32);
                     }
                  }
               } else {
                  b.a(2, 1);
               }

               var13.a(true);
            }
         }

         if(this.ao.v > 0 && this.ao.v != 3) {
            var6 = Math.abs(var13.a - var8);
            var7 = Math.abs(var13.bb - var9);
            var11 = var6 * var6 + var7 * var7;
            if(var11 < 30) {
               b.bt = (byte)(b.bt + 8);
               this.ao.v = 3;
               this.ao.aa = 0;
               var13.a(true);
               b.b(this);
               this.m += 2;
               b.c(this);
            }
         }

         if(this.ao.v == 2) {
            var7 = Math.abs(var13.bb - (var9 - 10));
            if(var6 < 10 && var7 < 5) {
               this.ao.v = 5;
               b.bt = (byte)(b.bt + 16);
            }
         }
      }
   }
}

static {
    int i2 = 16;
    do {
        i2--;
        int i1 = i2 - 12;
        if (i1 < 0)
            i1 = 16 + i1;
        az[i1] = (360 * i2 / 16);
    }
    while (i2 > 0);
    az[16] = az[8];
    az[17] = az[7];
    az[18] = az[6];
    az[19] = az[5];
    az[20] = az[4];
    az[21] = az[3];
    az[22] = az[2];
    az[23] = az[1];
    az[24] = az[0];
    az[25] = az[15];
    az[26] = az[14];
    az[27] = az[13];
    az[28] = az[12];
    az[29] = az[11];
    az[30] = az[10];
    az[31] = az[9];
}

//static {
//   int var1 = 16;
//
//   while(true) {
//      --var1;
//      if(var1 < 0) {
//         az[16] = az[8];
//         az[17] = az[7];
//         az[18] = az[6];
//         az[19] = az[5];
//         az[20] = az[4];
//         az[21] = az[3];
//         az[22] = az[2];
//         az[23] = az[1];
//         az[24] = az[0];
//         az[25] = az[15];
//         az[26] = az[14];
//         az[27] = az[13];
//         az[28] = az[12];
//         az[29] = az[11];
//         az[30] = az[10];
//         az[31] = az[9];
//         return;
//      }
//
//      int var0 = var1 - 12;
//      if(var0 < 0) {
//         var0 += 16;
//      }
//
//      az[var0] = 360 * var1 / 16;
//   }
//}
}