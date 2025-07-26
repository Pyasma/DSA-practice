package Piyush;

public class Mountainarray2 {
    public static void main(String[] args) {
        int[] arr = {18,29,38,59,98,100,99,98,90};
        System.out.println(peakfinder(arr));
    }
    static int peakfinder(int[] arr){
        int s = 0;
        int e = arr.length-1;

        while (s < e){
            int m = s + (e-s)/2;
            if (arr[m] > arr[m + 1]){
                e= m;
            }
            if (arr[m] < arr[m+1]){
                s = m+1;
            }
        }return e;
    }
    
}
