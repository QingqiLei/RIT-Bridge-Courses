import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternEs {
    public static void mathod1(){
        System.out.println("  method1   ");
        String[] someWords = {"aaa", "ab"};
        String somePattern = "a*";
        for(int i = 0; i < someWords.length; i++){
            Pattern p = Pattern.compile(somePattern);
            Matcher m = p.matcher(someWords[i]);
            System.out.println(somePattern +" matches "+someWords[i] + " "+m.matches());
            System.out.println(somePattern +" matches "+someWords[i] + " "+Pattern.matches(somePattern, someWords[i]));

        }
    }

    public static void method2(){
        System.out.println("  method2   ");
        String[] someWords = {"aaa", "ab"};
        String somePattern = "a+";
        for(int i = 0; i < someWords.length; i++){
            Pattern p = Pattern.compile(somePattern);
            Matcher m = p.matcher(someWords[i]);
            System.out.println(somePattern +" matches "+someWords[i] + " "+m.matches());
            System.out.println(somePattern +" matches "+someWords[i] + " "+Pattern.matches(somePattern, someWords[i]));

        }
    }

    /**
     * ^ 开始， 在[] 中表示非
     * $ 结束
     * * 任意次， 前面的字符或者子表达式
     * + 大于0次， 前面的字符或者子表达式
     * ？0次或者1次  等效{0，1}
     * {n} n 为非负整数，表示正好匹配n次
     * {n,} 匹配至少n次
     * \d 数字
     * \s 空白
     * \w 任何字符字符
     *
     */
    public static void method3(){
        System.out.println("      method3      ");
        System.out.println(Pattern.matches("^ab.*", "abc")); // begin with ab.......
        System.out.println(Pattern.matches("^ab?", "ab"));   // a, ab
        System.out.println(Pattern.matches("^ab?", "abc"));
        System.out.println(Pattern.matches("^ab?", "abb"));
        System.out.println(Pattern.matches("^ab.?", "abc"));   // ab   ab.
        System.out.println("  "+ Pattern.matches(".*bc.*", "bc"));
        System.out.println(Pattern.matches("^ab{1,}?", "abbbbbb"));   // ? useless
        System.out.println(Pattern.matches("^ab$", "ab"));

    }

    public static void method4(){
        String someWord = "abc";
        String somePattern = "";
        if(someWord.indexOf("a") == 0) somePattern = "^a";
        if(someWord.length() >=2) somePattern += ".*";
        if(someWord.charAt(someWord.length()-1) == 'c') somePattern += "c$";

        System.out.println("somePattern = "+ somePattern);
        System.out.println(somePattern +" matches " + someWord +" : "+ Pattern.matches(somePattern,someWord));


    }


    public static void main(String[] args) {
        mathod1();
        method2();
        method3();
        method4();
    }
}
