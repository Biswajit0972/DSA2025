package Restart.Practice.Day5;

import java.util.Arrays;

public class Day {
    public static int[] closestPrimes(int left, int right) {
        int [] result = new int [2];
        Arrays.fill(result, -1);
        int first = 0, second = 0;
        int minRange = 0;

        for (int i = left; i <= right; i++) {

           if (isPrime(i)) {
               first = second;
               second = i;
               int range = second -  first;

               if (first == 0) {
                   minRange = range;
               }

               if (minRange > range) {
                   result[0] = first;
                   result[1] = second;
                   minRange = range;
               }


           }

        }
        return result;
    }

    public static boolean isPrime (int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(closestPrimes(4, 6)));
    }
}
