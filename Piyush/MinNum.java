package Piyush;

public class MinNum {
    public static void main(String[] args) {
        int[] arr= {18, 12, -7,3,14,28};
        System.out.println(MinimumNumber(arr));

    }   
    static int MinimumNumber(int[] arr){
        int minnumb = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (minnumb > arr[i]){
                minnumb = arr[i];
            }
        }return  minnumb;
    }
}
