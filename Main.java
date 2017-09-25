import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
  public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    int n = cin.nextInt();
    for (int i = 1; i <= n; ++i) {
      if (i > 1)
        System.out.println();
      BigInteger a = new BigInteger("0"), b = new BigInteger("0"), c = new BigInteger("0");
      a = cin.nextBigInteger();
      b = cin.nextBigInteger();
      System.out.println("Case " + i + ":");
      System.out.print(a + " + " + b + " = ");
      b = b.add(a);
      System.out.print(b);
      System.out.println();
    }
  }
}