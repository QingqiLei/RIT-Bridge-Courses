package C10IO;

import java.io.*;

public class Grep {
  public static void main( String args[] ) {

    if ( args.length < 2 )	{
	System.err.println(
	     "Usage: java Grep search-string file-name [outputfilename]");
	System.exit(1);
    }

    try  {
    	BufferedReader input = new BufferedReader(
    			  new FileReader(args[1])
    			          );
	PrintWriter output = null;
	
	String line;
	if ( args.length == 3 )		{
		output = new PrintWriter( new FileWriter(args[2]) );
	} else
		output = new PrintWriter(System.out);

		while ( ( line = input.readLine() )  != null ) {
			if ( line.indexOf(args[0]) >= 0 )
				output.println(line);

    	}
		output.flush();
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
