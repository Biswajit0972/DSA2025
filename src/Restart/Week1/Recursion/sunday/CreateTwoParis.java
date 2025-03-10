package Restart.Week1.Recursion.sunday;

public class CreateTwoParis {

    public static void possibleCombination (String one, String two) {
        for (int i = 0; i  <one.length(); i++) {
            print(String.valueOf(one.charAt(i)), two, 0);
        }
    }
    public static void print (String ans,  String makePair, int index) {
        if (ans.length() == 2) {
            System.out.println(ans);
            return;
        }

        if (index == makePair.length())  {
            return;
        }
        // make two pair
        char ch =  makePair.charAt(index);
        print(ans + ch,  makePair, index+1);
        print(ans ,  makePair, index+1);
    }
    public static void main(String[] args) {
        possibleCombination("abc", "def");
    }
}
