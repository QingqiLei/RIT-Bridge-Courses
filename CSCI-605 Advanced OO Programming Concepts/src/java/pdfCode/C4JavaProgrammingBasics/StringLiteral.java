package pdfCode.C4JavaProgrammingBasics;

/**
 *
 */
public class StringLiteral {
    public static void main(String[] args) {
        String aString = "you";
        String bString = "yo" + "u"; // compiler

        if ("you".equals(aString))
            System.out.println("1. equal");
        if (bString.equals(aString))
            System.out.println("2. equal");
        if ("yo" + "u" == aString)
            System.out.println("3. ==");
        if (bString == aString)
            System.out.println("4. ==");
        if (bString == new String("you"))
            System.out.println("5. ==");
        else
            System.out.println("6. !=");
    }
}
/*
1. equal
2. equal
3. ==
4. ==
6. !=
 */