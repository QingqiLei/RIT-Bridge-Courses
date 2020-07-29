package C9ExceptionsAssertions;

public class Finally_4 {
	int i = 0;
 public int tryCatchFinally() {

	try {
		i = 1;
		System.out.println("a: " + i );                                //
		try {
			i = 2;
			System.out.println("b: " + i );                           //
			return i;		// this will be the return value
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("c: " + i );                             //
			++i;
		}
		System.out.println("d: " + i );
		return i;
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		System.out.println("e: " + i );                             //
		++i;
		System.out.println("f: " + i );                            //
	}
	return i;
	} 
  public static void main(String[] args) {
	System.out.println("Calling new Finally_4().tryCatchFinally() " + new Finally_4().tryCatchFinally() );   //

  }
}

/*

 */
