package pdfCode.C7Inheritance;

public interface X {

	static double MIMUM_INCREASE = 1.6 ;	// %  final

/*
 * Interface methods can't be native,
 * static, synchronized, final, private, or protected 
   Abstract and native methods can't have a body.
 */
        public static void volume()
	{
		System.out.println("xxxx");
	}

	public default void volume1()
	{
		System.out.println("xxxx1");
	}
        public void setPrice(int x);
}
