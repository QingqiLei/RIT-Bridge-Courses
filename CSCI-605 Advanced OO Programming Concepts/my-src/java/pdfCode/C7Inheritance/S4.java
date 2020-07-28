package pdfCode.C7Inheritance;

public class S4 extends S3 {

  public int instanceV = 4;		

  public void onlyInS4()	{
	System.out.println("S4: onlyInS4");
  }
    public void set(int value)    {
        instanceV = value;
  }
  public String toString()      {
        return "S4: " + instanceV;
  }

  public static void main(String args[]) {
 	S4 aS4 = new S4();
	S3 aS3 = (S3)aS4;
	
	System.out.println("1.	aS4 =" + aS4 );
	System.out.println("2.	aS3.instanceV = " + aS3.instanceV );

	System.out.println("3.	aS3 = " + aS3 );                        // 输出仍然是S4
	System.out.println("4.	aS3.instanceV = " + aS3.instanceV );

	System.out.println("5.	S4.set(44);");
	System.out.println("6.	S3.set(33);");
 	aS4.set(44);
	
	System.out.println("7.	aS4 = " + aS4 );
	System.out.println("8.	aS4.instanceV = " + aS4.instanceV );
	System.out.println("9.	aS3 = " + aS3 );                        // 子类S4 的toString() 方法
	System.out.println("10.	aS3.instanceV = " + aS3.instanceV );

 	aS3.set(33);                    // 仍然调用S4中的set 方法， 设置的是S4
	System.out.println("11.	aS4 = " + aS4 );
	System.out.println("12.	aS4.instanceV = " + aS4.instanceV );
	System.out.println("13.	aS3 = " + aS3 );                        // 子类S4 的toString() 方法
	System.out.println("14.	aS3.instanceV = " + aS3.instanceV );

  }
}
/*
1.	aS4 =S4: 4
2.	aS3.instanceV = 1
3.	aS3 = S3: 1               3.	aS3 = S4: 4
4.	aS3.instanceV = 1
7.	aS4 = S4: 44
8.	aS4.instanceV = 44
9.	aS3 = S3: 1               9.	aS3 = S4: 44
10.	aS3.instanceV = 1
11.	aS4 = S4: 33
12.	aS4.instanceV = 33
13.	aS3 = S3: 1               13.	aS3 = S4: 33
14.	aS3.instanceV = 1

 */

