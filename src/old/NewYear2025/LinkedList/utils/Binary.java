package old.NewYear2025.LinkedList.utils;

public class Binary {
    public static int convertBinToDe (int num) {
       int sum = 0;
       int i = 0;

       while (num != 0) {
           int digit = num % 10;
           int cal = digit * (int) Math.pow(2, i++);
           sum += cal;
           num /= 10;
       }

       return sum;
    }
    public static void main(String[] args) {
        int num = 11111;
        System.out.println(convertBinToDe(num));
    }
}
