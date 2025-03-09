package Restart.Week1.Recursion.Day4;

public class ValidSubstring {
    public static int CountVS(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }

        if (n <= 0) {
            return 0;
        }

        int count = CountVS(str,  i+1, j, n-1)  + CountVS(str, i+ 1, j-1, n-1) - CountVS(str, i-1, j-1, n-2);

        if (str.charAt(i) == str.charAt(j)) {
            count++;
        }

        return count;
    }
    public static int countPalindromicSubstrings(String str, int i, int j) {
        if (i > j) return 0;  // Base case: invalid range
        if (i == j) return 1; // Single character is always a palindrome

        int count = countPalindromicSubstrings(str, i + 1, j) +  // Exclude left char
                countPalindromicSubstrings(str, i, j - 1) -  // Exclude right char
                countPalindromicSubstrings(str, i + 1, j - 1); // Avoid double counting

        // If the current substring is a palindrome, count it
        if (str.charAt(i) == str.charAt(j)) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "()()";
        System.out.println(s.length());
    }
}
