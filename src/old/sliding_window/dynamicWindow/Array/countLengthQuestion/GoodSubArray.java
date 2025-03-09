package old.sliding_window.dynamicWindow.Array.countLengthQuestion;

public class GoodSubArray {
    public static int numberOfSubarrays(int[] nums, int k) {
return   0;
    }

    public  static int myCode(int[] nums, int k) {
//      int count = 0;
//      int currOdd = 0;
//      int left = 0;
//
//      for (int i = 0; i < nums.length; i++) {
//          currOdd += nums[i] % 2;
//          while ( currOdd > k) {
//              currOdd -= nums[left] % 2;
//              left++;
//          }
//
//          count += (i - left + 1);
//      }
//
//      return count;
        int windowSize = 0, subarrays = 0, start = 0;

        for (int end = 0; end < nums.length; end++) {
            windowSize += nums[end] % 2;
            // Find the first index start where the window has exactly k odd elements.
            while (windowSize > k) {
                windowSize -= nums[start] % 2;
                start++;
            }
            // Increment number of subarrays with end - start + 1.
            subarrays += end - start + 1;
        }

        return subarrays;
    }

    public static boolean isOdd(int val) {
        return val % 2 != 0;
    }
    public static void main(String[] args) {
       int [] nums = {1,1,2,1,1};
         int k = 2;
        System.out.println(myCode(nums, k) - myCode(nums , k - 1));
    }
}
