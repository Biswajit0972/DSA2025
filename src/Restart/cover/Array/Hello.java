package Restart.cover.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hello {
    public static void main(String[] args) {
        int [] ar ={2, 3, 1, 2, 3};
        System.out.println(findDuplicates(ar));
    }

    static int missingNumber(int arr[]) {
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            int range_diff = arr[i] - arr[i-1];
            if (range_diff > 1) {
                return arr[i-1]+ 1;
            }
        }

        return arr[arr.length-1] + 1;
    }
    static ArrayList<Integer> leaders(int arr[]) {
      ArrayList<Integer> result = new ArrayList<>();
      int n = arr.length-1;

      result.add(arr[n]);
      int currentLeader = arr[n];

      for (int i = n - 2; i >= 0; i--) {
           if (arr[i]  >= currentLeader) {
               result.add(arr[i]);
               currentLeader = arr[i];
           }
      }
        Collections.reverse(result);
      return result;
    }

    public static List<Integer> findDuplicates(int[] arr) {
        // code here
        List<Integer> res = new ArrayList<>();
        int count [] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                res.add(i);
            }
        }

        return res;
    }
}
