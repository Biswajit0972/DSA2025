package sliding_window.dynamicWindow.Array.countLengthQuestion;

public class BinarySumWithGoal {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == goal) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int myCode (int [] nums, int goal) {
        int count = 0;
        int sum = 0;
        int left = 0;
        for (int i = 0; i< nums.length; i++) {
            sum += nums[i];
            while (sum > goal) {
                sum -= nums[left];
                left++;
            }

            count +=  (i - left + 1);
        }

        return count;
    }
    // 0 and 1 segment we can't  use it as we do in previous question count subArray with given sum.
    public static void main(String[] args) {
        int [] nums = {1,1,1,1,1};
        int goal = 1;
        System.out.println(myCode(nums, goal));
    }
}
