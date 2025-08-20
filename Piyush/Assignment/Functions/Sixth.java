package Piyush.Assignment.Functions;
import java.util.*;
import java.math.*;

public class Sixth {
    public static void main(String[] args) {
        
    }

    static double areaCircle(int r){
        return Math.PI*power(r,2);
    }
    static double PerimeterCircle(int r){
        return 2*Math.PI*r;
    }

    static int power(int base, int exp){
        int result = 1;
        if (exp > 0){
            if ((exp&1) == 1){
                result *= base;
            }base *=base;
            exp >>= 1;
        }return result;
    }
}
