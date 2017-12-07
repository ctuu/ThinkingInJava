import java.util.concurrent.*;

public class SleepingTask extends LiftOff {
  public void run() {
    try {
      while(countDown-- > 0) {
        System.out.print(status());
        TimeUnit.MILLISECONDS.sleep(100);// 这里速度调慢以便客户加钱优化
      }
    } catch(InterruptedException e) {
      System.err.println("Interrupted");
    }
  }
  public static void main(String[] args) {
    ExecutorService exec = Executors.newCachedThreadPool();
    for(int i = 0; i < 5; ++i)
      exec.execute(new SleepingTask());
      exec.shutdown();
  }
}