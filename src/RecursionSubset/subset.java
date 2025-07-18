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
        ArrayList<String > list = subSeq("","abc");
//        list = allSubsetInArrayList("" , "abc" , list);
        System.out.println(list);
        System.out.println(allSubsetInArrayList("","abc",new ArrayList<>()));
        subSeqASCII("","abc");
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
    public static ArrayList<String> allSubsetInArrayList(String p , String up , ArrayList<String> list  ) {
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        allSubsetInArrayList(p + ch,up.substring(1), list );
        allSubsetInArrayList(p ,up.substring(1), list  );

        return list;
    }

    // without passing an argument
    public static ArrayList<String> subSeq(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeq(p + ch,up.substring(1));
        ArrayList<String> right =subSeq(p,up.substring(1));
        left.addAll(right);
        return left;

    }
    // print ASCII value of the character
    public static void subSeqASCII(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeqASCII(p+ch , up.substring(1));
        subSeqASCII(p,up.substring(1));
        subSeqASCII(p + (ch + 0), up.substring(1));
    }

}
