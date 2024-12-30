package sliding_window.revisionList;

import java.util.Arrays;

public class MaxVowel {
    public static int maxVowels(String s, int k) {
        if (s.length() < k) {
            return 0;
        }

        int maxVowelCount = 0;
        char [] charArray = s.toCharArray();
        int vowelCount = 0;

        for (int i = 0; i < k; i++) {
            char curr = charArray[i];
            if (isVowel(curr)) {
                vowelCount++;
            }

            maxVowelCount = Math.max(maxVowelCount, vowelCount);
        }

        for (int i = k; i < s.length(); i++) {
            if (isVowel(charArray[i - k])) {
                vowelCount--;
            }

            if (isVowel(charArray[i])) {
                vowelCount++;
            }

            maxVowelCount = Math.max(maxVowelCount, vowelCount);
        }


        return maxVowelCount;
    }

    public static boolean isVowel(char ch) {
        return ch =='a' ||  ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String s = "abciiidef";

        System.out.println(maxVowels(s, 3));
    }
}
