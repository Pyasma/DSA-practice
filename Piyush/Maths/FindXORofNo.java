package Piyush.Maths;

public class FindXORofNo {
    public static void main(String[] args) {
        int n = 8;
        int val = XOR(n);
        int val2 = AnotherXOR(n);
        System.out.println(val);
        System.out.println(val2);

    }

    static int XOR(int n){
        int ans = 0;
        while (n > 0){
            ans ^= n;
            n--; 
        }return ans;
    }

    static int AnotherXOR(int n){
        if ((n % 4) == 0){
            return n;
        }
        else if ((n%4) == 1){
            return 1;
        }
        else if ((n%4) == 2){
            return n+1;
        }
        // n%4 == 3 Last Condition
        else{
            return 0;
        }

    }
}
