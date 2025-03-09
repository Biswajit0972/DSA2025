package Restart.Week1.Recursion.Day1;

public class fact {
    static int calcFact(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }

        int nextCall = calcFact(n-1);
        int x = n   * nextCall;
        return x;
    }

    public static void main(String[] args) {
        System.out.println(calcFact(5));
    }
}
