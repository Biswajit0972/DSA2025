package old.sliding_window.dynamicWindow.String;

public class DominantOnes {
    public static int myCode (String s) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int zerosCount = 0;
            int onesCount = 0;

            for (int j = i; j < n; j++ ) {
                char ch = s.charAt(j);
                if (ch == '0') {
                    zerosCount++;
                }else {
                    onesCount++;
                }

                if (zerosCount * zerosCount <= onesCount) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int optimizedOne (String s ) {
//        int count = 0;
//        int zerosCount = 0;
//        int onesCount = 0;
//        int start = 0;
//        int n = s.length();
//
//        for (int i = 0; i < n; i++) {
//            char ch = s.charAt(i);
//            if (ch == '0') {
//                zerosCount++;
//            }else {
//                onesCount++;
//            }
//
//            while (zerosCount * zerosCount > onesCount) {
//                if (s.charAt(start) == '0') {
//                    zerosCount--;
//                }else {
//                    onesCount--;
//                }
//
//            }
//
//            count += (i - start + 1);
//        }
        int count = 0; // To store the result
        int onesCount = 0; // Count of 1s in the current window
        int zerosCount = 0; // Count of 0s in the current window
        int start = 0; // Start of the sliding window

        // Iterate through the string with the `end` pointer
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);

            // Update the counters based on the current character
            if (ch == '1') {
                onesCount++;
            } else {
                zerosCount++;
            }

            // Shrink the window from the left until the condition is satisfied
            while (onesCount < zerosCount * zerosCount) {
                if (s.charAt(start) == '1') {
                    onesCount--;
                } else {
                    zerosCount--;
                }
                start++;
            }

            // Count all valid substrings ending at `end`
            count += (end - start + 1);
        }


        return count;
    }
    public static void main(String[] args) {
        String str = "00011";
        System.out.println(optimizedOne(str));
    }
}
