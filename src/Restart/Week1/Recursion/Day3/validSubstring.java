package Restart.Week1.Recursion.Day3;

public class validSubstring {
    public static int validSub(String s) {
        int n = s.length();
        int count = 0;
        int i = 0;
        int freq = 1;
        // Count frequency of contiguous same characters
        while (i < n) {

            // Expand the window for contiguous same characters
            while (i + 1 < n && s.charAt(i) == s.charAt(i + 1)) {
                freq++;
                i++;
            }

            // Apply the formula to count valid substrings for this segment
            count += (freq * (freq + 1)) / 2;

            // Move to the next different character
            i++;
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "abcab";
        System.out.println(validSub(str));
    }
}
