package C9ExceptionsAssertions;

public class B extends A {

    /**
     * 替换了A的f 方法
     * @param n
     */
  private void f(int n) {
	System.out.println("f(" + n + ")" );
  }

  public static void main(String[] args) {
	new B().f(1);
  }
}
