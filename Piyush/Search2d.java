package Piyush;

import java.util.Arrays;

public class Search2d {
    public static void main(String[] args) {
        int[][] arr = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };
        int t = 99;
        int[] ans = search(arr, t);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int t){
        for (int row = 0; row < arr.length; row++){
            for (int col= 0; col < arr[row].length; col++){
                if (arr[row][col] == t){
                    return new int[] {row,col};
                }
            }
        }return new int[] {};
    }
}
