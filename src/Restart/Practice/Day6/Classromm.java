package Restart.Practice.Day6;

import java.util.HashMap;

public class Classromm {
    public static   long countOfSubstrings(String word, int k) {
        HashMap<Character,  Integer> Vowel =  new HashMap<>();
        int Consonant =  0;
        int left =  0;
        long count = 0;

        for (int right =0; right  < word.length(); right++) {
            char currChar =  word.charAt(right);

            if (isVowel(currChar)) {
                Vowel.put(currChar,  Vowel.getOrDefault(currChar,  0)  +  1);
            }else{
                Consonant++;
            }

            while (Consonant >  k) {
                System.out.println("Iam run");
                char removeChar = word.charAt(left);

                if (isVowel(removeChar)) {
                   Vowel.put(removeChar, Vowel.get(removeChar)-1);
                   if (Vowel.get(removeChar) == 0) {
                       Vowel.remove(removeChar);
                   }
                }else{
                    Consonant--;
                }

                left++;
            }

            if (Vowel.size() == 5 && Consonant ==  k) {
                count++;
            }
        }

        return count;

    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase to handle uppercase letters
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String s =  "aeiou";
        System.out.println(countOfSubstrings(s,  1));
    }
}
