import java.util.*;
import java.lang.*;
public class Copy {
  public static void main(String[] args) {
    int a[] = {1, 2, 3, 4, 5};
    int b[] = new int[10];
    System.arraycopy(a, 0, b, 0, 3);
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
  }
}