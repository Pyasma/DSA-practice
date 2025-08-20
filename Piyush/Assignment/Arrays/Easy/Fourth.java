package Piyush.Assignment.Arrays.Easy;

public class Fourth {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,2,1}};
        System.out.println(MaximumMoney2(arr));
    }
    public int maximumWealth(int[][] accounts) {
        int[] ans = MaximumMoney(accounts);
        int n = ans.length;
        int max = 0;
        for (int i = 0; i < n; i++){
            if (max < ans[i]){
                max = ans[i];
            }
        }return max;
    }

    static int[] MaximumMoney(int[][] arr){       
        int n = arr.length;
        int[] ans = new int[n]; 
        for (int row = 0; row < n; row++){
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++){
                sum += arr[row][col];
            }ans[row] = sum;
        }return ans;
    }
// -----------------------------------------------------------
    static int MaximumMoney2(int[][] arr){       
        int n = arr.length;
        int max = 0;
        for (int row = 0; row < n; row++){
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++){
                sum += arr[row][col];
            }if (max < sum){
                max = sum;
            }
            
        }return max;
    }
        
}
