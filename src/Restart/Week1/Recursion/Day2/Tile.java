package Restart.Week1.Recursion.Day2;

public class Tile {
    static int fillTheFloor (int n) {
        // TODO: assume that floor length is 2 and width n
        // Base case
        if (n == 0 || n == 1) {
            return 1; // one way to fill the floor
        }

        int vertically = fillTheFloor(n -1);
        int horizontally = fillTheFloor(n-2);
        int totalWay = vertically + horizontally;
        return totalWay;
    }
    public static void main(String[] args) {
        System.out.println(fillTheFloor(50));
    }
}
