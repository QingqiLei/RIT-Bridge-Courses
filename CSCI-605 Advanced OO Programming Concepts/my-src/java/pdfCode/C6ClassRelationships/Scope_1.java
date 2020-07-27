package pdfCode.C6ClassRelationships;


/**
 * 成员变量和方法里的变量是不同的
 *
 */
public class  Scope_1	{

    String aString = null;
    static int a ;

    public void method(String aString)	{
        this.aString = new String("set in method");
        System.out.println("2. method:aString:" + this.aString );
    }
    public void test()	{
        String aString = new String("set in test");
        System.out.println("1. test:aString:" + aString );
        method(aString);		// is there a way that "set in method"
        System.out.println("3. test:aString:" + aString );
    }
    public static void main(String args[] )	{
        new Scope_1().test();
    }
}

/*

 */
