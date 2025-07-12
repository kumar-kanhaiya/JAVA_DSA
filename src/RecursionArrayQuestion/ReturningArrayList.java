package RecursionArrayQuestion;

import java.util.ArrayList;

public class ReturningArrayList {
    public static void main(String[] args) {
        System.out.println(check());

    }
    // first approach by passing argument
    public static ArrayList<Integer> check(int[] array , int target , int start , ArrayList<Integer> list){
        if(start == array.length){
            return list;
        }
        if(array[start] == target){
            list.add(start);
        }
        return check(array , target , start + 1 , list);
    }
}
