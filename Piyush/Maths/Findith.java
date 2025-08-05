package Piyush.Maths;

public class Findith {
    public static void main(String[] args) {
        int n = 15;
        int i = 1; 
        int ans = ithValue(n,i);
        System.out.println(ans); 
    }

    static int ithValue(int n, int i){
        int second = 1 << i-1;
        return n & second; 
    }
}
