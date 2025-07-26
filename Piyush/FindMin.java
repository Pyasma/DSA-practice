package com.Piyush;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 15, 3, 9}; 
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < max){
                max = arr[i];
            }
        } 
        return max;
    } 

}


