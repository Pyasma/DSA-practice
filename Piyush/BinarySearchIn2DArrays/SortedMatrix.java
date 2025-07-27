package Piyush.BinarySearchIn2DArrays;
//  30 34 43

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{4},{1},{14}};
        
        int target = 14;
        int ans = search(arr, target);
        System.out.println(ans);
///4
// 1
// 14
// 38
// 68
// 127
// 53
    }

    static int search2(int[][] arr, int target){
        int m = arr.length;
        int n = arr[0].length;
        
        int low = 0;
        int high = m*n -1;
        
        while (low <= high){
            int mid = low + (high-low)/2;
            
            int row = mid/m;
            int col = mid%m;
            
            if (arr[row][col] == target){
                return 1;
            }
            else if (arr[row][col] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }return 0;
    }
    // Search in the Rows Provided Between the Cols provided 
    static int binarysearch(int[][] arr, int target, int row, int colstart, int colend){
        while (colstart <= colend){
            int mid = colstart+(colend-colstart)/2;
            
            if (arr[row][mid] == target){
                return 1;
            }
            else if (arr[row][mid] > target){
                colend = mid -1;
            }
            else {
                colstart = mid+1;
            }
        }return -1;
    }

    static int search(int[][] arr, int target){
        int row = arr.length;
        int col = arr[0].length;
        int colmid = col/2;


        if (row == 1){
            return binarysearch(arr, target, 0, 0, col-1);
        }
        int rowstart = 0;
        int rowend = row-1;

        while (rowstart <  (rowend-1)){
            int mid = rowstart + (rowend-rowstart)/2;
            if (arr[mid][colmid] == target) return 1;

            if (arr[mid][colmid] < target){
                rowstart = mid;
            }
            else {
                rowend = mid;
            }
        }
        //Check Wether the target is in the column of two rows
        if (arr[rowstart][colmid] == target || arr[rowstart+1][colmid] == target){
            return 1;
        } 
        if (target >= arr[rowstart][0] && arr[rowstart][colmid-1]  >= target){
            return binarysearch(arr, target, rowstart, 0, colmid-1);
        }
        if (target <= arr[rowstart][col-1] && arr[rowstart][colmid+1]  <= target){
            return binarysearch(arr, target, rowstart, colmid+1, col-1);
        }
        if (target >= arr[rowstart+1][0] &&arr[rowstart+1][colmid-1]  >= target){
            return binarysearch(arr, target, rowstart+1, 0, colmid-1);
        }
        if (target <= arr[rowstart+1][col-1] && arr[rowstart+1][colmid+1]  <= target){
            return binarysearch(arr, target, rowstart, colmid+1, col-1);
        }else{
            return -1;
        }
    }
}