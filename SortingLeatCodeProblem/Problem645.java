package SortingLeatCodeProblem;

import java.util.Arrays;

public class Problem645 {
    public static void main(String[] args) {
        int[] array = {1,2,2,4};
        int[] ans = findErrorNums(array);
        System.out.println(Arrays.toString(ans));

    }
    public static  int[] findErrorNums(int[] array) {
    int i =0 ;
    while(i< array.length){
        int correctIndex = array[i] - 1 ;
        if(i < array.length && array[i] != array[correctIndex]){
            swap(array,i,correctIndex);
        }
        else{
            i++;
        }
    }
        for (int index = 0; index < array.length; index++) {
            if(array[index] != index +1 ){
                return new int[]{array[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }
    public static void swap(int[] array , int first , int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] =temp;
    }
}
