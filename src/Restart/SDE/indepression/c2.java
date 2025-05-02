package Restart.SDE.indepression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class c2 {
    public static int [] [] merge(int[][] intervals) {

        int n = intervals.length;

        if (n == 1 || n ==  0) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int []> res = new ArrayList<>();
        int [] current = intervals[0];

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= current[1]) {
                current[1] = Math.max(intervals[i][1], current[1]);
            }else {
                res.add(current);
                current = intervals[i];
            }
        }
         res.add(current);
        return  res.toArray(new int[res.size()][]);
    }
    public static void main(String[] args) {
        int [] [] timeStamps  =  {


        };

       for  (int [] r : merge(timeStamps)) {
           System.out.println(Arrays.toString(r));
       }
    }
}
