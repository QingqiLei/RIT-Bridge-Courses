package homework;

import com.sun.media.sound.SoftTuning;

public class StringSummary {

    /**
     * str1(pointer) + "", substring, str1 + str2 :new String
     *
     * @param args
     */
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "4";
        System.out.println("a.   "+(str1 == "123"));          // true
        System.out.println("b.   "+(str1 == "12" +"3"));      // true
        System.out.println("c.   "+(str1 == ("123"+"")));
        System.out.println("d.   "+("123" == str1 +""));      // false
        System.out.println("e.   "+("123" == (str1 +"")));    // false
        System.out.println("f.   "+("1234" == "123" + 4));    // true
        method("g.", str1 +"", "123");     // false
        method("2","xyz","x"+"yz");        // true
        method("4","xyz",new String("x")+"yz");   // false
        System.out.println("5    "+("1234".substring(0,4) == "1234"));   // true
        System.out.println("6    "+("1234".substring(0,3) == str1));    // false
        System.out.println("7    "+((str1 + str2) == "1234"));    // false

    }

    public static void method(String id, String literal, String aNewString){
        System.out.println(id +"   "+(literal == aNewString));
    }
}
