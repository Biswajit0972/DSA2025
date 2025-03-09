package Restart.Week1.Recursion.Day3;

import java.util.ArrayList;
import java.util.List;

public class PrintListofIndexes {
    public static List<Integer> getOccurences (int [] arr, int index, List<Integer> list, int key) {
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == key) {
            list.add(index);
        }else {
            list.add(-1);
        }

        return getOccurences(arr, index + 1, list, key);
    }
    public static void main(String[] args) {
        int [] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 10;
        ArrayList<Integer> ls = new ArrayList<>();
        getOccurences(arr, 0, ls, key);

        for (Integer n: ls) {
            System.out.println(n);
        }
    }
}
