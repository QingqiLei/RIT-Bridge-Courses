package pdfCode.C4JavaProgrammingBasics;

import java.util.EnumSet;

/**
 *
 *  >> 负数 高位补1
 *  >>> 负数 高位补0
 */
public class S12EnumSetExample {
    enum Color{
        RED, GREEN, BLUE
    };

    public static void main(String[] args) {
        EnumSet<Color> redGreen = EnumSet.of(Color.RED, Color.GREEN);
        EnumSet<Color> complementOf = EnumSet.complementOf(redGreen);
        System.out.println("redGreen = "+redGreen);
        System.out.println("complementOf = "+complementOf);
        // ~ ^ | &
        System.out.println(~0); // 按位取反
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(1^0);  // 异或
        System.out.println(1|0);  // 与
        System.out.println(1 & 0);  // 和
        System.out.println('e' + 3);
        System.out.println('e' + "3");

        System.out.println("int\t" + (~0 >>> 1) + "\t" + (~ (~0 >>> 1)));
    }
}
