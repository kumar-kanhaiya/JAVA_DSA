package SortingAlgo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ans = normalSorting(array);
        System.out.println(Arrays.toString(array));
        bubbleSort(array);

    }

    public static int[] normalSorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        return arr;
    }
    public static void bubbleSort(int[] array ){
        boolean swaped ;
        // run the steps (N-1) times
        for (int i = 0; i < array.length; i++) {
                swaped = false;
            // for each steps , max item will come at the last respective index .
            for (int j = 1; j <= array.length - i - 1; j++) {
                // swap if the item is smaller than the privous item
                if(array[j] < array[j-1]){
                     int temp = array[j];
                     array[j] = array[j-1];
                     array[j-1] = temp;
                     swaped = true;
                }
            }
            // if you did not swap for a particular value of i, its means array is sorted
            if(swaped == false){
                break;
            }

        }
        System.out.println(Arrays.toString(array));
    }

}
