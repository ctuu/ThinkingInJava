import java.util.*;

public class ReplacingStringTokenizer {
  public static void main(String[] args) {
    String input = "But I'm not dead yet!  I feel happy!";
    StringTokenizer stock = new StringTokenizer(input);
    while(stock.hasMoreElements())
      System.out.print(stock.nextToken() + " ");
    System.out.println();
    System.out.println(Arrays.toString(input.split(" ")));
    Scanner scanner = new Scanner(input);
    while(scanner.hasNext())
      System.out.print(scanner.next() + " ");
    scanner.close();
  }
}