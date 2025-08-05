package Piyush.Maths;

public class Reset {
    public static void main(String[] args) {
        int n = 0b1010110;
        int i = 5;
        System.out.println(resetIthBit(n, i));
        System.out.println(Integer.toBinaryString(resetIthBit(n, i)));
    }

    static int resetIthBit(int n, int i){
        return (n&~(1<<(i-1)));
        // n Exclusive OR and Left shifting 1 to i-1 value  if i = 5 0001000
    }
}

