package pdfCode.C4JavaProgrammingBasics;


/**
 *
 *         int aInt = 0;
 *         String left = "0";
 *         System.out.println((0 + "1")==("0" + "1"));      // true
 *         System.out.println((aInt + "1")==("0" + "1"));   // false
 *         System.out.println(("0" + "1")==(left + "1"));   // false
 */
public class X_s1 {
    public static void method_a() {
        String one = "1";
        String ten = "10";
        do {
            System.out.println("a_1: " + (one == ten));
            one = one + "0";
        } while (one == ten);
    }

    public static void method_b() {
        int one = 1;
        int ten = 10;

        System.out.println("b_1: " + 3 * one + 0 * ten);
    }

    public static void method_c() {
        String right = new String(10 * 1 - 10 + "");
        String middle = "00".substring(0, 1);
        String left = "0";
        String m;
        m = new String("xxx");

        int aInt = 0;

        System.out.println("c_1: " + ("0" == left));
        System.out.println("c_1: " + (m == left));
        System.out.println("c_2: " + ("0" == middle));                   // false
        System.out.println( "00" == "00".substring(0,2));
        System.out.println("c_3: " + (left + aInt + aInt));
        System.out.println("c_4: " + (left + aInt * aInt));
        System.out.println("c_5: " + (("1" + "") == "1"));
        System.out.println("c_6: " + ((aInt + "1") == (left + "1")));    // false
    }

    public static void main(String argv[]) {
        int aInt = 0;
        String left = "0";
        System.out.println((0 + "1")==("0" + "1"));
        System.out.println((aInt + "1")==("0" + "1"));  // called variable aInt, yield new object
        System.out.println(("0" + "1")==(left + "1"));  // called variable left, yield new object
        System.out.println("---------------------------------");

        method_c();
        method_a();
        method_b();

        System.out.println("---------------------------------");
        String a="1";
        String b="";

        String str1=a+b;                //产生新对象, 不是在字符串池中的，是在堆上的
        String str2=a+b;                //产生新对象
        String str3="1"+b;              //有变量参与计算，产生新对象 
        String str4="1"+"";             //编译器自动优化 <==> String str4="1"; "1"常量字符串已被a引用过
        String str5="1"+"";             //同上  

        System.out.println(str1==str2);   // false
        System.out.println(str1==str3);   // false
        System.out.println(str1==str4);   // false

        System.out.println(str2==str3);   // false
        System.out.println(str2==str4);   // false

        System.out.println(str3==str4);   // false

        System.out.println(str4==str5);   // true

    }
}
/*
c_1: true
c_1: false
c_2: true    ---> false
c_3: 0       ---> 000
c_4: 0       ---> 00
c_5: true
c_6: true    ---> false
a_1: false
b_1: 30



 */
