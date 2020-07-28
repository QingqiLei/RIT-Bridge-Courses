package pdfCode.C7Inheritance;



public class AAandBBuse implements AA, BB {

    public void a() {		// interface
	System.out.println("AAandBBuse!a");
    }

    public void b(){
	System.out.println("AAandBBuse.b()");
        System.out.println(BB.super.getClass());
	BB.super.b();                   // 如果实现了多个接口，接口中有相同的default。那么在实现类中要重写方法，BB.super.b()
    }

    public static void main(String argv[])	{
//        System.out.println;
	new AAandBBuse().a();
	new AAandBBuse().b();
	new Object();
    }
}

interface AA {

    public void a();
    default void b(){
        System.out.println("AA.b()");
    }


/*

AAandBBuse.java:1: error: class AAandBBuse inherits unrelated defaults for b() from types AA and BB
public class AAandBBuse implements AA, BB {
*/
}

interface BB {

    public void a();

    default void b(){
        System.out.println("BB.b()");
    }
}

