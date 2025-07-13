package RecursionArrayQuestion;

import java.util.ArrayList;

public class ReturningArrayList {
    public static void main(String[] args) {
        int[] array = {3,2,1,4,4,8,6,9,};

        System.out.println(check(array , 4 , 0 , new ArrayList<>()));
        System.out.println(findAllIndex(array,4,0));

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

    // second approach return the list without passing any argument
    public static ArrayList<Integer> findAllIndex(int[] array , int target , int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == array.length){
            return list;
        }
        if(array[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansGettingFromBelow = findAllIndex(array,target,index + 1 );
        list.addAll(ansGettingFromBelow);
        return list;

    }

}
