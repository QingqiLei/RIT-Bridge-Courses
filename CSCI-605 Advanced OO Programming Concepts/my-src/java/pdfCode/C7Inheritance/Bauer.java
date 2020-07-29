public class Bauer {
  private        String bauerPrivate  = "bauerPrivate";
  private static String bauerPrivateS = "bauerPrivateS";

  public Bauer()	{
  }

  public Bauer(String bauerPrivate)	{
	this.bauerPrivate = bauerPrivate;
  }

    /**
     * 这种写法是不对的
     */
  public void knete()	{
//	this = new Bauer("RIT");
  }
		
  public static void main(String args[])	{
	Bauer aBauer = new Bauer();
 }
}
