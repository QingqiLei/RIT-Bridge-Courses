package pdfCode.C6ClassRelationships;

public class ComplexExample {
    static class Student	{
	int uid;
	String name;
		
	Student ( String name, Integer uid )	{
		this.name = name;
		this.uid = uid;
	}
	int 	getUid()	{
		return uid;		
	}
	String 	name()	{
		return name; 	
	}
	void   	setUid(int uid)	{
		uid = uid;
	}
	void   	setName(String name) {
		this.name = name;
	}
	public String	toString() {
		return name +"/" + uid;
	}
    }

    // 重新指定指针
    public static void method1(Student joe )	{
	joe = new Student("me", new Integer(2) );
    }

    // 改变内容
    public static void method2(Student joe )	{
	joe.setName("me");
    }

    // 改变内容
    public static void method3(Student joe )	{
	joe.setUid(2);
    }
    public static void method4(String you )	{
	System.out.println("	4.a:  " + you );
	you.replace("y", "p");
	System.out.println("	4.b:  " + you );
    }
    public static void main( String[] args ) {
	Student joe = new Student("joe", 1 );
	String  you = "yourName";
	int	uid = joe.getUid();
	Integer	intO = joe.getUid();
	method1(joe);	System.out.println("1: 	" + joe );
	method2(joe);	System.out.println("2: 	" + joe );
	method3(joe);	System.out.println("3: 	" + joe );
	method4(you);	System.out.println("4: 	" + you );
    }
}
/*
 me/2
 me/2
 me/2
 4.a:   yourName
 4.b:   yourName
 4:   yourName



 */


