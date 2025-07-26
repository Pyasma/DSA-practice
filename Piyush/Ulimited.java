package com.Piyush;
public class Ulimited {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        int result = findingRange(arr, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
    static int findingRange(int[] arr, int target){
        int start = 0;
        int end = 1;
 
        while (true){
            try {
                if (target < arr[end]){
                    break;
                }
                int newStart = end + 1;
                end = end + (end-start + 1)*2;
                start = newStart;
            } catch (ArrayIndexOutOfBoundsException e){
                break;
            }
            
        }
        return BinarySearch(arr, target, start, end);
    } 
    static int BinarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return mid;

            } else if (arr[mid] < target){
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
