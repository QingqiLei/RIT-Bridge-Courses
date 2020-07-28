package pdfCode.C7Inheritance;

public class SubclassOfS extends S {

  public int intS;

  public SubclassOfS ()	{
	System.out.println("in SubclassOfS constructor");
  }

  public S method(int x)	{
        intS = x;
	System.out.println("in SubclassOfS!method");
	super.method(9);
	System.out.println("4. super: " + super.toString() );
	super.intS = 4;
	System.out.println("5. super: " + super.toString() );
	return (S)this;
  }
  public String toString()      {
        return "SSubclassOfS: " + intS;
  }


  public static void main(String args[])	{
	SubclassOfS aSubclassOfS = new SubclassOfS();
	S  aS =  aSubclassOfS.method(42);
	 System.out.println(aS);                    // 和下面一行的输出一样，都是 SSubclassOfS: 42
	 System.out.println(aSubclassOfS);
	System.out.println("1. SubclassOfS!intS      = "
			+ aSubclassOfS.intS);
	System.out.println("2. ((S)SubclassOfS)!intS = "
			+ ((S)aSubclassOfS).intS);
	  System.out.println("3. aS.iniS   =" + aS.intS);
// 	method(3);		// <--- what is the problem here ...

  }
}

/*
in S constructor
in SubclassOfS constructor
in SubclassOfS!method
in S!ups
4. super: S: 9
5. super: S: 4
SSubclassOfS: 42
SSubclassOfS: 42
1. SubclassOfS!intS      = 42
2. ((S)SubclassOfS)!intS = 4
3. aS.iniS   =4


              class       package        subclass          outer
public
protected                                                   false
default                                    false            false
private                    false           false            false




 */
