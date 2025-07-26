package com.Piyush;

public class Search {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;
        int start = 1;
        int end = 4; 
        System.out.println(searchin(arr, target, start, end));
    }

    static int searchin(int[] arr, int target, int start, int end){
        if (arr.length == 0) {
            return -1;
        }
        for (int index =start; index < end; index++){
            if (arr[index] == target){
                return index;
            }
        }
        return -1;
    } 
}
