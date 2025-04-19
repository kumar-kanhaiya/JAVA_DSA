package SortingAlgo;

import java.util.Arrays;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] array = {5,3,4,1,2};
        insertionSorting(array);
        System.out.print("Increasing : ");
        System.out.println(Arrays.toString(array));
        insertionSortingDecreasing(array);
        System.out.print("\nDecreasing : ");
        System.out.println(Arrays.toString(array));

    }
    public static void insertionSorting(int[] array ){

        for (int i = 0; i < array.length - 1  ; i++) {
            for (int j = i + 1; j > 0  ; j--) {
                if(array[j] > array[j-1]){
                    break;
                }
                else {
                    int temp = array[j-1] ;
                    array[j-1] = array[j];
                    array[j] = temp;
                }

            }
        }
    }
    public static void insertionSortingDecreasing(int[] array ){
        for (int i = 0; i < array.length -1  ; i++) {
            for (int j = i+1; j > 0  ; j--) {
                if(array[j] < array[j-1]){
                    break;
                }
                else{
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }

        }
    }
}
