package Restart.Week1.Recursion.Day3;

public class ValidBinaryString {
    public static void validString (int n, String s, int lastIndex) {
        if (n == 0) {
            System.out.println(s);
            return;
        }
      // kaam
        validString(n-1, s + "0", 0);
        if (lastIndex == 0) {
            validString(n-1, s + "1", 1);
        }
    }
    public static void main(String[] args) {
       validString(3, "", 0);
    }
}
