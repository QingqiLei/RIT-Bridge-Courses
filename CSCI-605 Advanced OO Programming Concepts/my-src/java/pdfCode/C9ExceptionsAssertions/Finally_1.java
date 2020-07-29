package C9ExceptionsAssertions;

public class Finally_1 {

  private void caller()	 {
		try {
			throw new Exception("in try:	caller(): in thisMethodThrowsAnException");
		} catch (Exception e)	{
			System.out.println("	in catch caller(): caught exception");
			e.printStackTrace();
			System.out.println("11");
		} finally	{
			System.out.println("		Finally: caller()");
		}
  }
  private void returnS()	 {
		try {
			throw new Exception("in try:	returnS(): in thisMethodThrowsAnException");
		} catch (Exception e)	{
			System.out.println("	in catch(): returnS: caught exception");
			System.out.println("	in catch(): calling System.returnS(0)");
			return;
		} finally	{
			System.out.println("		Finally: returnS()");
		}
		// Finally_1.java:24: error: unreachable statement
		// System.out.println("returnS(): you will not see this line");
  }
  private void exit()	 {
		try {
			throw new Exception("in try:	exit(): in thisMethodThrowsAnException");

		} catch (Exception e)	{
			System.out.println("	in catch exit(): caught exception");
			System.out.println("	in catch exit() calling System.exit(0)");
			System.exit(0);
		} finally	{
			System.out.println("		Finally: exit()");	// nicht ausgefuehrt
		}
		System.out.println("exit(): you will not see this line");	// nicht ausgefuehrt
  }

  public static void main(String[] args) {
//	new Finally_1().caller();
//	new Finally_1().returnS();
	new Finally_1().exit();
  }
}
