package SortingAlgo;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {

    }

    public static void radixSort(int[] array ){
        int max = Arrays.stream(array).max().getAsInt();

        // do count sort for every digit place
        for(int exp = 1; max/exp > 0 ; exp *=10 ){
            countSort(array , exp);
        }
    }
    private static void countSort(int[] array , int exp){
        int n = array.length;
        int[] output = new int[n];
        int[] count = new int[10];

        Arrays.fill(count , 0);
    }
}
