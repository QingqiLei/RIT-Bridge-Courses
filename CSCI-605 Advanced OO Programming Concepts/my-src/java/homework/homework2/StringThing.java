package homework.homework2;

import java.beans.MethodDescriptor;

public class StringThing {
    public static void method(String id, String literal, String aNewString){
        System.out.println(id +".        "+(literal == aNewString));
    }

    public static void main(String[] args) {
        String aString = "654";
        String bString = "654";
        String cString = "6" + "54";

        System.out.println("I.    "+bString == aString); //    false
        System.out.println("II.     "+(bString == aString)); // true
        System.out.println("III.    " + (bString +"" == aString)); // false , new object
        System.out.println("IV.     "+ ((bString+"") == aString));// false , new object
        System.out.println("V.      "+((""+bString) == aString));// false , new object

        System.out.println("a.   " + "654" == aString);       // false
        System.out.println("b.   "+ ("65"+4 == aString));     //             true
        System.out.println("c.   "+ aString + 6 * 54);        // 654324
        System.out.println("d.   "+ 654 + 4+ aString);        // 6544654
        System.out.println("e.   "+(654 + 4) + aString);      // 658654
        System.out.println("f.   "+(654 - 5 +""+4 + aString));// 6494654
        System.out.println("g.   "+654 * 4 + aString);        // 2616654
        System.out.println("h.   "+654/1 + aString);          // 654654
        System.out.println("i.   "+ (654 - 0) + aString);     // 654654
        System.out.println("j.   "+("654" == aString));       // true
        System.out.println("g.   "+("65" + "4" == "654"));    // false       true
        System.out.println("h.   "+("654" == cString));       // true

        method("1","xyz","x"+"yz");        //             true
        method("2","xyz","x"+"y"+"z");    // false        true
        method("3","6"+"5"+"4","6"+"5"+"4"); // false     true
        method("4","xyz",new String("x")+"yz");  // false
        method("5","6"+"5"+"4", "6"+(4-6)+4);  // false
        method("6","6"+"5"+"4","6"+5+4);  //               true







    }
}
