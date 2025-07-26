package com.Piyush;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 15, 300, 9}; 
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i : arr){
            if (i> max){
                max = i;
            }
        }
        return max;
    }    
}

