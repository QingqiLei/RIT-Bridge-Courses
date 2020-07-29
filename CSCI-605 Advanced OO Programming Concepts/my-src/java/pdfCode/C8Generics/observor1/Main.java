package C8Generics.observor1;

public class Main {

	public static void main(String args[]) { 
		TheObservable s = new TheObservable("Dr Hook and the Medicine Show"); 
		TheObserver  aTheObserver = new TheObserver();
		
		s.addObserver(aTheObserver);
		s.setName("you");
		s.go(1234);
	}
}
