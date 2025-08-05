package Piyush.Maths;

public class SettheIth {
    public static void main(String[] args) {
        int n = 0b1010110;
        int i = 4;
        int ans = SetIth(n, i);
        System.out.println(ans);
        System.out.println(Integer.toBinaryString(ans));

    }

    static int SetIth(int n, int i){
        return n | (1 << (i-1));
    }
}
