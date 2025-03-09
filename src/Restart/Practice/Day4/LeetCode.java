package Restart.Practice.Day4;

import java.util.Arrays;

public class LeetCode {
    public static int [] getAns (int [] [] grid) {
        int n = grid.length;
        int [] hashedArray = new int[n * n + 1];
        int [] result = new int [2];
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0;  j< grid[i].length; j++) {
                hashedArray[grid[i][j]]++;
            }
        }

        for (int i = 1; i <= n * n; i++) {
            if (hashedArray[i] > 1) {
                result[0] = i;
            }

            if (hashedArray[i] == 0) {
                result[1]  = i;
            }
        }

        return  result;

    }
    public static void main(String[] args) {
        int [] [] arr = {
                {1,3},
                {2,2}
        };
        System.out.println( Arrays.toString(getAns(arr)));

    }
}
