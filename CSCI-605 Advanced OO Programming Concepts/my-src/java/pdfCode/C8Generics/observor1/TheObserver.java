package C8Generics.observor1;

import java.util.Observer;
import java.util.Observable;

public class TheObserver implements Observer {

	int id = 0;
	static int counter = 0;

	public TheObserver()	{
		id = counter ++;
	}

	public void update( Observable aObservable, Object o ) {
		if ( o instanceof String )	{
			System.out.println("TheObserver:update: a String object came in");
			System.out.println("TheObserver:update:o " + o );
		} else {
			System.out.println("TheObserver:update: ! a String object came in");
			System.out.println("TheObserver:update:o " + o );
		}
	}
}

