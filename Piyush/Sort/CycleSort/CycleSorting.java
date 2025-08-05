package Piyush.Sort.CycleSort;

import java.util.Arrays;

public class CycleSorting {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        Sorting(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static void Sorting(int[] arr){
        int i = 0;
        while (i < arr.length){
            if (arr[i]-1 == i){
                i++;
            }else {
                int newindex = arr[i]-1;
                int temp  = arr[i];
                arr[i] = arr[newindex];
                arr[newindex] = temp;
            }
        }
    }
}
