package pdfCode.C7Inheritance;

public class SS {

  static public int intS;		

  public SS ()	{
	System.out.println("in S constructor");
  }

  static {
	System.out.println("S:Static 1");
  }

  static {
	System.out.println("S: Static 2");
  }

  public static void main(String args[])	{
	System.out.println("new S()     " +  new SS());
  }
}
