package C8Generics.observor1;

import java.util.Observer;
import java.util.Observable;

public class TheObservable extends Observable {

	String name = null;
	Integer value = null;

	public TheObservable(String name)	{
		this.name = name;
	}
	
	public void setName(String name) { 
		this.name = name; 
		setChanged(); 
		notifyObservers(name); 
	} 
	public void go(Integer value) { 
		this.value = value; 
		setChanged(); 
		notifyObservers(value); 
	} 
}
