import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner("1blobblob2blob3").useDelimiter("blob");
        System.out.println("> ");
        while(sc.hasNext()){
//            int line = sc.nextInt();
            String line = sc.next();
            System.out.printf("-%s-%n", line);
            System.out.printf("> ");

        }
        sc.close();
    }
}
