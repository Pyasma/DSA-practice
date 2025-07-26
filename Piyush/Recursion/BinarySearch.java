package com.Piyush.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int ans = search(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 5, 0, 8);
        System.out.println(ans);
    }
    static int search(int[] arr, int target, int s, int e){
        if (s > e){
            return -1;
        }
        int m = s + (e-s)/2;
        if (arr[m] == target){
            return m;
        }
        if (arr[m] < target){
            // s = m + 1;
            return search(arr,target,m+1,e);
        }
        return search(arr,target,s,m-1);
    }
}
