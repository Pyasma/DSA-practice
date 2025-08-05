package Piyush.Maths;

public class PascalTriangleSum {
    public static void main(String[] args) {
        int n = 5;
        int ans = SumofEachRow(n);
        System.out.println(ans);
    }

    static int SumofEachRow(int n){
        return (1 << (n-1));
    }
}
