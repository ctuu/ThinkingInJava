import java.util.concurrent.*;
import static net.mindview.util.Print.*;

public class SimpleDaemons implements Runnable {
  public void run() {
    try {
      while(true) {
        TimeUnit.MILLISECONDS.sleep(100);
        print(Thread.currentThread() + " " + this);
      }
    } catch(InterruptedException e) {
      print("sleep() interrupted");
    }
  }
  public static void main(String[] args) throws Exception {
    for(int i = 0; i < 10; ++i ) {
      Thread daemon = new Thread(new SimpleDaemons());
      daemon.setDaemon(true);
      daemon.start();
    }
    print("All ademons started");
    TimeUnit.MILLISECONDS.sleep(175);
  }
}