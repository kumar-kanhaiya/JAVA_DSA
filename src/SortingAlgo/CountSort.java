package SortingAlgo;

import java.util.Arrays;

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
}
