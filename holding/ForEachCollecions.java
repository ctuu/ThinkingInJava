import java.util.*;
public class ForEachCollecions {
  public static void main(String[] args) {
    Collection<String> cs  = new LinkedList<String>();
    Collections.addAll(cs,
      "Take the long way home".split(" "));
    for (String s : cs)
      System.out.print("'" + s + "' ");
  }
}