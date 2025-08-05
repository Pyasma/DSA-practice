package Piyush.Maths;

public class FindXORinRange {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int ans = XORinRange(b);
        int ans2 = XORinRange(a-1);
        System.out.println(ans^ans2);
        int ans3 = ForinRange(a, b);
        System.out.println(ans3);
    }
    // This Will give TLE error 
    static int ForinRange(int a,int b){
        int ans = 0;
        for (int i = a; i <= b; i++) {
            ans ^= i; 
        }return ans;
    }

    static int XORinRange(int b){
        int ans= 0;

        if ((b%4) == 0){
            ans = b;
        }
        else if (b%4 == 1){
            ans = 1;
        }
        else if (b%4 == 2){
            ans = b+1;
        } // b%4  == 3 is 0
        else{
            ans = 0;
        }
        return ans;
    }
}
