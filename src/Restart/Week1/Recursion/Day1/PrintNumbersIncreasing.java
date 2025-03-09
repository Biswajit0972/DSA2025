package Restart.Week1.Recursion.Day1;

public class PrintNumbersIncreasing {
    static void PrintL (int ans, int step) {
        if (ans == step) {
           return;
        }

        System.out.println(ans++);
        PrintL(ans, step);
    }
    public static void main(String[] args) {
        PrintL(0, 5);
    }
}
