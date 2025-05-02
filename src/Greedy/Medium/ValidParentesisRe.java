package Greedy.Medium;

public class ValidParentesisRe {
    public boolean checkValidString(String s) {
        return ValidParentesis(s, 0, 0);
    }
    
    public static boolean ValidParentesis(String s, int i, int count) {
        if (i == s.length()) {
            return count == 0;
        }
        
        if (count < 0) {
            return false;
        }
        //kaam
        if (s.charAt(i) == '(') {
            return ValidParentesis(s, i+1, count +1);
        }
        
        if (s.charAt(i) == ')') {
            return ValidParentesis(s, i+1, count -1);
        }
        
        return ValidParentesis(s, i+1, count+1) ||  ValidParentesis(s, i+1, count-1) || ValidParentesis(s, i+1, count);
    }
    public static void main(String[] args) {

    }
}
