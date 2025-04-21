package SortingLeatCodeProblem;

import java.util.ArrayList;
import java.util.List;

public class Problem448 {
    public static void main(String[] args) {
        int[] array = {7,3,2,4,8,2,3,1};
        List<Integer> result = findDisappearedNumbers(array);
        System.out.println("Missing Number : " + result);

    }
    public static List<Integer> findDisappearedNumbers(int[] array) {
        List<Integer> answer = new ArrayList<>();
        int i = 0;
        while(i< array.length){
            int correctIndex = array[i] - 1;
            if(i< array.length && array[i] != array[correctIndex]){
                swap(array,i,correctIndex);
            }
            else{
                i++;
            }
        }
        int j = 0;
        for (int k = 0; k < array.length; k++) {
            if(array[k] != k+1){
                answer.add(k+1);
            }
        }
        return answer;


    }

    public static void swap(int[] array , int first , int second ){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
