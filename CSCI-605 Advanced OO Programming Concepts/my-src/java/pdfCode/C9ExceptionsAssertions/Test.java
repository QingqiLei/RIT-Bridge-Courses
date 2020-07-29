package C9ExceptionsAssertions;

public class Test	{

/*
http://download.oracle.com/javase/tutorial/essential/exceptions/finally.html
https://docs.oracle.com/javase/specs/jls/se8/html/jls-14.html#jls-14.20.2
*/
	public int tryCatchFinally() {
	     try {
	        try {
	            System.out.println("Inner TRY");
	            int i = 1/0;
	            System.out.println("Never Seen: Inner TRY after 1/0");
	            return 1;
	        } catch (Exception e) {
	            System.out.println("Inner CATCH");
	            System.out.println(e);
		    int i = 1/0;
	            System.out.println("Never Seen: Inner CATCH after 1/0");
	            return 2;
	        }
		finally {
	            System.out.println("Inner FINALLY!");
		    // int i = 1/0;
		    // System.exit(1);
		    return 3;	 // 执行到这里，如果有return 那么程序就要进入结束阶段        // what will happen if we comment this line out?  Outer Catch  return 4
	        }
	      } catch (Exception e) {
	            System.out.println("Outer Catch");
		    return 4;
	      } finally {
	            System.out.println("Outer FINALLY");
//		     System.exit(1);	// hat will happen if we comment this line out?  decomment will exit , not process the fllowing step
		    return 6;	// what will happen if we comment this line out?    return 3
	      }


	}
	
	public static void main(String[] args )	{
		// return value is?
		System.out.println("new Test().tryCatchFinally(); = " + 
				new Test().tryCatchFinally() );
	}
}
/*
Inner TRY
Inner CATCH
e
Outer Catch           // 没有
Inner FINALLY!
Outer FINALLY
6
 */