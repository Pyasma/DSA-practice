package Piyush.Recursion.Arrays;

public class Rotated_Binary {
    public static void main(String[] args) {
        int[] arr = {5,6,1,2,3,4};
        int t = 6;
        int ans = Binary(arr, t, 0, arr.length-1);
        System.err.println(ans);
    }

    static int Binary(int[] arr,int t,int s, int e){
        if (s > e){
            return -1;
        }
        int m = s+(e-s)/2;
        if (t == arr[m]){
            return m;
        }
        if (arr[s] <= arr[m]){
            if (t >= arr[s] && t <= arr[m]){
                return Binary(arr, t,s,m-1);
            }return Binary(arr,t, m+1,e);
        }
        if (t >= arr[m] && t  <= arr[e]){
            return Binary(arr, t, m+1, e);
        }return Binary(arr,t,s,m-1);
    }

}
