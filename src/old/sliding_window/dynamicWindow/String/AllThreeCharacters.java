package old.sliding_window.dynamicWindow.String;

import java.util.Arrays;

public class AllThreeCharacters {
    public static int myCode(String s) {
       int count = 0;
       int [] lastSeen = new int[3];
        Arrays.fill(lastSeen, -1);
       for (int i = 0; i < s.length(); i++) {
           lastSeen[s.charAt(i) - 'a'] = i;
           if (lastSeen[0]  != -1) {
               // we add 1, because for getting the valid window length,
               // example : go reade.md
               count  += (1 + Math.min(lastSeen[0], Math.min(lastSeen[1],  lastSeen[2])));
           }
       }

       return count;
    }

    private static boolean isValid (int [] arr) {
        for (int n: arr) {
            if (n == 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String str = "abcabc";
        System.out.println(myCode(str));
    }
}
