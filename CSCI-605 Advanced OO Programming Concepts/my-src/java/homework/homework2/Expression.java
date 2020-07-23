package homework.homework2;

import java.util.Vector;

public class Expression {

    public static void main (String args []) {
        Vector<String> aLine = new Vector<String>();

/*
	  for ( String arg: args ) {
	  }
		aLine.add(arg);
*/
        aLine.add("2");
        aLine.add("+");
        aLine.add("2");
        aLine.add("*");
        aLine.add("3");

        if ( aLine.size() > 0 )
            System.out.println(copyExpression(aLine) + " == " + sum(aLine) );
    }

    public static String copyExpression (Vector aLine) {
        String rValue = "";
        for ( int index = 0; index < aLine.size(); index ++ )   {
            rValue += aLine.elementAt(index) + " ";
        }
        return rValue;
    }
    /** recognizes sum: sum [{ ('+'|'-') product }];
     */
    public static double sum (Vector s) {
        double result = product(s);

        while (s.size() > 0 ) {
            char op = ((String)s.elementAt(0)).charAt(0);
            switch (op) {
                case '+':
                    s.remove(0);
                    result = result +  product(s);
                    continue;
                case '-':
                    s.remove(0);
                    result = result - product(s);
                    continue;
                default:
                    return result;
            }
        }
        return result;
    }

    /** recognizes product: term [{ ('*'|'%'|'/') term }];
     */
    public static double product (Vector s) {
        double result = term(s);
        if (s.size() == 0 )
            return result;
        while (s.size() > 0 ) {
            char op = ((String)s.elementAt(0)).charAt(0);
            switch (op) {
                case '*':
                    s.remove(0);
                    result = result * term(s);
                    continue;
                case '/':
                    s.remove(0);
                    result = result / term(s);
                    continue;
                case '%':
                    s.remove(0);
                    result = result % term(s);
                    continue;
                default:
                    return result;
            }
        }
        return result;
    }

    public static double term (Vector s) {
        double result;
        char op = ((String)s.elementAt(0)).charAt(0);

        switch (op) {
            default:
                result = Double.parseDouble((String)s.elementAt(0));
                s.remove(0);
        }
        return result;
    }

}

