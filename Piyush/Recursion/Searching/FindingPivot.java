package Piyush.Recursion.Searching;

// public class FindingPivot {
//     public static void main(String[] args) {

//         int[] arr = {3,1,2};
//         System.out.println(FindPivot(arr));
        
//     }
//     static int FindPivot(int[] arr){
//         int start = 0;
//         int end = arr.length-1;

//         while (start <= end){
//             int mid = start + (end-start)/2;

//             //checking if Mid element is the peak
//             if (arr[mid] > arr[mid+1])return mid;

//             //checking if start to mid is sorted?
//             if (arr[start] < arr[mid] && mid < end){
//                 start = mid+1;
//             }
//             else{
//                 end = mid-1;
//             }
//         }return -1;

//     }
    
// }

public class FindingPivot {
    public static void main(String[] args) {
        int arr[] = {3,1,2};
        int minimum = findMin(arr);
        System.out.println(minimum);
    }
    static int findMin(int[] nums) {
        int Pivot = FindPivot(nums);
        //System.out.println(nums[Pivot+1]);
        return nums[Pivot+1];
        
    }

    static int FindPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end-start)/2;

            //checking if Mid element is the peak
            if (end > mid && arr[mid] > arr[mid+1])return mid;
            if (start < mid && arr[mid] < arr[mid-1]) return mid-1;

            //checking if start to mid is sorted?
            if (arr[start] < arr[mid] && mid < end){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }return -1;

    }
}