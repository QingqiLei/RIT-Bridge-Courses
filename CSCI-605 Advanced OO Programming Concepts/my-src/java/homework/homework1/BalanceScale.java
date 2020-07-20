

/**
 * make elemente of toWeigh using myWeights
 */
public class BalanceScale {
    // static int[] myWeights = { 1, 4, 5, 8, 12, 20, 35, 61, 80 };
    static int[] myWeights = { 3, 2, 1, 4, 5, 7, 8, 12, 20, 35, 61, 80 };
    static int soManyBalanceWeights = myWeights.length;
    static int[] toWeigh = { 5, 6, 7, 20, 61, 80 };
//    static int[] toWeigh = { 1, 3, 4, 5, 7 };

    /**
     * sort myWeights
     */
    private static void sortWeights(){
        for(int i = 0; i < soManyBalanceWeights-1; i++)
            for(int j = 0; j < soManyBalanceWeights-1; j++)
            if(myWeights[j] < myWeights[j+1]){
                int tmp = myWeights[j];
                myWeights[j] = myWeights[j+1];
                myWeights[j+1] = tmp;
            }
    }

    /**
     * 1g 2g 3g
     * @param value
     * @return
     */
    private static String printUsedWeights(int value){
        String res = "";
        for(int i = 0; i < soManyBalanceWeights; i++){
            if(((1 << i) & value) == ( 1 << i)) res += myWeights[i] + "g ";
        }
        if(res == "") return "empty set";
        return res;
    }

    /**
     * count 1 in the binary representation of value
     * @param value
     * @return
     */
    private static int soManyBitsAre1(int value){
        int res = 0;
        for(int i = 0; i < soManyBalanceWeights; i++){
            if(((1 << i) & value) == (1<< i)) res++;
        }
        return res;
    }

    /**
     * sum weights using binary representation of value
     * @param value
     * @return
     */
    private static int calculateWeightForThisSet(int value){
        int res = 0;
        for(int i = 0; i < soManyBalanceWeights; i++){
            if(((1 << i) & value) == (1 << i)) res += myWeights[i];
        }
        return res;
    }


    private static void testIfaCombinationForThisWeightExist(int thisWeight){
        int allCombinations = (int)Math.pow(2,soManyBalanceWeights);
        int largestSetSoFar = 0;
        for(int i = 0; i < allCombinations; i++){
            int sum = calculateWeightForThisSet(i);
            if(sum == thisWeight){
                if(soManyBitsAre1(i) > soManyBitsAre1(largestSetSoFar)) largestSetSoFar = i;
            }

        }
        if(calculateWeightForThisSet(largestSetSoFar) == thisWeight) System.out.println(thisWeight+"g: "+"\tyes; used myWeights = " + printUsedWeights(largestSetSoFar));

    }

    public static void main(String[] args) {
        sortWeights();
        for(int i : toWeigh) testIfaCombinationForThisWeightExist(i);

    }
}
