public class d {

public int a = -1;
public int bb;
public int c;
public int d;
public int e;
public int f;


public void a(Graphics var1) {
   if(this.f > 0) {
      --this.f;
      if(this.f == 0) {
         this.a = -1;
         return;
      }
   }

   if((this.f == 0 || this.f > 16) && this.f == 0) {
      int var4 = this.a >> 5;
      int var5 = this.bb >> 5;
      var1.drawImage(b.a8[this.e], var4, var5, new Color(33), null);
      this.a += this.c;
      this.bb += this.d;
      this.d += 25;
      if(this.d > 200) {
         this.d = 200;
      }

      boolean var6 = false;
      if(var5 > 186) {
         var6 = true;
      } else if(var5 > 166 && var4 > 111 && var4 < 143) {
         var6 = true;
      }

      if(var6 && this.d > 0) {
         this.d >>= 2;
         if(this.d < 5) {
            this.a = -1;
         }

         this.d = (byte)(-this.d);
      }

      ++this.e;
      if(this.e > 56) {
         this.e = 53;
      }
   }

}

public void a(int var1, int var2, int var3, int var4) {
   this.a = var1 << 5;
   this.bb = var2 << 5;
   this.c = var3;
   this.d = var4;
   this.e = 53;
   this.f = 0;
}
}