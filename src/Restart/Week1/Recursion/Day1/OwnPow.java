package Restart.Week1.Recursion.Day1;

public class OwnPow {
    static int MathPow (int n ,  int x) {
        if (x == 1) {
            return n;
        }

        if (x % 2 == 0) {
            return MathPow(n, x/2) * MathPow(n,x/2);
        }else {
            return n * MathPow(n, x/2) * MathPow(n, x/2);
        }
    }
    public static void main(String[] args) {
        System.out.println(MathPow(3, 3));
    }
}
