import java.util.*;
import java.lang.*;

public class Overflow {
  public static void main(String[] args) {
    byte a = 124;
    short b = -32764;
    for (int i = 0; i < 8; ++i) {
      System.out.print(String.format("a =   %4d  ", a)); //类似 C 语言的格式化输出
      bytetobin(a); // Byte 类型二进制表示
      a += 1;
    }

    byte c = -1;
    System.out.print("        " + c + "  ");
    bytetobin(c); //随机测试

    for (int i = 0; i < 8; ++i) {
      System.out.print(String.format("b = %6d  ", b));
      shorttobin(b); // Short 类型二进制表示
      b -= 1;
    }
  }

  public static void bytetobin(byte a) {
    String str = Integer.toBinaryString(a); //整型转二进制表示并用字符串储存
    // System.out.println(str);
    String ans = new String(); // Java 对于非基本类型初始化
    if (str.length() > 8) { //如果是负数
      ans = str.substring(24, 28) + " " + str.substring(28, 32); // substring 从0开始前闭后开
      System.out.print("原码：" + ans + " ");
      String ant = new String();
      for (int i = 0; i < ans.length(); ++i) { //反码
        if (ans.charAt(i) == '0')
          ant += "1";
        else if (ans.charAt(i) == ' ')
          ant += " ";
        else
          ant += "0";
      }
      System.out.println(" 反码: " + ant);
    } else {
      ans = "0" + str.substring(0, 3) + " " + str.substring(3, 7);
      System.out.println("原码：" + ans);
    }
  }

  public static void shorttobin(short b) {
    String str = Integer.toBinaryString(b);
    // System.out.println(str);
    String ans = new String();
    if (str.length() > 16)
      ans = str.substring(16, 20) + " " + str.substring(20, 24) + " " + str.substring(24, 28) + " "
          + str.substring(28, 32);
    else
      ans = "0" + str.substring(0, 3) + " " + str.substring(3, 7) + " " + str.substring(7, 11) + " "
          + str.substring(11, 15);
    System.out.println("原码：" + ans);
  }
}
/*
Output:
a =    124  原码：0111 1100
a =    125  原码：0111 1101
a =    126  原码：0111 1110
a =    127  原码：0111 1111
a =   -128  原码：1000 0000  反码: 0111 1111
a =   -127  原码：1000 0001  反码: 0111 1110
a =   -126  原码：1000 0010  反码: 0111 1101
a =   -125  原码：1000 0011  反码: 0111 1100
        -1  原码：1111 1111  反码: 0000 0000
b = -32764  原码：1000 0000 0000 0100
b = -32765  原码：1000 0000 0000 0011
b = -32766  原码：1000 0000 0000 0010
b = -32767  原码：1000 0000 0000 0001
b = -32768  原码：1000 0000 0000 0000
b =  32767  原码：0111 1111 1111 1111
b =  32766  原码：0111 1111 1111 1110
b =  32765  原码：0111 1111 1111 1101
*/
/*
Byte 是 有符号单字节整型，在机器中占8位，表示范围是 -2^8 到 2^8-1，即 -128 到 127。
因为有一位作为确定正负的符号位。
127的二进制表示是 0111 1111。
一般来说，机器判断正负的依据在于第0位：
if (Btye[0] == 0)
正数
else
负数
对一个数的加减，其实是在二进制表示中加减。
127 - 1 = 126： 0111 1110
如果要显示一个数，在遇到负数时，取补码，将补码转换成10进制，在这个数前面加负号。
简单的说，要得到一个数的补码，先把该二进制数据按位取反，再加1。
如：-126，二进制原码 1000 0010；反码 0111 1101；补码 0111 1110，此时补码得到的10进制数是 126。
根据这个计算法则，恰好就有一个溢出环。0,1,2,...,127,-128,-127,...,-2,-1,0,1,...
Short 是有符号16位整型，也同理。
*/