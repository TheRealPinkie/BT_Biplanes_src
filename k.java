import java.util.TimerTask;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;

public class k extends TimerTask {
  private Player a;

  public k(Player paramPlayer) {
    this.a = paramPlayer;
  }

  public void run() {
    try {
      this.a.stop();
    }
    catch (MediaException localMediaException) {
      localMediaException.printStackTrace();
    }
  }
}

/* Location:           /Users/ilya/4fun/Biplanes/Bluetooth_Biplanes.jar
 * Qualified Name:     k
 * JD-Core Version:    0.6.2
 */