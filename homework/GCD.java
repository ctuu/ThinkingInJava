import java.util.*;
public class GCD {
  private static int calc(int a, int b) {
    if (b == 0)
      return a;
    return a % b == 0 ? b : calc(b, a % b);
  }
  private static int getRan() {
    Random ran = new Random();
    return ran.nextInt(100);
  }
  public static void main(String[] args) {
    // GCD re = new GCD();
    int a = GCD.getRan(), b = GCD.getRan();
    System.out.println(a + " " + b);
    System.out.println("Result: " + GCD.calc(a, b));
  }
}