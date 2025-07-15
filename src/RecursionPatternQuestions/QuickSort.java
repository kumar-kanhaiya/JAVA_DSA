package RecursionPatternQuestions;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
    /* 3 ways to pick the pivot
    1. choose random element
    2. corner element
    3. pick the middle element
     */
        /* worst case and best case
        worst case is maximum or minimum present on starting or ending
        best case is middle one
        hybrid sorting algorithm is a combination of merge sort and insertion sort
         */
        int[] array = {5,4,3,2,1};
        sort(array,0, array.length-1);
        System.out.println(Arrays.toString(array));

    }
    static void sort(int[] array , int low , int high){
        if(low >= high){
            return;
        }
        int start = low;
        int end = high ;

        int mid = start + (end - start)/2;
        int pivot = array[mid];
        while(start <= end ){
            while(pivot > array[start]){
                start++;
            }
            while(pivot < array[end]){
                end--;
            }
            if(start <= end ){
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }
        // now my pivot is at correct index
        sort(array,low , end);
        sort(array,start,high);

    }
}
