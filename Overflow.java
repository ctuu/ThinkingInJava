import java.util.*;
import java.lang.*;

public class Overflow {
    public static void main(String[] args) {
        byte a = 124;
        short b = -32764;
        for (int i = 0; i < 8; ++i) {
            System.out.print(String.format("a= %4d ", a));
            bytetobin(a);
            a += 1;
        }
        for (int i = 0; i < 8; ++i) {
            System.out.print(String.format("b= %6d ", b));
            shorttobin(b);
            b -= 1;
        }
    }

    public static void bytetobin(byte a) {
        String str = Integer.toBinaryString(a);
        String ans = new String();
        if (str.length() > 8) {
            ans = str.substring(24, 28) + " " + str.substring(28, 32);
            // System.out.println(str);
            System.out.print(ans + " ");
            String ant = new String();
            for (int i = 0; i < ans.length(); ++i) {
                if (ans.charAt(i) == '0')
                    ant += "1";
                else if (ans.charAt(i) == ' ')
                    ant += " ";
                else
                    ant += "0";
            }
            System.out.println(ant);
        } else {
            ans = "0" + str.substring(0, 3) + " " + str.substring(3, 7);
            System.out.println(ans);
        }
    }

    public static void shorttobin(short b) {
        String str = Integer.toBinaryString(b);
        String ans = new String();
        if (str.length() > 16)
            ans = str.substring(16, 20) + " " + str.substring(20, 24) + " " + str.substring(24, 28) + " "
                    + str.substring(28, 32);
        else
            ans = "0" + str.substring(0, 3) + " " + str.substring(3, 7) + " " + str.substring(7, 11) + " "
                    + str.substring(11, 15);
        // System.out.println(str);
        System.out.println(ans + " ");
    }
}