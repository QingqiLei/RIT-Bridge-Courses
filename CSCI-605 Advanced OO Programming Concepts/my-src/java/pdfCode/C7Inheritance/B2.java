package pdfCode.C7Inheritance;


public class B2 extends B1 {

  public int instanceV = 2;		
  public boolean calledOddTimes = false;

  public void both()	{
	instanceV = 22;
  }
  public void toCallSuper()	{
	super.both();
  }


  public String toString()      {
        return "B2: " + instanceV;
  }

  public static void main(String args[]) {
 	B2 aB2 = new B2();
	B1 aB1 = (B1)aB2;

	aB2.both();
		System.out.println("1. aB2 = " + aB2 );            //  same
 		System.out.println("1. aB1 = " + aB1 + "\n" );
	aB1.both();
		System.out.println("2. aB2 = " + aB2 );           // same
		System.out.println("2. aB1 = " + aB1 + "\n" );

	aB1.instanceV = 5;    // 直接修改成员变量
		System.out.println("3. aB2.instanceV = " + aB2.instanceV );          //  22
		System.out.println("3. aB1.instanceV = " + aB1.instanceV + "\n" );   //  5

	aB2.instanceV = 7;     // 直接修改成员变量
		System.out.println("4. aB2.instanceV = " + aB2.instanceV );        // 7
		System.out.println("4. aB1.instanceV = " + aB1.instanceV + "\n");  // 5

	aB2.toCallSuper();
		System.out.println("5. aB2.instanceV = " + aB2.instanceV );       // 7
		System.out.println("6. aB1.instanceV = " + aB1.instanceV + "\n"); //  upper.both()  77

	aB2 = (B2)aB1;		// will this compile?
		System.out.println("7. aB2.instanceV = " + aB2.instanceV );
//	 aB2 = new B1();		// will this compile


	//  System.out.println("3. aB2.superA(): " + super.B2.instanceV);

  }
}

