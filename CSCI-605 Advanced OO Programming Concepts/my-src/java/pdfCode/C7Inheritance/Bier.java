package pdfCode.C7Inheritance;
public class Bier {
  private int bier;
  
  public Bier()	{
	bier ++;
  }
	
  public void print()	{
	System.out.println("bier  = " + bier  );
  }

  public static void main(String args[])	{
//		Bier aBier = new Bier();
      Bier aBier = null;
//      Bier aBier;
      for ( int i = 0; i < 1000; i ++ )
		aBier = new Bier();
	aBier.print();
 }
}
