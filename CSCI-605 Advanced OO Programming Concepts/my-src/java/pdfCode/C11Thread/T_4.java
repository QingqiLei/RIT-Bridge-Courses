package C11Thread;

import java.util.*;

public class T_4 extends Thread    {
    static Object o = new Object();
    public void run () {
        synchronized ( o ) { 
            System.err.println("--->");
            try {
                    sleep(1000);
            }
            catch (  InterruptedException e ) {
                System.err.println("Interrupted!");
            }
            System.err.println("<---" );
        }
    }

    public static void main (String args []) {
        new T_4().start();
        new T_4().start();
        new T_4().start();
    }
}
