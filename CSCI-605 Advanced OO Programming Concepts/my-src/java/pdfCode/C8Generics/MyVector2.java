package C8Generics;

public class MyVector2<E> {
	Object[] data = null;
	public MyVector2( int size ) {
		data = new Object[size];
	}
	public E get( int i ) {
		return (E)data[i];
	}
	public void set( int i, E val ) {
		data[i] = val;
	}
	public static void main(String args[]) {
		MyVector2 aMyVector2 = new MyVector2(12);
		aMyVector2.set(0, "a");
		System.out.println("aMyVector2.get(0): " + aMyVector2.get(0));
	}
}

