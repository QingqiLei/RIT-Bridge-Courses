package C11Thread;

import java.util.*;

public class T_6 extends Thread    {
    static Object o = new Object();
    static int    counter = 0;

    public void run () {
	if ( counter++ == 1 )	
		o = new Object();
	
        synchronized ( o ) { 
            System.err.println("--->" );
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
        new T_6().start();
        new T_6().start();// 这个里面 o 变量变化了
        new T_6().start();
    }
}
