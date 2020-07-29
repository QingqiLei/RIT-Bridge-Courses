package C9ExceptionsAssertions;

public class Finally_3 {

  int rValue = 0;
  private int caller()	 {
		try {
			throw new Exception("in thisMethodThrowsAnException");

		} catch (Exception e)	{
			rValue = 1;
			System.out.println("caller: before return! rValue =  " + rValue);
			return rValue;
//			 rValue = 11;
			
		} finally	{
			System.out.println("finaly: before return! rValue =  " + rValue);
			rValue = 111;
			return rValue;  // 注释掉，caller 方法返回1
			// rValue = 1111;
		}
  }
  public static void main(String[] args) {
	System.out.println("Calling new Finally_3().caller() " + new Finally_3().caller() );
  }
}
