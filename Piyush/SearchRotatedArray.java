package com.Piyush;

public class SearchRotatedArray {
    public static void main(String[] args) {
        
    }
    static int search(int[] arr, target){
        int peak = peakindex(arr);
        int firstTry = BinarySearch(target, arr, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        else {
            return BinarySearch(target, arr, peak+1, arr.length-1);
        }

    }
    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1; 
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    static int BinarySearch(int target, int[] arr, int start, int end) {
        // int start = 0; 
        // int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        
        while (start <= end){
            int mid = start + (end-start)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]){
                    end = mid-1;
                } else{                            
                    start = mid+1;
                }
            }
            else {
                if (target > arr[mid]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}

