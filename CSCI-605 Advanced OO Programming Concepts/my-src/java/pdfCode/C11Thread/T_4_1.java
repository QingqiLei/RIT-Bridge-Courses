package C11Thread;

import java.util.*;

public class T_4_1 extends Thread    {
    static Object o = new Object();
    public T_4_1()	{
	o  = new Object();
//        System.out.println(o);
    }
    public void run () {
        synchronized ( o ) {
//            System.out.println("in  "+o);
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
        new T_4_1().start();
        new T_4_1().start();
        new T_4_1().start();   // 都是用这个对象创建的o 来同步的
    }
}
