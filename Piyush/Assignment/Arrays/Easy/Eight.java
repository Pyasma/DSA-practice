package Piyush.Assignment.Arrays.Easy;

import java.util.Arrays;

public class Eight {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(SmallerthanCurrent(nums));
    }

    static String SmallerthanCurrent(int[] arr){
        int n = arr.length;
        int[] list = new int[n];
        for (int i = 0; i < n; i++){
            int count = 0;
            for (int j = 0; j < n; j++){
                if (arr[i] > arr[j]){
                    count++;
                }
            }list[i] = count;
        }return Arrays.toString(list);
    }
    // Using the Array Sorted Method  We will sort the method and   
}
