package RecursionQuestions;

import java.util.ArrayList;

public class Leetcode17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations2("7"));

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
        int digit = up.charAt(0) - '0' - 1;
        for (int i = (digit-1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' +  i);
            ans.addAll(check(p+ch,up.substring(1)));
        }
        return ans;
    }

    // second approach
    public static ArrayList<String> letterCombinations2(String digits) {
        return check2("",digits);
    }

    private static ArrayList<String> check2(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int digit = up.charAt(0) - '0'; // Convert char to int
        String letters = mapping[digit];

        for (char ch : letters.toCharArray()) {
            ans.addAll(check2(p + ch, up.substring(1)));
        }
        return ans;
    }
}
