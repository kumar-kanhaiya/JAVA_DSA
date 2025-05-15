package SortingLeatCodeProblem;

import java.util.ArrayList;
import java.util.List;

public class Problem442 {
    public static void main(String[] args) {
        int[] array = {10,2,5,10,9,1,1,4,3,7};
        List<Integer> ans = findDuplicates(array);
        System.out.println("missing answer : " + ans);

    }
    public static List<Integer> findDuplicates(int[] array) {
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
//        int j = 0;
//        for (int k = 0; k < array.length; k++) {
//            for (int l = k+1; l < array.length ; l++) {
//                if(array[k] == array[l]){
//                    answer.add(array[k]);
//            }
//            }
//
//
//        }
//        return answer;
        // try to use while loop ;
//        int index = 0 ;
//        while(index< array.length){
//            int m = index+1;
//            while(m< array.length){
//                if(array[index] == array[m]){
//                    answer.add(array[index]);
//                }
//                m++;
//            }
//            index++;
//        }
        for (int index = 0; index < array.length; index++) {
            if (array[index] != index + 1) {
                answer.add(array[index]);
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
