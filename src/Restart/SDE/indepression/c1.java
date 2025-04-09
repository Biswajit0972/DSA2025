package Restart.SDE.indepression;

import java.util.ArrayList;
import java.util.List;

public class c1 {
    public static int maxSubArray(int[] nums) {
        int max =  Integer.MIN_VALUE;
        int sum = 0;

        for (int i : nums) {
            sum = (Math.max(sum, 0)) + i;
            max = Math.max(max, sum);
        }

        return max;
    }
    public static void main(String[] args) {
      int [] nums = {-1,-1,-1,-1,-1};
        System.out.println(maxSubArray(nums));
    }
}
