package Restart.SDE.ARRAYI;

public class ClockWise {
    public static void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int [][] newMatrix = new int [rows] [cols];

        for (int row = 0; row  <  rows;  row++) {
            for (int col = 0; col <  cols; col++)  {
                int newCol = cols - 1 - row;
                int newRow  = col;

                newMatrix [newRow] [newCol] = matrix[row][col];
            }
        }

        for (int row = 0; row  <  rows;  row++) {
            for (int col = 0; col <  cols; col++)  {
                System.out.print(newMatrix[row][col]  + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [] [] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        rotate(matrix);
    }
}
