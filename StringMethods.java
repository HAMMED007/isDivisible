package divisible;

import java.util.Arrays;

public class StringMethods {

    public static boolean isDivisible(int n, int m) {
        if (n % m == 0)
            return true;


        return false;
    }
    public static boolean isEven(int m){
        if ( m % 2 == 0)
            return true;

        return false;
    }
    public static int maxNumbers(int a, int b, int c){
int[] arrays ={a,b,c};
 Arrays.sort(arrays);


  return arrays[2];
    }
}
