package C10IO;

import java.io.*;
import java.util.Hashtable;

public class InOut_1 {
  public static void main( String args[] ) {


	  Hashtable aHashTable = new Hashtable();
	  aHashTable.put("plus  Movie", "A little Voice");
	  aHashTable.put("The HashTable", aHashTable);
	  System.out.println("The HashTable "+aHashTable.get("The HashTable"));


	  try {
		  ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("example1"));
		  oos.writeBoolean(false);
		  oos.writeDouble(23.23423);
	  } catch (IOException e) {
		  e.printStackTrace();
	  }

	  byte[]  buffer = new byte[1024];
    int     n;

    if ( args.length < 2 )	{
	System.err.println(
	     "Usage: java InOut_1 from to");
	System.exit(1);
    }

    try (
    	DataInputStream in = new DataInputStream(
    				new FileInputStream(args[0]) );
    	DataOutputStream out = new DataOutputStream(
    				new FileOutputStream(args[1]) );
	) {

		while ( (n = in.read(buffer) ) != -1 ) {
			out.write(buffer, 0, n);
    		}

    }
    catch ( FileNotFoundException ef)	{
    	System.out.println("File not found: " + args[1]);
    }
    catch ( IOException ef)	{
    	System.out.println("File not found: " + args[1]);
    }
    catch ( Exception e)	{
    	System.out.println("ExceptionType occurred: " + 
    		e.getMessage() );
    }

  }
}
