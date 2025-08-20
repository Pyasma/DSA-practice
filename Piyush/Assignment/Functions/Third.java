package Piyush.Assignment.Functions;

public class Third {
    public static void main(String[] args) {
        EligibleVoteOrNot(10);
    }

    static void EligibleVoteOrNot(int n){
        if (n >= 18){
            System.out.println("You are Eligible");
        }else{
            System.out.println("You are not Eligible");
        }
    }
}
