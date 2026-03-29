class A extends D {
  public A() {
    s10 = 2;
    s19 = 2;
    s11 = 2L;
  }
  public void s18() {
    System.out.println("метод s18 в классе A");
    System.out.println(--s10);
  }
  public void s20() {
    System.out.println("метод s20 в классе A");
    System.out.println(s12 >> 1);
  }
  public void s36() {
    System.out.println("метод s36 в классе A");
    System.out.println(s12 - 2);
  }
  public static void s17() {
    System.out.println("метод s17 в классе A");
    System.out.println((s6 + 1));
  }
  public static void s9() {
    System.out.println("метод s9 в классе A");
    System.out.println(s6++);
  }
  public static void s29() {
    System.out.println("метод s29 в классе A");
    System.out.println(s38);
  }
  public static void s40() {
    System.out.println("метод s40 в классе A");
    System.out.println((s38 + 3));
  }
  public void s30(D r) {
    r.s21();
  }
  public void s30(A r) {
    r.s20();
  }
}
