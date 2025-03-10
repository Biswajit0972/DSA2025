package Restart.Week1.Recursion.sunday;

public class RemoveCharacter {
    public static String getRemove (String s, char key) {
        return myCode(s, key, new StringBuilder(), 0);
    }

    public static String  myCode (String s, char key,  StringBuilder str,  int index) {
        // base case
        if (index  ==  s.length()) {
            return str.toString();
        }
        // kaam
        char ch =  s.charAt(index);

        if (ch == key) {
            return myCode(s,key, str,  index  +  1);
        }

        return myCode(s,key, str.append(ch),  index  +  1);
    }
    public static void main(String[] args) {
        String s = "abbcaad";
        char ch = 'b';
        System.out.println(getRemove(s,   ch));
    }
}
