package pdfCode.C6ClassRelationships;



// see http://docs.oracle.com/javase/specs/jls/se7/html/jls-6.html#jls-6.3 example 6.4-1

/**
 * 方法内只能声明一个变量（相同名字）,除非在方法内定义一个类，或方法
 */
public class  Scope_2	{

  String aString = null;

  public void test()	{
	String aString = new String("set in test");
	if ( true )
	{
//		String aString = new String("set in test");
	}
  }
  public static void main(String args[] )	{
	new Scope_2().test();
  }
}
