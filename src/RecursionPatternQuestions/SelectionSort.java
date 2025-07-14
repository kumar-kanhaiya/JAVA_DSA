package RecursionPatternQuestions;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {1,8,7,2,9,5,4};
        selectionSort2(array, array.length  ,0 ,0 );
        System.out.println(Arrays.toString(array));

    }
    public static void selectionSort(int[] array , int r , int c){
        if(r == 0){
            return;
        }
        if(c < r){
            int max = maxIndex(array, array.length - c - 1);
            swap(array,max, array.length - c - 1);
            selectionSort(array,r, c+1);
        }
        else{
            selectionSort(array , r-1 , 0);
        }


    }


    public static void swap(int[] array , int first , int second){
        int temp = array[first];
        array[first] =array[second];
        array[second] =temp;
    }
    public static int maxIndex(int[] array , int end){
        int ans = 0 ;
        int max = -1;
        for (int i = 0; i <= end ; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        for (int i = 0; i <=end ; i++) {
            if(array[i] == max){
                ans = i ;
                break;
            }
        }
        return ans;
    }

    // crazy approach
    public static void selectionSort2(int[] array , int r , int c , int max){
        if(r == 0){
            return;
        }
        if(r > c){
            if(array[c] > array[max]){
                selectionSort2(array , r , c+1 , c);
            }
            else{
                selectionSort2(array , r , c+1 ,max);
            }
        }
        else{
            int temp = array[max];
            array[max] = array[r-1];
            array[r-1] = temp;
            selectionSort2(array,r-1,0,0);
        }
    }
}
