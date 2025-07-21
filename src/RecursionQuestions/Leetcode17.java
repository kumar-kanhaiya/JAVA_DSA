package RecursionQuestions;

import java.util.ArrayList;

public class Leetcode17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("12"));

    }
    public static ArrayList<String> letterCombinations(String digits) {
        return check("",digits);
    }

    private static ArrayList<String> check(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = (int) (up.charAt(0) - '0');
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a' +  digit);
            ans.addAll(check(p+ch,up.substring(1)));
        }
        return ans;
    }
}
