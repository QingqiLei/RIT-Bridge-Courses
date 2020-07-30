package C10IO.tokenMath;/*
 * Thanks to ats
 */
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.StreamTokenizer;

/** recognizes, stores, and evaluates arithmetic expressions.
  */
public abstract class Expression {
  final static int eol  = StreamTokenizer.TT_EOL; // switch use ...
  final static int eof  = StreamTokenizer.TT_EOF; // must be const :(
  final static int word  = StreamTokenizer.TT_WORD;

  /** reads lines from standard input, parses, and evaluates them
      or writes them as a Vector to standard output if -c is set.
      @param args if -c is specified, a Vector is written.
    */
  public static void main (String args []) {
    Scanner scanner = new Scanner(new InputStreamReader(System.in));
    try {
      do
	try {
	  Number n = Expression.line(scanner);
	  System.out.println(n.floatValue());
	} catch (java.lang.Exception e) {
	  System.err.println(scanner +": "+ e);
	  while (scanner.ttype != scanner.TT_EOL
		 && scanner.nextToken() != scanner.TT_EOF)
	    ;
      } while (scanner.ttype == scanner.TT_EOL);
    } catch (IOException ioe) { System.err.println(ioe); }
  }
  /** indicates parsing errors.
    */
  public static class Exception extends java.lang.Exception {
    public Exception (String msg) {
      super(msg);
    }
  }
  /** recognizes line: sum '\n';
      an empty line is silently ignored.
      @param s source of first input symbol, may be at end of file.
      @return tree for sum, null if only end of file is found.
      @throws Exception for syntax error.
      @throws IOException discovered on s.
    */
  public static Number line (Scanner s) throws Exception, IOException {
    for (;;)
      switch (s.nextToken()) {
      default:
	Number result = sum(s);
	if (s.ttype != eol) throw new Exception("expecting nl");
	return result;
      case eol:	continue;	// ignore empty line
      case eof:	return null;
      }
  }
  /** recognizes product: term [{ ('*'|'%'|'/') term }];
      @param s source of first input symbol, advanced beyond product.
      @return tree with evaluators.
      @see Expression#sum
    */
  public static Number product (Scanner s) throws Exception, IOException {
    Number result = term(s);
    for (;;)
      switch (s.ttype) {
      case '*':
	s.nextToken();
	result = new Node.Mul(result, term(s));
	continue;
      case '/':
	s.nextToken();
	result = new Node.Div(result, term(s));
	continue;
      case '%':
	s.nextToken();
	result = new Node.Mod(result, term(s));
	continue;
      default:
	return result;
      }
  }
  /** recognizes sum: product [{ ('+'|'-') product }];
      @param s source of first input symbol, advanced beyond sum.
      @return tree with evaluators.
      @see Expression#line
    */
  public static Number sum (Scanner s) throws Exception, IOException {
    Number result = product(s);
    for (;;)
      switch (s.ttype) {
      case '+':
	s.nextToken();
	result = new Node.Add(result, product(s));
	continue;
      case '-':
	s.nextToken();
	result = new Node.Sub(result, product(s));
	continue;
      default:
	return result;
      }
  }
  /** recognizes term: '('sum')' | Number;
      @param s source of first input symbol, advanced beyond term.
      @return tree with evaluators.
      @see Expression#sum
    */
  public static Number term (Scanner s) throws Exception, IOException {
    switch (s.ttype) {
    case '(':
      s.nextToken();
      Number result = sum(s);
      if (s.ttype != ')') throw new Exception("expecting )");
      s.nextToken();
      return result;
    case word:
      result = s.sval.indexOf(".") < 0 ? (Number)new Long(s.sval)
				       : (Number)new Double(s.sval);
      s.nextToken(); return result;
    }
    throw new Exception("missing term");
  }
}	// end of class Expression
