package pdfCode.C6ClassRelationships;

public class  XX	{
  int instanceV = 1; // 6

  static XX b; // this b is same as the b in main function
  static XX a;  // this a is same as the a in main function

  public XX()	{
  }
  public void method(int i){
	instanceV = i;
  }
	
  public String toString() {
	return "instanceV = " + instanceV;
  }

  public void m2(int i){
	a.method(i);
	method(2 * i);
	System.out.println("-----------------------------------------");
	System.out.println("print itself : " + this);
	System.out.println("print a: " + a);
	System.out.println("=========================================");
  }

  public static void main(String args[] )	{
	b = new XX();
	a = new XX();

        b.m2(3); //
        a.m2(24);
  }
}
