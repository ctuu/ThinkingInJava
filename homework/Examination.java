import java.util.*;
public class Examination {
  private static final int MC = 30;
  private static final float CP = 0.3f;
  private static final int MG = 60;
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    try {
      System.out.println("Enter your scoring in attendance and homework:");
      float atteHomeScore = stdin.nextFloat();
      System.out.println("Enter your scoring in attendance:");
      int attendance = stdin.nextInt();
      if (atteHomeScore < MG || attendance < MC * CP)
        System.out.println("You are not qualified for the exam.");
      else
        System.out.println("You have the eligibility of the exam");
    } finally {
      stdin.close();
    }
  }
}