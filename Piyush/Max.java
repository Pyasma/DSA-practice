package com.Piyush;

public class Max {
    public static void main(String[] args) {

        int[] arr = {1100000001, 2000, 30, 20, 5};
        System.out.println(max(arr, 1 ,4));
        System.out.println(maxVal(arr));
    }

    static int max(int[] arr, int start,int end){
        if (end < start){
            return -1; 
        }
        if (arr == null){
            return -1;
        }
        
        int max = arr[0]; // if array is Empty we can use Integer.MIN_VALUE
        for (int i = start; i < end; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int maxVal(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        
        int max = arr[0]; // if array is Empty we can use Integer.MIN_VALUE
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
