package Piyush.Assignment.Arrays.Easy;

import java.util.Arrays;

public class TwentyFour {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        System.out.println(Arrays.deepToString(reshape(arr, r, c)));
    }

    static int[][] reshape(int[][] mat, int r, int c){
        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                // for Second Loop i will become 0
                arr[i][j] = mat[i][j];
            }
        }return arr;
    }
}
