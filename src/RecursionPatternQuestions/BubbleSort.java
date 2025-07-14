package RecursionPatternQuestions;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
    int[] array = {4,3,2,1};
    bubbleSort(array,0);
        System.out.println(Arrays.toString(array));

    }
    static void bubbleSort(int[] array , int start ){
        if(start >= array.length - 1){
            return;
        }
        if(array[start] > array[start+1] && start < array.length-1){
            swap(array,start,start + 1);
            bubbleSort(array,start );
        }
        bubbleSort(array,start+1);

    }
    public static void swap(int[] array , int first , int second ){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
