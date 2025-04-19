package SortingAlgo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {2,3,5,4,1};
//        System.out.println(maximumIndex(array,0, array.length));
        selectionSorting(array);
        System.out.println(Arrays.toString(array));
    }
    public static void selectionSorting(int[] array ){
        for (int i = 0; i < array.length; i++) {
            // getting the largest element in the remaining array
            int last = array.length - i -1 ;
            int maxElementIndex = maximumIndex(array , 0 , last);
            swap(array, maxElementIndex, last);
        }
    }
    public static int maximumIndex(int[] array , int start , int end ){
        int max = start;

        for (int i = start; i <= end  ; i++) {
            if(array[i] > array[max]){
                max = i;

            }
        }
        return max;
    }
    public static void swap(int[] arr , int first , int second ){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;

    }
}
