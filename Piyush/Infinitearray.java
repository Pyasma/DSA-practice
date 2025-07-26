package Piyush;

public class Infinitearray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,10,11,12,15,20,23,30};
        int t = 15;  
        // System.out.println(brute(arr, t));
        System.out.println(findingrange(arr, t));
    }

    /**
     * @param arr
     * @param t
     * @return
     */
    static int findingrange(int[] arr, int t){
        int s = 0;
        int e = 1;

        while (true){
            try {
                if (arr[e] >= t){
                    break;
                }
                int temp = e + 1;
                e = e + (e-s+1)*2;
                s = temp;
                
            } catch (ArrayIndexOutOfBoundsException ex) {
                break;
            }

        }return Binary(arr, t, s, e);
    }

    // static int brute(int[] arr, int t){
    //     for (int i = 0; ; i++){
    //         if (arr[i] == t){
    //             return i;
    //         }
    //     }
    // }

    static int Binary(int[] arr, int t, int s, int e){
        while (s <= e){        
            int m = s + (e-s)/2;
            if (arr[m] == t){
                return m;
            }
            if (arr[m] > t){
                e = m-1;
            }
            if (arr[m] < t){
                s = m+1;
            }
        }return -1;
    }
}
  