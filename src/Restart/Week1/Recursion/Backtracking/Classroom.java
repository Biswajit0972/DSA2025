package Restart.Week1.Recursion.Backtracking;

import java.util.Arrays;

public class Classroom {
    public static void update (int [] nums, int n, int i) {
        if (n == i) {
            return;
        }

        nums[i] = i;
        update(nums, n, i + 1);
        // runs after hitting the base case.
        nums[i] -= 2;
    }
    public static void main(String[] args) {
        int [] arr = new int[5];
        update(arr, 5, 0);
        System.out.println(Arrays.toString(arr));
    }
}
