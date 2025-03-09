package Restart.Week1.Recursion.Day3;

public class CountLength {
    public static int length (String str, int count) {
        if (count == str.length()) {
            return count;
        }

        count++;
        return length(str, count);
    }
    public static void main(String[] args) {
        String str = "ababa";
        System.out.println(str.length());
        System.out.println(length(str, 0));
    }
}
