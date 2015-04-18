import java.io.PrintStream;
import javax.microedition.lcdui.Graphics;

public class e {
    public int a;
    public int b;
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

    public e(boolean paramBoolean) {
        int i1 = 2;
        do {
            this.av[i1] = new f(this);
            i1--;
        }
        while (i1 >= 0);
        this.aw = new int[6];
        this.ax = new int[6];
        this.ay = new int[6];
        int i2 = 6;
        do {
            this.aw[i2] = -1;
            i2--;
        }
        while (i2 >= 0);
        this.ap = false;
        this.aq = paramBoolean;
    }

    public void a() {
        if ((this.k > 0) || (this.v != 0))
            return;
        if (this.a == 1) {
            int i1 = 2;
            do {
                if (this.av[i1].b == 255) {
                    this.av[i1].a(this.b, this.c, this.h);
                    this.k = 10;
                    return;
                }
                i1--;
            }
            while (i1 >= 0);
        }
    }

    public void a(int paramInt) {
        this.af = paramInt;
        this.an = (Integer.toString(paramInt) + "%");
    }

    public void a(boolean paramBoolean) {
        this.n += 1;
        if (paramBoolean)
            this.o += 1;
        this.af = (this.o * 100 / this.n);
        this.an = (Integer.toString(this.af) + "%");
    }

    public void b() {
        if (this.a == 2)
            return;
        if ((this.a != 1) || (this.v != 0)) {
            if (this.v == 1) {
                this.z += -60;
                if (this.z < 20)
                    this.z = 20;
                this.v = 2;
                this.ac = 1;
            }
            return;
        }
        b.a(5, 1);
        this.w = this.b;
        this.x = this.c;
        this.v = 1;
        int i1;
        if (this.i == 2)
            i1 = b.g(this.h + 90);
        else
            i1 = b.g(this.h - 90);
        this.y = (b.h(i1) * 300 >> 7);
        this.z = (-(b.f(i1) * 300) >> 7);
    }

    public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
        this.i = paramInt4;
        if (paramInt4 == 3)
            b.bw = this;
        else
            b.bx = this;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.af = 0;
        this.an = "000%";
        b.c(this);
        this.at = true;
        int i1 = this.u * 7;
        this.ag = b.bs[(i1++)];
        this.ah = b.bs[(i1++)];
        this.ai = b.bs[(i1++)];
        this.aj = b.bs[(i1++)];
        this.ak = b.bs[(i1++)];
        this.al = b.bs[(i1++)];
        this.am = b.bs[(i1++)];
        b(paramInt1, paramInt2, paramInt3, paramInt4);
        this.d = paramInt2;
        this.e = paramInt3;
    }

    public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
        this.a = paramInt1;
        this.b = (paramInt2 << 6);
        this.c = (paramInt3 << 6);
        this.g = 0;
        this.p = 0;
        this.r = 255;
        this.s = 0;
        switch (paramInt1) {
        case 0:
            this.f = 1;
            if (paramInt4 == 2)
                this.h = 270;
            else
                this.h = 90;
            break;
        }
        this.au = false;
        this.ap = true;
        this.ar = false;
        this.as = false;
        this.v = 0;
        int i1 = 6;
        do {
            this.aw[i1] = -1;
            i1--;
        }
        while (i1 >= 0);
        int i2 = 2;
        do {
            this.av[i2].b = 255;
            i2--;
        }
        while (i2 >= 0);
    }

    public void b(int paramInt) {
        if ((this.j > 0) || (this.v != 0)) {
            switch (this.v) {
            case 2:
                if (paramInt == 2) {
                    this.y -= 10;
                    if (this.y < -45)
                        this.y = -45;
                    this.ac = 0;
                }
                else {
                    this.y += 10;
                    if (this.y > 45)
                        this.y = 45;
                    this.ac = 2;
                }
                break;
            case 4:
                if (paramInt == 2) {
                    this.w -= 100;
                    if (this.aa == 2)
                        this.aa = 3;
                    else
                        this.aa = 2;
                }
                else {
                    this.w += 100;
                    if (this.aa == 4)
                        this.aa = 5;
                    else
                        this.aa = 4;
                }
                int i1 = this.w >> 6;
                if ((i1 > 109) && (i1 < 145))
                    b.a(this);
                break;
            }
            return;
        }
        if (this.a == 0)
            return;
        if (((this.i == 2) && (paramInt == 2)) || ((this.i == 3) && (paramInt == 3))) {
            this.f -= 1;
            if (this.f < 0)
                this.f = 15;
        }
        else {
            this.f += 1;
            if (this.f == 16)
                this.f = 0;
        }
        if (this.i == 2)
            this.h = az[this.f];
        else
            this.h = az[(this.f + 16)];
        this.j = 2;
    }

    public void c() {
        if (this.v != 0)
            return;
        this.as = true;
        switch (this.a) {
        case 0:
            this.g += 16;
            if ((this.f == 1) && (this.g > 125)) {
                this.c -= 128;
                this.f = 0;
            }
            if (this.g > 250) {
                this.c -= 64;
                this.g = 250;
                this.a = 1;
                this.as = false;
            }
            break;
        case 1:
            if (this.g > 250)
                return;
            this.g += (Math.abs(b.h(this.h)) * 8 >> 7);
            if (this.g > 250)
                this.g = 250;
            break;
        }
    }

    public void d() {
        if (this.v != 0)
            return;
        this.as = false;
        switch (this.a) {
        case 1:
            this.g -= 8;
            if (this.g < 0)
                this.g = 0;
            break;
        }
    }

    public void e() {
        switch (this.a) {
        case 0:
            c();
            if ((this.g >= 250) && (this.f < 2))
                b(3);
            break;
        case 1:
            if (this.g < 250)
                c();
            int i1 = 0;
            if (((this.e > 182 - this.ah) || ((this.d > 109 - this.ah) && (this.d < 145 + this.ah) && (this.e > 168 - this.ah))) && ((this.am == 0) || (b.c(this.am) == 0))) {
                if (this.f < 4)
                    b(3);
                else if ((this.f > 4) && (this.f < 12))
                    b(2);
                else if (this.f > 11)
                    b(3);
                i1 = 1;
            }
            if (this.e < this.al) {
                if (this.f < 5)
                    b(2);
                else if ((this.f > 4) && (this.f < 9))
                    b(3);
                i1 = 1;
            }
            int i3;
            if ((i1 == 0) && ((this.ag == 0) || (b.c(this.ag) == 0))) {
                int i2;
                if (this.ao.v == 0)
                    i2 = b.b(this.b, this.c, this.ao.b, this.ao.c);
                else
                    i2 = b.b(this.b, this.c, this.ao.w, this.ao.x);
                i3 = b.b(this.h, i2);
                if (i3 >= 2)
                    b(i3);
                else
                    a();
            }
            if ((this.v == 0) && (this.p == 2)) {
                int i5 = 2;
                do {
                    f localf = this.ao.av[i5];
                    if ((localf.b != 255) && (this.ao.ap)) {
                        i3 = Math.abs(localf.a - this.d);
                        int i4 = Math.abs(localf.b - this.e);
                        int i6 = i3 * i3 + i4 * i4;
                        if (i6 < 80 + this.ai)
                            this.ar = true;
                    }
                    i5--;
                }
                while (i5 >= 0);
            }
            if ((this.ar) && ((this.f > 12) || (this.f < 4)))
                b();
            break;
        }
        switch (this.v) {
        case 4:
            if (this.w >> 6 < 127)
                b(3);
            else
                b(2);
            break;
        case 1:
            if (b.c(this.aj) == 0)
                b();
            break;
        case 2:
            if (this.t >= 2)
                b(this.t);
            if (b.c(this.ak) == 0)
                this.t = b.c(4);
            break;
        case 3:
        }
    }

    public void f() {
        b.a(3, 1);
        this.a = 2;
        this.f = 0;
        this.at = false;
        this.au = false;
        this.p = 0;
        int i1 = b.h(this.h) >> 1;
        b.a(25, this.d, this.e, i1 - 100, i1 + 100, -270, -50);
    }

    public void a(Graphics paramGraphics, boolean paramBoolean) {
        if ((paramBoolean) && (!this.au)) {
            if (this.as)
                c();
            switch (this.a) {
            case 3:
                this.l += 1;
                if (this.l > 50) {
                    this.l = 0;
                    if (this.v == 0)
                        b.a(this);
                }
                break;
            case 0:
                if (this.i == 2)
                    this.b -= this.g;
                else
                    this.b += this.g;
                break;
            case 1:
                this.b += (b.h(this.h) * this.g >> 7);
                int i1 = 0;
                i2 = b.f(this.h) * this.g >> 7;
                this.c -= i2;
                if ((this.f > 1) && (this.f < 7)) {
                    this.g -= (b.f(this.h) >> 5);
                    if (this.g < 0)
                        this.g = 0;
                }
                else if ((this.f > 9) && (this.f < 15)) {
                    this.g -= (b.f(this.h) >> 5);
                    if (this.g > 350)
                        this.g = 350;
                }
                if (this.g < 230) {
                    i1 = 250 * (230 - this.g) / 230;
                    this.c += i1;
                }
                if (i1 > i2)
                    this.as = false;
                break;
            case 2:
            }
            switch (this.v) {
            case 1:
            case 5:
                this.w += this.y;
                this.x += this.z;
                this.z += 10;
                if (this.y > 8)
                    this.y -= 8;
                else if (this.y < -8)
                    this.y += 8;
                if (this.aa == 0)
                    this.aa = 1;
                else
                    this.aa = 0;
                break;
            case 2:
                this.w += this.y;
                this.x += this.z;
                this.ad += 1;
                if (this.ad > 1) {
                    this.ad = 0;
                    this.z += -15;
                    if (this.z < 70)
                        this.z = 70;
                }
                if (this.y > 8)
                    this.y -= 8;
                else if (this.y < -8)
                    this.y += 8;
                else
                    this.ac = 1;
                this.ab += 1;
                if (this.ab > 3) {
                    this.ab = 0;
                    if (this.aa == 0)
                        this.aa = 1;
                    else
                        this.aa = 0;
                }
                break;
            case 3:
                this.x -= 30;
                if (this.aa != 3) {
                    this.ab += 1;
                    if (this.ab > 1) {
                        this.ab = 0;
                        this.aa += 1;
                        if (this.aa == 3)
                            this.aa = 0;
                    }
                    this.ad += 1;
                    if (this.ad == 40) {
                        this.ad = 0;
                        this.aa = 3;
                    }
                }
                else {
                    this.ad += 1;
                    if (this.ad > 3) {
                        this.ad = 0;
                        b.a(this);
                    }
                }
                break;
            case 4:
            }
            if (this.j > 0)
                this.j -= 1;
            if (this.k > 0)
                this.k -= 1;
            this.d = (this.b >> 6);
            this.e = (this.c >> 6);
            i3 = this.w >> 6;
            i4 = this.x >> 6;
            if ((this.a < 2) && ((this.e > 182) || ((this.e > 164) && (this.d > 104) && (this.d < 150)))) {
                f();
                b.bt = (byte)(b.bt + 2);
                if (this.v == 0) {
                    b.bt = (byte)(b.bt + 1);
                    this.m -= 1;
                    if (this.m < 0)
                        this.m = 0;
                    b.c(this);
                }
            }
            if (((this.v == 1) || (this.v == 2) || (this.v == 5)) && (i4 > 185)) {
                this.x = 11840;
                if (this.z > 160) {
                    b.bt = (byte)(b.bt + 4);
                    this.v = 3;
                    this.m -= 1;
                    if (this.m < 0)
                        this.m = 0;
                    b.b(this.ao);
                    b.c(this);
                }
                else {
                    this.v = 4;
                    if ((i3 > 109) && (i3 < 145))
                        b.a(this);
                }
            }
            if ((this.v != 0) && (this.j == 0)) {
                if ((this.f < 5) || (this.f > 12)) {
                    this.f -= 1;
                    if (this.f == -1)
                        this.f = 15;
                }
                else if ((this.f > 4) && (this.f < 12)) {
                    this.f += 1;
                }
                if (this.i == 2)
                    this.h = az[this.f];
                else
                    this.h = az[(this.f + 16)];
                this.j = 5;
            }
            if (this.d < 0) {
                this.d = 255;
                this.b = (this.d << 6);
            }
            else if (this.d > 255) {
                this.d = 0;
                this.b = (this.d << 6);
            }
            if (i3 < 0) {
                i3 = 255;
                this.w = (i3 << 6);
            }
            else if (i3 > 255) {
                i3 = 0;
                this.w = (i3 << 6);
            }
            if (this.e < 0) {
                this.e = 0;
                this.c = (this.e << 6);
                this.g -= 10;
            }
            else if (this.e > 208) {
                this.e = 0;
                this.c = (this.e << 6);
            }
        }
        if (this.r != 255) {
            paramGraphics.drawImage(b.a8[(30 + this.s)], this.r, 189, 33);
            this.s += 1;
            if (this.s == 5) {
                this.r = 255;
                this.s = 0;
            }
        }
        int i2 = this.ao.b >> 6;
        int i3 = this.ao.c >> 6;
        int i4 = 0;
        int i6 = this.ao.w >> 6;
        int i7 = this.ao.x >> 6;
        int i8 = 2;
        int i9;
        do {
            f localf = this.av[i8];
            localf.a(paramGraphics, paramBoolean);
            if (((b.as == 1) && (this.aq)) || ((b.as == 0) && (localf.b != 255) && (this.ao.ap))) {
                int i5;
                if (this.ao.a < 2) {
                    i4 = Math.abs(localf.a - i2);
                    i5 = Math.abs(localf.b - i3);
                    i9 = i4 * i4 + i5 * i5;
                    if (i9 < 80) {
                        this.ao.p += 1;
                        this.ao.at = false;
                        if (this.ao.p > 2) {
                            this.ao.f();
                            if (this.ao.v == 0)
                                if (b.as == 0) {
                                    this.m += 1;
                                    System.out.println("updating score.. now = " + this.m);
                                    b.c(this);
                                }
                                else {
                                    b.bt = (byte)(b.bt + 32);
                                }
                        }
                        else {
                            b.a(2, 1);
                        }
                        localf.a(true);
                    }
                }
                if ((this.ao.v > 0) && (this.ao.v != 3)) {
                    i4 = Math.abs(localf.a - i6);
                    i5 = Math.abs(localf.b - i7);
                    i9 = i4 * i4 + i5 * i5;
                    if (i9 < 30) {
                        b.bt = (byte)(b.bt + 8);
                        this.ao.v = 3;
                        this.ao.aa = 0;
                        localf.a(true);
                        b.b(this);
                        this.m += 2;
                        b.c(this);
                    }
                }
                if (this.ao.v == 2) {
                    i5 = Math.abs(localf.b - (i7 - 10));
                    if ((i4 < 10) && (i5 < 5)) {
                        this.ao.v = 5;
                        b.bt = (byte)(b.bt + 16);
                    }
                }
            }
            i8--;
        }
        while (i8 >= 0);
        switch (this.a) {
        case 0:
        case 1:
            i9 = this.f;
            if ((this.i == 3) && (this.aq))
                i9 += 16;
            paramGraphics.drawImage(b.a7[i9], this.d, this.e, 3);
            break;
        case 2:
            if (this.f < 7) {
                paramGraphics.drawImage(b.a8[(this.f + 2)], this.d, this.e, 3);
                this.f += 1;
            }
            else {
                this.a = 3;
                if (this.v == 0)
                    b.b(this.ao);
            }
            break;
        }
        switch (this.v) {
        case 2:
            paramGraphics.drawImage(b.a8[(27 + this.ac)], this.w >> 6, (this.x >> 6) - 10, 3);
        case 1:
        case 4:
        case 5:
            paramGraphics.drawImage(b.a8[(21 + this.aa)], this.w >> 6, this.x >> 6, 3);
            break;
        case 3:
            paramGraphics.drawImage(b.a8[(17 + this.aa)], this.w >> 6, this.x >> 6, 3);
        }
        if ((this.a < 2) && (this.p > 0)) {
            if (this.p == 2) {
                paramGraphics.drawImage(b.a8[(14 + this.q)], this.d, this.e, 3);
                this.q += 1;
                if (this.q > 2)
                    this.q = 0;
            }
            int i10 = 6;
            do {
                if (this.aw[i10] == -1) {
                    if (b.c(12) < this.p * 2) {
                        this.aw[i10] = (this.b >> 6);
                        this.ax[i10] = (this.c >> 6);
                        this.ay[i10] = 0;
                    }
                }
                else {
                    paramGraphics.drawImage(b.a8[(this.ay[i10] + 9)], this.aw[i10], this.ax[i10], 3);
                    this.ay[i10] += 1;
                    if (this.ay[i10] > 4)
                        this.aw[i10] = -1;
                }
                i10--;
            }
            while (i10 >= 0);
        }
    }

    static {
        int i2 = 16;
        do {
            int i1 = i2 - 12;
            if (i1 < 0)
                i1 = 16 + i1;
            az[i1] = (360 * i2 / 16);
            i2--;
        }
        while (i2 >= 0);
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
}

/* Location:           /Users/ilya/4fun/Biplanes/Bluetooth_Biplanes.jar
 * Qualified Name:     e
 * JD-Core Version:    0.6.2
 */