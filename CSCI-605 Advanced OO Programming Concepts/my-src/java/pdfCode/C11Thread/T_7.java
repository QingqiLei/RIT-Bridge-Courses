package C11Thread;

/*
 * is 	e dd
 *	e ee
 *	a b
 * possible?
 */
public class T_7 extends Thread {
    static String i = "2";
    static String aValue = "a";
    static String bValue = "b";

    T_7(String i) {
        this.i = i;
    }

    public void run() {
        synchronized (i) {     // 这里实际上用的是 "2", 因为
			System.out.println(i);
            if (i == "1") {
                aValue = "e";
                bValue = "ee";
            }
            else{
				aValue = "d";
				bValue = "dd";
			}
			System.out.println("aValue = " + aValue);
			System.out.println("bValue = " + bValue);
        }


    }

    public static void main(String args[]) {
		new T_7("1").start();
        new T_7("2").start();

        synchronized (i) {
            System.out.println("aValue = " + aValue);
            System.out.println("bValue = " + bValue);
        }
    }
}
