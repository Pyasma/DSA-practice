package Piyush.Maths;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,4,5,4,5};
        // int ans = Duplicates(arr);
        int ans2 = Duplicates2(arr);
        // System.out.println(ans);
        System.out.println(ans2);
    }

    static int Duplicates(int[] arr){
        int value = arr[0];
        for (int i = 1; i <= arr.length-1; i++){
            value = value^arr[i];
        }return value;
    }

    static int Duplicates2(int[] arr){
        int unique = 0;
        for (int n : arr){
            unique ^= n;
        }return unique;
    }
}
