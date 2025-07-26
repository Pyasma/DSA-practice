package Piyush.Recursion.Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5,6};
        System.out.println(sort(arr,0));
    }
    static boolean sort(int[] arr, int s){
        if (s == arr.length-1){
            return true;
        }
        return arr[s] < arr[s+1] && sort(arr,s+1);
    }
    
}
