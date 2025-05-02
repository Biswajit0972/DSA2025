package Restart.SDE.indepression;

import java.util.Arrays;

public class c3 {
    public static int marge (int [] nums, int low,  int high) {
        int count = 0;
        if (low   >= high) return count;

        int mid = (low + high ) / 2;
        count += marge(nums, low, mid);
        count += marge(nums, mid+1, high);
        count += margeSort(nums, mid, low, high);
        return count;
    }
    public static int margeSort (int [] nums, int  mid, int low, int high) {
        int cut = 0;
        int [] arr = new int[high - low + 1];
        int left = low;
        int right =   mid + 1;
        int k = 0;

        while (left <= mid && right <= high) {
            if (nums[left] > nums[right]) {
                arr[k++] = nums[right++];
                cut += (mid - left + 1);
            }else {
                arr[k++] = nums[left++];
            }
        }

        while (left <= mid) {
            arr[k++] = nums[left++];
        }

        while (right <= high) {
            arr[k++] = nums[right++];
        }

        for (int i =0; i < arr.length; i++) {
            nums[low + i] = arr [i];
        }
        return cut;
    }
    public static void main(String[] args) {
        int [] arr = {3, 2,   1};

        System.out.println( marge(arr, 0, arr.length-1));
    }
}
