package pdfCode.C7Inheritance;

public class B1 {

  public int instanceV = 1;		

  public String toString()	{
	return "B1: " + instanceV;
  }
  public void both()    {
        instanceV = 11;
  }
  public static void main(String args[]) {
	System.out.println(new B1());
  }
}

