package com.Piyush;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {89,24,1,2,3,45,22,46,889,10};
        int target = 46;
        int ans = Linsea(numbers, target);
        System.out.println(ans);
          
    }
    //search in the array: Return the index if item found otherwise return -1

    static int Linsea(int[] arr, int target){
        if (arr.length ==0){
            return -1;
        }
        for (int element : arr){
            if (element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
    static boolean Linsearch(int[] arr, int target){
        if (arr.length ==0){
            return false; 
        }
        for (int element : arr){
            if (element == target){
                return true;
            }
        }
        return false;
    }
}


