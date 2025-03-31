package Restart.Practice.restart.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassRoom {
    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 0},
                {1, 0, 1},
                {1, 1, 1}
        };

        int m = arr.length;
        int n = arr[0].length;
        List<int []> zeroPosition = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
               if (arr[i][j] == 0) {
                  zeroPosition.add(new int [] {i,  j});
               }
            }
        }

        for (int i = 0; i < zeroPosition.size(); i++) {
            // row basis
            int row = zeroPosition.get(i)[0];
            int col = zeroPosition.get(i)[1];

            for (int x  = 0 ; x < n; x++) {
                arr[row][x] = 0;
            }

            // col
            for (int y  = 0 ; y < m; y++) {
                arr[y][col] = 0;
            }
        }

        print(arr);
    }
}
