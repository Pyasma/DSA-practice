package Piyush.BinarySearchIn2DArrays;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[][] arr = {{1,3}};
        int target = 3;
        int[] ans = searchin2d(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchin2d(int[][] arr, int target){
        int row = 0;
        int col = arr[0].length-1;
        // int m =  arr[0].length;
        // int end = arr[n][m];

        while (row <= arr.length-1 && col >= 0){

            if (arr[row][col] == target){
                return new int[]{row,col};
            }
            if (arr[row][col] > target){
                col--;
            }
            if (arr[row][col] < target){
                row++;
            }
        }return new int[]{};

    }
    
}
