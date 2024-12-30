package sliding_window.dynamicWindow.String;

import java.util.HashMap;


public class MaximumNumberofOccurrencesofaSubstring {
    public static int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int maxFrequency = 0;
        HashMap<String, Integer> seen = new HashMap<>();
        int n = s.length();
        for (int i = 0 ; i < n - minSize; i++) {
            for (int j = minSize; j <= maxSize && j < n; j++) {
                    String subString = s.substring(i, i + j );
                    seen.put(subString, seen.getOrDefault(subString, 0) + 1);
                System.out.println(subString);
                    if (seen.containsKey(subString)) {
                        maxFrequency = Math.max(maxFrequency, seen.get(subString));
                    }
            }
        }

        return maxFrequency;
    }

    public static boolean isValid (String s, int maxLetter) {
        boolean [] seen = new boolean[26];
        int unique = 0;

        for (int i = 0; i < s.length(); i++) {

            boolean isSeen = seen[s.charAt(i) - 'a'];
            if (!isSeen) {
                seen[s.charAt(i) - 'a'] = true;
                unique++;
                if (unique > maxLetter) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(maxFreq("aababcaab", 1,3,4));
    }
}
