package RecursionSubset;

import java.util.ArrayList;
import java.util.List;

public class ArraySubset {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(subset(array));

    }

    // solving without using rescursion
    static List<List<Integer>> subset(int[] array ){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int element : array){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer > internal = new ArrayList<>(outer.get(i));
                internal.add(element);
                outer.add(internal);
            }
        }
        return outer;
    }

}
