package Piyush.Leetcode;

public class Leetcode_860 {
    public static void main(String[] args) {
        int[] bills = {5,5,10,10,20};
        System.out.println(changetoProvide(bills));
    }
    static boolean changetoProvide(int[] arr){
        int five = 0;
        int ten = 0;

        for (int val : arr){
            if (val == 5){
                five += 1;
            }
            else if (val == 10){
                if (five < 1){
                    return false;
                }five -= 1;
                ten += 1;
            }else{
                if (five > 0 && ten > 0){
                    five -=1;
                    ten -=1;
                }else if (five >= 3){
                    five -= 3;

                }else{
                    return false;
                }   
            }
        }return true;

    }
}
