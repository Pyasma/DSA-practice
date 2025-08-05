package Piyush.Recursion.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 36; 
        int ans = BinarySearchQuest(arr, target);
        System.out.println(ans);
    }
    static int BinarySearchQuest(int[] GivenArr, int target){
        
        int start = 0;
        int end = GivenArr.length - 1;  
        while(start <= end){         

            int mid = start + (end-start)/2; 
            if (target <  GivenArr[mid]){
                end = mid - 1;
            } else if (target > GivenArr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
   