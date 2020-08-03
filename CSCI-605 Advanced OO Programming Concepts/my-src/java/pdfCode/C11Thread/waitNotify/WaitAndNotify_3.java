package C11Thread.waitNotify;

import java.util.Vector;
import java.util.Date;


public class WaitAndNotify_3 extends Thread	{

	private String info;
	static  Vector aVector = new Vector();

	public WaitAndNotify_3 (String info, Vector aVector) {
		this.info = info;
		this.aVector = aVector;
	}
	
 	public void doTheJob() {
		if(info.equals("first"))
	   synchronized ( aVector )	{
		System.out.println(info + " is waiting. " + new Date() );
		try {
			aVector.wait(1000);
		} catch ( Exception  e )	{
			System.out.println(info + ": Exception");
			e.printStackTrace();
		}
		System.out.println(info + " is awake! " + new Date());
	  }

		else if(info.equals("second"))
			synchronized ( aVector )	{
				System.out.println(info + " is waiting. " + new Date() );
				try {
					aVector.wait(4000);
				} catch ( Exception  e )	{
					System.out.println(info + ": Exception");
					e.printStackTrace();
				}
				System.out.println(info + " is awake! " + new Date());
			}

		else
			synchronized ( aVector )	{
				if (   info.equals("two")  )	{
					System.out.println(info + " will wait ...");
					aVector.notify();
					System.out.println(info + " done.");
				} else {
					System.out.println(info + " will wait ...");
					try {
						new WaitAndNotify_First("two", aVector).start();
						aVector.wait();
					} catch ( IllegalMonitorStateException  e )	{
						System.out.println( ": IllegalMonitorStateException");
					} catch ( InterruptedException  e )	{
						System.out.println(": InterruptedException");
					}
					System.out.println(info + " is awake!");
				}
			}
	}

	public void run () {
		doTheJob();
	}

	public static void main (String args []) {
		new WaitAndNotify_3("first", aVector).start();
		new WaitAndNotify_3("second", aVector).start();
		new WaitAndNotify_3("one", aVector).start();
		// new WaitAndNotify_3("last", aVector).start();
	}
}
