package com.Piyush;

public class LeetcodeFloor {
    public static void main(String[] args) {
        int ans = binarySearch(new int[]{1,2,8,10,10,12,19}, 0);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start)/2; 
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return end;
    } 
}
