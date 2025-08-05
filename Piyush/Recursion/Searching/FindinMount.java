package Piyush.Recursion.Searching;

public class FindinMount {
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 4, 2};
        int t = 4;
        System.out.println(search(arr, t));

    }
    // static int search{int[] arr, int t}{
    //     int[] arr;
    //     // int peak = findpeak(arr);
    //     // int firsthalf = binarySearch(arr,t,0,peak);
    //     // int Secondhalf = binarySearch(arr,t,peak+1,arr.length-1);
    //     int peak = findpeak(arr);
    //     int firsthalf = binarySearch(arr, t, 0, peak, true);
    //     if (firsthalf != -1) return firsthalf;
    //     return binarySearch(arr, t, peak + 1, arr.length - 1, false);
    // }
    static int search(int[] arr, int t) {
        int peak = findpeak(arr);
        int firsthalf = binarySearch(arr, t, 0, peak);
        if (firsthalf != -1) return firsthalf;
        return binarySearch(arr, t, peak + 1, arr.length - 1);
    }
    static int findpeak(int[] arr){

        // First Find peak element in an array
        int s = 0;
        int e = arr.length-1;
        while (s < e){
            int m = s + (e-s)/2;
            if (arr[m] > arr[m+1]){
                e = m;
            }else { 
                s = m+1;
            }
        }return s;
    }

    static int binarySearch(int[] arr, int t, int s, int e){
        
        boolean Asc = arr[s] < arr[e];
        while (s < e){
            int m = s + (e-s)/2;
            if (arr[m] == t){
                return m;
            }
            if (Asc){
                if (arr[m] > t){
                    e = m-1;
                }s = m+1;
            }else{
                if (arr[m] > t){
                    s = m+1;
                }e = m -1;
            }
        }return -1;
    }
}