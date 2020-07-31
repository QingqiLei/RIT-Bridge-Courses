package C11Thread;

public class Thread_3 extends Thread	{
	private String info;
	Thread_3 aT1;

	public Thread_3 (String info) {
		this.info = info;
	}
	public static void sleepForAbit(long sleepTime )	{
		try {
		    sleep(sleepTime);
		} catch (InterruptedException e) {
		    System.err.println("Was interrupted in sleepForAbit");
		} 

	}
	public void run () {
		System.out.println(info + " is running");
		try {
			while(true)
			sleep(100);		// thread has to be here
		}
		catch (  InterruptedException e ) {
			System.err.println("Interrupted!");
			System.out.println(isInterrupted());
			if ( isInterrupted() )
				System.err.println("yup it's true.");
		}
		System.out.println(interrupted());
		System.out.println(info + ": exit run");

	}
	public static void main (String args []) {
		Thread_3 aT1  = new Thread_3("first");
		aT1.start();
		sleepForAbit(100);
		System.err.println("interrupt 'first'");
		aT1.interrupt();

	}
}
/*
is running
interrupt 'first'
Interrupted!
yup it's true.
exit run
 */
