package RecursionSubset;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        permutation("","abc");
        System.out.println(permutation2("","abc",new ArrayList<String>()));
        ArrayList<String> ans = permutation3("","abc");
        System.out.println(ans);

    }
    public static void permutation(String p , String up){
        // base condition
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutation(f+ch+s,up.substring(1));
        }
    }

    // returning array list
    // first approach pass the arraylist inside the function paratmeter
    public static ArrayList<String> permutation2(String p , String up , ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length() ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutation2(f + ch + s,up.substring(1),list);

        }
        return list;
    }

    // here is the second approach
    public static ArrayList<String> permutation3(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length() ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutation3(f + ch + s,up.substring(1)));
        }
        return ans;
    }
}
