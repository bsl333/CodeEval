import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Branden on 6/12/2016.
 */


public class MersennePrime {
    public static void main(String args []) throws IOException
    {
        File file = new  File(args[0]);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;

        while( (line = bufferedReader.readLine()) != null)
        {

            int countComma = 0;
            line = line.trim();
            int num = Integer.valueOf(line);
            int n = 1;

            while(Math.pow(2,n) < num)
            {
                n++;
                double x = (Math.pow(2,n)-1);

                if(isPrime(x)) {
                    if(countComma !=0)
                        System.out.print(", ");
                    System.out.print((int) x);
                    countComma = 1;
                }

            }


            System.out.println();

        }


    }
  static boolean isPrime(double x) {
      for (int i = 2; i <= Math.sqrt(x); i++)
      {
          if(x%i == 0)
          {
              return false;
          }
      }

      return true;


        }

}