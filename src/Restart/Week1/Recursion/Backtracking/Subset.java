package Restart.Week1.Recursion.Backtracking;

public class Subset {
    public static void printSubset (String s, String ans, int i) {
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }
        // 0
        // 1
        // 2
        printSubset(s, ans + s.charAt(i), i + 1);
        // 0
        // 1
        //2
        // backtrack start
        printSubset(s, ans, i +1);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubset(str, "", 0);
    }
}
