import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class BluetoothBiplanes extends MIDlet
{
  private b a = new b(this);
  private Display b = Display.getDisplay(this);

  public void startApp()
  {
    this.b.setCurrent(this.a);
    this.a.f();
  }

  public void pauseApp()
  {
  }

  public void destroyApp(boolean paramBoolean)
  {
  }

  static
  {
    System.gc();
  }
}

/* Location:           /Users/ilya/4fun/Biplanes/Bluetooth_Biplanes.jar
 * Qualified Name:     BluetoothBiplanes
 * JD-Core Version:    0.6.2
 */