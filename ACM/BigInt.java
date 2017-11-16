import java.util.*;
import java.math.BigInteger;

/**
 * BigInt
 */
public class BigInt {
  public static void main(String[] args) {
    BigInteger a = BigInteger.valueOf(3); 
    BigInteger b = BigInteger.valueOf(4);
    System.out.println(a); 
    a = a.abs();
    a = a.add(a);
    a = a.subtract(a);
    a.divide(b);
    // a.remainder(a);
    // a.mod(a);
    // a.gcd(b);
    a.negate();
    System.out.println(a.and(b));
    if(a.and(b) == BigInteger.ZERO)
      System.out.println("Hello World");
  }
}