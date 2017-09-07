import java.math.*;
public class BigInt {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("1");
        for (int i = 1; i < 50; ++i) {
        BigInteger b = new BigInteger("2");
        a.multiply(b);
        }
        System.out.println(a);
    }
}