package RecursionPatternQuestions;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
    int[] array = {4,3,2,1};
    bubbleSort(array, array.length - 1,  0);
        System.out.println(Arrays.toString(array));

    }
    static void bubbleSort(int[] array , int row , int collumn){
        if(row == 0){
            return;
        }
        if(collumn < row) {
            if (array[collumn] > array[collumn + 1]) {
                swap(array, collumn, collumn + 1);
            }
                bubbleSort(array, row, collumn + 1);
        }
        else{
            bubbleSort(array , row -1 ,0);
        }

    }
    public static void swap(int[] array , int first , int second ){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
