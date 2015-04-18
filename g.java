import javax.microedition.lcdui.Graphics;

public class g {
  public static int a;
  public static int b;
  public static int c;
  private static String d;
  private static byte[] e;
  private static byte[] f;
  public static String[] g;
  public static int h;
  public static int i;
  public static boolean j;

  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, c paramc) {
    int k = 0;
    if (d != null)
      k = paramc.a(d);
    int n = b;
    do {
      int m = paramc.a(g[e[n]]);
      if (m > k)
        k = m;
      n--;
    }
    while (n >= 0);
    int i1 = b;
    if (d != null)
      i1++;
    int i2 = i1 * paramInt7 + 2 + 4 - 6;
    int i3 = k + 4 + 4;
    if (i3 < paramInt3)
      i3 = paramInt3;
    int i4 = 0;
    int i5 = 0;
    switch (paramInt4) {
    case 4:
      i4 = 0;
      break;
    case 1:
      i4 = paramInt1 - i3 >> 1;
      break;
    case 8:
      i4 = paramInt1 - i3;
    }
    switch (paramInt5) {
    case 16:
      i5 = 0;
      break;
    case 2:
      i5 = paramInt2 - i2 >> 1;
      break;
    case 32:
      i5 = paramInt2 - i2;
    }
    if (h > 0) {
      paramGraphics.setColor(6488245);
      paramGraphics.fillRect(i4, i5, i3, i2);
      paramGraphics.setColor(16671843);
      paramGraphics.fillRect(i4 + 2, i5 + 2, i3 - 4, i2 - 4);
      i6 = i5 + 2 + 2;
      i7 = i4 + 2 + 2;
      switch (paramInt6) {
      case 8:
        break;
      case 1:
        i7 = i4 + (i3 >> 1);
      }
      i8 = paramInt7 - (paramInt7 >> 1);
      if (d != null) {
        paramGraphics.setColor(6724044);
        paramGraphics.fillRect(i4 + 2, i6 - 2, i3 - 4, i8 + 2);
        paramc.a(paramGraphics, d, i7, i6 - 7, paramInt6);
        i6 += i8;
      }
      for (i9 = 0; i9 < b; i9++) {
        if (i9 == c) {
          paramGraphics.setColor(16776960);
          paramGraphics.fillRect(i4 + 2, i6, i3 - 4, paramInt7);
        }
        if (a(paramGraphics, i9, i7, i6))
          i7 += 18;
        paramc.a(paramGraphics, g[e[i9]], i7, i6 + (paramInt7 >> 1), paramInt6 | 0x2);
        i6 += paramInt7;
        if ((a == 14) || (a == 60) || (a == 92) || (a == 82))
          i7 -= 18;
      }
      h -= 1;
    }
    int i6 = i5 + 2 + 2 + c * paramInt7;
    int i7 = i4 + 2 + 2;
    if (d != null) {
      i8 = paramInt7 - (paramInt7 >> 1);
      i6 += i8;
    }
    int i8 = i3 - 4;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    i9 = i8 / 24;
    i10 = i9 * 24;
    if (i10 < i8)
      i11 = i8 - i10;
    int i12 = 0;
    int i13 = 0;
    for (i13 = 0; i13 < 24; i13++) {
      a(paramGraphics, i13, true);
      paramGraphics.fillRect(i4 + 2 + i12, i6, i9, paramInt7);
      a(paramGraphics, i13, false);
      paramGraphics.fillRect(i4 + 2 + i12, i6 + 1, i9, paramInt7 - 2);
      i12 += i9;
    }
    if (i11 != 0) {
      a(paramGraphics, 24, true);
      paramGraphics.fillRect(i4 + 2 + i12, i6, i11, paramInt7);
      a(paramGraphics, 24, false);
      paramGraphics.fillRect(i4 + 2 + i12, i6 + 1, i11, paramInt7 - 2);
    }
    if (a(paramGraphics, c, i7, i6))
      i7 += 18;
    paramc.a(paramGraphics, g[e[c]], i7, i6 + (paramInt7 >> 1), paramInt6 | 0x2);
    if (!j) {
      i += 1;
      if (i > 24)
        j = true;
    }
    else {
      i -= 1;
      if (i < 0)
        j = false;
    }
  }

  public static void a(Graphics paramGraphics, int paramInt, boolean paramBoolean) {
    int i1 = Math.abs(i - paramInt);
    if (paramBoolean)
      i1 = 24 - i1;
    int i2 = 256;
    int i3 = (24 - i1) * i2 / 24;
    int k = i3 * 255 + (i2 - i3) * 67;
    int m = i3 * 255 + (i2 - i3) * 137;
    int n = i3 * 0 + (i2 - i3) * 67;
    k /= i2;
    m /= i2;
    n /= i2;
    if (paramBoolean) {
      k -= 32;
      m -= 32;
      n -= 32;
    }
    k = k < 0 ? 0 : k;
    m = m < 0 ? 0 : m;
    n = n < 0 ? 0 : n;
    paramGraphics.setColor(k, m, n);
  }

  public static boolean a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3) {
    if ((a == 14) || (a == 92)) {
      if ((paramInt1 == 0) || (b.af[(paramInt1 - 1)] != 0))
        paramGraphics.drawImage(b.a8[(43 + paramInt1)], paramInt2, paramInt3, 20);
      else
        paramGraphics.drawImage(b.a8[51], paramInt2, paramInt3, 20);
      paramInt2 += 18;
      return true;
    }
    if ((a == 60) || (a == 82)) {
      if ((paramInt1 == 0) || (b.af[(paramInt1 - 1)] != 0))
        paramGraphics.drawImage(b.a8[(47 + paramInt1)], paramInt2, paramInt3, 20);
      else
        paramGraphics.drawImage(b.a8[52], paramInt2, paramInt3, 20);
      paramInt2 += 18;
      return true;
    }
    return false;
  }

  public static void a(int paramInt) {
    b.h = false;
    h = 2;
    a = paramInt << 1;
    a();
  }

  public static void b(int paramInt) {
    switch (paramInt) {
    case 0:
      c -= 1;
      if (c < 0)
        c = b - 1;
      break;
    case 1:
      c += 1;
      if (c == b)
        c = 0;
      break;
    case 2:
      int k = e[c] << 1;
      switch (f[k]) {
      case 3:
        a(0);
        int m = f[(k + 1)];
        b.a(m);
        break;
      default:
        if (b.o != 0);
        b.h = false;
        a = k;
        a();
      }
      break;
    }
    h = 2;
  }

  private static void a(boolean paramBoolean) {
    int k = f[(a + 1)];
    if (!paramBoolean)
      switch (f[a]) {
      case 0:
        d = null;
        break;
      case 1:
        d = g[(a >> 1)];
        break;
      case 2:
        a += 2;
        d = g[(a >> 1)];
      }
    a += 2;
    while ((a < f.length) && (k > 0)) {
      int m = f[a];
      switch (m) {
      case 0:
      case 1:
      case 2:
        if (!paramBoolean) {
          e[b] = ((byte)(a >> 1));
          b += 1;
        }
        k--;
        a(true);
        break;
      case 3:
        if (!paramBoolean) {
          e[b] = ((byte)(a >> 1));
          b += 1;
        }
        k--;
      default:
        a += 2;
      }
    }
  }

  public static void a() {
    h = 2;
    b = 0;
    c = 0;
    a(false);
  }

  public static void a(byte[] paramArrayOfByte) {
    f = paramArrayOfByte;
    e = new byte[6];
    a(false);
  }
}

/* Location:           /Users/ilya/4fun/Biplanes/Bluetooth_Biplanes.jar
 * Qualified Name:     g
 * JD-Core Version:    0.6.2
 */