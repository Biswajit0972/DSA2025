package Restart.Week1.Recursion.Day1;

public class Fibonacci {
    static void fib (int s, int a, int b) {
       /* printing fib series
       * ! if (s == 0) {
            return;
        }

        int ans = a + b;
        System.out.println(ans);
        a = b;
        b = ans;
        s--;
        ! fib(s, a, b);
        * */

    }


    public static void main(String[] args) {
        fib(23, 0, 1);
    }
}
