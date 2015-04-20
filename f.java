import java.awt.Graphics;
import java.awt.Color;

public class f {
    public int a;
    public int bb;
    public int c;
    public int d;
    public e e;

    public f(e parame) {
        this.e = parame;
        this.bb = 255;
    }

    public void a(int paramInt1, int paramInt2, int paramInt3) {
        this.a = (paramInt1 >> 6);
        this.bb = (paramInt2 >> 6);
        this.c = paramInt3;
        this.d = 0;
    }

    public void a(boolean paramBoolean) {
        this.bb = 255;
        this.e.a(paramBoolean);
    }

    public void a(Graphics paramGraphics, boolean paramBoolean) {
        if (this.bb == 255)
            return;
        if (paramBoolean) {
            this.d += 1;
            if (this.d > 20) {
                a(false);
                return;
            }
            this.a += (b.h(this.c) * 10 >> 7);
            this.bb -= (b.f(this.c) * 10 >> 7);
        }
        if ((this.bb > 189) || ((this.bb > 168) && (this.a > 109) && (this.a < 145))) {
            this.e.r = (this.a + 1);
            a(false);
        }
        paramGraphics.setColor(new Color(16737792));
        paramGraphics.fillRect(this.a, this.bb, 3, 3);
        paramGraphics.setColor(new Color(16776960));
        paramGraphics.fillRect(this.a + 1, this.bb + 1, 1, 1);
    }
}

/* Location:           /Users/ilya/4fun/Biplanes/Bluetooth_Biplanes.jar
 * Qualified Name:     f
 * JD-Core Version:    0.6.2
 */