package Piyush.Sort.SelectionSort;
import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,7,4};
        Sorting(arr);
        System.out.println(Arrays.toString(arr));
        
    }   
    static int getmax(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end;i++){
            if (arr[i]>arr[max]){
                max = i;
            }
        }return max;
    }

    static void swapping(int[] arr, int value1, int value2){
        int temp = arr[value1];
        arr[value1] = arr[value2];
        arr[value2] = temp; 
    }
    static void Sorting(int[] arr){
        for (int i=0; i <arr.length; i++){
            int lastvalue = arr.length-i-1;
            int maxvalue = getmax(arr,0, lastvalue);

            swapping(arr, maxvalue, lastvalue);
        }

    }


}
