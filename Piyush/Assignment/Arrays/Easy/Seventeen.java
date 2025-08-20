package Piyush.Assignment.Arrays.Easy;

import java.util.Arrays;

public class Seventeen {
    //https://leetcode.com/problems/transpose-matrix/description/
    public static void main(String[] args) {
        int[][] arr =  {{1,2,3},{4,5,6}};
        //Transpose(arr);
        int m = arr.length;
        int n = arr[0].length;
        int[][] ans = transposeofmatrix(arr, n, m);
        System.out.println(Arrays.deepToString(ans));
    }

    //https://leetcode.com/problems/transpose-matrix/submissions/1735030875/

    static int[][] transposeofmatrix(int[][] arr, int n, int m){
        int[][] transpose = new int[n][m];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                transpose[j][i] = arr[i][j];
            }
        }return transpose;
    }
}
