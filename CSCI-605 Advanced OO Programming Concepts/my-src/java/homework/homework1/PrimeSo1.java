/*
The that every natural number n and n > 1, n is either a prime number, or
can be represented as a product of prime numbers.
find all natural number that can be represented by a product of two prime numbers
 */
public class PrimeSo1 {

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++)
            if (n % i == 0) return false;
        return true;
    }

    static int firstOne = 0;
    static int secondOne = 0;
    private static int findAllPrimeUpTo2(int n){
        int sumOfRes = 0;
        int mayBePrime = 1;
        int countPrime = 0;
        firstOne = 0;
        secondOne = 0;
        while(countPrime < 3 && n  > 1){
            mayBePrime++;
            if(isPrime(mayBePrime)){
                while(countPrime < 3 && n % mayBePrime == 0){
                    sumOfRes += mayBePrime;
                    countPrime++;
                    n = n / mayBePrime;
                    if(firstOne == 0) firstOne = mayBePrime;
                    else secondOne = mayBePrime;
                }
            }
        }
        if(countPrime == 2) return sumOfRes;
        else return -1;
    }


    public static void main(String[] args) {
        System.out.println(findAllPrimeUpTo2(6));
        for(int i = 2; i < 100; i++){
            int sum = findAllPrimeUpTo2(i);
            if(sum != -1) System.out.println("The sum of all primes for"+i+":    "+sum+"( "+firstOne+" + "+secondOne+")");

        }
    }
}
