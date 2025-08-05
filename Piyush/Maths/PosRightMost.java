package Piyush.Maths;

public class PosRightMost {
    public static void main(String[] args) {
        int n = 0b11110110;
        int ans = posofRight(n);
        System.out.println(Integer.toHexString(ans));
    }

    static int posofRight(int n){
        System.out.println((n + 1));
        return (n&(-n));
        // When We And n with it's negative counterpart we get the Right Most Set Bit 
        // Set Bit is basically First 1 from the right
        // We get Negative of a number using 2s Complement 

        // First Get Complement of a number and then add 1 to it
    }
}
