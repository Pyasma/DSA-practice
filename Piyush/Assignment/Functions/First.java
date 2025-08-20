package Piyush.Assignment.Functions;

public class First {
    public static void main(String[] args) {
        int Fir = 1;
        int Sec = 5;
        int Thir = 3;
        System.out.println(Maximum(Fir, Sec, Thir));
        System.out.println(Minimum(Fir, Sec, Thir));
    }   

    static int Maximum(int Fir, int Sec, int Thir){
        int max = Fir;
        if (max > Sec){
            if (max > Thir){
                return max;
            }else{
                max = Thir;
            }
        }else{
            max = Sec;
        }return max;
    }

    static int Minimum(int Fir, int Sec, int Thir){
        int min = Fir;
        if (min < Sec){
            if (min < Thir){
                return min;
            }else{
                min = Thir;
            }
        }else {
            min = Sec;
        }return min;
    }
}
