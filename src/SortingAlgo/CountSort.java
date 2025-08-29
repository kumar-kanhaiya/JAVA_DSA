package SortingAlgo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSort {
    public static void main(String[] args) {
        int[] array = {3,5,10,6,3,10,9,2,4,9,7};
        countSort(array);
        System.out.println(Arrays.toString(array));

    }
    public static void countSort(int[] array ){
        if(array == null || array.length <= 1){
            return;
        }
        int max = maxNumber(array);

        // it is the frequency array
        int[] countArray = new int[max + 1 ];

        for(int num : array){
            countArray[num]++;
        }
        int index = 0;
        for(int i = 0 ; i< max ; i++){
            while(countArray[i] > 0){
                array[index] = i;
                index++;
                countArray[i]--;
            }

        }

    }
    public static int maxNumber(int[] array){
        int max = array[0];
        for(int num : array){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    public static void countSortHas(int[] array ){
        if(array == null || array.length <=1){
            return;
        }
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();

        Map<Integer,Integer> countMap = new HashMap<>();

        for(int number : array){
            countMap.put(number , countMap.getOrDefault(number , 0) + 1);
        }

        int index = 0;
        for(int i = min ;i<= max ; i++){
            int count = countMap.getOrDefault(i,0);
            for(int j = 0 ; j < count ; j++){
                array[index] = i;
                index++;
            }
        }
    }
}
