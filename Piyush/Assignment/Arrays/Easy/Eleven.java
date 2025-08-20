package Piyush.Assignment.Arrays.Easy;

import java.util.List;

public class Eleven {
    public static void main(String[] args) {
        
    }

    ///https://leetcode.com/problems/count-items-matching-a-rule/

    static int CountItems(String[][] items, String RuleKey, String ruleValue){
        int count = 0;
        if (RuleKey.equals("type")){
            for (int arr = 0; arr < items.length; arr++){
                if (items[arr][0].equals(ruleValue)){
                    count++;
                }
            }return count;
        }  
        else if (RuleKey.equals("color")){
            for (int arr = 0; arr < items.length; arr++){
                if (items[arr][1].equals(ruleValue)){
                    count++;
                }
            }return count;
        }  
        else if (RuleKey.equals("name")){
            for (int arr = 0; arr < items.length; arr++){
                if (items[arr][2].equals(ruleValue)){
                    count++;
                }
            }return count;
        }
        return -1;  
    }

    static int CountMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int index;
        switch (ruleKey){
            case "type": index = 0; break; 
            case "color": index = 1; break;
            case "name" : index  =2; break;
            default: return 0;
        }

        int count = 0;
        for (List<String> item: items){
            if (item.get(index).equals(ruleValue)){
                count++;
            }
        }
    }   
}
