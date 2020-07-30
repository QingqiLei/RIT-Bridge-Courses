package C11Thread;

public class InterruptExample extends Thread {
	

    public InterruptExample(String name) {
	    setName(name);
    }

    public static void sleepForAbit(long sleepTime )	{
        try {
            sleep(sleepTime);
        } catch (InterruptedException e) {
            System.err.println(Thread.currentThread().getName() + " Was interrupted in sleepForAbit");
	}

    }
    public void run() {

        System.err.println(getName() + " has started!");
	double x = 1;
	while ( x > 0 )	{		// forever loop
		x = x * 2 - x;		// x is constant
		sleepForAbit(200);	
		if ( isInterrupted() )	{
			System.err.println(Thread.currentThread().getName() + "is interrupted");
			break;
		}

	}
        System.err.println(getName() + " has exited!");
    }

    public static void main(String args[]) throws InterruptedException {
	
        InterruptExample aThread = new InterruptExample("aThread");
	aThread.start();
	sleepForAbit(100);	// should allow the thread to enter the while loop
        aThread.interrupt();
        Thread.sleep(1000);
        aThread.interrupt();


    }
}
