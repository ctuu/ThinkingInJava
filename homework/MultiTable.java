public class MultiTable {
  public static void main(String[] args) {
    System.out.format("* |");
    for (int i = 1; i <= 9; ++i) System.out.format("%2d ", i);
    System.out.print("\n--|---------------------------");
    for (int i = 1; i <= 9; ++i) {
      System.out.format("\n%d |", i);
      for (int j = 1; j <= i; ++j) System.out.format(" %-2d", i * j);
    }
  }
}