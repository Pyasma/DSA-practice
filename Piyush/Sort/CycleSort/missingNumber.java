package Piyush.Sort.CycleSort;

public class missingNumber {
    //leetcode 268   
    public static void main(String[] args) {
        int[] arr = {0,3,2,1,5,6};
        int ans = CyclicSortMethod(arr);
        System.out.println(ans);
    }

    static void swap(int[] arr, int value, int value2){
        int temp = arr[value];
        arr[value] = arr[value2];
        arr[value2] = temp;
    }   

    static int CyclicSortMethod(int[] arr){
        int i = 0;
        while (i < arr.length){
            int Valueindex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[Valueindex]){
                swap(arr, i, Valueindex);
            }
            else{
                i++;
            }
        }int  valu = findmissing(arr);
        return valu;
    }

    static int sumMethod(int[] nums){
        //Sum method to get the missing number
        
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++){ 
            sum += nums[i];
        }
        int total = n*(n+1)/2;
        return total-sum;
    }

    static int findmissing(int[] nums){
        int j = 0;
        int n = nums.length;
        while ( j < n){
            if (nums[j] != j){
                return j;
            }j++;  
        }return n;
    }
}
