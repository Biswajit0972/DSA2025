package Restart.Practice.Day3;

public class BinaryString {
    public static void Print (int n, String str, int lastIndex) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        Print(n-1, str+ "0", 0);

        if (lastIndex == 0) {
            Print(n-1,  str +"1", 1);
        }
    }
    public static void main(String[] args) {
        Print(3, "", 0);
    }
}
