package old.sliding_window.revisionList;

public class Permutation {
    public static boolean checkInclusion(String s1, String s2) {
       if (s1.length() > s2.length()) {
           return false;
       }


       int [] frequncy = new int[26];

       for (int i = 0; i < s1.length(); i++) {
           frequncy[s2.charAt(i) - 'a'] ++;
           frequncy[s1.charAt(i) - 'a'] --;
       }

       if (isFlag(frequncy)) {
           return true;
       }

       for (int i = s1.length(); i < s2.length(); i++) {
           frequncy[s2.charAt(i) - 'a'] ++;
           frequncy[s1.charAt(i-s1.length()) - 'a'] --;
           if (isFlag(frequncy)) {
               return true;
           }
       }

       return false;
    }

    private static boolean isFlag (int [] arr) {
        for (int num : arr) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
       String s1 = "abc";
       String s2 = "abcabcabc";

        System.out.println(checkInclusion(s1, s2));
    }
}
