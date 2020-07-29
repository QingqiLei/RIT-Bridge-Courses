package C8Generics;

import java.lang.reflect.Array;

public class MyVector1<E> {
	E[] data = null;
	public MyVector1( int size ) {
//		 data = (E[])new Object[size];
		data = (E[])getArray( new Object().getClass(), size );

	}
	public E get( int i ) {
		return data[i];
	}
	public void set( int i, E val ) {
		data[i] = val;
	}
	public <E> E[] getArray(Class<E> aClass, int size) {
//		@SuppressWarnings("unchecked")
			E[] arr = (E[]) Array.newInstance(aClass, size);

	    return arr;
	}
	public <E> E[] getArray(int size) {
//		@SuppressWarnings("unchecked")
			E[] arr = (E[]) Array.newInstance(new Object().getClass(), size);
	    return arr;
	}
	public static void main(String args[]) {
		MyVector1<String> aMyVector1 = new MyVector1<String>(11);
		aMyVector1.set(0, "a");
		System.out.println("aMyVector1.get(0): " + aMyVector1.get(0));


	}
}

/*
MyVector1.java:7: warning: [unchecked] unchecked cast
		data = (E[])getArray( new Object().getClass(), size );
		                    ^
  required: E[]
  found:    CAP#1[]
  where E is a type-variable:
    E extends Object declared in class MyVector1
  where CAP#1 is a fresh type-variable:
    CAP#1 extends Object from capture of ? extends Object
1 warning

*/
