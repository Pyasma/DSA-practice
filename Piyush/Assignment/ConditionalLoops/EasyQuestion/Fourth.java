package Piyush.Assignment.ConditionalLoops.EasyQuestion;
import java.util.*;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("h :");
        int h = sc.nextInt();
        System.out.print("b :");
        int b = sc.nextInt();
        System.out.println(AreaIsoceles(h, b));
    }
    
    static double AreaIsoceles(int h, int b){
        return (h*b*(0.5));
    }
}
