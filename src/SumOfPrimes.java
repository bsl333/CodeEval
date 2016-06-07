/**
 * Created by Branden on 6/5/2016.
 */

import java.math.*;

public class SumOfPrimes {
    public static void main(String args[])
    {
        int sum = 0;
        int numberOfPrimes = 0;
        for (int i = 2; numberOfPrimes < 1000; i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
                sum +=i;
                numberOfPrimes++;
            }
        }

        System.out.print(sum);

    }

    static boolean isPrime(int n)
    {
        // only need to test up to sqrt of n.
        // if the modulus of n % i == 0, it's not a prime number
        // i must start at 2 to exclude 5%1 = 0
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n%i == 0)
            {
                return false;
            }
        }

        return true;
    }


}
