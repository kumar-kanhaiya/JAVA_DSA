package RecursionArrayQuestion;

import java.util.Arrays;

public class RoatatedBinarySearch {
    public static void main(String[] args) {
        int[] array = {5,6,7,8,9,1,2,3};
        rotation(array);
        System.out.println(Arrays.toString(array));

    }
    public static void rotation(int[] array ){
        int start = 0 ;
        int end = array.length - 1;

            for (int i = 0; i <array.length  ; i++) {
                if(array[i] < array[array.length - 1 - i]){
                    swap(array,i,end - i );
                }
            }
        }

    public static void swap(int[] array , int first , int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] =temp;
    }
}
