package C10IO.tokenMath;

import java.io.BufferedReader;
import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;

/** lexical analyzer for arithmetic expressions.
	Comments extend from # to end of line.
	Words are composed of digits and decimal point(s).
	White space consists of control characters and space and is ignored;
	however, end of line is returned.
	Fixes the lookahead problem for TT_EOL.
  */
public class Scanner extends StreamTokenizer {
  /** kludge: pushes an anonymous Reader which inserts
	a space after each newline.
    */
  public Scanner (Reader r) {
    super (new FilterReader(new BufferedReader(r)) {
      protected boolean addSpace;	// kludge to add space after \n
      public int read () throws IOException {
	int ch = addSpace ? ' ' : in.read();
	addSpace = ch == '\n';
	return ch;
      }
    });
    resetSyntax();
    commentChar('#');			// comments from # to end-of-line
    wordChars('0', '9');		// parse decimal numbers as words
    wordChars('.', '.');
    whitespaceChars(0, ' ');		// ignore control-* and space
    eolIsSignificant(true);		// need '\n'
  }
}
