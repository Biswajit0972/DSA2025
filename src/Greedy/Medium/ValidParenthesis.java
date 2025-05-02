package Greedy.Medium;

/*
This logic covert recursion problem into a linear solution by using only two variable
* It is super important because I learnt recursion all possible combination topic and also use of range to solve p
* problem 0 and 1. It is my first string question on greedy.
* */
public class ValidParenthesis {
    public static boolean checkValidString(String s) {
        int min = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                // encounter 'C' both will be updated +1
                min++;
                max++;
            }else if (ch == ')') {
                min--;
                max--;
            }else {
                min--; // consider closing or empty, but not -1 because it is invalid.
                max++; // consider max is an opening bracket
            }

            if (min < 0) {
                min++;
            }

            if   (max < 0) {
                return false;
            }
        }


        return min ==0 ;
    }
    public static void main(String[] args) {

    }
}
