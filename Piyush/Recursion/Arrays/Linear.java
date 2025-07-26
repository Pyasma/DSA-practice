package Piyush.Recursion.Arrays;
import java.util.ArrayList;

public class Linear {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,18,9};
        int t = 18;
        System.out.println(search(arr,0,t));
        System.out.println(exist(arr,0,t));
        System.out.println(searchLast(arr, arr.length-1, t));
        list.clear();
        searchAll(arr,0,t);
        System.out.println(list);
        ArrayList<Integer> ans = searchAllele(arr, 0, t, new ArrayList<>());
        System.out.println(ans);
 
        System.out.println(searchAllele(arr, 0, t, new ArrayList<>()));
        System.out.println(newlist(arr, 0, t));

        
    }
    static int search(int[] arr, int s, int t){
        if (s == arr.length){
            return -1;
        }
        if (arr[s]==t){
            return s;
        }
        return search(arr, s+1, t);
    }
    static boolean exist(int[] arr, int s, int t){
        if (s == arr.length){
            return false ;
        }
        return arr[s]== t || exist(arr, s+1, t);
    }
    static int searchLast(int[] arr, int s, int t){
        if (s == -1){
            return -1;
        }
        if (arr[s]==t){
            return s;
        }
        return searchLast(arr, s-1, t);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void searchAll(int[] arr, int s, int t){
        if (s == arr.length){
            return;
        }
        if (arr[s]==t){
            list.add(s);
        }
        searchAll(arr, s+1, t);
    }
    static ArrayList<Integer> searchAllele(int[] arr, int s, int t,ArrayList<Integer> list){
        if (s == arr.length){
            return list;
        }
        if (arr[s]==t){
            list.add(s);
        }
        return searchAllele(arr, s+1,  t,list);
    } 
    static ArrayList<Integer> newlist(int[] arr,int s, int t){
        ArrayList<Integer> list = new ArrayList<>();
        if (s == arr.length){
            return list;
        }
        if (arr[s] == t){
            list.add(s);
        }
        ArrayList<Integer> ansfrombelowbeingcollectedhere =  newlist(arr,s+1,  t);
        
        list.addAll(ansfrombelowbeingcollectedhere);

        return list;

    }
}
