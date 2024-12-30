package sliding_window.dynamicWindow.Array;

import java.util.HashMap;

public class MaxConsecutiveOnes_III {
    public static int longestOnes(int[] nums, int k) {

        int maxLength = 0;
        int maxFreq = 0;
        HashMap<Integer, Integer> seen = new HashMap<>();
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            seen.put(nums[i], seen.getOrDefault(nums[i], 0) + 1);
            maxFreq = Math.max(maxFreq, seen.get(nums[i]));
            int windowSize = i - left + 1;
            int minChanges =  windowSize - maxFreq;

            if (minChanges > k) {
                seen.put(nums[left], seen.get(nums[left]) - 1);
                left++;
            }

            maxLength = Math.max(maxLength,  i - left + 1);
        }

        return maxLength;
    }

    public static int betterApporch (int [] nums, int k) {
        int maxL = 0;
        int zeroCount = 0;
        int left = 0;

        for (int i = 0; i < nums.length; i++) {  // O(n)
            if (nums[i] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {  // O(k)
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxL = Math.max(maxL, (i - left + 1));

        }
        return maxL;

        /**
         * Time complexity:
         * outer loops runs only ones, from o to n - 1. it's time complexity is linear O(n)
         * inner while loop runs only when the zero count exceed the limit of count.
         * in worst case it should be runs 0 to N -1, so time complexity is O(n)
         * Total = O(n) + O(n) = O(n)
         *
         * 🚀 we are not multiply it because it runs executly
         * */
    }

    public static void  experiment (int [] nums) {
        int i = 0;
        System.out.println(i);
        int x = i++;
        System.out.println(i);
        System.out.println(x);
    }
    public static void main(String[] args) {
      int [] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
//        System.out.println(betterApporch(nums,  3));
        experiment(nums);
    }
}
