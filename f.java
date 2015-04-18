import javax.microedition.lcdui.Graphics;

public class f {
  public int a;
  public int b;
  public int c;
  public int d;
  public e e;

  public f(e parame) {
    this.e = parame;
    this.b = 255;
  }

  public void a(int paramInt1, int paramInt2, int paramInt3) {
    this.a = (paramInt1 >> 6);
    this.b = (paramInt2 >> 6);
    this.c = paramInt3;
    this.d = 0;
  }

  public void a(boolean paramBoolean) {
    this.b = 255;
    this.e.a(paramBoolean);
  }

  public void a(Graphics paramGraphics, boolean paramBoolean) {
    if (this.b == 255)
      return;
    if (paramBoolean) {
      this.d += 1;
      if (this.d > 20) {
        a(false);
        return;
      }
      this.a += (b.h(this.c) * 10 >> 7);
      this.b -= (b.f(this.c) * 10 >> 7);
    }
    if ((this.b > 189) || ((this.b > 168) && (this.a > 109) && (this.a < 145))) {
      this.e.r = (this.a + 1);
      a(false);
    }
    paramGraphics.setColor(16737792);
    paramGraphics.fillRect(this.a, this.b, 3, 3);
    paramGraphics.setColor(16776960);
    paramGraphics.fillRect(this.a + 1, this.b + 1, 1, 1);
  }
}

/* Location:           /Users/ilya/4fun/Biplanes/Bluetooth_Biplanes.jar
 * Qualified Name:     f
 * JD-Core Version:    0.6.2
 */