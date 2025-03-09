package old.sliding_window.dynamicWindow.String;

public class WithoutRepeatingCharacters {
    public static int BruteFroce(String s) {
     int maxLength = 0;
//     frequency array
        int [] freq = new int[26];

//        window validation
        int remove = 0;
//        iterate window
      for (int i = 0; i < s.length(); i++) {
//          check is already present or not
          char currentChar = s.charAt(i);

          if (freq[currentChar - 'a'] > 0) {
              while (freq[currentChar - 'a'] != 0) {
                  freq[s.charAt(remove) - 'a']--;
                  remove++;
              }

          }

          freq[currentChar-'a'] ++;

          maxLength = Math.max(maxLength, (i - remove + 1));
      }
     return maxLength;
    }
    public static void main(String[] args) {
        String  s = "bbbbb";
        System.out.println(BruteFroce(s));
    }
}
