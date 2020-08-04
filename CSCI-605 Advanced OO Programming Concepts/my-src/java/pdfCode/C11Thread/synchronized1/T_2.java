package C11Thread.synchronized1;

public class T_2 extends Thread    {
    int id;
    static Object aMonitor = new Object();
    public T_2(int id)	{
	this.id = id;
    }
    public void teoTorriatte()	{
		System.out.println(id);
    }
    public void run () {
	while ( true )	{
		synchronized ( aMonitor )	{
			try {
				aMonitor.notify();
				sleep(1000);
				teoTorriatte();
				aMonitor.wait();
			} catch (Exception e)	{}

		}
	}
    }

    public static void main (String args []) {
        new T_2(1).start();
        new T_2(2).start();
    }
}
