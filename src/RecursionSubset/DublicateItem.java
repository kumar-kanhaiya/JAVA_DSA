package RecursionSubset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DublicateItem {
    public static void main(String[] args) {
        /* when you find a dublicate item only add in newly created subset of previous step

         */

    }
    static List<List<Integer>> subset(int[] array ){
        Arrays.sort(array);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0 ;
        int end = 0;

        for(int i = 0 ; i< array.length ; i++){
            start = 0;
            // if my start is equal to the previous element then start = end + 1
            if( i > 0 &&array[i] == array[i-1]){
                start = end + 1;
            }
            end = outer.size() - 1 ;

//            for(int element : array){
            
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer > internal = new ArrayList<>(outer.get(j));
                internal.add(array[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
