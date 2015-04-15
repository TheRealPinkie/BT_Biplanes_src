import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class c
{
  public final int a;
  public final int b;
  private Image c;
  private short[] d;
  private short[] e;
  private byte[] f;
  private int[][] g = new int[16][];
  private static int h = 43;
  public static int[] i = null;

  public c(String paramString)
  {
    try
    {
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
      for (int i1 = 0; i1 < n; i1++)
      {
        i2 = arrayOfChar[i1];
        arrayOfInt1[(i2 & 0xF)] += 1;
      }
      int i2 = 16;
      do
      {
        this.g[i2] = new int[arrayOfInt1[i2] << 1];
        i2--;
      }
      while (i2 >= 0);
      arrayOfInt1 = new int[16];
      for (int i3 = 0; i3 < n; i3++)
      {
        i4 = arrayOfChar[i3];
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
      this.c = Image.createImage(arrayOfByte, 0, arrayOfByte.length);
      localDataInputStream.close();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      throw new IllegalArgumentException();
    }
  }

  public String[] a(String paramString, int paramInt)
  {
    Object localObject = new String[10];
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
    while (i4 == 0)
    {
      if (m == arrayOfChar.length)
      {
        n = m;
        i5 = 1;
        i4 = 1;
        if (i1 > m)
          break label413;
      }
      else
      {
        char c1 = arrayOfChar[m];
        if (i6 != 0)
        {
          if (c1 == 'n')
          {
            i1 = m + 1;
          }
          else
          {
            i5 = 1;
            i7 = 1;
            if ((c1 == 'i') || (c1 == 'g'))
            {
              n = m + 3;
              i1 = m - 1;
            }
            else
            {
              n = m + 1;
              i1 = m - 1;
            }
            i3 = 0;
          }
          i6 = 0;
        }
        else if (c1 == '\n')
        {
          i5 = 1;
          n = m;
          i3 = 0;
        }
        else if (c1 == '\\')
        {
          i6 = 1;
          if ((i1 < m) || (arrayOfChar[(m + 1)] == 'n'))
          {
            i5 = 1;
            n = m;
            i3 = 0;
          }
        }
        else if (c1 == ' ')
        {
          i2 += this.b;
          n = m;
          i3 = 0;
        }
        else
        {
          i9 = a(c1) + 0;
          i3 += i9;
          i2 += i9;
          if (i2 > paramInt)
            i5 = 1;
        }
      }
      if (i5 != 0)
      {
        if (j >= k)
        {
          k += 5;
          String[] arrayOfString1 = new String[k];
          i9 = localObject.length;
          do
          {
            arrayOfString1[i9] = localObject[i9];
            i9--;
          }
          while (i9 >= 0);
          localObject = arrayOfString1;
        }
        int i8 = n <= i1 ? 1 : 0;
        if (i8 != 0)
          n = m;
        localObject[j] = new String(arrayOfChar, i1, n - i1);
        if ((i8 != 0) || (i7 != 0))
        {
          i1 = n;
          i2 = 0;
        }
        else
        {
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
    do
    {
      arrayOfString2[i9] = localObject[i9];
      i9--;
    }
    while (i9 >= 0);
    return arrayOfString2;
  }

  public int a(String paramString)
  {
    return a(paramString.toCharArray(), 0, paramString.length());
  }

  public int a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int j = 0;
    int k = paramInt2;
    do
    {
      char c1 = paramArrayOfChar[paramInt1];
      j += a(c1);
      if ((c1 != ' ') && (k != 0))
        j += 0;
      paramInt1++;
      k--;
    }
    while (k >= 0);
    return j;
  }

  public int a(char paramChar)
  {
    if (paramChar == ' ')
      return this.b;
    int j = a(paramChar);
    if (j == -1)
      return 0;
    return this.f[j];
  }

  private int a(int paramInt)
  {
    int j = -1;
    int[] arrayOfInt = this.g[(paramInt & 0xF)];
    for (int k = arrayOfInt.length - 2; k >= 0; k -= 2)
    {
      int m = arrayOfInt[k];
      if (m == paramInt)
      {
        j = arrayOfInt[(k + 1)];
        break;
      }
    }
    return j;
  }

  public void a(Graphics paramGraphics, String[] paramArrayOfString, int paramInt1, int paramInt2, int paramInt3)
  {
    int j = paramArrayOfString.length;
    for (int k = 0; k < j; k++)
    {
      a(paramGraphics, paramArrayOfString[k].toCharArray(), paramInt1, paramInt2, paramInt3);
      paramInt2 += this.a + 0;
    }
  }

  public void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    a(paramGraphics, paramString.toCharArray(), paramInt1, paramInt2, paramInt3);
  }

  public void a(Graphics paramGraphics, char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt3 & h) > 0)
    {
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

  private void a(Graphics paramGraphics, char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int j = paramGraphics.getClipX();
    int k = paramGraphics.getClipY();
    int m = paramGraphics.getClipWidth();
    int n = paramGraphics.getClipHeight();
    int i1 = paramArrayOfChar.length;
    int i2 = 0;
    paramGraphics.setClip(j, k, m, n);
    for (int i3 = 0; i3 < i1; i3++)
    {
      int i4 = paramArrayOfChar[i3];
      if (i != null)
        i2 = i[i3];
      if (i4 == 32)
      {
        paramInt1 += this.b;
      }
      else
      {
        int i5 = a(i4);
        if (i5 != -1)
        {
          int i6 = this.f[i5];
          int i7 = paramInt2 + i2;
          paramGraphics.clipRect(paramInt1, i7, i6, this.a);
          paramGraphics.drawImage(this.c, paramInt1 - this.d[i5], i7 - this.e[i5], 20);
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