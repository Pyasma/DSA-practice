package Piyush;

public class searchinrange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int t = 5;
        int s = 0;
        int e = 6;
        int ans = Linear(arr, s,e,t);
        System.out.println(ans);
    }
    static int Linear(int[] arr, int s, int e, int t){
        if (s > e){
            return -1;
        }
        for (int i = s; i < e; i++){
            if (arr[i]  == t){
                return i;
            }
        }return -1;  
    }
}
