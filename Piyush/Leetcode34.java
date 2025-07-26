package com.Piyush;

import java.util.Arrays;

public class Leetcode34 {
    public static void main(String[] args) {
    //     int arr[] = {5,7,7,8,8,10};
    //     int target = 6;
    //     int ans[] = first_last(arr, target);
    //     System.out.println(Arrays.toString(ans));
    // }
    // static int[] first_last(int[] arr, int target){
    //     int[] not_found = {-1, -1}; 
    //     for (int i = 0; i< arr.length-1; i++){
    //         if (arr[i] == target){
    //             for (int j = arr.length - 1; j > 0 ; j--){
    //                 if (arr[j] == target){
    //                     return new int [] {i, j};
    //                 }
    //             }
    //         }
    //     }
    //     return not_found;
        int arr[]  = {5,7,7,8,8,10};
        int target = 8;
        int ans[] = first_occurence(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] first_occurence(int[] arr, int target){
        int orginal[] = {-1, -1}; 
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end -start)/2;
            if (target < arr[mid]){
                end = mid-1 ;
            }
            else if (target > arr[mid]){
                start = mid+1;
            }
            else{
                return new int[] {mid,mid};
            }

        }
        return orginal;
    }
}