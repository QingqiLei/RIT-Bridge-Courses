public class H {
  private        String hPrivate  = "hPrivate";
  private static String hPrivateS = "hPrivateS";

  public H(String hPrivate)	{
	this.hPrivate = hPrivate;
  }


    /**
     * only constructors can invoke constructors
     */
  public void knete()	{
//	this = this("RIT");
  }

  public void print(String tag)	{
	System.out.println(tag + "hPrivate  = " + hPrivate  );
  }

  public static void main(String args[])	{
	H aH = new H("1");
        aH.print("1.");
        aH.knete();
        aH.print("2.");
 }
}
