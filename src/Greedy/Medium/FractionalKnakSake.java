package Greedy.Medium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * In this question, I learnt about of comparator class and compare function how it works.
 * Return Double.compare(b1, a1); compare (x,y) and returns x < y -> -1, x==y -> 0, x > y -> 1. On the basis of return value array will be sorted.
 */

public class FractionalKnakSake {
    static Comparator<int[]> com = new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            double a1 = (1.0 * o1[0]) / o1[1]; // calculate body to a weight ratio
            double b1 = (1.0 * o2[0]) / o2[1];
            return Double.compare(b1, a1);
        }
    };

    static double  fractionalKnapsack(int[] values, int[] weights, int W) {
        int n = values.length;
        int [] [] combineData = new int [n][2];

        for (int i = 0; i < n; i++) {
            combineData[i] = new int[] {values[i], weights[i]};
        }
        // sort array by the value to weight ratio.
        Arrays.sort(combineData, com);

        double maximumProfit = 0.0;
        int copyBag = W;

        for (int i = 0; i < combineData.length; i++) {
            if  (combineData[i][1] <= copyBag) {
                maximumProfit += combineData[i][0];
                copyBag -= combineData[i][1];
            }else {
                // calculate fraction data
                maximumProfit += (1.0 * combineData[i][0]/ combineData[i][1]) * copyBag;
                break;
            }
        }
        return maximumProfit;
    }

    public static void main(String[] args) {
        int [] values = {60, 100, 120}; // 6, 5, 4
        int [] weight = {10, 20, 30};
        System.out.println(  fractionalKnapsack(values, weight, 50));
    }
}
