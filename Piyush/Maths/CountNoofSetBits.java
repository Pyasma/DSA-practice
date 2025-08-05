package Piyush.Maths;

public class CountNoofSetBits {
    public static void main(String[] args) {
        int n = 9;
        int ans = setbitsCounter(n);
        System.out.println(ans);
        int ans2 = BrianKernighanAlgorithm(n);
        System.out.println(ans2);
    }

    static int setbitsCounter(int n){
        int count = 0;
        while (n > 0){
            if ((n&1) == 1){
                count++;
            }
            n >>= 1;
        }return count;
    }

    static int BrianKernighanAlgorithm(int n){

        // This 
        int count =0;
        while (n > 0){
            n = n-(n&-n);
            count++;
        }return count;
    }
}
