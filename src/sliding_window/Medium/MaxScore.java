package sliding_window.Medium;

import java.util.Arrays;

public class MaxScore {
    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        int sum = 0;
        for (int i =0; i < k; i++) {
            sum += cardPoints[i];
        }

        if (n == k) {
            return sum;
        }

        int maxSum = sum;

        for (int i = 0; i < k; i++) {
            sum -= cardPoints[k - i -1];
            sum += cardPoints[ n-i-1];

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void perfixSum (int [] nums) {
        int [] preSum = new int[nums.length];

        preSum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            preSum[i] = preSum[i-1] + nums[i];
        }

        System.out.println(Arrays.toString(preSum));
    }

    public static void main(String[] args) {
     int [] nums = {1,2,3,4,5,6,1};
     int k = 3;
        System.out.println(maxScore(nums, k));
    }
}
