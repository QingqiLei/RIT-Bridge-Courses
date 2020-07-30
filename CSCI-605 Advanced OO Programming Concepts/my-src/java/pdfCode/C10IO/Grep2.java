package C10IO;

import java.io.*;

public class Grep2 {
  public static void main( String args[] ) {
    LineNumberReader input;
    PrintWriter    output;

    if ( args.length < 2 )	{
	System.err.println(
	     "Usage: java Grep search-string file-name [outputfilename]");
	System.exit(1);
    }

    try {
    	String line;
    	input = new LineNumberReader (
		      new  BufferedReader(
    			     new FileReader(args[1])
					 )
    			             );
        if ( args.length == 3 )		{
	    output = new PrintWriter( new FileWriter(args[2]) );
        } else
	    output = new PrintWriter(System.out);

    	while ( ( line = input.readLine() )  != null ) {
    		if ( line.indexOf(args[0]) >= 0 )
    			output.println(input.getLineNumber() + 
				": " + line);
    	}
	output.close();
	input.close();
    }
    catch ( FileNotFoundException e)	{
    	System.out.println(e.getMessage());
    }
    catch ( IOException e)	{
    	System.out.println(e.getMessage());
    }
    catch ( Exception e)	{
    	System.out.println("ExceptionType occurred: " + 
    		e.getMessage() );
    }

  }
}
