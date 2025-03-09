package old.sliding_window.Medium;

public class StringPermutation {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        StringBuilder s = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            s.append(s2.charAt(i));
        }

        if (isValid(s.toString(), s1)) {
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            s.deleteCharAt(0);
            s.append(s2.charAt(i));

            if (isValid(s.toString(), s1)) {
                return true;
            }
        }

        return false;
    }

    private boolean isValid (String str, String s1) {
        if (str.length() < s1.length()) {
            return false;
        }

        int [] frequency = new int[26];

        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i) - 'a']++;
            frequency[s1.charAt(i) - 'a']--;
        }

        for (int num: frequency) {
            if (num > 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
