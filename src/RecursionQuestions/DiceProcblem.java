package RecursionQuestions;

import java.util.ArrayList;

public class DiceProcblem {
    public static void main(String[] args) {
    dice("",4);
        System.out.println(dice3("",4));
    }
    public static void dice(String p , int target ){
        if(target == 0){
            System.out.println(p);
            return;
        }
//        int digit = p.charAt(0) + '0';
        for (int i = 1; i <=6 && i<= target; i++) {
            dice(p+i,target-i);
        }
    }

    // second approach adding in array list
    // first we pass the list argument in the function or method
    public static ArrayList<String> dice2(String p , int target, ArrayList<String> list){
        if(target == 0){
            list.add(p);
            return list;
        }
        for (int i = 1; i <=6&& i<= target ; i++) {
            dice2(p+i,target-i,list);
        }
        return list;
    }

    // here is the second approach
    public static ArrayList<String> dice3(String p , int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <=6&& i<= target ; i++) {
            ans.addAll(dice3(p+i,target-i));
        }
        return ans;
    }

}
