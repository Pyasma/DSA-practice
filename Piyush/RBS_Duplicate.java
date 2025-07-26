package Piyush;

public class RBS_Duplicate{
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target = 2;
        System.out.println(OutputUsingPivot(arr, target));
    }

    static int OutputUsingPivot(int[] arr, int target){
        int pivot = FindingPeak(arr);
        if (pivot == -1){
            return BinarySearch(arr, target, 0, arr.length-1);
        }
        if (arr[pivot] == target){
            return pivot;
        }
        if (target >= arr[0] && target <= arr[pivot]){
            return BinarySearch(arr, target, 0, pivot);
        }else{
            return BinarySearch(arr, target, pivot+1, arr.length-1);
        }
    }
    //First Step should be Finding peak in the element
    // 

    static int FindingPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            // Checking if mid is the Peak Element
            if (mid < end && arr[mid] > arr[mid+1]) return mid;

            // Checking if mid-1 is the Peak Element 
            if (mid > start && arr[mid] < arr[mid-1]) return mid-1;

            //Checking if (Middle == Start == End) IF yes we need to Ignore or Skip these Same elements
            if (arr[start] == arr[mid] && arr[end] == arr[mid]){
                // Checking if Start that we are going to skip is Pivot or not
                if (start < end && arr[start] > arr[start+1]) return start;
                start++;

                // Checking if End is the Pivot or Not
                if (end > start && arr[end] < arr[end-1]) return end-1;
                end--;
                continue;
            }

            // IF Left Side is Sorted Checking Right Side

            if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }return -1;
    }
   
    
    static int FindingPeak2(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
    
            // Check if mid is pivot
            if (mid < end && arr[mid] > arr[mid + 1]) return mid;
            if (mid > start && arr[mid] < arr[mid - 1]) return mid - 1;
    
            // If elements at start, mid, end are equal, skip duplicates
            if (arr[start] == arr[mid] && arr[end] == arr[mid]) {
                // Check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) return start;
                start++;
    
                // Check if end is pivot
                if (end > start && arr[end] < arr[end - 1]) return end - 1;
                end--;
            }
            // Left side is sorted, go right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    

    static int BinarySearch(int[] arr, int target, int start, int end){
        while (start  <= end){
            int mid = start + (end-start)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (arr[mid] > target){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }return -1;
    }
    
}
