package Piyush;

public class RotatedSearch { 
    public static void main(String[] args) {
        int[] arr = {5,1,3};
        int t = 5; 
        System.out.println(sub(arr, t));
        System.out.println(searchusingpivot(arr, t));
    }
    static int sub(int[] arr, int target) {
        int Peak = peak(arr);
        int FirstHalf = SearchArray(arr, target, 0, Peak);
        if (FirstHalf != -1){
            return FirstHalf; 
        }return SearchArray(arr, target, Peak+1, arr.length-1);
    }

    static int searchusingpivot(int[] arr, int t){
        int pivot = peak(arr);
        if (pivot == -1){
            // if there is no Pivot that means array isn't rotated
            return SearchArray(arr, t, 0, arr.length-1);
        }
        if (arr[pivot] == t){
            return pivot;
        }
        if (arr[0] > t){
            return SearchArray(arr, t, pivot+1,arr.length-1);
        }else{
            return SearchArray(arr, t, 0, pivot);
        }
    }

    static int peak(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while (s <= e){
            int m = s + (e-s)/2;
            //Case number 1 
            if (m < e && arr[m] > arr[m+1]){
                return m; 
            }
            if (m > s && arr[m-1] > arr[m]){
                return m-1;
            }
            if (arr[s] >= arr[m]){
                e = m-1;
            }else { 
                s = m+1;
            }
        }return -1;
    }

    static int SearchArray(int[] arr, int t, int s, int e){
        
        while (s <= e){
            int m = s + (e-s)/2;
            if (arr[m] == t){
                return m;
            }
            if (arr[m] > t){
                e = m-1;
            }else { 
                s = m+1;
            }
        }return -1;
    }        
}
