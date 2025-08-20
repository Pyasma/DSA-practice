package Piyush.Assignment.Arrays.Easy;

public class TwentyEight {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(findingCost(arr));
    }
    static int findingCost(int[] pos){
        int odd = 0;
        int even = 0;
        for (int i = 0; i < pos.length; i++){
            if (pos[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }return Math.min(odd,even);
    }
}
