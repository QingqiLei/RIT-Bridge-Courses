package C12Lambda;

import java.util.ArrayList;

@FunctionalInterface
interface LambdaExpressionInterface {
    void anExample(int x);

}

public class LambdaExpression1{
    public static void main(String[] args) {
        LambdaExpressionInterface lambdaObj = (int aInt) -> System.out.println(aInt);
        lambdaObj.anExample(42);

        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.add(1); arrL.add(2); arrL.add(3); arrL.add(4);
        arrL.forEach(n ->{if(n%2 == 0) System.out.println(n);});
//        arrL.forEach(n ->{if(n %2 == 0) arrL.add(n);});  // ConcurrentModificationException
    }
}