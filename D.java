class D {
  int s35;
  int s33;
  int s10;
  int s19;
  int s12;
  long s11;
  long s13;
  long s37;
  int[] s27 = {3, 0, 1, 0, -1};
  int[] s2 = {0, 3, -3, -2, -2};
  int[] s14 = {-2, 2, 3, -3, -3};
  static int s6;
  static int s38;
  static int s15;
  static int s31;
  static int s22;
  public D() {
    s35 = 1;
    s33 = 0;
    s10 = 2;
    s19 = 6;
    s12 = 4;
    s11 = 7L;
    s13 = 1L;
    s37 = 1L;
  }
  public void s18() {
    System.out.println("метод s18 в классе D");
    System.out.println(s35);
  }
  public void s28() {
    System.out.println("метод s28 в классе D");
    System.out.println(s12 - 1);
  }
  public void s21() {
    System.out.println("метод s21 в классе D");
    System.out.println(++s10);
  }
  public void s20() {
    System.out.println("метод s20 в классе D");
    System.out.println(s14[2] + s14[2]);
  }
  public void s36() {
    System.out.println("метод s36 в классе D");
    System.out.println((int)s37);
  }
  public void s32() {
    System.out.println("метод s32 в классе D");
    System.out.println(s2[2] + s2[1]);
  }
  public static void s17() {
    System.out.println("метод s17 в классе D");
    System.out.println(s31);
  }
  public static void s9() {
    System.out.println("метод s9 в классе D");
    System.out.println((s31 - 3));
  }
  public static void s29() {
    System.out.println("метод s29 в классе D");
    System.out.println(s22);
  }
  public static void s40() {
    System.out.println("метод s40 в классе D");
    System.out.println((s22 - 5));
  }
  public void s30(D r) {
    r.s18();
  }
  public void s30(A r) {
    r.s28();
  }
}
