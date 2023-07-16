/**
 * int a, b, c, d;
 * a, b = 2;
 * c = 3;
 * d = 4;
 * 
 * int [][][][] fourDArray = new int[a][b][c][d];
 * 
 * Use for loops to fill this multi dimensional array with incremented values
 */

 import java.util.Arrays;

public class ChallengeSeven {
    public static void main(String[] args) {
        int accumulator = 1;

        int a, b, c, d;
        a = 2;
        b = 2;
        c = 3;
        d = 4;
        int [][][][] fourDArray = new int[a][b][c][d];

        // Outer-most array layer has 2 arrays, those two arrays each have two arrays, those two inner arrays in each layer have three arrays inside them, and each of the innermost arrays have four values

        // for (int i = 0; i < fourDArray.length; i++) {
        //     int[][][] row = fourDArray[i];
        //     for (int j : row) {
        //         int [][] innerRow = j;
        //         for (int k : innerRow) {
        //             innerRow[k] = accumulator++;
        //         }
        //     } 
        // }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    for (int l = 0; l < d; l++) {
                        fourDArray[i][j][k][l] = accumulator;
                        accumulator++;
                    }
                }
            }
        }

        for (int[][][] threeDArray : fourDArray) {
            for (int[][] twoDArray : threeDArray) {
                for (int[] oneDArray : twoDArray) {
                    System.out.println(Arrays.toString(oneDArray));
                }
            }
        }
    }
}
