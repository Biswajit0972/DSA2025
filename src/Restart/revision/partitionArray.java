package Restart.revision;
import Oop.*;
import Oop.QuickRevision.Practice;

import java.util.Arrays;

public class partitionArray {
    static class Ex extends Practice.Car {
        public void print () {
            System.out.println(brand);
        }
    }
    public static int [] partition (int [] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];
        int low = 0, high = n - 1;
        int countPivot = 0;

        // Count occurrences of pivot
        for (int num : nums) {
            if (num < pivot) {
                low++;
            } else if (num == pivot) {
                countPivot++;
            }
        }

        int mid = low; // Position to place pivot elements
        high = mid + countPivot; // Position to place elements > pivot
        low = 0; // Reset low to fill small elements

        // Fill the result array based on Dutch National Flag Algorithm
        for (int num : nums) {
            if (num < pivot) {
                result[low++] = num;
            } else if (num == pivot) {
                result[mid++] = num;
            } else {
                result[high++] = num;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int []arr = {9,10,12,3,4,12,14};
        System.out.println(Arrays.toString(partition(arr, 10)));
    }
}
