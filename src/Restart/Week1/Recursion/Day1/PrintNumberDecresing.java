package Restart.Week1.Recursion.Day1;

public class PrintNumberDecresing {
    static void PrintD (int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }

        PrintD(n-1);
        System.out.println(n+n);
    }
    public static void main(String[] args) {
        PrintD(5);
    }
}
