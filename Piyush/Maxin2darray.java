package com.Piyush;

public class Maxin2darray {
    public static void main(String[] args) {
        int[][] arr = {
            {23,4,1},
            {18,120,3,9},
            {78,99,34,56},
            {18,12}
        };
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;

        for (int[] arr1 : arr) {
            for (int element : arr1) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
