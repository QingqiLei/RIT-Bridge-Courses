package pdfCode.C4JavaProgrammingBasics;

/**
 * /t  /n
 */
public class StringL {
    public static void method(String id, String literal, String aNewString) {
        System.out.println(id + " in method");
        System.out.print("\tliteral= aNewString\n ");
        System.out.println(literal == aNewString);
    }

    public static void main(String args[]) {
        String aString = "abc";
        System.out.print("abc == aString\n ");
        System.out.println("abc" == aString);       // true

        String newString = new String("abc");
        System.out.print("abc == new String(abc)\n ");
        System.out.println("abc" == newString);     // false

        method("1", "abc", "abc");          // true
        method("2", "abc", new String("abc"));  //false
        method("3", "abc", "ab" + "c");      // true
        method("4", "abc", "" + "abc");     // true

        String str1 = "abc";
        method("5","abc",(str1+""));         // false
         System.out.println("abc"== (str1+""));        // false
    }
}
/*
only method("2", "abc", new String("abc")); is not ==
 */