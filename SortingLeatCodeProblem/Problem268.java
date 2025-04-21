package SortingLeatCodeProblem;

import java.util.Arrays;

public class Problem268 {
    public static void main(String[] args) {
        int[] array = {9,6,4,2,3,5,7,0,1};
        int ans = cycleSort(array);
        System.out.println(ans);

    }


    public static void swap(int[] array , int first , int second ){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
    public static int  cycleSort(int[] array ){
        int i = 0;
        while(i< array.length  ) {
            int correctIndex = array[i] ;
            if (array[i] < array.length && array[i] != array[correctIndex]) {
                swap(array, i, correctIndex);

            } else {
                i++;
            }
        }
        // search for element
        for(int index = 0 ; index < array.length ; index ++){
            if(array[index] != index){
                return index;
            }
        }
        return array.length;
    }

}
