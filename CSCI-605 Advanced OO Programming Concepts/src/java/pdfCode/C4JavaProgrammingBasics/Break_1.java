package pdfCode.C4JavaProgrammingBasics;

public class Break_1 {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        i += 63;
        System.out.println("1. " + (i++ >> 2));  // 15

//        int n = 0;
//         while ( true ) {   // 不会停止
//             System.out.println("xx");
//             if(n++ == 0 ) {
//                 System.out.println("n == 0");
//                 } else if ( n++ == 1 ) {
//                 System.out.println("n == 1");
//                 } else if ( n-- == 2 ) System.out.println("n == 2");
//             Thread.sleep(10);
//             System.out.println(n);
//             }


        int n = 0;
        here:
        {
            while (true) {
                System.out.println("1.n == " + n);
                while (n < 100) {
                    n++;
                    System.out.println("2.n == " + n);
                    if (n > 2) break here;
                }
                System.out.println("3.n == " + n);
            }
        }
        int aInt;
        int countUpTo5;
//         int 5IsA_niceNumber;
//         int ooo\";
//         int notToMany:areAllowd;

    }
}
