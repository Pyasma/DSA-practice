package Piyush.Maths;

public class FindPowerof2 {
    public static void main(String[] args) {
        int n = 6;
        int ans = FindingPowerof2(n);
        System.out.println(ans);
    }

    static int FindingPowerof2(int n){
        //leading 1 binary numbers are all multiples of 2 or we can say square of 2 100000 binary numbers
        if ((n > 0) && (n&(n-1)) == 0){
            return 1;
        }else{
            return -1;
        }
    }
}
