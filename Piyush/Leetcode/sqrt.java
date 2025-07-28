package Piyush.Leetcode;

public class sqrt {
    public static void main(String[] args) {
        int x = 2147395599;
        int ans = mySqrt(x);
        System.out.println(ans);
    } 
    static int mySqrt(int x) {

        if (x < 2) return x; 

        int low = 1;
        int high = x;

        while (low <= high){
            int mid = low + (high-low)/2;
            long sq = (long)mid*mid;
            if (sq == x){
                return mid;
            }

            if (sq > x){
                high = mid-1;
            }
            if (sq < x){
                low = mid+1;
            }
        }return high;
    }
}

