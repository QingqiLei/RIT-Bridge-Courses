package homework.homework2;

import java.util.Vector;

public class ExpressionLR {

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

    public static double product (Vector s) {
        double result = power(s);
        if (s.size() == 0 )
            return result;
        while (s.size() > 0 ) {
            char op = ((String)s.elementAt(0)).charAt(0);
            switch (op) {
                case '*':
                    s.remove(0);
                    result = result * power(s);
                    continue;
                case '/':
                    s.remove(0);
                    result = result / power(s);
                    continue;
                case '%':
                    s.remove(0);
                    result = result % power(s);
                    continue;
                default:
                    return result;
            }
        }
        return result;
    }
    /** recognizes power: term ['^' term }];
     */
    public static double power (Vector s) {
        double result = term(s);
        Vector<Double> aVector = new Vector<Double>();
        aVector.add( result );

        if (s.size() == 0 )
            return result;
        while (s.size() > 0 ) {
            char op = ((String)s.elementAt(0)).charAt(0);
            switch (op) {
                case '^':
                    s.remove(0);
                    // result = Math.pow(result , term(s));
                    double theTerm = term(s);
                    aVector.add(theTerm);
                    continue;
                default:
                    return performPowerOperation(aVector);
            }
        }
        return performPowerOperation(aVector);
    }

    public static double term (Vector s) {
        double result;
        char op = ((String)s.elementAt(0)).charAt(0);

        switch (op) {
            case '(':
                s.remove(0);
                result =  sum(s);
                op = ((String)s.elementAt(0)).charAt(0);
                s.remove(0);
                if ( op != ')' )
                    System.out.println("Incorrect");
                break;
            default:
                result = Double.parseDouble((String)s.elementAt(0));
                s.remove(0);
        }
        return result;
    }

    public static double performPowerOperation(Vector<Double> aVector)	{
        double result = 0.0;
        for (int index = 0; index < aVector.size(); index ++ )	{
            if ( aVector.size() >= 2 )	{
                double last = aVector.get( aVector.size() - 1);
                double secondLast = (double)aVector.get( aVector.size() - 2);
                result = Math.pow(secondLast, last);
                aVector.remove(aVector.size() - 2);
                aVector.remove(aVector.size() - 1);
                aVector.add( result);
            }
        }
        return aVector.get( 0 );
    }
}
