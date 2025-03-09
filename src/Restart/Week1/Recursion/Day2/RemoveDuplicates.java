package Restart.Week1.Recursion.Day2;

public class RemoveDuplicates {
    public static String removeFn (String str) {
        boolean [] tc = new boolean[26];
        StringBuilder sb = new StringBuilder();
        return helperOfRemoveFn(str, sb, tc);
    }

    public static String helperOfRemoveFn (String str, StringBuilder sb, boolean [] arr) {
        if (str.isEmpty()) {
            return sb.toString();
        }

        char ch = str.charAt(0);

        if (arr[ch - 'a']) {
            return helperOfRemoveFn(str.substring(1), sb, arr);
        }

        arr[ch - 'a'] = true;

        sb.append(ch);
        return helperOfRemoveFn(str.substring(1), sb, arr);
    }

    // TC = ON2
    // Space = ON
    public static void main(String[] args) {
        String str = "appna";
        System.out.println(removeFn(str));
    }
}
