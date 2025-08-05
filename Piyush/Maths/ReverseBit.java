package Piyush.Maths;

public class ReverseBit {
    public static void main(String[] args) {
        int n = 6;
        int bitlength = Integer.toBinaryString(n).length();
        int ans = Reverse(n, bitlength);
        System.out.println(Integer.toBinaryString(ans));

    }

    static int Reverse(int n, int k){
        int result = 0;
        for (int i = 0; i < k; i++){
           int lsb = (n >> i) & 1;
           result |= (lsb << (k-1-i)); 
        }return result;
    }
}
