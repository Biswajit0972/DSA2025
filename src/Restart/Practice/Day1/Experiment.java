package Restart.Practice.Day1;

public class Experiment {
    public static void Print (int [] arr, int k) {
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = k; i < arr.length; i++) {
            for (int j = i - k + 1; j < k+1 ; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [] nums = {3,9,2,1,7};
        Print(nums, 2);
    }
}
