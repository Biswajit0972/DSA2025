package Restart.Week1.Recursion.Day3;

public class NumberToString {
    public static String getSt (int n) {
        StringBuilder sb = new StringBuilder();
        return helper(n,sb);
    }

    public static String helper (int n, StringBuilder sb) {
        if (n == 0) {
            return sb.toString();
        }

        int last = n % 10;

        String st = numToSt(last);
        sb.insert(0, st);
        sb.append(" ");
        return helper(n/10,sb);
    }
    public static String numToSt (int n) {
        return switch (n) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "Non";
        };

    }
    public static void main(String[] args) {
int year = 2018;
        System.out.println(getSt(year));
    }
}
