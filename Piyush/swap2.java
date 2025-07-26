package com.Piyush;
import java.util.Arrays;

public class swap2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
        int[] rev = reverse(arr);
        System.out.println(Arrays.toString(rev));
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }
    }
    static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <  end){
            swap(arr,start,end);
            start++;
            end--;
        }
        return arr;
        
    }
}
