class Soupl {
  private Soupl() {}
  public static soupl makeSoup() {
    return ps1;
  }
}

class Soup2 {
  private Soup2() {}
  private static Soup2 ps1 = new Soup2();

  public static Soup2 access() {
    return ps1;
  }
}

public class Lunch {
  void testPrivate() {}

  void testStatic() {
    Soup1 soup = Soup1.makeSoup();
  }

  void testSingleton() {
    Soup2.access().f();
  }
}