package RecursionSubset;

import java.util.ArrayList;
import java.util.Arrays;

public class subset {
    public static void main(String[] args) {
    /*
    subset is non adjactance collections
    the pattern of taking some element or removing some element is known as subset pattern

     */
        allSubsets("" , "abc");
        ArrayList<String > list = new ArrayList<>();
        list = allSubsetInArrayList("" , "abc" , list);
        System.out.println(list);
    }
    public static void allSubsets(String p , String up){
        if( up.isEmpty() ){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        allSubsets((p + ch),up.substring(1));
        allSubsets(p , up.substring(1));
    }

    // adding in array list
    // 1st approach passing an list item
    public static ArrayList<String> allSubsetInArrayList(String p , String up , ArrayList<String> list ) {
        if (up.isEmpty()) {
            list.add(p);

        }
        char ch = up.charAt(0);
        if (true) {
            return allSubsetInArrayList(p + ch, up.substring(1), list);

        }
        if (true) {
            return allSubsetInArrayList(p, up.substring(1), list);
        }
        return list;
    }
}
