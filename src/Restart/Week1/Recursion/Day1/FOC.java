package Restart.Week1.Recursion.Day1;

public class FOC {
    static int FC (int [] arr, int index, int searchVal) {
        if (index == arr.length-1) {
            if (arr[index] == searchVal) {
                return searchVal;
            }else {
                return -1;
            }
        }

        if (arr[index] == searchVal) {
            return index;
        }

        return FC(arr, index+1, searchVal);
    }
    static int LC (int [] arr, int index, int searchVal, int lastIndex) {
        if (index == arr.length) {
            return lastIndex;
        }

        if (arr[index] == searchVal) {
            lastIndex = index;
        }

        return LC(arr, index+1, searchVal, lastIndex);
    }
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,3,4,5,6,5,5,6,4};
        System.out.println(LC(arr, 0, 4, -1));
    }
}
