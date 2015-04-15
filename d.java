import javax.microedition.lcdui.Graphics;

public class d
{
  public int a = -1;
  public int b;
  public int c;
  public int d;
  public int e;
  public int f;

  public void a(Graphics paramGraphics)
  {
    if (this.f > 0)
    {
      this.f -= 1;
      if (this.f == 0)
      {
        this.a = -1;
        return;
      }
    }
    if (((this.f == 0) || (this.f > 16)) && (this.f == 0))
    {
      int i = this.a >> 5;
      int j = this.b >> 5;
      paramGraphics.drawImage(b.a8[this.e], i, j, 33);
      this.a += this.c;
      this.b += this.d;
      this.d += 25;
      if (this.d > 200)
        this.d = 200;
      int k = 0;
      if (j > 186)
        k = 1;
      else if ((j > 166) && (i > 111) && (i < 143))
        k = 1;
      if ((k != 0) && (this.d > 0))
      {
        this.d >>= 2;
        if (this.d < 5)
          this.a = -1;
        this.d = ((byte)-this.d);
      }
      this.e += 1;
      if (this.e > 56)
        this.e = 53;
    }
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = (paramInt1 << 5);
    this.b = (paramInt2 << 5);
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = 53;
    this.f = 0;
  }
}

/* Location:           /Users/ilya/4fun/Biplanes/Bluetooth_Biplanes.jar
 * Qualified Name:     d
 * JD-Core Version:    0.6.2
 */