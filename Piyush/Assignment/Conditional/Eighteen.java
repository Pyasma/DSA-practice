package Piyush.Assignment.Conditional;

import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("l :");
        int l = sc.nextInt();
        System.out.print("w :");
        int w = sc.nextInt();
        System.out.print("h :");
        int h = sc.nextInt();
        System.out.println(VolumePyramid(l, w, h));
    }
    static double VolumePyramid(int l, int w, int h){
        return (l*w*h)/3.0;
    }
}
