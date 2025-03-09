package Restart.Week1.Recursion.functions;

import java.util.HashMap;

public class RemoveDuplicates {
    public static String removeFn (String str) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> tc = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (tc.containsKey(curr)) {
                continue;
            }

            tc.put(curr, 1);
            sb.append(curr);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
//        System.out.println(removeFn(str));
        System.out.println(str.substring(1));
    }
}
