import java.io.File;
import java.util.Scanner;

public class Scanner7 {
    public static void asIs(){
        Scanner sc = new Scanner(System.in);
        System.out.print(": ");
        while(sc.hasNext()) System.out.print("-" + sc.next()+ "+");
        sc.close();
        System.out.println();
    }

    public static void whiteSpace(String description, String theDelimiter){
        Scanner sc = null;
        try{
            // 0000000 1 ,sp2,3,sp sp sp sp ,5;7nl 0000020
            sc = new Scanner(new File("words.txt"));

        }catch (Exception e) {e.printStackTrace();}
        sc.reset();

        sc.useDelimiter(theDelimiter);
        System.out.println(description);
        System.out.println("\tdelemiter: "+ theDelimiter);
        while(sc.hasNext()) System.out.println("\t-" + sc.next()+"+");
        sc.close();
        System.out.println();
    }

    public static void main(String[] args) {
        // * any time, + more than 0, \s white space
        whiteSpace("java white space", "\\p{javaWhitespace}+");
        whiteSpace("white space* and comma and white spice*","\\s*,\\s*");
        whiteSpace("white space+ and comma and white space*", "\\s+,\\s*");
        whiteSpace("comma or semicolom", "\\s*(,|;)\\s*");





        asIs();
    }
}
