package C12Lambda;

import java.util.ArrayList;
import java.util.Comparator;

public class MethodReference {
    public static void main(String[] args) {
        ArrayList<String> arrL = new ArrayList<>();
        arrL.add("a"); arrL.add("X"); arrL.add("b");
        arrL.sort(String::compareToIgnoreCase);
        arrL.sort(Comparator.reverseOrder());
        arrL.forEach(n ->System.out.print(n));
        System.out.println();
        arrL.sort(String::compareTo);

        arrL.forEach(n -> System.out.print(n));
    }
}
