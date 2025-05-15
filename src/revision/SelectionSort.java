package revision;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {2,3,5,4,1};
        swapped(array);
        System.out.println(Arrays.toString(array));

    }
    public static void swapped(int[] array ){
        for (int i = 0; i < array.length ; i++) {
            int last = array.length - i -1;
            int maxIndex = maximumIndex(array, 0 , last);
            swapped(array , maxIndex , last);
        }
    }
    public static int maximumIndex(int[] array , int start , int end  ){
        int max = start ;
        for (int i = start; i <= end ; i++) {
            if(array[i] > array[max]){
                max = i ;
            }
        }
        return max;
    }
    public static void swapped(int[] array , int first , int second ){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
