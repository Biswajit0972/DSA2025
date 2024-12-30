package sliding_window.dynamicWindow.String;

public class LongestStringLengthWithMinimalChanges {
    public static int MinimumChanges (String s, int k) {
        int maxLength = 0;
        int n = s.length();
        if (s.length() < k) {
            return 0;
        }

        for (int i = 0; i < n; i++) {
            int [] frequency = new int[26];
            int maxFrequncy = 0;
            for (int j = i; j < n; j++) {
                char currChar = s.charAt(j);
                frequency[currChar - 'A']++;
                maxFrequncy = Math.max(maxFrequncy, frequency[currChar - 'A']);
                int minChages = (j - i + 1) - maxFrequncy;

                if (minChages <= k) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }else {
                    break;
                }
            }
        }
        return maxLength;
    }

    public static int Optimized (String s, int k) {
        if (s.length() < k) {
            return s.length();
        }

        int [] map = new int[26];  // space O(26)
        int maxLength = 0;
        int maxFrequency = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) { // O(n)
            char currChar = s.charAt(right);
            map[currChar - 'A']++;
            maxFrequency = Math.max(maxFrequency,  map[currChar - 'A']);
            int minChange = (right - left + 1 ) - maxFrequency;

            if (minChange > k) {
                map[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, (right - left + 1 ));
        }

        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(Optimized("ABAB", 2));
    }
}
