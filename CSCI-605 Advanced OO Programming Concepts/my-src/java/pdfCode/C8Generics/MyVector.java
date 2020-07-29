package C8Generics;

public class MyVector {
	String[] data = null;
	public MyVector( int size ) {
		data = new String[size];
	}
	public String get( int i ) {
		return data[i];
	}
	public void set( int i, String val ) {
		data[i] = val;
	}
}
